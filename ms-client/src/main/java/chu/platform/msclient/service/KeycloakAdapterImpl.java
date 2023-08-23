//package chu.platform.msclient.service;
//
//import chu.platform.msclient.dto.AuthenticationResponse;
//import chu.platform.msclient.dto.UserDTO;
//import chu.platform.msclient.service.iservices.IKeycloakAdapter;
//
//import lombok.RequiredArgsConstructor;
//import org.jboss.resteasy.client.jaxrs.ResteasyClient;
//import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
//import org.keycloak.OAuth2Constants;
//import org.keycloak.admin.client.Keycloak;
//import org.keycloak.admin.client.KeycloakBuilder;
//import org.keycloak.admin.client.resource.RealmResource;
//import org.keycloak.admin.client.resource.UsersResource;
//import org.keycloak.representations.AccessTokenResponse;
//import org.keycloak.representations.idm.CredentialRepresentation;
//import org.keycloak.representations.idm.RoleRepresentation;
//import org.keycloak.representations.idm.UserRepresentation;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.*;
//
//import org.springframework.stereotype.Service;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
//import org.springframework.web.client.RestClientException;
//import org.springframework.web.client.RestTemplate;
//
//import javax.ws.rs.core.Response;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//@RequiredArgsConstructor
//public class KeycloakAdapterImpl implements IKeycloakAdapter
//{
//    @Value("${keycloak.auth-server-url}")
//    String serverUrl;
//    @Value("${keycloak.resource}")
//    String clientId;
//    @Value("${keycloak.realm}")
//    String realm;
//    @Value("${keycloak.credentials.secret}")
//    String clientSecret;
//    @Value("${adminKeycloak.username}")
//    String keycloakUsername;
//    @Value("${adminKeycloak.password}")
//    String keycloakPassword;
//
//    @Value("${admin.client-secret}")
//    String adminClientSecret;
//     private RestTemplate restTemplate = new RestTemplate();
//     final private UserDTO userDTO;
//
//    @Override
//    public AuthenticationResponse getToken(String username, String password) {
//
//        try {
//            MultiValueMap<String, String> data = getDataUser(username, password, realm,clientId,clientSecret);
//            String refreshUrl = serverUrl + "/realms/" + realm + "/protocol/openid-connect/token";
//            MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
//            headers.add("Content-Type", "application/x-www-form-urlencoded");
//            ResponseEntity<AccessTokenResponse> response = restTemplate.exchange(
//                    refreshUrl,
//                    HttpMethod.POST,
//                    new HttpEntity<>(data, headers),
//                    AccessTokenResponse.class
//            );
//            return new AuthenticationResponse(response.getBody()
//                    .getToken(), response.getBody()
//                    .getExpiresIn(), response
//                    .getBody()
//                    .getRefreshToken(), response.getBody()
//                    .getRefreshExpiresIn(), response.getBody().getTokenType());
//        } catch (RestClientException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Override
//    public AuthenticationResponse getAdminoken() {
//        try {
//                MultiValueMap<String, String> data = getDataUser(keycloakUsername, keycloakPassword, "master","admin-cli",adminClientSecret);
//                String refreshUrl = serverUrl + "/realms/" + "master" + "/protocol/openid-connect/token";
//                MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
//                headers.add("Content-Type", "application/x-www-form-urlencoded");
//                ResponseEntity<AccessTokenResponse> response = restTemplate.exchange(
//                        refreshUrl,
//                        HttpMethod.POST,
//                        new HttpEntity<>(data, headers),
//                        AccessTokenResponse.class
//                );
//            return new AuthenticationResponse(response.getBody()
//                    .getToken(), response.getBody()
//                    .getExpiresIn(), response
//                    .getBody()
//                    .getRefreshToken(), response.getBody()
//                    .getRefreshExpiresIn(), response.getBody().getTokenType());
//        } catch (RestClientException e) {
//            throw new RuntimeException(e);
//        }
//
//}
//
//
//    @Override
//    public MultiValueMap getDataUser(String username, String password ,String realm, String clientid,String clientsecret) {
//
//        MultiValueMap<String, String> data = new LinkedMultiValueMap<>();
//        data.add("client_id", clientid);
//        data.add("username", username);
//        data.add("password", password);
//        data.add("client_secret", clientsecret);
//        data.add("grant_type", "password");
//        data.add("realm" ,realm);
//
//        return data;
//    }
//
//
//    @Override
//    public Keycloak getAdminKeycloak() {
//        //Client client = ClientBuilder.newBuilder().build();
//        return KeycloakBuilder.builder()
//                .resteasyClient(new ResteasyClientBuilder().disableTrustManager().build())
//                .serverUrl(serverUrl)
//                .realm("master")
//                .username(keycloakUsername)
//                .password(keycloakPassword)
//                .clientId("admin-cli")
//                .clientSecret(adminClientSecret)
//                .grantType(OAuth2Constants.PASSWORD)
//                .build();
//    }
//
//    public Response signupUser(UserDTO userDTO) {
//        try {
//            UserRepresentation userRepresentation = new UserRepresentation();
//            userRepresentation.setEmail(userDTO.getEmailId());
//            userRepresentation.setFirstName(userDTO.getFirstname());
//            userRepresentation.setLastName(userDTO.getLastname());
//            //TODO change this later to username
//            userRepresentation.setUsername(userDTO.getUsername());
//            userRepresentation.setEnabled(true);
//            CredentialRepresentation credentialRepresentation = new CredentialRepresentation();
//            credentialRepresentation.setTemporary(false);
//            credentialRepresentation.setType(CredentialRepresentation.PASSWORD);
//            credentialRepresentation.setValue(userDTO.getPassword());
//            userRepresentation.setCredentials(Arrays.asList(credentialRepresentation));
//            RealmResource resource = getAdminKeycloak().realm(realm);
//            UsersResource usersResource = resource.users();
//            Response response = usersResource.create(userRepresentation);
//            if(response.getStatusInfo().getFamily()==Response.Status.Family.SUCCESSFUL){
//                List<RoleRepresentation> roleRepresentationList = getAdminKeycloak().realm(realm).roles().list();
//                String clientId = getAdminKeycloak().realm(realm).users().search(userDTO.getUsername()).get(0).getId();
//                //TODO Add roles before register new user to avoid default role
//                //Query the user then map role depending on client profil
//                getAdminKeycloak().realm(realm).users().get(clientId).roles().realmLevel().remove(Collections.singletonList(roleRepresentationList.stream().filter(
//                        roleRepresentation -> roleRepresentation.getName().equals("default-roles-e-retraite")
//                ).findFirst().get()));
//                getAdminKeycloak().realm(realm).users().get(clientId).roles().realmLevel().add(
//                        roleRepresentationList.stream().filter(
//                                roleRepresentation -> roleRepresentation.getName().equals("collab")
//                        ).collect(Collectors.toList())
//                );
//                return response;
//            } else {
//                return null;
//            }
//        }
//        catch (Exception e){
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//
//}

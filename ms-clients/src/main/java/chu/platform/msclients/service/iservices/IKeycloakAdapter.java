package chu.platform.msclients.service.iservices;//package chu.platform.msclient.service.iservices;

import chu.platform.msclients.dto.AuthenticationResponse;
import chu.platform.msclients.dto.UserDTO;
import org.keycloak.admin.client.Keycloak;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

import javax.ws.rs.core.Response;

public interface IKeycloakAdapter
{

    public AuthenticationResponse getToken(String username , String password);
    public AuthenticationResponse getAdminoken();
    public Keycloak getAdminKeycloak();

    public Response signupUser(UserDTO userDTO);
    public MultiValueMap getDataUser(String username , String password, String realm, String clientid, String clientsecret);

    public boolean checkIfUsernameOrEmailExist(String value);
}

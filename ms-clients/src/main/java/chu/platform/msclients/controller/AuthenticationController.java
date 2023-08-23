package chu.platform.msclients.controller;//package chu.platform.msclient.controller;
//

import chu.platform.msclients.client.MetierService;
import chu.platform.msclients.dto.AuthenticationResponse;
import chu.platform.msclients.dto.UserDTO;
import chu.platform.msclients.entity.Stagiaire;
import chu.platform.msclients.exceptions.AuthException;
import chu.platform.msclients.service.KeycloakAdapterImpl;
import chu.platform.msclients.service.iservices.IStagiaireService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class AuthenticationController {

    private final KeycloakAdapterImpl keycloakAdapter;
    private final MetierService metierService;
    private final IStagiaireService stagiaireService;

    @PostMapping ("/login")
    public ResponseEntity<AuthenticationResponse> login(@RequestParam("username") String username , @RequestParam("password") String password) {
        String name = username;
        String pass = password;

        AuthenticationResponse authenticationResponse = keycloakAdapter.getToken(username, password);
        return ResponseEntity.ok(authenticationResponse);
    }


    @PostMapping("/singup2")
    public String addUser(@RequestBody UserDTO userDTO){

        //keycloakAdapter.signupUser(userDTO);
        stagiaireService.createStagiaire(userDTO);

        return "User Added Successfully.";
    }

    @PostMapping("/signup")
    public ResponseEntity<Stagiaire> signUp( @RequestBody UserDTO userDTO) {
        try {
            Stagiaire createdStagiaire = stagiaireService.createStagiaire(userDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdStagiaire);
        } catch (AuthException e) {
            System.err.println("service prblm" );
            // Handle a specific custom exception (replace YourCustomException with the actual exception type)
            // You can log the error and return an appropriate response, such as a 4xx or 5xx HTTP status
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }



    @PreAuthorize("hasRole('Stagiaire')")
    @GetMapping("/client-listmetier")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<String>> getMetiers(@RequestHeader("Authorization") String token)
    {
        System.out.println("token " + token);
    return metierService.listAllMetiers(token);

    }


    @PreAuthorize("hasRole('Stagiaire')")
    @GetMapping("/list")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<String>> getCors()
 {

     List<String > list =  new ArrayList<>();
     list.add("informa");
     list.add("marketing");
     list.add("economie");
     list.add("electricite");


     list.add("access_token: eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJUT1ZVcGRMTVFyQ3NmVmlSTzA5RVlqVEZicHFSZUE4UXRCaWxzZkZ0WEc0In0.eyJleHAiOjE2OTQ3NzYwMjcsImlhdCI6MTY5NDc3Mjk2NywianRpIjoiNTExODFmMmEtZGQ5MC00NDc4LTkyY2MtMjRmNTYyZjJlOTI1IiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwL3JlYWxtcy9wbGF0Zm9ybS1jaHUtc3RhZ2UtcmVhbG0iLCJhdWQiOiJhY2NvdW50Iiwic3ViIjoiODU1NzM3MGQtNjhmNi00Nzk3LWE1OTktN2UxYzcyMGI1MDBmIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoibXMtY2xpZW50Iiwic2Vzc2lvbl9zdGF0ZSI6IjgyMzM3ZWQ1LTUzMzMtNGFkOS04YTk5LTIxZWE4ODU5YThhOCIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiLyoiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIlN0YWdpYWlyZSIsIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJkZWZhdWx0LXJvbGVzLXBsYXRmb3JtLWNodS1zdGFnZS1yZWFsbSJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoiZW1haWwgcHJvZmlsZSIsInNpZCI6IjgyMzM3ZWQ1LTUzMzMtNGFkOS04YTk5LTIxZWE4ODU5YThhOCIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwibmFtZSI6ImFobWVkIGtoYWxpZCIsInByZWZlcnJlZF91c2VybmFtZSI6InRlc3QiLCJnaXZlbl9uYW1lIjoiYWhtZWQiLCJmYW1pbHlfbmFtZSI6ImtoYWxpZCIsImVtYWlsIjoidGVzdEBnbWFpbC5jb20ifQ.gvNHJ1g0kDT-Xi6Uet07R3iumnUbGZ1Z0XB6zkv2eUb09zIwa-FXFSIKtqrC1ZQoY86RgYtRrqrCT1EwRzmiOYDKJKU_4UOR3c21xfLFID6blDeiBxDUV73HZOl1XO2RP3NFM1_G6GikKjYiC2nSZQQ4OLTJDtCfmGCLYSbyaRdgN_9dQfSkJgmnDLvHzCAIY2sQtrxNNhaRvHWD8ZzAz_J2ZvmXHfCg8nv7wRnZtbjR4pNFgUU1ohqtGkaeIRto65th7rFdQieYZkmgYUkzGLtlZnKtYhjz-XzAay7X2VaG2WRATWxwP-lMbsrZUdfKS9Sork6h-daJrglvSJJkgw");

     return ResponseEntity.ok().body(list);
 }


}

//package chu.platform.msclient.controller;
//
//
//import chu.platform.msclient.dto.AuthenticationResponse;
//import chu.platform.msclient.dto.UserDTO;
//import chu.platform.msclient.client.MetierService;
//import chu.platform.msclient.service.KeycloakAdapterImpl;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//public class AuthenticationController {
//
//    private final KeycloakAdapterImpl keycloakAdapter;
//    private final MetierService metierService;
//
//    @PostMapping ("/login")
//    public ResponseEntity<AuthenticationResponse> login(@RequestParam("username") String username ,@RequestParam("password") String password) {
//        String name = username;
//        String pass = password;
//
//        AuthenticationResponse authenticationResponse = keycloakAdapter.getToken(username, password);
//        return ResponseEntity.ok(authenticationResponse);
//    }
//
//    @PostMapping("/singup")
//    public String addUser(@RequestBody UserDTO userDTO){
//
//        keycloakAdapter.signupUser(userDTO);
//        return "User Added Successfully.";
//    }
//
//
//
//    @GetMapping("/client-listmetier")
//    public ResponseEntity<List<String>> getMetiers()
//    {
//    return metierService.listAllMetiers();
//
//    }
//
//
//
//
//}

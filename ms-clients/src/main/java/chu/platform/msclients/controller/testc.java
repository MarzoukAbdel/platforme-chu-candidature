package chu.platform.msclients.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class testc {


    @PreAuthorize("hasRole('Stagiaire')")
    @GetMapping("/test")
    public String testApi()
    {
        return "hello from keycloak";
    }


}

package chu.platform.msclients.config;

import lombok.RequiredArgsConstructor;
import org.keycloak.adapters.KeycloakConfigResolver;
import org.keycloak.adapters.springboot.KeycloakBaseSpringBootConfiguration;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.keycloak.adapters.springsecurity.KeycloakConfiguration;
import org.keycloak.adapters.springsecurity.authentication.KeycloakAuthenticationProvider;
import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.authority.mapping.SimpleAuthorityMapper;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.session.NullAuthenticatedSessionStrategy;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;

import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@RequiredArgsConstructor
public class SecurityConfig  {
    private final JwtAuthConverter jwtAuthConverter;
   @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
       http.cors(); // Active la configuration CORS

       http.csrf().disable();
       // http.csrf().disable().authorizeHttpRequests().requestMatchers("/singup").permitAll();
        http.csrf().disable().authorizeHttpRequests().requestMatchers("/login","/signup","/singup2","/list","metier/api/client-listmetier").permitAll().anyRequest().authenticated();
        http.oauth2ResourceServer().jwt().jwtAuthenticationConverter(jwtAuthConverter);
        http.sessionManagement().sessionCreationPolicy(STATELESS);

        return http.build();
    }


//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth)  {
//        KeycloakAuthenticationProvider keycloakAuthenticationProvider = new KeycloakAuthenticationProvider();
//        //Used to map keycloak ROLES/AUTHORITIES TO SRPING SECURITY USER DETAILS CONFIGURATION
//        SimpleAuthorityMapper mapper = new SimpleAuthorityMapper();
//
//
//        keycloakAuthenticationProvider.setGrantedAuthoritiesMapper(mapper);
//        auth.authenticationProvider(keycloakAuthenticationProvider);
//    }


}

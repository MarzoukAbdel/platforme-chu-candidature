//package chu.platform.msmetier.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//
//@Configuration
//public class CorsConfig {
//    @Bean
//    public CorsFilter corsFilter() {
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//        //corsConfiguration.addAllowedOrigin("http://localhost:3000"); // Replace with your React app's domain
//         corsConfiguration.addAllowedOrigin("*"); // Allow requests from any origin (you can restrict this to specific origins)
//        corsConfiguration.addAllowedMethod("http://localhost:8084/metier/api/listmetier");
//        corsConfiguration.addAllowedMethod("metier/api/listmetier");
//        // Allow all HTTP methods
//        corsConfiguration.addAllowedHeader("*"); // Allow all headers
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", corsConfiguration);
//
//        return new CorsFilter(source);
//    }
//}
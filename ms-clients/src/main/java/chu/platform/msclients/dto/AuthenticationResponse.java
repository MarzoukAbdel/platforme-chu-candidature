package chu.platform.msclients.dto;//package chu.platform.msclient.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthenticationResponse {

    String access_token;
    long expires_in;
    String refresh_token;
    long refresh_expires_in;
    String token_type;


 public AuthenticationResponse(String access_token , long expires_in, String refresh_token, long refresh_expires_in, String token_type)
 {
     this.access_token= access_token;
     this.expires_in= expires_in;
     this.refresh_expires_in= refresh_expires_in;
     this.refresh_token = refresh_token;
     this.token_type= token_type;

 }
}

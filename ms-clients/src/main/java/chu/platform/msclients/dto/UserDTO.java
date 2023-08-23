package chu.platform.msclients.dto;//package chu.platform.msclient.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Builder
public class UserDTO {


    @NonNull String username ;
    @NonNull String password;
    @NonNull String firstname;
    @NonNull String lastname;
    @NonNull String addresse;
    @NonNull String emailId;
}

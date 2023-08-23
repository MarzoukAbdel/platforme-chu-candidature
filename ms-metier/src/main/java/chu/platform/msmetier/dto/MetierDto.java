package chu.platform.msmetier.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MetierDto {

    String Nommetier;
    String Email;
    int nbrStagiaire;


}

package chu.platform.msclients.entity;//package chu.platform.msclient.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Stagiaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String FirstName;
    private String LastName;
    private String username;
    private String Email;
    private String Tel;
    private  String Addresse;
    private String Password;

    @OneToOne
    private Candidature candidature;

}

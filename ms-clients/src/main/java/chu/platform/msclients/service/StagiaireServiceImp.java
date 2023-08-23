package chu.platform.msclients.service;

import chu.platform.msclients.dto.UserDTO;
import chu.platform.msclients.entity.Stagiaire;
import chu.platform.msclients.exceptions.AuthException;
import chu.platform.msclients.repository.IStagiaireRepository;
import chu.platform.msclients.service.iservices.IStagiaireService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.apache.logging.log4j.Logger;

import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;


@RequiredArgsConstructor
@Service
public class StagiaireServiceImp implements IStagiaireService {


  //  private static final Logger LOG = (Logger) LoggerFactory.getLogger(StagiaireServiceImp.class);
    //private static final Logger logger = LoggerFactory.getLogger(StagiaireServiceImp.class);

    final private UserDTO userDTO;
    private final IStagiaireRepository stagiaireRepository;
    private final KeycloakAdapterImpl keycloakAdapter;


    @Override
    public Stagiaire createStagiaire(UserDTO userDTO) {

        if (userDTO == null)
            throw new IllegalArgumentException("UserDTO cannot be null");
            Stagiaire stagaireCreated;
        if (userDTO.getFirstname() == null || userDTO.getLastname() == null || userDTO.getEmailId() == null
            || userDTO.getPassword() == null ||userDTO.getUsername() == null ||userDTO.getAddresse() == null) {
            throw new IllegalArgumentException("UserDTO attributes cannot be null");
        }

        if( !keycloakAdapter.checkIfUsernameOrEmailExist(userDTO.getUsername()) || !keycloakAdapter.checkIfUsernameOrEmailExist(userDTO.getEmailId()))
            throw new IllegalArgumentException("email or username  Exists");

            Stagiaire stagiaire = Stagiaire.builder().Addresse(userDTO.getAddresse())
                    .Email(userDTO.getEmailId())
                    .FirstName(userDTO.getFirstname())
                    .LastName(userDTO.getLastname())
                    .username(userDTO.getUsername())
                    .Password(userDTO.getPassword()).build();


                Response response = keycloakAdapter.signupUser(userDTO);


        try {
             stagaireCreated = stagiaireRepository.save(stagiaire);
        }
        catch(Exception e){

                throw new AuthException("Error save in DB Stagiaire table");
            }

        return stagiaireRepository.save(stagaireCreated);
    }
    @Override
    public Stagiaire updateStagiaire(UserDTO userDto) {
    return  null;
    }
}

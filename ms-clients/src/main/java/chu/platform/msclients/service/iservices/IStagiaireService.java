package chu.platform.msclients.service.iservices;

import chu.platform.msclients.dto.UserDTO;
import chu.platform.msclients.entity.Stagiaire;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public interface IStagiaireService {


    public Stagiaire createStagiaire(UserDTO userDTO);

    public Stagiaire updateStagiaire(UserDTO userDTO);


}

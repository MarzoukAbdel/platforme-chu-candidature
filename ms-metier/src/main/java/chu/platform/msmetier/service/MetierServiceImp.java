package chu.platform.msmetier.service;

import chu.platform.msmetier.dto.MetierDto;
import chu.platform.msmetier.entity.Metier;
import chu.platform.msmetier.repository.IMetierRepository;
import chu.platform.msmetier.service.iservice.IMetierService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class MetierServiceImp implements IMetierService {


    final  private IMetierRepository metierRepository;


    @Override
    public Metier CreateMetier(MetierDto metierDto) {
         return  Metier.builder().NomMetier(metierDto.getNommetier())
                .Email(metierDto.getEmail())
                .NbrStagiaire(0)
                .build();
    }

    @Override
    public List<Metier> listAllMetiers() {
        List<Metier> Metiers = metierRepository.findAll();

         return Metiers;

    }

    @Override
    public MetierDto getMetierById(Long id) {
        Optional<Metier> metier = metierRepository.findById(id);
        MetierDto metierDto;
        if (metier.isPresent())
        {
            metierDto= MetierDto.builder().nbrStagiaire(metier.get().getNbrStagiaire())
          .Email(metier.get().getEmail())
          .Nommetier(metier.get().getNomMetier())
          .build();
        }
        else
        return null;

        return metierDto;
    }
}

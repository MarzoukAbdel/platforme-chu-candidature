package chu.platform.msmetier.service.iservice;

import chu.platform.msmetier.dto.MetierDto;
import chu.platform.msmetier.entity.Metier;

import java.util.List;

public interface IMetierService {

    public Metier CreateMetier(MetierDto metierDto);
    public List<Metier> listAllMetiers();
    public MetierDto getMetierById(Long id);


}

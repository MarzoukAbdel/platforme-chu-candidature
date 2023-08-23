package chu.platform.msclients.repository;//package chu.platform.msclient.repository;


import chu.platform.msclients.entity.Stagiaire;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


 @Repository
public interface IStagiaireRepository extends JpaRepository<Stagiaire, Long>
{


    @Override
    List<Stagiaire> findAllById(Iterable<Long> longs);

    @Override
    List<Stagiaire> findAll(Sort sort);




}

package chu.platform.msmetier.repository;

import chu.platform.msmetier.entity.Metier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IMetierRepository extends JpaRepository<Metier, Long> {



}

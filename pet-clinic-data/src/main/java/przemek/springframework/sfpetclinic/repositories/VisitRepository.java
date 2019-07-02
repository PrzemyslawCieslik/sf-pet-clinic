package przemek.springframework.sfpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import przemek.springframework.sfpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}

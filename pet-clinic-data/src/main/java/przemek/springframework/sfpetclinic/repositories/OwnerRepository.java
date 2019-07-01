package przemek.springframework.sfpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import przemek.springframework.sfpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}

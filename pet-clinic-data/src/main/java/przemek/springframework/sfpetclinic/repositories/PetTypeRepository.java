package przemek.springframework.sfpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import przemek.springframework.sfpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

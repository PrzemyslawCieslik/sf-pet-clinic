package przemek.springframework.sfpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import przemek.springframework.sfpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

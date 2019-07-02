package przemek.springframework.sfpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import przemek.springframework.sfpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}

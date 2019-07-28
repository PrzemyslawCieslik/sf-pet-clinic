package przemek.springframework.sfpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import przemek.springframework.sfpetclinic.model.Owner;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

}

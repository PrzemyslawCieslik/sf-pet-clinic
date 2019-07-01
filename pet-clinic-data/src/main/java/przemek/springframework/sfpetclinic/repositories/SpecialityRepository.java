package przemek.springframework.sfpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import przemek.springframework.sfpetclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}

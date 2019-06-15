package przemek.springframework.sfpetclinic.services;

import org.springframework.stereotype.Service;
import przemek.springframework.sfpetclinic.model.Pet;

@Service
public interface PetService extends CrudService<Pet, Long> {

}

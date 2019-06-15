package przemek.springframework.sfpetclinic.services;

import org.springframework.stereotype.Service;
import przemek.springframework.sfpetclinic.model.Owner;

@Service
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName (String lastName);

}

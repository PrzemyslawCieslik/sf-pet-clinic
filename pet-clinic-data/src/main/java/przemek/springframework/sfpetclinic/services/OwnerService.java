package przemek.springframework.sfpetclinic.services;

import przemek.springframework.sfpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName (String lastName);

}

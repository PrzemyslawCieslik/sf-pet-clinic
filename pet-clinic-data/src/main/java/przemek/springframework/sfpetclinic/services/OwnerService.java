package przemek.springframework.sfpetclinic.services;

import przemek.springframework.sfpetclinic.model.Owner;

import java.util.List;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName (String lastName);

    List<Owner> findByLastNameLike(String lastName);
}

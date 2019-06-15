package przemek.springframework.sfpetclinic.services.map;

import przemek.springframework.sfpetclinic.model.Owner;
import przemek.springframework.sfpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findByAll() {
        return super.findByAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByid(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}

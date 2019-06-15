package przemek.springframework.sfpetclinic.services.map;

import org.springframework.stereotype.Service;
import przemek.springframework.sfpetclinic.model.Pet;
import przemek.springframework.sfpetclinic.services.CrudService;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findByAll() {
        return super.findByAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByid(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}

package przemek.springframework.sfpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import przemek.springframework.sfpetclinic.model.Pet;
import przemek.springframework.sfpetclinic.services.PetService;

import java.util.Set;

@Service
@Profile({"default","map"})
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
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

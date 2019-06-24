package przemek.springframework.sfpetclinic.services.map;

import przemek.springframework.sfpetclinic.model.Speciality;
import przemek.springframework.sfpetclinic.services.SpecialtiesService;

import java.util.Set;

public class SpecialtiesServiceMap extends AbstractMapService<Speciality, Long> implements SpecialtiesService {
    @Override
    public Set<Speciality> findByAll() {
        return super.findByAll();
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByid(id);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}

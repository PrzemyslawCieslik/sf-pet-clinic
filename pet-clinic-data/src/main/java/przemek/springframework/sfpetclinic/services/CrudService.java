package przemek.springframework.sfpetclinic.services;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface CrudService<T, ID>  {

    Set<T> findByAll();

    T findById(ID id);

    T save (T object);

    void delete (T object);

    void deleteById (ID id);

}

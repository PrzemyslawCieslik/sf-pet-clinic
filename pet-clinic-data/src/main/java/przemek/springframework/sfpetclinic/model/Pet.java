package przemek.springframework.sfpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Pet extends BaseEntity {

    public Pet(Long id, String name, PetType petType, Owner owner, LocalDate birthDate){
        super(id);
        this.name = name;
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;
    }

    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}

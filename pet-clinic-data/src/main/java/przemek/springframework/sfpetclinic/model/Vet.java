package przemek.springframework.sfpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Vets")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialities",
            joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "speciality"))
    private Set<Speciality> specialities;
}

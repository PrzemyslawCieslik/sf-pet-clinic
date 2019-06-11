package przemek.springframework.sfpetclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@Entity
public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;
}

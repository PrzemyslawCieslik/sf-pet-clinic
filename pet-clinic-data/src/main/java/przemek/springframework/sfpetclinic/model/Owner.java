package przemek.springframework.sfpetclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Owner extends Person {

    public Owner(Long id, String firstName, String lastName, String address, String city,
                 String telephone){

        super(id, firstName, lastName);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
    }

    private String address;
    private String city;
    private String telephone;
}

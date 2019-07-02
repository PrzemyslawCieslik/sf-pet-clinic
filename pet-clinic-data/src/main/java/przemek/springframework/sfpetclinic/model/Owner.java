package przemek.springframework.sfpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "owners")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Owner extends Person {

    @Builder
    public Owner(Long id, String firstName, String lastName, String address, String city,
                 String telephone){

        super(id, firstName, lastName);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
    }


    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "telephone")
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets;
}

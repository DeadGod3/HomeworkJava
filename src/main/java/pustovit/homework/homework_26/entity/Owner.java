package pustovit.homework.homework_26.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Setter
@Getter
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String name;
    public int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "second_owner_id")
    private SecondOwner secondOwner;

    @OneToMany(mappedBy = "owner",fetch = FetchType.EAGER)
    private Set<Key> keys;

    @ManyToMany
    @JoinTable(
            name = "owner_car",
            joinColumns = {@JoinColumn(name = "owner_id")},
            inverseJoinColumns = {@JoinColumn(name = "car_id")})
    private Set<Car> cars;
}

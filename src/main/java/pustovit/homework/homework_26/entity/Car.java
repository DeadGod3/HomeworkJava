package pustovit.homework.homework_26.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String model;
    public int year;

    @ManyToMany(mappedBy = "cars")
    private Set<Owner> owner;




}

package pustovit.homework.homework_26.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SecondOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String name;
    public int age;

    @OneToOne(mappedBy = "secondOwner")
    private Owner owner;

}

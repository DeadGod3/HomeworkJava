package pustovit.homework.homework_26.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Key {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public int number;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_id")
    private Owner owner;
}

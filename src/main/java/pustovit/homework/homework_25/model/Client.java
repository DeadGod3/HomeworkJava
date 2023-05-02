package pustovit.homework.homework_25.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "clients")
@Getter
@Setter
@ToString
//@NamedNativeQuery(name = "getAll", query = "SELECT * FROM clients;", resultClass = Client.class)
// - CAN BE SOLO QUERY!
@NamedNativeQueries({
        @NamedNativeQuery(name = "getAll", query = "SELECT * FROM clients;", resultClass = Client.class),
        @NamedNativeQuery(name = "getByPhone", query = "SELECT * FROM clients WHERE phone = :phone", resultClass = Client.class)
})
// NAMED NATIVE QUERIES CAN BE TYPED HERE TO REPLACE PART OF CODE IN SERVICE CLASS!!!
// NAMED NATIVE QUERIES CAN BE TYPED HERE TO REPLACE PART OF CODE IN SERVICE CLASS!!!

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private int phone;
    private String about;

}

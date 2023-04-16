package pustovit.homework.homework_24.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Accounts {
    private int id;
    private int client_id;
    private String number;
    private double value;

}

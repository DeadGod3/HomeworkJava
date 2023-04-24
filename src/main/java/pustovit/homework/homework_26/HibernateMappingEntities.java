package pustovit.homework.homework_26;

import pustovit.homework.homework_26.entity.Car;
import pustovit.homework.homework_26.entity.Owner;
import pustovit.homework.homework_26.entity.SecondOwner;
import pustovit.homework.homework_26.service.CarService;
import pustovit.homework.homework_26.service.OwnerService;

import java.util.HashSet;

public class HibernateMappingEntities {
    public static void main(String[] args) {
        OwnerService ownerService = new OwnerService();
        CarService carService = new CarService();
        Owner owner = new Owner();
        SecondOwner secondOwner = new SecondOwner();
        secondOwner.setAge(22);
        secondOwner.setName("Aleksandr");
        secondOwner.setOwner(owner);
        owner.setName("Ihor");
        owner.setAge(21);
        owner.setSecondOwner(secondOwner);

        final HashSet<Owner> customers = new HashSet<>();
        customers.add(owner);

        Car car = new Car();
        car.setOwner(customers);
        car.setYear(2001);
        car.setModel("Audi");

        carService.save(car);
        ownerService.save(owner);





    }
}

package pustovit.homework.homework_26.service;

import pustovit.homework.homework_26.dao.CarDao;
import pustovit.homework.homework_26.entity.Car;

public class CarService {
    CarDao carDao = new CarDao();

    public void save(Car car){
        carDao.save(car);
    }

}

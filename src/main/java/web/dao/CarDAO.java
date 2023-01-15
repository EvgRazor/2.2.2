package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Honda",2.0, "red"));
        carList.add(new Car("Toyota",1.6, "green"));
        carList.add(new Car("Mitsubishi",1.0, "black"));
        carList.add(new Car("Lada",1.8, "yellow"));
        carList.add(new Car("Volvo",2.4, "blue"));
    }

    public List<Car> getCarList () {
        return carList;
    }

    public List<Car> getCarCounter (int counter) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i <= counter-1; i++) {
            cars.add(carList.get(i));
        }
        return cars;
    }



}

package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private static int id;

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Honda",2.0, "red",id++));
        carList.add(new Car("Toyota",1.6, "green",id++));
        carList.add(new Car("Mitsubishi",1.0, "black",id++));
        carList.add(new Car("Lada",1.8, "yellow",id++));
        carList.add(new Car("Volvo",2.4, "blue",id++));
    }

    @Override
    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public List<Car> getCarCounter(int counter) {
        return carList.stream()
                .filter(car -> counter >= 1 && counter <= carList.size())
                .filter(car -> counter - 1 >= car.getId())
                .toList();
    }

}

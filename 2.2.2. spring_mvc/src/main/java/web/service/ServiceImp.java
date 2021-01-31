package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceImp implements CarService {

    private Car car;

    @Override
    public List<Car> listCar() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", 220, 3));
        list.add(new Car("Mercedes", 290, 7));
        list.add(new Car("Audi", 240, 8));
        list.add(new Car("Toyota", 190, 90));
        list.add(new Car("Nisan", 180, 122));
        return list;
    }

    @Override
    public List<Car> printCar(int count) {
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(listCar().get(i));
        }
        return list;
    }
}

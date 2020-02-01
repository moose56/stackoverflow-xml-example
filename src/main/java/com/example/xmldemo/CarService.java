package com.example.xmldemo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService
{
    public List<Car> findAll()
    {
        var cars = new ArrayList<Car>();

        cars.add(new Car(1, "Ford", "Fiesta"));
        cars.add(new Car(2, "Ford", "Mustang"));
        cars.add(new Car(3, "Ford", "GT40"));

        return cars;
    }
}

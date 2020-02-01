package com.example.xmldemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController
{
    private final CarService carService;

    public CarController(CarService carService)
    {
        this.carService = carService;
    }

    @GetMapping(value="/cars")
    public List<Car> getCars()
    {
        return carService.findAll();
    }
}

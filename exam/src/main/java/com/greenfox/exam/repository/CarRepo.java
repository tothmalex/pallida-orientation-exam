package com.greenfox.exam.repository;

import com.greenfox.exam.model.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepo extends CrudRepository<Car, Long> {

    List<Car> findAllByLicencePlateIsLike(String licencePlate);
    List<Car> findAllByBrandIsLike(String brand);
}

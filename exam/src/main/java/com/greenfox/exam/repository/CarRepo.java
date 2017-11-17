package com.greenfox.exam.repository;

import com.greenfox.exam.model.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepo extends CrudRepository<Car, Long> {

    List<Car> findAllByTitleIsLikeOrGenreIsLikeOrTypeIsLike( String title, String genre, String type);
    List<Car> findAllByLicencePlateIsLike(String licencePlate);
    List<Car> findAllByUsersId(long id);
}

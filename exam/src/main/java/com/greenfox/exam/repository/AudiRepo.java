package com.greenfox.exam.repository;

import com.greenfox.exam.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface AudiRepo extends CrudRepository<Car, Long> {
}

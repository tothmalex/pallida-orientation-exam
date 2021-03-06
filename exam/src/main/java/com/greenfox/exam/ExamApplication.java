package com.greenfox.exam;

import com.greenfox.exam.model.GroupOfCar;
import com.greenfox.exam.repository.AudiRepo;
import com.greenfox.exam.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamApplication implements CommandLineRunner {

	@Autowired
	CarRepo carRepo;

	@Autowired
	AudiRepo audiRepo;

	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}

	@Override
	public void run( String... args ) throws Exception {
		audiRepo.save(GroupOfCar.cars);
	}
}

package com.greenfox.exam.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String plate;
    String carBrand;
    String carModel;
    int year;
    String color;

    public long getId() {
        return id;
    }

    public void setId( long id ) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate( String plate ) {
        this.plate = plate;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand( String carBrand ) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel( String carModel ) {
        this.carModel = carModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear( int year ) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor( String color ) {
        this.color = color;
    }

    public Car() {

    }

    public Car( String plate, String carBrand, String carModel, int year, String color ) {

        this.plate = plate;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.year = year;
        this.color = color;
    }
}

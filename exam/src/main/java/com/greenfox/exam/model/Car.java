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

    String licencePlate;
    String brand;
    String model;
    String color;
    int year;

    public Car( String licencePlate, String brand, String model, String color, int year ) {
        this.licencePlate = licencePlate;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public void setId( long id ) {
        this.id = id;
    }

    public Car() {
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate( String licencePlate ) {
        this.licencePlate = licencePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand( String brand ) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel( String model ) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor( String color ) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear( int year ) {
        this.year = year;
    }
}

package com.greenfox.exam.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupOfCar {

    public static Car first = new Car("HMZ-140","Audi","A8",2016,"red" );
    public static Car second = new Car("HMZ-555", "BMW","Z4",2011, "pink");

    public static List<Car> cars = new ArrayList<Car>(Arrays.asList(
            first,second));
}

package com.telran.org.lessonnine;

import java.util.Arrays;

public class CarTest {

    public static void main(String[] args) {
        Car carOne = new Car();
        carOne.price = 2.3;
        carOne.model = "BMW";

        Car carTwo = new Car();
        carTwo.price = 3.4;
        carTwo.model = "Honda";

        Car carThree = new Car();
        carThree.price = 4.5;
        carThree.model = "VW";

        Car carFour = new Car();
        carFour.price = 5.1;
        carFour.model = "Peugeot";
        
        Car carFive = new Car();
        carFive.price = 4.2;
        carFive.model = "Smart";

        Car [] cars = {carOne, carTwo, carThree, carFour, carFive};

        System.out.println(Arrays.toString(cars));

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length - 1 - i ; j++) {
                    if (cars[j].price > cars[j + 1].price) {
                    Car temp = cars[j + 1];
                    cars[j + 1] = cars[j];
                    cars[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(cars));

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length - 1 - i ; j++) {
                if (cars[j].model.compareTo(cars[j + 1].model)>0) {
                    Car temp = cars[j + 1];
                    cars[j + 1] = cars[j];
                    cars[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(cars));
    }
}

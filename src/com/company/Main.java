package com.company;

public class Main {

    public static void main(String[] args) {

        Car porshe = new Car("porshe",314);
        Car lambo;
        lambo = new Car ("lambo",310);

        System.out.println( porshe.getCarName() + " + " + lambo.getCarName() + " = " + (porshe.getHorsePower() + lambo.getHorsePower()) );















    }
}

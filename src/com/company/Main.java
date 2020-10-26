package com.company;

public class Main {

    public static void main(String[] args) {

        Car porshe = new Car("porshe",300);
        Car lambo;
        lambo = new Car ("lambo",310);

        porshe.engineStart();
        lambo.engineStop();
        porshe.getHorsePower();
        System.out.println("ЛОШАДИНЫЕ СИЛЫ У ЛАМБЫ " + lambo.getHorsePower());
        System.out.println("Сила машины " + lambo.getCarName() + ": " + lambo.getHorsePower());
        porshe.setHorsePower(300);
        System.out.println("Измененная сила: " + lambo.engineStop(););















    }
}

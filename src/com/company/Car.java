package com.company;

public class Car{

        private int wheels = 4;
       private int horsePower;
       private int seats = 4;
       private String carName;

        public Car(String carName, int horsePower){
            this.carName = carName;
            this.horsePower = horsePower;
            System.out.println("Machine was create, name:" + carName + " power:" + horsePower);
        }

        public void engineStart (){
            System.out.println("Machine " + carName +  " started");
        }

        public void engineStop(){
            System.out.println("Machine " + carName + " turn off");
        }

        public int getHorsePower(){
            return horsePower;
        }

        public String getCarName(){
            return carName;
        }

        public void setHorsePower(int power){
            this.horsePower = power;
            System.out.println("Мощность " + carName + "изменена на: " + power);
        }
}

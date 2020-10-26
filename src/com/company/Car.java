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

    public int getWheels() {
        return wheels;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getSeats() {
        return seats;
    }

    public String getCarName() {
        return carName;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}

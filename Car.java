package homework_12;


public abstract class Car implements Car_Interface {
  public int price;
    public int fuelConsumption;
    public int maxSpeed;
    public int numberOfAirbag;

    public Car(int price, int fuelConsumption, int maxSpeed, int numberOfAirbag) {
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.numberOfAirbag = numberOfAirbag;
    }



    public int getNumberOfAirbag() {

        return numberOfAirbag;
    }

    public void setNumberOfAirbag(int numberOfAirbag) {

        this.numberOfAirbag = numberOfAirbag;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", fuelConsumption=" + fuelConsumption +
                ", maxSpeed=" + maxSpeed +
                ", numberOfAirbag=" + numberOfAirbag +
                '}';
    }

    abstract public String WhatIsThisCar (String qualit);
}


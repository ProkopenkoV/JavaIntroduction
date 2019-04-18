package homework_12;


public class Jaguar  extends F_Class {
    int numberOfDrivingWheels; //количество ведущих колес.

    public Jaguar(int price, int fuelConsumption, int maxSpeed, int numberOfAirbag, int numberOfDrivingWheels) {
        super(price, fuelConsumption, maxSpeed, numberOfAirbag);
        this.numberOfDrivingWheels = numberOfDrivingWheels;
    }

    public int getNumberOfDrivingWheels() {
        return numberOfDrivingWheels;
    }

    public void setNumberOfDrivingWheels(int numberOfDrivingWheels) {
        this.numberOfDrivingWheels = numberOfDrivingWheels;
    }

    @Override
    public String toString() {
        return "The car is in the entered speed range is JAGUAR XJ which consists of the following characteristics: "+"Price= $ " + this.getPrice() + "  Fuel consumption= " + this.getFuelConsumption() + " liters Max speed= " + this.getMaxSpeed()+"km/h Number of airbag= "+this.getNumberOfAirbag() +
                " Number of driving wheels= " + this.getNumberOfDrivingWheels()+"\n   This car belongs to the F-class segment";

    }

    @Override
    public int getPrice(int price) {
        return 0;
    }
}

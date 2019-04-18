package homework_12;

// Европейский сегмент легковых автомобилей = F = Luxury cars
// Jaguar XJ
public class F_Class extends Car {

    public F_Class(int price, int fuelConsumption, int maxSpeed, int numberOfAirbag) {
        super(price, fuelConsumption, maxSpeed, numberOfAirbag);

    }
    public String WhatIsThisCar (String qualit){
        qualit="Brilliant car...";
        String res=qualit;
        System.out.println(res);

        return res;
    }

    @Override
    public int getPrice(int price) {
        return 0;
    }
}
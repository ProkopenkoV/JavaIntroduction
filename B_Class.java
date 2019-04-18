package homework_12;


// Европейский сегмент легковых автомобилей = B = Small class
// LADA Kalina
public class B_Class extends Car {
    String qualit;

    public B_Class(int price, int fuelConsumption, int maxSpeed, int numberOfAirbag) {
        super(price, fuelConsumption, maxSpeed, numberOfAirbag);
    }
    public String WhatIsThisCar (String qualit){
        qualit="Bad car...";
        String res=qualit;
        System.out.println(res);

        return res;
    }
    @Override
    public int getNumberOfAirbag() { //заглушил ,т.к. B-class не имеет подушек бехопасности
        return 0;
    } //для того,чтобы всегда выводило количество подушек = 0

    @Override
    public int getPrice(int price) {
        return 0;
    }


}


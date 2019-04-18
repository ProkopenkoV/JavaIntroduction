package homework_12;

import homework_12_inter.CarStorage;
import homework_12_inter.FileCarsStorage;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        CarStorage storage = new FileCarsStorage("input.txt","out.txt");
        Car[] cars = storage.readCars();
        storage.writeCars(cars);



       /* Car[] cars = new Car[]{
                new LadaKalina(13000,6,160,2,5),
                new JaguarXJ(100000,15,300,9,8),
                new AudiA7(60000,14,260,10,7),



        };*/







        /*System.out.println("INFORMATION ABOUT CARS IN THE TAXI PARK");

        TaxiPark endTask = new TaxiPark(cars);

        Car[] end;

        System.out.print(endTask.CostOfAllCars());
        System.out.println(" ");
        try{
            end=endTask.getCarsByMaxSpeed(290,400);
            for(int i = 0; i < end.length; i++)
                System.out.println(end[i].toString());
        }catch(Exception e){
            System.out.println("It's impossible to display the technical specifications of the cars staying in a taxi park due to a negative speed value.\n   Car speed must be more than zero. Try again. ");
        }*/

        //Car_Interface audi = new AudiQ8();
       // System.out.print(audi.getPrice(70000));
       // Car_Interface bmw =  new BMWX5();
        //System.out.print(bmw.getPrice(65000));

    }

}

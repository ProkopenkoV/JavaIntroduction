package homework_12_inter;


import homework_12.Car;

import java.io.FileNotFoundException;
import java.*;
import java.io.IOException;

public interface CarStorage {

    Car[] readCars ();
    void writeCars(Car[] cars);

}

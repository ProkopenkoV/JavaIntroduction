package homework_12_inter;


import homework_12.Car;

import java.io.FileNotFoundException;
import java.*;
import java.io.IOException;
import java.util.List;

public interface CarStorage {

    List<Car> readCars ();
    void writeCars(List<Car> cars);

}

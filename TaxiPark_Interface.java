package homework_12;

import java.util.List;

public interface TaxiPark_Interface {
    public int CostOfAllCars();
    public void sortByFuelConsumption();
    public List<Car> getCarsByMaxSpeed(int min, int max) throws NegativeSpeedException;
}

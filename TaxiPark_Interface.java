package homework_12;

public interface TaxiPark_Interface {
    public int CostOfAllCars();
    public void sortByFuelConsumption();
    public Car[] getCarsByMaxSpeed(int min, int max) throws NegativeSpeedException;
    public Car[] arrayCopyAndPlusOneElement(Car[] car);
    public Car[] removingElementByIndex(Car[] cars, int index);
}

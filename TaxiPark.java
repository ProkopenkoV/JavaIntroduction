package homework_12;


import java.util.Arrays;
import java.util.List;

class TaxiPark implements TaxiPark_Interface {
    public List<Car> cars;
    public Car car;

    TaxiPark(List<Car> cars) {

        this.cars = cars;
    }

    public int CostOfAllCars() {
        System.out.println(" ");
        System.out.print("1. Cost of all cars : $ ");

        int cost = 0;
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            cost += car.getPrice();
        }


        return cost;

    }

    public void sortByFuelConsumption() {
        for (int i = 0; i < cars.size(); i++) {
            for (int j = i + 1; j < cars.size(); j++) {
                if (cars.get(j).getFuelConsumption() > cars.get(i).getFuelConsumption()) {
                    Car temp = cars.get(j);
                    cars.set(j,cars.get(i) );
                    cars.set(i,temp );
                }
            }
        }
    }

    public List<Car> getCarsByMaxSpeed(int min, int max) throws NegativeSpeedException {
        System.out.print("\n2. ");
        if(min<0 || max<0){
            throw new NegativeSpeedException();
        }
        List<Car> temp = cars;
        for (int i = 0; i < cars.size(); i++) {
            if (!(cars.get(i).getMaxSpeed() >= min && cars.get(i).getMaxSpeed() <= max)) {
                temp.add(car);

            }

        }
        return temp;
    }




}











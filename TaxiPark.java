package homework_12;


import java.util.Arrays;

class TaxiPark implements TaxiPark_Interface {
    public Car[] cars;
    public Car car;

    TaxiPark(Car[] cars) {
        this.cars = cars;
    }

    public int CostOfAllCars() {
        System.out.println(" ");
        System.out.print("1. Cost of all cars : $ ");

        int cost = 0;
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            cost += car.getPrice();
        }


        return cost;

    }

    public void sortByFuelConsumption() {
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[j].getFuelConsumption() > cars[i].getFuelConsumption()) {
                    Car temp = cars[j];
                    cars[j] = cars[i];
                    cars[i] = temp;
                }
            }
        }
    }

    public Car[] getCarsByMaxSpeed(int min, int max) throws NegativeSpeedException {
        System.out.print("\n2. ");
        if(min<0 || max<0){
            throw new NegativeSpeedException();
        }
        Car[] temp = cars;
        for (int i = 0; i < cars.length; i++) {
            if (!(cars[i].getMaxSpeed() >= min && cars[i].getMaxSpeed() <= max)) {
                temp = removingElementByIndex(temp, i);

            }

        }
        return temp;
    }



    public Car[] arrayCopyAndPlusOneElement(Car[] car) {
        Car[] temp = new Car[car.length+1];
        for (int i = 0; i < car.length; i++)
            car[i] = temp[i];
        return temp;
    }


    @Override
    public String toString() {
        return "TaxiPark{" +
                "cars=" + Arrays.toString(cars) +
                ", car=" + car +
                '}';
    }

    public Car[] removingElementByIndex(Car[] cars , int index){
        Car[] newCars = new Car[cars.length-1];
        for(int i = 0, j = 0; j < newCars.length; i++, j++){
            if(index==i){
                j--;
            }else {
                newCars[j]=cars[i];
            }
        }
        return newCars;
    }


}











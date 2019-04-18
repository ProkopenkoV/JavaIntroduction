package homework_12;



public class Audi extends E_Class {
    int numberOfGearTransmission; //количество ступеней механической коробки передач

    public Audi(int price, int fuelConsumption, int maxSpeed, int numberOfAirbag, int numberOfGearTransmission) {
        super(price, fuelConsumption, maxSpeed, numberOfAirbag);
        this.numberOfGearTransmission = numberOfGearTransmission;
    }



    public int getNumberOfGearTransmission() {
        return numberOfGearTransmission;
    }

    public void setNumberOfGearTransmission(int numberOfGearTransmission) {
        this.numberOfGearTransmission = numberOfGearTransmission;
    }

    @Override
    public String toString() {
        return "   The car is in the entered speed range is AUDI A7 which consists of the following characteristics:  "+"   Price= $ " + this.getPrice() + "  Fuel consumption= " + this.getFuelConsumption() + "liters Max speed= " + this.getMaxSpeed()+"km/h Number of airbag= "+this.getNumberOfAirbag()
                +" Number of gear transmission= " +this.getNumberOfGearTransmission()+ "steps gearbox"+"\n   This car belongs to the E-class segment ";
    }

    @Override
    public int getPrice(int price) {
        return 0;
    }

    @Override
    public String toFileFormat() {
        String output ="Audi ";
        return "";
    }
}


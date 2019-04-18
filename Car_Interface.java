package homework_12;


public interface Car_Interface  {

    public int getNumberOfAirbag();

    public void setNumberOfAirbag(int numberOfAirbag);

    public int getPrice(int price);

    public void setPrice(int price);

    public int getFuelConsumption();

    public void setFuelConsumption(int fuelConsumption);

    public int getMaxSpeed();

    public void setMaxSpeed(int maxSpeed);

    default String toFileFormat(){
     return "";
    }
}

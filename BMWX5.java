package homework_12;


public class BMWX5 implements Car_Interface {


    @Override
    public int getNumberOfAirbag() {
        return 0;
    }

    @Override
    public void setNumberOfAirbag(int numberOfAirbag) {

    }

    @Override
    public int getPrice(int price) {
        int res=0;
        System.out.print("\n   BMW X5 starting at $ ");
        res=res+price;
        return res;
    }

    @Override
    public void setPrice(int price) {

    }

    @Override
    public int getFuelConsumption() {
        return 0;
    }

    @Override
    public void setFuelConsumption(int fuelConsumption) {

    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {

    }
}

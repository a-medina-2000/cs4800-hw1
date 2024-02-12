import java.sql.SQLOutput;

public class CruiseShip extends Ship{
    private int maxPassengerLimit;

    public CruiseShip() {
        maxPassengerLimit = 0;
    }

    public void setMaxPassengerLimit(int maxNumberOfPassengers) {
        this.maxPassengerLimit = maxNumberOfPassengers;
    }

    public int getMaxPassengerLimit() {
        return maxPassengerLimit;
    }

    @Override
    public void printer() {
        System.out.println("Ship Name: " + getShipName());
        System.out.println("Ship Passenger Capacity: " + getMaxPassengerLimit());
    }
}

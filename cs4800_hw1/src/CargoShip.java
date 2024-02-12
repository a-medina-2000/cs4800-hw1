public class CargoShip extends Ship{
    private int shipTonnageLimit;
    public CargoShip() {
        shipTonnageLimit = 0;
    }

    public void setShipTonnageLimit(int shipTonnageLimit) {
        this.shipTonnageLimit = shipTonnageLimit;
    }

    public int getShipTonnageLimit() {
        return shipTonnageLimit;
    }

    @Override
    public void printer() {
        System.out.println("Ship Name: " + getShipName());
        System.out.println("Ship Cargo Limit: " + getShipTonnageLimit());
    }
}

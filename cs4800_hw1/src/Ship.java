public class Ship {
    private String shipName;
    private String yearBuilt;

    public void setShipName(String nameOfShip) {
        this.shipName = nameOfShip;
    }
    public void setYearBuilt(String yearShipBuilt) {
        this.yearBuilt = yearShipBuilt;
    }

    public String getShipName() {
        return shipName;
    }
    public String getYearBuilt() {
        return yearBuilt;
    }

    public void printer() {
        System.out.println("Ship name: " + getShipName());
        System.out.println("Year ship was built: " + getYearBuilt());
    }
}

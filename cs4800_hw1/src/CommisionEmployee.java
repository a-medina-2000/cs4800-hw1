public class CommisionEmployee extends Employee {
    private int commisionRate;
    private int grossSales;

    public CommisionEmployee() {
        commisionRate = 0;
        grossSales = 0;
    }

    public void setCommisionRate(int employeeCommisionRate) {
        this.commisionRate = employeeCommisionRate;
    }
    public void setGrossSales(int employeeGrossSales) {
        this.grossSales = employeeGrossSales;
    }

    public int getCommisionRate() {
        return commisionRate;
    }
    public int getGrossSales() {
        return grossSales;
    }
}

public class SalariedEmployee extends Employee {
    private int weeklySalary;

    public SalariedEmployee() {
        weeklySalary = 0;
    }
    public void setWeeklySalary(int weeklySalaryReceived) {
        this.weeklySalary = weeklySalaryReceived;
    }
    public int getWeeklySalary() {
        return weeklySalary;
    }
}

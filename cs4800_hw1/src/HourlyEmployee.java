public class HourlyEmployee extends Employee {
    private int wage;
    private int hoursWorked;
    public HourlyEmployee() {
        wage = 0;
        hoursWorked = 0;
    }
    public void setWage(int workerWage) {
        this.wage = workerWage;
    }
    public void setHoursWorked(int employeeHoursWorked) {
        this.hoursWorked = employeeHoursWorked;
    }
}

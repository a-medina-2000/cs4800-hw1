public class BaseEmployee extends Employee {
    private int baseSalary;
    public BaseEmployee() {
        baseSalary = 0;
    }

    public void setBaseSalary(int employeeBaseSalary) {
        this.baseSalary = employeeBaseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}

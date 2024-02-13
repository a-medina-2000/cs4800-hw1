
public class Main {
    public static void main(String[] args) {
        // Inheritance - "Is A" Relationship
        SalariedEmployee employeeOne = new SalariedEmployee();
        employeeOne.setFirstName("Joe");
        employeeOne.setLastName("Jones");
        employeeOne.setSocialNumber("111-11-1111");
        employeeOne.setWeeklySalary(2_500);

        HourlyEmployee employeeTwo = new HourlyEmployee();
        employeeTwo.setFirstName("Stephanie");
        employeeTwo.setLastName("Smith");
        employeeTwo.setSocialNumber("222-22-2222");
        employeeTwo.setWage(25);
        employeeTwo.setHoursWorked(32);

        HourlyEmployee employeeThree = new HourlyEmployee();
        employeeThree.setFirstName("Mary");
        employeeThree.setLastName("Quinn");
        employeeThree.setSocialNumber("333-33-3333");
        employeeThree.setWage(19);
        employeeThree.setHoursWorked(47);

        CommisionEmployee employeeFour = new CommisionEmployee();
        employeeFour.setFirstName("Nicole");
        employeeFour.setLastName("Dior");
        employeeFour.setSocialNumber("444-44-4444");
        employeeFour.setCommisionRate(15);
        employeeFour.setGrossSales(50_000);

        SalariedEmployee employeeFive = new SalariedEmployee();
        employeeFive.setFirstName("Renwa");
        employeeFive.setLastName("Chanel");
        employeeFive.setSocialNumber("555-55-5555");
        employeeFive.setWeeklySalary(1_700);

        BaseEmployee employeeSix = new BaseEmployee();
        employeeSix.setFirstName("Mike");
        employeeSix.setLastName("Davenport");
        employeeSix.setSocialNumber("666-66-6666");
        employeeSix.setBaseSalary(95_000);

        CommisionEmployee employeeSeven = new CommisionEmployee();
        employeeSeven.setFirstName("Mahnaz");
        employeeSeven.setLastName("Vaziri");
        employeeSeven.setSocialNumber("777-77-7777");
        employeeSeven.setCommisionRate(22);
        employeeSeven.setGrossSales(40_000);

        // Polymorphism
        Ship[] shipGroup = new Ship[3];
        shipGroup[0] = new Ship();
        Ship shipOne = (Ship)shipGroup[0];
        shipOne.setShipName("SS Yorker");
        shipOne.setYearBuilt("1909");

        shipGroup[1] = new CruiseShip();
        CruiseShip shipTwo = (CruiseShip)shipGroup[1];
        shipTwo.setShipName("SS Retriever");
        shipTwo.setMaxPassengerLimit(800);

        shipGroup[2] = new CargoShip();
        CargoShip shipThree = (CargoShip)shipGroup[2];
        shipThree.setShipName("SS Hauler");
        shipThree.setShipTonnageLimit(10000);

        for(int i = 0; i < shipGroup.length; i++)
        {
            shipGroup[i].printer();
        }

        Course course = new Course();
        Instructor instructor = new Instructor();
        Textbook textbook = new Textbook();

        instructor.setInstructorFirstName("Nima");
        instructor.setInstructorLastName("Davarpanah");
        instructor.setInstructorOfficeNumber("Office 3-2636");
        textbook.setTextbookTitle("Clean Code");
        textbook.setTextbookAuthor("Robert C. Martin");
        textbook.setTextbookPublisher("Pearson");
        course.printer();
    }
}

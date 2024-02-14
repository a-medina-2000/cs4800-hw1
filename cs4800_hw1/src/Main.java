
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

        // Polymorphism - reuse classes
        Ship[] shipGroup = new Ship[3];
        shipGroup[0] = new Ship();
        Ship shipOne = shipGroup[0];
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

        for (Ship shipDisplay : shipGroup) {
            shipDisplay.printer();
        }

        // Aggregation - "HAS A" Relationship
        System.out.println("\n--------------");
        Course course = new Course();
        course.setCourseName("CS 4800 - Software Engineering");
        course.instructor.setInstructorFirstName("Nima");
        course.instructor.setInstructorLastName("Davarpanah");
        course.instructor.setInstructorOfficeNumber("Office 3-2636");
        course.textbook.setTextbookTitle("Clean Code");
        course.textbook.setTextbookAuthor("Robert C. Martin");
        course.textbook.setTextbookPublisher("Pearson");
        course.printer();

        Course scienceCourse = new Course();
        scienceCourse.setCourseName("BIO 1080 - Biology Intro");
        scienceCourse.instructor.setInstructorFirstName("Jack");
        scienceCourse.instructor.setInstructorLastName("Smith");
        scienceCourse.instructor.setInstructorOfficeNumber("Office 8-08");
        scienceCourse.textbook.setTextbookTitle("Biology: An Introduction");
        scienceCourse.textbook.setTextbookAuthor("Janey Ablersch");
        scienceCourse.textbook.setTextbookPublisher("Wiley");
        scienceCourse.printer();

        Course mathCourse = new Course();
        mathCourse.setCourseName("MATH 4060 - Calculus 2");
        mathCourse.instructor.setInstructorFirstName("Issac");
        mathCourse.instructor.setInstructorLastName("Asimov");
        mathCourse.instructor.setInstructorOfficeNumber("Office 8-3250");
        mathCourse.textbook.setTextbookTitle("Calculus: The Sequel");
        mathCourse.textbook.setTextbookAuthor("Frank Roberts");
        mathCourse.textbook.setTextbookPublisher("Wulters Klewer");
        mathCourse.printer();

        System.out.println("\n--------------");

        //Composition - "OWN A" Relationship
        Folder folder = new Folder("php_demo1", "text", ".txt");
        folder.printer();
    }
}

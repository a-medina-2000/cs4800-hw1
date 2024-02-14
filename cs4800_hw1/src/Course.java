import org.w3c.dom.Text;

public class Course {
    private String courseName;
    Instructor instructor;
    Textbook textbook;

    public Course() {
        this.courseName = "";
        this.instructor = new Instructor();
        this.textbook = new Textbook();
    }

    public void setCourseName(String courseFullName) {
        this.courseName = courseFullName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void printer() {
        System.out.println("\nCourse Name: " + getCourseName());
        System.out.println("Instructor Name: " + instructor.getInstructorFirstName() + " " + instructor.getInstructorLastName());
        System.out.println("Textbook Title: " + textbook.getTextbookTitle());
        System.out.println("Textbook Author: " + textbook.getTextbookAuthor());
    }
}
class Instructor {
    private String instructorFirstName;
    private String instructorLastName;
    private String instructorOfficeNumber;

    public Instructor() {
        this.instructorFirstName = "";
        this.instructorLastName = "";
        this.instructorOfficeNumber = "";
    }

    public void setInstructorFirstName(String instructFirstName) {
        this.instructorFirstName = instructFirstName;
    }
    public void setInstructorLastName(String instructLastName) {
        this.instructorLastName = instructLastName;
    }
    public void setInstructorOfficeNumber(String instructOfficeNumber) {
        this.instructorOfficeNumber = instructOfficeNumber;
    }

    public String getInstructorFirstName() {
        return instructorFirstName;
    }
    public String getInstructorLastName() {
        return instructorLastName;
    }
    public String getInstructorOfficeNumber() {
        return instructorOfficeNumber;
    }
}

class Textbook {
    private String textbookTitle;
    private String textbookAuthor;
    private String textbookPublisher;

    public Textbook() {
        this.textbookTitle = "";
        this.textbookAuthor = "";
        this.textbookPublisher = "";
    }

    public void setTextbookTitle(String bookTitle) {
        this.textbookTitle = bookTitle;
    }
    public void setTextbookAuthor(String bookAuthor) {
        this.textbookAuthor = bookAuthor;
    }
    public void setTextbookPublisher(String bookPublisher) {
        this.textbookPublisher = bookPublisher;
    }

    public String getTextbookTitle() {
        return textbookTitle;
    }
    public String getTextbookAuthor() {
        return textbookAuthor;
    }
    public String getTextbookPublisher() {
        return textbookPublisher;
    }
}

public class Course {
    private String courseName;
    Instructor instructor;
    Textbook textbook;

    public Course() {
        courseName = "";

    }

    public void setCourseName(String courseFullName) {
        this.courseName = courseFullName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void printer() {
        System.out.println("Course Name: " + getCourseName());
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
        instructorFirstName = "";
        instructorLastName = "";
        instructorOfficeNumber = "";
    }

    public void setInstructorFirstName(String instructFirstName) {
        this.instructorFirstName = instructFirstName;
    }
    public void setInstructorLastName(String instructLastName) {
        this.instructorLastName = instructorLastName;
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
        textbookTitle = "";
        textbookAuthor = "";
        textbookPublisher = "";
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

public class Employee {
    private String firstName;
    private String lastName;
    private String socialNumber;

    public Employee() {
        firstName = "";
        lastName = "";
        socialNumber = "";
    }

    public void setFirstName(String fName) {
        this.firstName = fName;
    }
    public void setLastName(String LName) {
        this.lastName = LName;
    }
    public void setSocialNumber(String socialSecNum) {
        this.socialNumber = socialSecNum;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSocialNumber() {
        return socialNumber;    }
}

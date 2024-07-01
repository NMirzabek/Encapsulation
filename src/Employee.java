public class Employee {
    private String identificationNumber;
    private String firstName;
    private String lastName;
    private String month;

    public Employee(String identificationNumber, String firstName, String lastName, String month){
        this.identificationNumber = identificationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMonth() {
        return month;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void displayEmployeeDetails() {
        System.out.println("Identification number: " + identificationNumber);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Month: " + month);
    }





}

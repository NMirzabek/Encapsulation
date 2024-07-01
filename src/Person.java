import java.time.LocalDate;
import java.time.Year;

public class Person {
    String firstName;
    String lastName;
    int age;
    int birthYear;



    public void calculateBirthYear (int age) {

         this.birthYear = Year.now().getValue() - age;
    }
}

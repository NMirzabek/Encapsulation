import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(1, 25, 8);
        System.out.println(time.getTime());

        Person abdulla = new Person();

        System.out.print("Enter age: ");
        Scanner scanner = new Scanner(System.in);
        int personAge = scanner.nextInt();
        abdulla.calculateBirthYear(personAge);
        System.out.println(abdulla.birthYear);

    }

}
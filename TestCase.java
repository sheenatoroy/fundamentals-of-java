import java.util.Scanner;
public class TestCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int februaryDays = 29;

        System.out.println("Enter a date: ");
        String result = scanner.nextLine();

        result = (februaryDays == 28) ? "Leap Year" : "Not a Leap Year";
        System.out.println(result);

    }
}

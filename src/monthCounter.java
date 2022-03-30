import java.time.Month;
import java.util.Scanner;
public class monthCounter {
    public static void main(String[] args) {
        Scanner month = new Scanner(System.in);
        try {
            System.out.println("enter a month number");
            int monthNumber = month.nextInt();
            System.out.println(Month.of(monthNumber));
        } catch (Exception e) {
            System.out.println("Entered month number not correct");
        }
    }
}
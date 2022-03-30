import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);
        try {


            int firstNumber;
            int secondNumber;

            System.out.println("enter first integer number");
            firstNumber = vvod.nextInt();
            System.out.println("enter 2nd integer number");
            secondNumber = vvod.nextInt();

            System.out.println("Sum= " + (firstNumber + secondNumber));
            System.out.println("Mutli= " + (firstNumber * secondNumber));
        } catch (Exception e) {
           System.out.println("Entered not integer value");

            }
        }

    }


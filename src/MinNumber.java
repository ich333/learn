import java.util.Scanner;
public class MinNumber {
    public static void main(String[] args) {
        System.out.print("How much number you want enter? ");
        Scanner howMuchNumbers = new Scanner(System.in);
        int size = howMuchNumbers.nextInt();
         int[]  sourceNumbers = new int[size];
        System.out.print("Enter integer numbers with <Space> between numbers " + "and press <Enter>: ");
        for (int i = 0; i < size; i++) {
            sourceNumbers[i] = howMuchNumbers.nextInt();
                    }
        int minimalNumber = sourceNumbers[0];
        for (int i = 0; i < size; i++) {
            if (minimalNumber > sourceNumbers[i])
                minimalNumber = sourceNumbers[i];
        }
        System.out.println("Minimal number is:" + minimalNumber);
            }
}

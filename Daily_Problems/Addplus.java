import java.util.InputMismatchException;
import java.util.Scanner;

public class Addplus {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        try {
            System.out.println("Enter Number:");
            int num = obj.nextInt();
            num = num + 1;
            System.out.println("Increased number is: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            obj.close(); // Closing the scanner to prevent resource leak
        }
    }
}

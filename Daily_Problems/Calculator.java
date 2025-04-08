import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("CALCULATOR");
            System.out.println("Enter 'add', 'substract','multiply','divide','exit'");
            String operation = sc.nextLine().toLowerCase();

            if (operation.equals("exit")) {
                System.out.println("Thank You");
                break;
            } else if (operation.equals("add") || operation.equals("substract") || operation.equals("multiply")
                    || operation.equals("divide")) {
                try {
                    System.out.println("Enter First Number: ");
                    double num1 = sc.nextDouble();
                    System.out.println("Enter Second Number: ");
                    double num2 = sc.nextDouble();

                    double res = 0;
                    if (operation.equals("add")) {
                        res = num1 + num2;
                        System.out.println(num1 + "+" + num2 + "=" + res);

                    } else if (operation.equals("substract")) {
                        res = num1 - num2;
                        System.out.println(num1 + "-" + num2 + "=" + res);
                    } else if (operation.equals("multiply")) {
                        res = num1 * num2;
                        System.out.println(num1 + "*" + num2 + "=" + res);
                    } else if (operation.equals("divide")) {
                        if (num2 != 0) {
                            res = num1 / num2;
                            System.out.println(num1 + "/" + num2 + "=" + res);

                        } else {
                            System.out.println("Cannot Divide by ZERO");

                        }
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input (Enter number only)");
                    sc.nextLine();

                }
            } else {
                System.out.println("Invalid operation");

            }
        }
    }
}

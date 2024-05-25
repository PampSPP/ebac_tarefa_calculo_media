import java.util.Scanner;

/**
 * @author PampSPP
 */

public class Main {
    public static void main(String[] args) {

        float number1;
        float number2;
        float number3;
        float number4;

        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter the first grade (1-10):");

        float grade1 = num1.nextFloat();
        number1 = grade1;

        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter the second grade (1-10):");

        float grade2 = num2.nextFloat();
        number2 = grade2;

        Scanner num3 = new Scanner(System.in);
        System.out.println("Enter the third grade (1-10):");

        float grade3 = num3.nextFloat();
        number3 = grade3;

        Scanner num4 = new Scanner(System.in);
        System.out.println("Enter the forth grade (1-10):");

        float grade4 = num4.nextFloat();
        number4 = grade4;

        float result = (number1 + number2 + number3 + number4) / 4;

        if (result >= 7) {
            System.out.println("You were approved and your result was: " + result);
        } else {
            System.out.println("Unfortunately you were not approved. Your result was: " + result);
        }
    }
}
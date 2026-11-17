
import java.util.Scanner;

public class LineEquation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Въведете координатите на първата точка:");

        System.out.print("x1 = ");
        double x1 = input.nextDouble();

        System.out.print("y1 = ");
        double y1 = input.nextDouble();

        System.out.println("Въведете координатите на втората точка:");

        System.out.print("x2 = ");
        double x2 = input.nextDouble();

        System.out.print("y2 = ");
        double y2 = input.nextDouble();

        if (x1 == x2 && y1 == y2) {
            System.out.println("Двете точки съвпадат!");
            return;
        }


        double A = y1 - y2;
        double B = x2 - x1;
        double C = x1 * y2 - x2 * y1;

        System.out.println("\nУравнение на правата:");

        System.out.println(A + "x + " + B + "y + " + C + " = 0");

        input.close();
    }
}

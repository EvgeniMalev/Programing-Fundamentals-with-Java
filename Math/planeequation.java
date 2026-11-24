
import java.util.Scanner;

public class PlaneEquation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[][] p = new double[3][3];

        System.out.println("Enter coordinates of three points:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Point " + (i + 1));

            System.out.print("x = ");
            p[i][0] = scanner.nextDouble();

            System.out.print("y = ");
            p[i][1] = scanner.nextDouble();

            System.out.print("z = ");
            p[i][2] = scanner.nextDouble();
        }

        double a1 = p[1][0] - p[0][0];
        double a2 = p[1][1] - p[0][1];
        double a3 = p[1][2] - p[0][2];

        double b1 = p[2][0] - p[0][0];
        double b2 = p[2][1] - p[0][1];
        double b3 = p[2][2] - p[0][2];

        

        double A = a2 * b3 - a3 * b2;
        double B = a3 * b1 - a1 * b3;
        double C = a1 * b2 - a2 * b1;

  

        if (Math.abs(A) < 1e-10 &&
            Math.abs(B) < 1e-10 &&
            Math.abs(C) < 1e-10) {

            System.out.println(
                "The three points do not define a plane."
            );

        } else {

            

            double D = -(A * p[0][0]
                       + B * p[0][1]
                       + C * p[0][2]);

            System.out.println("\nPlane equation:");

            System.out.printf(
                "%.2fx + %.2fy + %.2fz + %.2f = 0%n",
                A, B, C, D
            );
        }

        scanner.close();
    }
}

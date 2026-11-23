
import java.util.Scanner;

public class PlaneEquation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of point P1:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double z1 = sc.nextDouble();

        System.out.println("Enter coordinates of point P2:");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double z2 = sc.nextDouble();

        System.out.println("Enter coordinates of point P3:");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double z3 = sc.nextDouble();

        double ux = x2 - x1;
        double uy = y2 - y1;
        double uz = z2 - z1;

        double vx = x3 - x1;
        double vy = y3 - y1;
        double vz = z3 - z1;

        double A = uy * vz - uz * vy;
        double B = uz * vx - ux * vz;
        double C = ux * vy - uy * vx;

        if (Math.abs(A) < 1e-10 &&
            Math.abs(B) < 1e-10 &&
            Math.abs(C) < 1e-10) {

            System.out.println("The points are collinear.");
            return;
        }

        double D = -(A * x1 + B * y1 + C * z1);

        System.out.println("\nPlane equation:");

        System.out.printf(
            "%.2fx + %.2fy + %.2fz + %.2f = 0%n",
            A, B, C, D
        );

        sc.close();
    }
}


import java.util.Scanner;

public class VectorAddition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Въведете размерността на векторите: ");
        n = scanner.nextInt();

        double[] A = new double[n];
        double[] B = new double[n];
        double[] C = new double[n];

      
        System.out.println("Въведете елементите на вектор A:");

        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextDouble();
        }

        
        System.out.println("Въведете елементите на вектор B:");

        for (int i = 0; i < n; i++) {
            B[i] = scanner.nextDouble();
        }

       
        for (int i = 0; i < n; i++) {
            C[i] = A[i] + B[i];
        }

       
        System.out.println("Резултатен вектор C:");

        for (int i = 0; i < n; i++) {
            System.out.print(C[i] + " ");
        }

        scanner.close();
    }
}

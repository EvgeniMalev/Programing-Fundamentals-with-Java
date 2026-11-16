
import java.util.Scanner;

public class VectorOperations {

 
    public static double scalarProduct(
            double[] a, double[] b) {

        return a[0] * b[0]
             + a[1] * b[1]
             + a[2] * b[2];
    }

 
    public static double[] vectorProduct(
            double[] a, double[] b) {

        double[] result = new double[3];

        result[0] = a[1] * b[2] - a[2] * b[1];
        result[1] = a[2] * b[0] - a[0] * b[2];
        result[2] = a[0] * b[1] - a[1] * b[0];

        return result;
    }


    public static double mixedProduct(
            double[] a, double[] b, double[] c) {

        double[] cross = vectorProduct(a, b);

        return scalarProduct(cross, c);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] a = new double[3];
        double[] b = new double[3];
        double[] c = new double[3];

        System.out.println("Въведете координатите на A:");

        for (int i = 0; i < 3; i++) {
            a[i] = input.nextDouble();
        }

        System.out.println("Въведете координатите на B:");

        for (int i = 0; i < 3; i++) {
            b[i] = input.nextDouble();
        }

        System.out.println("Въведете координатите на C:");

        for (int i = 0; i < 3; i++) {
            c[i] = input.nextDouble();
        }

   
        double scalar = scalarProduct(a, b);

        double[] vector = vectorProduct(a, b);

        double mixed = mixedProduct(a, b, c);

   
        System.out.println("\nРЕЗУЛТАТИ:");

        System.out.println("Скаларно произведение = "
                + scalar);

        System.out.println("Векторно произведение = ("
                + vector[0] + ", "
                + vector[1] + ", "
                + vector[2] + ")");

        System.out.println("Смесено произведение = "
                + mixed);

        input.close();
    }
}

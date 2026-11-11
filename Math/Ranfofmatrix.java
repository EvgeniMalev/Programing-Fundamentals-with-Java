
import java.util.Scanner;

public class MatrixRank {

    public static int findRank(double[][] matrix, int rows, int cols) {

        final double EPS = 1e-9;
        int rank = 0;

        for (int col = 0; col < cols && rank < rows; col++) {

            
            int pivot = rank;

            for (int i = rank + 1; i < rows; i++) {
                if (Math.abs(matrix[i][col]) >
                    Math.abs(matrix[pivot][col])) {
                    pivot = i;
                }
            }

           
            if (Math.abs(matrix[pivot][col]) < EPS) {
                continue;
            }

             
            double[] temp = matrix[rank];
            matrix[rank] = matrix[pivot];
            matrix[pivot] = temp;

            
            double divisor = matrix[rank][col];

            for (int j = col; j < cols; j++) {
                matrix[rank][j] /= divisor;
            }

            
            for (int i = 0; i < rows; i++) {

                if (i != rank) {

                    double factor = matrix[i][col];

                    for (int j = col; j < cols; j++) {
                        matrix[i][j] -=
                            factor * matrix[rank][j];
                    }
                }
            }

            rank++;
        }

        return rank;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Rows: ");
        int rows = input.nextInt();

        System.out.print("Columns: ");
        int cols = input.nextInt();

        double[][] matrix = new double[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        int rank = findRank(matrix, rows, cols);

        System.out.println("Rank of matrix = " + rank);

        input.close();
    }
}

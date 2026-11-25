
import java.util.Scanner;

public class MatrixRank {

    public static int findRank(double[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int rank = 0;
        double epsilon = 1e-10;

        for (int col = 0; col < cols && rank < rows; col++) {

        
            int pivotRow = rank;

            for (int i = rank + 1; i < rows; i++) {
                if (Math.abs(matrix[i][col]) >
                    Math.abs(matrix[pivotRow][col])) {

                    pivotRow = i;
                }
            }

      
            if (Math.abs(matrix[pivotRow][col]) < epsilon) {
                continue;
            }

            
            double[] temp = matrix[rank];
            matrix[rank] = matrix[pivotRow];
            matrix[pivotRow] = temp;

            
            double pivot = matrix[rank][col];

            for (int j = col; j < cols; j++) {
                matrix[rank][j] /= pivot;
            }


            for (int i = rank + 1; i < rows; i++) {

                double factor = matrix[i][col];

                for (int j = col; j < cols; j++) {
                    matrix[i][j] -=
                        factor * matrix[rank][j];
                }
            }

            rank++;
        }

        return rank;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Брой редове: ");
        int rows = scanner.nextInt();

        System.out.print("Брой колони: ");
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];

        System.out.println("Въведете елементите на матрицата:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        int rank = findRank(matrix);

        System.out.println("Рангът на матрицата е: " + rank);

        scanner.close();
    }
}

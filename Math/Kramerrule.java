
public class CramerRule {

 
    public static double determinant(double[][] matrix) {

        int n = matrix.length;
        double[][] a = new double[n][n];

        for (int i = 0; i < n; i++) {
            a[i] = matrix[i].clone();
        }

        double det = 1.0;

        for (int i = 0; i < n; i++) {

            int pivot = i;

            for (int j = i + 1; j < n; j++) {
                if (Math.abs(a[j][i]) >
                    Math.abs(a[pivot][i])) {
                    pivot = j;
                }
            }

            if (Math.abs(a[pivot][i]) < 1e-12) {
                return 0.0;
            }

            if (pivot != i) {
                double[] temp = a[i];
                a[i] = a[pivot];
                a[pivot] = temp;
                det *= -1;
            }

            double p = a[i][i];
            det *= p;

            for (int j = i + 1; j < n; j++) {
                double factor = a[j][i] / p;

                for (int k = i + 1; k < n; k++) {
                    a[j][k] -= factor * a[i][k];
                }
            }
        }

        return det;
    }

   
    public static double[] cramer(
        double[][] A, double[] B) {

        int n = A.length;

        if (B.length != n) {
            throw new IllegalArgumentException(
                "Invalid dimensions");
        }

        for (double[] row : A) {
            if (row.length != n) {
                throw new IllegalArgumentException(
                    "Matrix must be square");
            }
        }

        double D = determinant(A);

        if (Math.abs(D) < 1e-12) {
            throw new ArithmeticException(
                "No unique solution exists");
        }

        double[] X = new double[n];

        for (int j = 0; j < n; j++) {

            double[][] temp = new double[n][n];

            for (int r = 0; r < n; r++) {
                temp[r] = A[r].clone();
                temp[r][j] = B[r];
            }

            X[j] = determinant(temp) / D;
        }

        return X;
    }

    public static void main(String[] args) {

        double[][] A = {
            {2, 1, 1},
            {1, 3, 2},
            {1, 0, 0}
        };

        double[] B = {4, 5, 6};

        double[] result = cramer(A, B);

        for (int i = 0; i < result.length; i++) {
            System.out.printf(
                "x%d = %.2f%n", i + 1, result[i]);
        }
    }
}

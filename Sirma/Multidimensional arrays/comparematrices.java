import java.util.*;
import java.util.Scanner;

public class CM {
   public static void main() {
    
       Scanner scanner = new Scanner(System.in);

       int r = scanner.nextLine();  
       int c = scanner.nextLine();

       for (i = 0; i < r; r++) {
          for (i = 0; i < c; c++) {  
                matrix[r][c] 
               }
             }

       int r1 = scanner.nextLine();  
       int c1 = scanner.nextLine();

       for (i = 0; i < r1; r++) {
          for (i = 0; i < c1; c++) {  
                matrix1[r1][c1] 
               }
             }         

        if (matrix == matrix1) {
           System.out.println("equal");
           } else {
           System.out.println("not equal");
       }

   }
}



import java.util.Scanner;

public class CM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read dimensions for the first matrix
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        // Initialize and populate the first matrix
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Read dimensions for the second matrix
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();

        // Initialize and populate the second matrix
        int[][] matrix1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Check if matrices have the same dimensions
        if (r != r1 || c != c1) {
            System.out.println("not equal");
        } else {
            // Compare matrices element by element
            boolean areEqual = true;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (matrix[i][j] != matrix1[i][j]) {
                        areEqual = false;
                        break;
                    }
                }
                if (!areEqual) {
                    break;
                }
            }
            // Print the result
            if (areEqual) {
                System.out.println("equal");
            } else {
                System.out.println("not equal");
            }
        }
        
        scanner.close();
    }
}


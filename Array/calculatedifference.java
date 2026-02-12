import java.util.Scanner;

public class DifferenceEvenOddSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArray = input.split(",");

        int difference = calculateDifference(inputArray);
    }

    public static int calculateDifference(String[] strArray) {
        int evenSum = 0;
        int oddSum = 0;

        for (String str : strArray) {
            try {
                int number = Integer.parseInt(str.trim());
                if (number % 2 == 0) {
                    evenSum += number;
                } else {
                    oddSum += number;
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid number format: " + str);
            }
        }

        return evenSum - oddSum;
    }
}

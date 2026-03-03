import java.util.Arrays;
import java.util.Scanner;

public class TwoSmallestElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array of numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        printTwoSmallestElements(inputArray);
    }

    public static void printTwoSmallestElements(String[] array) {
        int[] numbers = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            numbers[i] = Integer.parseInt(array[i]);
        }

        Arrays.sort(numbers);
        System.out.println("Two smallest elements:");
        System.out.println(numbers[0] + " " + numbers[1]);
    }
}

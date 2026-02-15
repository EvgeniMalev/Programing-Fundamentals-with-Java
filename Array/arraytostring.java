import java.util.Scanner;

public class CondenseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArray = input.split(",");

        int[] numbers = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i].trim());
        }

        int result = condenseArrayToSingleNumber(numbers);
        System.out.println("The result of condensing the array is: " + result);
    }

    public static int condenseArrayToSingleNumber(int[] numbers) {
        while (numbers.length > 1) {
            int[] condensed = new int[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                condensed[i] = numbers[i] + numbers[i + 1];
            }
            numbers = condensed;
        }
        return numbers[0];
    }
}

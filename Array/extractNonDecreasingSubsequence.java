import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        List<Integer> result = extractNonDecreasingSubsequence(inputArray);
        System.out.println("Processed array after filtration:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> extractNonDecreasingSubsequence(String[] array) {
        List<Integer> subsequence = new ArrayList<>();
        int currentMax = Integer.MIN_VALUE;

        for (String numStr : array) {
            int num = Integer.parseInt(numStr);

            if (num >= currentMax) {
                subsequence.add(num);
                currentMax = num;
            }
        }

        return subsequence;
    }
}

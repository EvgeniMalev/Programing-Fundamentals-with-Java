import java.util.Scanner;

public class OddPositionElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        print(inputArray);
    }

    public static void print(String[] array) {
        for (int i = array.length - 1; i >= 0; i -= 2) {
            int num = Integer.parseInt(array[i]);
            System.out.print(num * 2 + " ");
        }
    }
}

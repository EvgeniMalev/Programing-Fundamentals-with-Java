import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] elements = input.split(",");

        int length = elements.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = elements[i].trim();
            elements[i] = elements[length - 1 - i].trim();
            elements[length - 1 - i] = temp;
        }

        for (int i = 0; i < length; i++) {
            System.out.print(elements[i]);
            if (i < length - 1) {
                System.out.print(" ");
            }
        }

    }
}

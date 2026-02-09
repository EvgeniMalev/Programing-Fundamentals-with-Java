import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements to take from the array:");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.println("Enter the elements of the array separated by spaces:");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");

        String[] newArray = new String[Math.min(n, elements.length)];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = elements[i];
        }

        for (int i = 0; i < newArray.length / 2; i++) {
            String temp = newArray[i];
            newArray[i] = newArray[newArray.length - 1 - i];
            newArray[newArray.length - 1 - i] = temp;
        }

        for (String element : newArray) {
            System.out.print(element + " ");
        }
    }
}

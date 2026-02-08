import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for the day of the week (1-7):");
        int dayNumber = scanner.nextInt();

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (dayNumber >= 1 && dayNumber <= 7) {
            System.out.println(daysOfWeek[dayNumber - 1]);
        } else {
            System.out.println("Invalid day!");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class RageExpenses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = scanner.nextInt();

        double headsetPrice = scanner.nextDouble();

        double mousePrice = scanner.nextDouble();

        double keyboardPrice = scanner.nextDouble();

        double displayPrice = scanner.nextDouble();

        double totalExpenses = calculateRageExpenses(lostGames, headsetPrice, mousePrice, keyboardPrice, displayPrice);
        System.out.printf("Rage expenses: %.2f lv.%n", totalExpenses);
    }

    public static double calculateRageExpenses(int lostGames, double headsetPrice, double mousePrice, double keyboardPrice, double displayPrice) {
        int trashedHeadsets = lostGames / 2;
        int trashedMice = lostGames / 3;
        int trashedKeyboards = lostGames / 6;
        int trashedDisplays = trashedKeyboards / 2;

        double totalExpenses = (trashedHeadsets * headsetPrice) + 
                               (trashedMice * mousePrice) + 
                               (trashedKeyboards * keyboardPrice) + 
                               (trashedDisplays * displayPrice);
        return totalExpenses;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int partySize = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int coins = 0;

        for (int i = 1; i <= days; i++) {
            if (i % 10 == 0) {
                partySize -= 2;
            }
            if (i % 15 == 0) {
                partySize += 5;
            }
            coins += 50;
            coins -= (2 * partySize);
            if (i % 3 == 0) {
                coins -= (partySize * 3);
            }
            if (i % 5 == 0) {
                coins += (partySize * 20);
                if (i % 3 == 0) {
                    coins -= (partySize * 2);
                }
            }
        }
        int coinsPerPerson = (int) Math.floor((double) coins / partySize);
        System.out.println(partySize + " companions received " + coinsPerPerson + " coins each.");
    }
}

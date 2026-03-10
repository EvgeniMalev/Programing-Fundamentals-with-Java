import java.util.Scanner;

public class ArmstrongNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        scanner.close();

        if (isArmstrong(n)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }

    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int numDigits = String.valueOf(n).length();
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numDigits);
            n /= 10;
        }

        return sum == originalNumber;
    }
}


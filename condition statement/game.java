import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rightHand = scanner.nextLine().toLowerCase();

        String leftHand = scanner.nextLine().toLowerCase();

        String decision = makeDecision(rightHand, leftHand);
        System.out.println(decision);

        scanner.close();
    }

    public static String makeDecision(String rightHand, String leftHand) {
        if (rightHand.equals("sword") || leftHand.equals("sword")) {
            if (rightHand.equals("shield") || leftHand.equals("shield")) {
                return "Take the path to the castle.";
            } else {
                return "Take the path to the forest.";
            }
        } else if (rightHand.equals("map") || leftHand.equals("map")) {
            if (rightHand.equals("coins") || leftHand.equals("coins")) {
                return "Go to the town.";
            } else {
                return "Camp at the current spot and prepare for the next day.";
            }
        } else {
            return "Wander aimlessly.";
        }
    }
}


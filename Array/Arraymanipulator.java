import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] initialArray = input.split(" ");

        List<String> array = new ArrayList<>(Arrays.asList(initialArray));

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }

            String[] tokens = command.split(" ");
            String action = tokens[0];
            int number;

            switch (action) {
                case "Add":
                    number = Integer.parseInt(tokens[1]);
                    array.add(String.valueOf(number));
                    break;
                case "Remove":
                    number = Integer.parseInt(tokens[1]);
                    array.remove(String.valueOf(number));
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < array.size()) {
                        array.remove(index);
                    }
                    break;
                case "Insert":
                    number = Integer.parseInt(tokens[1]);
                    index = Integer.parseInt(tokens[2]);
                    if (index >= 0 && index <= array.size()) {
                        array.add(index, String.valueOf(number));
                    }
                    break;
            }
        }

        System.out.println(String.join(" ", array));
    }
}

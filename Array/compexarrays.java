import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 7, 5, 8, 2));
        System.out.println("Original ArrayList: " + numbers);

        System.out.print("Enter a number to count its occurrences: ");
        int target = scanner.nextInt();
        int count = Collections.frequency(numbers, target);
        System.out.println("Count of " + target + ": " + count);

        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);
        
        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Shuffled ArrayList: " + numbers);
        
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
        
        ArrayList<Integer> newNumbers = new ArrayList<>(Arrays.asList(10, 15, 20));
        System.out.println("New ArrayList: " + newNumbers);
        boolean value = Collections.disjoint(numbers, newNumbers);
        System.out.println("Two lists are disjoint: " + value);


        numbers.addAll(newNumbers);
        System.out.println("Merged ArrayList: " + numbers);
        
        scanner.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String word = scanner.nextLine();
            
            if (word.equals("end")) {
                break;
            }
            
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            
            System.out.println(word + " = " + reversedWord);
        }
        
        scanner.close();
    }
}

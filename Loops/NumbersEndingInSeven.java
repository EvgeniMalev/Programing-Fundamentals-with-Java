import java.util.Scanner;

public class NumbersEndingInSeven {

    public static void main(String[] args) {


        for (int number = 1; number <= 1000; number++) {
            if (number % 10 == 7) {
                System.out.println(number);
            }
        }

     
    }
}

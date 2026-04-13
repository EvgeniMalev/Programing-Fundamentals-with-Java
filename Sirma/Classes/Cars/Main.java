import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] carDetails = scanner.nextLine().split(" ");
            Car car;
            if (carDetails.length == 1) {
                car = new Car(carDetails[0]);
            } else {
                String brand = carDetails[0];
                String model = carDetails[1];
                int horsepower = Integer.parseInt(carDetails[2]);
                car = new Car(brand, model, horsepower);
            }
            cars.add(car);
        }

        for (Car car : cars) {
            System.out.println(car.carInfo());
        }

        scanner.close();
    }
}

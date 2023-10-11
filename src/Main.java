
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla Model S", 90.9);
        Car car2 = new Car("Toyota Prius", 56.5);
        Car car3 = new Car("Honda Civic", 32.3);
        Car car4 = new Car("Ford Mustang", 25.5);

        ArrayList<Car> carList = new ArrayList<>(Arrays.asList(car1, car2, car3, car4));
        StatsResult result = EfficiencyStats.computeStats(carList);

        System.out.println("Mean: " + result.mean);
        System.out.println("Median: " + result.median);
        System.out.println("Mode: " + result.mode);
    }
}

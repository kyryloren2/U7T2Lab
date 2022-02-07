import java.util.ArrayList;
import java.util.Arrays;

public class CarRunner
{
    public static void main(String[] args)
    {
        Car car1 = new Car("Mustang", 12500);
        Car car2 = new Car("Camry", 8400);
        Car car3 = new Car("Ram", 17200);
        Car[] carsArray = {car1, car2, car3};

        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(carsArray));
        System.out.println(carList);
    }
}

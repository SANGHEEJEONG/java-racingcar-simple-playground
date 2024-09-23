import java.util.ArrayList;
import java.util.List;

public class Cars {
    private static List<Car> cars;

    private static String[] splitCarName(){
        String input = View.inputCarName();
        String[] carNames = input.split(",");
        return carNames;
    }

    private static int carSize(String[] carNames){
        return carNames.length;
    }

    private static List<Car> generateCar(){
        final List<Car> cars = new ArrayList<>(carSize(splitCarName()));
        for(String carName : splitCarName()){
            cars.add(new Car(carName));
        }
        return cars;
    }

}

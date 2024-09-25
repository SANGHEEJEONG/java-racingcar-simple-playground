import domain.Car;
import domain.WinnerSelector;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WinnerTest {

    @DisplayName("우승자 찾기 테스트")
    @Test
    void getWinnersTest(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("car1",1));
        cars.add(new Car("car2",2));
        cars.add(new Car("car3",2));
        cars.add(new Car("car4",1));

        List<String> winners = WinnerSelector.getWinners(cars);

        assertEquals(2, winners.size());
        assertTrue(winners.contains("car2"));
        assertTrue(winners.contains("car3"));
    }

    @DisplayName("우승자 위치 찾기 테스트")
    @Test
    void findWinnerPositionTest(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("car1",1));
        cars.add(new Car("car2",2));
        cars.add(new Car("car3",2));
        cars.add(new Car("car4",1));

        int winnerPosition = WinnerSelector.findWinnerPosition(cars);

        assertEquals(2, winnerPosition);
    }


}
package domain;

import domain.Car;

import java.util.ArrayList;
import java.util.List;

public class WinnerSelector {
    private static List<String> winners = new ArrayList<>();

    //우승자 구하는 메서드
    public static List<String> getWinners(List<Car> cars){
        int winnerPosition = findWinnerPosition(cars);

        for(Car car : cars){
            addWinner(car,winnerPosition);
        }

        return winners;
    }

    //우승자 위치 찾는 메서드
    public static int findWinnerPosition(List<Car> cars){
        return cars.stream()
                .map(Car::getPosition)
                .reduce(Integer::max)
                .orElse(0);
    }

    //우승자 판별 메서드
    private static void addWinner(Car car, int winnerPosition){
        if(car.getPosition()==winnerPosition){
            winners.add(car.getName());
        }
    }
}

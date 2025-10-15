package academy.devdojo.maratonajava.javacore.ZZBcomportamento.teste;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste01 {
    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("Black", 1998), new Car("Red", 2019));

    public static void main(String[] args) {
        System.out.println(filterCarByColor(cars, "Green"));
        System.out.println(filterCarByColor(cars, "Red"));
        System.out.println(filterCarByYearBefore(cars, 2015));
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterCarByYearBefore(List<Car> cars, int year) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getAno() < year) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}

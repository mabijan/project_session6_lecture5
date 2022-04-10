package Tamrin_Manzel_3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the car you wish to see:" +
                "PS:  BMW = 1, BENZ = 2, Honda = 3");

        int key = scanner.nextInt();

        Car car = CarFactory.getCar(Car.Honda);

    }

}

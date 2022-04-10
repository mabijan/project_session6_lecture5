package Tamrin_Manzel_3;

import java.util.Scanner;

public class Honda implements Car{

    @Override
    public void Get_Info() {

        Scanner scanner = new Scanner(System.in);

        /*System.out.print("enter the car size (length and width):");
        CAR[0] = scanner.next();

        System.out.print("enter the engine power:");
        CAR[1] = scanner.next();

        System.out.print("enter the fuel consumption:");
        CAR[2] = scanner.next();

        System.out.print("enter the engine power:");
        CAR[3] = scanner.next();*/

        System.out.format("""
                length and width = %s
                engine power = %s
                fuel consumption = %s
                """, "5.5*6", "600hp", "7lit");

    }
}

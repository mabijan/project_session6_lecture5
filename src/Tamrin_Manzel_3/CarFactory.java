package Tamrin_Manzel_3;

public class CarFactory {

    public static Car getCar(int key)
    {
        switch (key)
        {

            case 1:
                return new BMW();

            case 2:
                return new Benz();

            case 3:
                return new Honda();

            default:
                return null;
        }
    }
}

import java.util.Scanner;

public class TransformingHourForMinutes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Write a value in hours: ");
        double valueInHours = input.nextDouble();

        double valueInMinutes = valueInHours * 60;

        System.out.println("The value in minutes is " +valueInMinutes);

    }
}

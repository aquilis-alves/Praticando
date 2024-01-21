import java.util.Scanner;

public class ChangeMinuteForHour {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Write time in minutes: ");
        double valueInMinutes = input.nextDouble();

        double valueInHour = valueInMinutes / 60;

        System.out.println("this time in hour is " +valueInHour);

    }
}

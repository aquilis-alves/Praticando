package sequentialStructure.converttemperatures;

import java.util.Scanner;

public class ConvertTemperatures {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        System.out.print("temperature = ");
        double temperature = inputs.nextDouble();

        System.out.println("convert to \n");

        System.out.println
                ("1 - degrees Celsius" +
                "\n2 - degrees Fahrenheit" +
                "\n3 - Exit");

        int option = inputs.nextInt();

        switch (option) {

            case 1:
                double degreesFahrenheit = (9 * temperature + 160) / 5;
                System.out.println("degrees in Fahrenheit = " + degreesFahrenheit);
                
                break;

            case 2:
                double degreesCelsius = (9 * temperature - 160) / 5;
                System.out.println("degrees Celsius = " + degreesCelsius);
                
                break;

            case 3:
                System.exit(0);
        }

    }

}

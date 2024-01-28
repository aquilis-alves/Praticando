package conditionalstructure.isprime;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Write number: ");
        int number = input.nextInt();

        int divisors = 0;

        for (int counter = number - 1; counter > 1 ; counter--) {


            if (number % counter == 0) {

                divisors++;

            }

        }

        if (divisors > 0) {

            System.out.println("the number " + number + " isn't prime");

        } else {

            System.out.println("the number " + number + " is prime");

        }

    }

}

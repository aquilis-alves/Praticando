package sequentialStructure.reverseOrderOfNumber;

import java.util.Scanner;

public class ReverseOrderOfNumber {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);
        ControlOfDigits control = new ControlOfDigits();

        System.out.println("Type number");

        System.out.print("1 - ");
        int number = inputs.nextInt();

        control.limitOfDigit(3, number);

        int digitOne = number % 10;
        int digitTwo = (number - digitOne) % 100;
        int digitThree = number - digitOne - digitTwo;

        int reverseNumber = (digitOne * 100) + (digitTwo) + (digitThree / 100);

        System.out.println("reverseNumber = " + reverseNumber);

    }
}

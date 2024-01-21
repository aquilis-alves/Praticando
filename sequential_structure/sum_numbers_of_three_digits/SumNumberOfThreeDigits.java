import java.util.Scanner;

public class SumNumberOfThreeDigits {

    public static void main(String[] args) {

        Scanner inputs = new Scanner (System.in);
        ControlOfDigits digits = new ControlOfDigits();

        System.out.println("Write numbers");

        System.out.print("1 - ");
        int numberOne = inputs.nextInt();

        System.out.print("2 - ");
        int numberTwo = inputs.nextInt();

        System.out.print("3 - ");
        int numberThree = inputs.nextInt();

        digits.limitOfDigit(3, numberOne, numberTwo, numberThree);

        int sumOfNumbers = numberOne + numberTwo + numberThree;
        System.out.println("sum of numbers = " + sumOfNumbers);

    }
}

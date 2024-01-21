package sequentialStructure.reverseOrderOftwoNumbers;

import java.util.Scanner;

public class ReverseOrderOfTwoNumbers {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        System.out.println("Type numbers");

        System.out.print("1 - ");
        int numberOne = inputs.nextInt();

        System.out.print("2 - ");
        int numberTwo = inputs.nextInt();

        int[] numbers = {numberOne, numberTwo};

        System.out.println("numbers in original position - " +numbers[0] +" " +numbers[1]);

        numbers[0] = numberTwo;
        numbers[1] = numberOne;

        System.out.println("numbers with position switch - " +numbers[0] +" " +numbers[1]);

    }
}

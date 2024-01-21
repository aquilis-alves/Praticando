package sequentialStructure.sumDividedbyDifference;

import java.util.Scanner;

public class SumDividedByDifference {

    public static void main(String[] args) {

        Scanner inputs = new Scanner (System.in);

        System.out.println("Write numbers");

        System.out.print("1 - ");
        double numberOne = inputs.nextInt();

        System.out.print("2 - ");
        double numberTwo = inputs.nextInt();

        double sumNumberOneAndNumberTwo = numberOne + numberTwo;
        double differenceNumberOneAndNumberTwo = numberOne - numberTwo;

        double division = sumNumberOneAndNumberTwo / differenceNumberOneAndNumberTwo;

        System.out.println("division of numbers = " +division);
    }
}

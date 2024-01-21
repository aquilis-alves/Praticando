package sequentialStructure.quotientAndRemainderOfDivision;

import java.util.Scanner;

public class QuotientAndRemainderOfDivision {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        System.out.println("Type numbers");

        System.out.print("1 - ");
        int numberOne = inputs.nextInt();

        System.out.print("2 - ");
        int numberTwo = inputs.nextInt();

        double quotient = numberOne / numberTwo;
        double remainder = numberOne % numberTwo;

        System.out.println("remainder = " + remainder + " quotient = " + quotient);
    }
}

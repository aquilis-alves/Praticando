package conditionalstructure.comparasionofnumbers;

import java.util.Scanner;

public class ComparisionOfNUmbers {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        System.out.print("number one = ");
        double numberOne = inputs.nextDouble();

        System.out.print("number two = ");
        double numberTwo = inputs.nextDouble();

        if (numberOne > numberTwo){

            System.out.println(numberOne + " > " + numberTwo);

        } else if (numberOne < numberTwo) {

            System.out.println(numberOne + " < " + numberTwo);

        } else {

            System.out.println(numberOne + " = " + numberTwo);

        }

    }

}

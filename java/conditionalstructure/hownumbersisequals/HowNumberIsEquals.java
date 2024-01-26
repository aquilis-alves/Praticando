package conditionalstructure.hownumbersisequals;

import java.util.Scanner;

public class HowNumberIsEquals {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        System.out.print("number one = ");
        double numberOne = inputs.nextDouble();

        System.out.print("number two = ");
        double numberTwo = inputs.nextDouble();

        System.out.print("number Three = ");
        double numberThree = inputs.nextDouble();

        int counter = 0;

        if (numberOne == numberTwo & numberTwo == numberThree & numberOne == numberThree) {

            counter = 3;
            System.out.println(counter);

        } else if (numberOne == numberTwo || numberTwo == numberThree || numberOne == numberThree) {

            counter = 2;
            System.out.println(counter);

        } else {

            counter = 0;
            System.out.println(counter);

        }


    }

}

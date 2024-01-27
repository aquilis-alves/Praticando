package conditionalstructure.tenalgarismsisequaltotampalgarism;

import java.util.Scanner;

public class TenAlgarismIsEqualToDampAlgarism {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        System.out.print("type number of two digits: ");
        int number = inputs.nextInt();

        int firstDigit = number / 10;
        int lastDigit = number - (firstDigit * 10);

        if (firstDigit == lastDigit) {

            System.out.println("first digit is equals to last digit");

        } else {

            System.out.println("the digits of number isn't equals");

        }

    }

}


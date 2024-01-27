package conditionalstructure.whatisquadranteofthenumber;

import java.util.Scanner;

public class WhatIsQuadrantOfTheNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Write a angle: ");
        int angle = input.nextInt() % 360;

        if (angle >= 0 && angle <= 90) {

            System.out.println("The angle stay in first quadrant");

        } else if (angle >= 91 && angle <= 180) {

            System.out.println("The angle stay in second quadrant");

        } else if (angle >= 181 && angle < 270) {

            System.out.println("The angle stay in third quadrant");

        } else {

            System.out.println("the angle stay in fourth quadrant");

        }

    }

}

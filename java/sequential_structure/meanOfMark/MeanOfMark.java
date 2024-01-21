package sequentialStructure.meanOfMark;

import java.util.Scanner

public class MeanOfMark {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        System.out.println("Type marks");

        System.out.print("1 - ");
        double numberOne = inputs.nextDouble();

        System.out.print("2 - ");
        double numberTwo = inputs.nextDouble();

        System.out.print("3 - ");
        double numberThree = inputs.nextDouble();

        double meanOfMarks = (numberOne + numberTwo + numberThree) / 3;

        System.out.println("mean of marks = " + meanOfMarks);


    }
}

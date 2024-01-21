package sequentialStructure.sumAndDifference;
import java.util.Scanner;

public class SumAndDifference {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        System.out.println("Write numbers");

        System.out.print("1 - ");
        double numberOne = inputs.nextInt();

        System.out.print("2 - ");
        double numberTwo = inputs.nextInt();

        System.out.print("3 - ");
        double numberThree = inputs.nextInt();

        double sumNumberOneAndNumberTwo = numberOne + numberTwo;
        double differenceNumberTwoAndNumberThree = numberTwo + numberThree;

        System.out.println("Sum between first and second number = " +sumNumberOneAndNumberTwo);
        System.out.println("Difference between second and third = " +differenceNumberTwoAndNumberThree);

    }

}

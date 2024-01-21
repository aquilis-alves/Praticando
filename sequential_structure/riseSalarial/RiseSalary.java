package sequentialStructure.riseSalarial;

import java.util.Scanner;

public class RiseSalary {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        System.out.println("Type salary");

        System.out.print("1 - ");
        int salary = inputs.nextInt();

        double salaryWithRise = salary * 1.25;

        System.out.println("salary with rise = " + salaryWithRise);
    }
}

import java.util.Scanner;

public class ConvertendoDolarParaReal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What a cotatio of Dollar: ");
        double cotationOfDollar = input.nextDouble();

        System.out.print("What value in dollar you have: ");
        double valueInDollar = input.nextDouble();

        double valueInReal = valueInDollar * cotationOfDollar;

        System.out.println("the value in Real: " +valueInReal);

    }
}

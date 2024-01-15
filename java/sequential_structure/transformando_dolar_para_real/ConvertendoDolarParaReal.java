import java.util.Scanner;

public class ConvertendoDolarParaReal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("qual a cotacao atual do dolar: ");
        double cotacaoDoDolar = input.nextDouble();

        System.out.print("qual o valor que voce tem em dolar: ");
        double valorEmDolar = input.nextDouble();

        double valorEmReais = valorEmDolar * cotacaoDoDolar;

        System.out.println("o valor em reais é: " +valorEmReais);

    }
}

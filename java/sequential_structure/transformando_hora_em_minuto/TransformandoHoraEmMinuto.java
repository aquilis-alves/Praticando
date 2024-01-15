import java.util.Scanner;

public class TransformandoHoraEmMinuto {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("digite um valor em horas: ");
        double valorEmHoras = input.nextDouble();

        double valorEmMinutos = valorEmHoras * 60;

        System.out.println("o valor em minutos é " +valorEmMinutos);

    }
}

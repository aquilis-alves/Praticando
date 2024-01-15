import java.util.Scanner;

public class TranformandoMinutoEmHora {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("digite um valor em mintos: ");
        double valorEmMinutos = input.nextDouble();

        double valorEmHoras = valorEmMinutos / 60;

        System.out.println("o valor em horas é " +valorEmHoras);

    }
}

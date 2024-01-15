import java.util.Scanner;

public class TransformandoVelocidades {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        System.out.print("Digite a velocidade em m/s: ");
        double metroSegundo = inputs.nextDouble();

        double kilometroHora = metroSegundo * 3.6;

        System.out.println("Velocidade em km/h = " +kilometroHora);
    }
}

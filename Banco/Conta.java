import java.util.Date;

class Conta {

    private static int numeroDaConta;
    private Date dataDeCriacaoDaConta;
    private double saldo;

    Conta() {

        Conta.numeroDaConta += 1;
        dataDeCriacaoDaConta = new Date();

    }

    void depositar(double valorDoDeposito) {

        if (valorDoDeposito > 0) {

            this.saldo += valorDoDeposito;
            System.out.println("foi depoositado um valor de " +valorDoDeposito);

        }

        else {

            System.out.println("não foi possivel realizar o saque");
        }

    }

    void sacar(double valorDoSaque) {

        if (saldo > valorDoSaque){

            this.saldo -= valorDoSaque;
            System.out.println("foi sacado um valor de " +valorDoSaque);

        }

        else {

            System.out.println("saldo insuficiente");

        }

    }

    String getDadosDaConta() {

        return "numero da conta - " +numeroDaConta+
                "\ndata de criacao - " +dataDeCriacaoDaConta+
                "\nsaldo - " +saldo;
    }
}

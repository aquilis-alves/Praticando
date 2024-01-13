package Banco.example;

public class Banco{

    public static void main(String[] args) {

        Conta minhaConta = new Conta();

        System.out.println(minhaConta.getDadosDaConta());

        minhaConta.depositar(100);
        minhaConta.sacar(50);

        System.out.println(minhaConta.getDadosDaConta());

    }

}
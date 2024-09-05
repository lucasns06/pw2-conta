package principal;

import model.Conta;
import model.Corrente;
import model.Poupanca;

public class Teste
{
    public static void main(String[] args)
    {

        Conta conta = new Conta(500);
        System.out.println("\nConta principal:");
        System.out.println(conta.consultarSaldo());
        System.out.println("\nDebitando 100...");
        System.out.println(conta.debitar(100.0));
        System.out.println("\nDebitando 500...");
        System.out.println(conta.debitar(500));
        System.out.println("\nCreditando 500...");
        System.out.println(conta.creditar(500));

        System.out.println("\n==========================================");

        Corrente corrente = new Corrente(500.0, 300.0);
        System.out.println("\nConta Corrente:");
        System.out.println(corrente.consultarSaldo());
        System.out.println("\nDebitando 600...");
        System.out.println(corrente.debitar(600.0));
        System.out.println("\nDebitando 50...");
        System.out.println(corrente.debitar(50));
        System.out.println("\nDebitando 300...");
        System.out.println(corrente.debitar(300.0));

        System.out.println("\n==========================================");

        Poupanca poupanca = new Poupanca(600, 0.01);
        System.out.println("\nConta Poupança:");
        System.out.println(poupanca.consultarSaldo());
        poupanca.atualizarSaldo();
        System.out.println("Após atualizar com rendimento:");
        System.out.println(poupanca.consultarSaldo());
    }
}

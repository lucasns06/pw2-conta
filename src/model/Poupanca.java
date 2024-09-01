package model;

public class Poupanca extends Conta
{
    double reajusteMensal;

    public Poupanca(double saldo, double reajusteMensal) {
        super(saldo);
        this.reajusteMensal = reajusteMensal;
    }

    public void atualizarSaldo()
    {
        saldo = saldo * reajusteMensal;
    }
}

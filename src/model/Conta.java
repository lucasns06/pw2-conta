package model;

public class Conta
{
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public String consultarSaldo()
    {
        return "R$: " + this.saldo;
    }
    public String creditar(double valor)
    {
        saldo = saldo + valor;
        return consultarSaldo();
    }
    public String debitar(double valor)
    {
        if(valor <= saldo)
        {
            saldo = saldo - valor;
            return consultarSaldo();
        }
        else
        {
            return "Saldo insuficiente! " + consultarSaldo();
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

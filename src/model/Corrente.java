package model;

public class Corrente extends Conta
{
    double limite;

    public Corrente(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    @Override
    public String debitar(double valor)
    {
        if(valor <= saldo)
        {
            saldo = valor - saldo;
           return consultarSaldo();
        }
        else if (valor <= saldo + limite)
        {
            saldo = saldo - valor;
            atualizarSaldo();
            return "Saldo insuficiente, usando o limite! " + consultarSaldo();
        }
        else {
            return "Saldo insuficiente " + consultarSaldo();
        }

    }

    public void atualizarSaldo()
    {
        if(saldo < 0)
            saldo = saldo + (saldo * 0.08);
    }
}

package br.com.digitalhouse;

public class ContaPoupanca extends Contas {

    private float taxaDeJuros;

    public float getTaxaDeJuros() {

        return taxaDeJuros;
    }

    public void setTaxaDeJuros(float novaTaxaDeJuros) {
        taxaDeJuros = novaTaxaDeJuros;

    }

    public void recolherJuros(Clientes clientes) {


    }

    @Override
    public void consultarSaldo(Clientes clientes) {
        super.consultarSaldo(clientes);
    }

    @Override
    public void deposito(Clientes clientes, String quantidadeDeDinheiro) {
    }

    @Override
    public void sacar(Clientes clientes, String saldo) {
        super.sacar(clientes, saldo);
    }


    public ContaPoupanca(Clientes clientes, float novaTaxaDeJuros) {
        taxaDeJuros = novaTaxaDeJuros;
    }


}


package br.com.digitalhouse;

public class ContaPoupanca extends Contas {

    private float taxaDeJuros;

    public float getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(float novaTaxaDeJuros) {
        taxaDeJuros = novaTaxaDeJuros;
        taxaDeJuros = 13;
    }

    public void recolherJuros(){

    }

    @Override
    public void consultarSaldo(Clientes clientes) {
        super.consultarSaldo(clientes);
    }

    @Override
    public void deposito(Clientes clientes) {
        super.deposito(clientes, "2590");
    }

    @Override
    public void sacar(Clientes clientes) {
        super.sacar(clientes, "50");

    }
}


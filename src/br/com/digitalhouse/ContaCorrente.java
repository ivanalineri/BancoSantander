package br.com.digitalhouse;

public class ContaCorrente extends Contas {

    @Override
    public void consultarSaldo(Clientes clientes) {
        super.consultarSaldo(clientes);
    }

    @Override
    public void deposito(Clientes clientes) {
        super.deposito(clientes, "35");
    }


    @Override
    public void sacar(Clientes clientes) {
        super.sacar(clientes, "10");

    }

    public void sacar(){

    }

}

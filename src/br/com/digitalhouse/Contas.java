package br.com.digitalhouse;

public abstract class Contas {

    public void deposito(Clientes clientes, String quantidadeDeDinheiro){

    }

    public void sacar(Clientes clientes, String saldo){

    }

    public void consultarSaldo(Clientes clientes){


    }

    public abstract void deposito(Clientes clientes);

    public abstract void sacar(Clientes clientes);
}

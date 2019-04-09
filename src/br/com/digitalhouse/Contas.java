package br.com.digitalhouse;

public abstract class Contas {

    public void deposito(Clientes clientes, String quantidadeDeDinheiro){
        System.out.println("depositei");


    }

    public void depositoCheque(Clientes clientes, Cheque cheque){

        System.out.println("Cheque depositado");

    }

    public void deposito(){

    }

    public void sacar(Clientes clientes, String saldo){
        System.out.println("Saquei a grana");

    }

    public void sacar(){

    }

    public void consultarSaldo(Clientes clientes){
        System.out.println("Saldo consultado com sucesso!!");



    }

    public void consultarSaldo(){

    }



    //public abstract void deposito(Clientes clientes);

    //public abstract void sacar(Clientes clientes);

}

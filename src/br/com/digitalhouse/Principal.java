package br.com.digitalhouse;

public class Principal {
    public static void main(String[] args) {
       Clientes clientes  = new Clientes(2435,"Crezes", "44356546", "2312344");
       Cheque cheque = new Cheque(250, "Itau", "23/04/2019");
       Contas contaCorrente1 = new ContaCorrente();
       Contas contapoupanca1 = new ContaPoupanca();

        contaCorrente1.deposito(clientes,"800");
        contaCorrente1.sacar(clientes, "20");
        contapoupanca1.deposito(clientes);
        contapoupanca1.sacar(clientes, "50");
        ((ContaPoupanca) contapoupanca1).recolherJuros();
        cheque.setValor(500);

        System.out.println("Saque realizado pelo Banco Santader pelo cliente: " + clientes.toString());





    }

}

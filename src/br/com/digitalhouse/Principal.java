package br.com.digitalhouse;

public class Principal {

    public static void main(String[] args) {

        Clientes clientes = new Clientes(1234,"Jeremias","1234524", "12378930");
        Contas contas = new ContaPoupanca(clientes, 12);
        Contas contas1 = new ContaCorrente(clientes);
        Cheque cheque = new Cheque(300,"Itau","23/09/2019");
        // poupança pode: depositar dinheiro, sacar dinheiro, recolher juros
        //corrente pode: depositar dinheiro, depositar cheque, sacar dinheiro.
        contas.deposito(clientes,"200");
        contas.sacar(clientes, "200");
        contas1.deposito(clientes, "300");
        contas1.depositoCheque(clientes,cheque);
        contas1.sacar(clientes, "100");
        contas.consultarSaldo(clientes);
        contas1.consultarSaldo(clientes);

        System.out.println(clientes);

    }

}

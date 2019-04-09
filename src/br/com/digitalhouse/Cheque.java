package br.com.digitalhouse;

public class Cheque {
    private float valor;
    private String bancoEmissor;
    private String data;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getBancoEmissor() {
        return bancoEmissor;
    }

    public void setBancoEmissor(String bancoEmissor) {
        this.bancoEmissor = bancoEmissor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cheque(float valor, String bancoEmissor, String data) {
        this.valor = valor;
        this.bancoEmissor = bancoEmissor;
        this.data = data;
    }
}

package br.com.digitalhouse;

public class Cheque {
    private float valor;
    private String bancoEmissor;
    private String data;

    public float getValor() {

        return valor;
    }

    public void setValor(float novoValor) {

        valor = novoValor;
    }

    public String getBancoEmissor() {

        return bancoEmissor;
    }

    public void setBancoEmissor(String novoBancoEmissor) {

        bancoEmissor = novoBancoEmissor;
    }

    public String getData() {

        return data;
    }

    public void setData(String novaData) {

        data = novaData;
    }

    public Cheque(float novoValor, String novoBancoEmissor, String novaData) {
        valor = novoValor;
        bancoEmissor = novoBancoEmissor;
        data = novaData;
    }
}

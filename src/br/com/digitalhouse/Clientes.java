package br.com.digitalhouse;

public class Clientes {
    private float numeroDoCliente;
    private String sobreNome;
    private String rg;
    private String cpf;

    public float getNumeroDoCliente() {
        return numeroDoCliente;
    }

    public void setNumeroDoCliente(float numeroDoCliente) {
        this.numeroDoCliente = numeroDoCliente;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Clientes(float numeroDoCliente, String sobreNome, String rg, String cpf) {
        this.numeroDoCliente = numeroDoCliente;
        this.sobreNome = sobreNome;
        this.rg = rg;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Clientes{"+ numeroDoCliente + " " + sobreNome + " " +  rg + " " +  cpf  +
                '}';
    }
}

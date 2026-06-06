package br.com.pagamento.model;

public class Pagamento {

    private final Long id;
    private final double valor;
    private String status;

    public Pagamento(Long id, double valor, String status) {
        this.id = id;
        this.valor = valor;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
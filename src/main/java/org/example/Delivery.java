package org.example;

public abstract class Delivery {
    protected FormaPagamento formaPagamento;

    protected float compra;

    public Delivery(float compra) {
        this.compra = compra;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setFormaParamento(float compra) {
        this.compra = compra;
    }

    public abstract float calcularTotalCompra();
}

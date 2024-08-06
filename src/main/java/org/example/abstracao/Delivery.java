package org.example.abstracao;

import org.example.implementacao.FormaPagamento;

public abstract class Delivery {
    protected FormaPagamento formaPagamento;

    protected float compra;

    public Delivery(float compra) {
        this.compra = compra;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setFormaPagamento(float compra) {
        this.compra = compra;
    }

    public abstract float calcularTotalCompra();
}

package org.example;

public class Ifood extends Delivery{

    private float custoOperacao;

    public Ifood(float compra) {
        super(compra);
    }

    public void setCustoOperacao(float custoOperacao) {
        this.custoOperacao = custoOperacao;
    }

    public float calcularTotalCompra() {
        return this.compra * (1 + this.formaPagamento.percentualTaxa()) + this.custoOperacao;
    }
}

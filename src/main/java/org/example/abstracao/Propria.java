package org.example.abstracao;

import org.example.abstracao.Delivery;

public class Propria extends Delivery {

    private float comissao;

    public Propria(float compra) {
        super(compra);
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float calcularTotalCompra() {
        return this.compra * (1 + this.formaPagamento.percentualTaxa()) + this.comissao;
    }
}

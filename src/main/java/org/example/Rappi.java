package org.example;

public class Rappi extends Delivery {

    public Rappi(float compra) {
        super(compra);
    }

    public float calcularTotalCompra() {
        return this.compra * (1 + this.formaPagamento.percentualTaxa());
    }
}

package org.example;

public class Debito implements FormaPagamento{
    @Override
    public float percentualTaxa() {
        return 0.01f;
    }
}

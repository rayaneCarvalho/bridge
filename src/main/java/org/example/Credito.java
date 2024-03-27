package org.example;

public class Credito implements FormaPagamento{
    @Override
    public float percentualTaxa() {
        return 0.1f;
    }
}

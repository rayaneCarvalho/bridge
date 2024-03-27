package org.example;

public class Ticket implements FormaPagamento{
    @Override
    public float percentualTaxa() {
        return 0.15f;
    }
}

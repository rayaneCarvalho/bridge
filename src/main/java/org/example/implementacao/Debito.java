package org.example.implementacao;

import org.example.implementacao.FormaPagamento;

public class Debito implements FormaPagamento {
    @Override
    public float percentualTaxa() {
        return 0.01f;
    }
}

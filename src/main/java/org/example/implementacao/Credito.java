package org.example.implementacao;

import org.example.implementacao.FormaPagamento;

public class Credito implements FormaPagamento {
    @Override
    public float percentualTaxa() {
        return 0.1f;
    }
}

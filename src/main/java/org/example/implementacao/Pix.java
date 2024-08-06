package org.example.implementacao;

import org.example.implementacao.FormaPagamento;

public class Pix implements FormaPagamento {
    @Override
    public float percentualTaxa() {
        return 0;
    }
}

package org.example;

import org.example.abstracao.Ifood;
import org.example.implementacao.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IfoodTest {

    @Test
    void deveRetornarIfoodComCredito() {
        FormaPagamento formaPagamento = new Credito();
        Ifood ifood = new Ifood(55.0f);
        ifood.setFormaPagamento(formaPagamento);
        ifood.setCustoOperacao(15.0f);
        assertEquals(75.5f, ifood.calcularTotalCompra(), 0.01f);
    }
    @Test
    void deveRetornarIfoodComDebito() {
        FormaPagamento formaPagamento = new Debito();
        Ifood ifood = new Ifood(50.0f);
        ifood.setFormaPagamento(formaPagamento);
        ifood.setCustoOperacao(15.0f);
        assertEquals(65.5f, ifood.calcularTotalCompra(), 0.01f);
    }

    @Test
    void deveRetornarIfoodComPix() {
        FormaPagamento formaPagamento = new Pix();
        Ifood ifood = new Ifood(50.0f);
        ifood.setFormaPagamento(formaPagamento);
        ifood.setCustoOperacao(15.0f);
        assertEquals(65.0f, ifood.calcularTotalCompra(), 0.01f);
    }

}
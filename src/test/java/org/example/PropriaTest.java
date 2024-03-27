package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropriaTest {
    @Test
    void deveRetornarPropriaComCredito() {
        FormaPagamento formaPagamento = new Credito();
        Propria propria = new Propria(55.0f);
        propria.setFormaPagamento(formaPagamento);
        propria.setComissao(20.f);
        assertEquals(80.5f, propria.calcularTotalCompra(), 0.01f);
    }
    @Test
    void deveRetornarPropriaComDebito() {
        FormaPagamento formaPagamento = new Debito();
        Propria propria = new Propria(50.0f);
        propria.setFormaPagamento(formaPagamento);
        propria.setComissao(20.f);
        assertEquals(70.5f, propria.calcularTotalCompra(), 0.01f);
    }

    @Test
    void deveRetornarPropriaComPix() {
        FormaPagamento formaPagamento = new Pix();
        Propria propria = new Propria(50.0f);
        propria.setFormaPagamento(formaPagamento);
        propria.setComissao(20.f);
        assertEquals(70.0f, propria.calcularTotalCompra(), 0.01f);
    }

    @Test
    void deveRetornarPropriaComDinheiro() {
        FormaPagamento formaPagamento = new Dinheiro();
        Propria propria = new Propria(50.0f);
        propria.setFormaPagamento(formaPagamento);
        propria.setComissao(20.f);
        assertEquals(70.0f, propria.calcularTotalCompra(), 0.01f);
    }

    @Test
    void deveRetornarPropriaComTicket() {
        FormaPagamento formaPagamento = new Ticket();
        Propria propria = new Propria(50.0f);
        propria.setFormaPagamento(formaPagamento);
        propria.setComissao(20.f);
        assertEquals(77.5f, propria.calcularTotalCompra(), 0.01f);
    }

}
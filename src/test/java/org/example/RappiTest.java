package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RappiTest {

    @Test
    void deveRetornarRappiComCredito() {
        FormaPagamento formaPagamento = new Credito();
        Rappi rappi = new Rappi(55.0f);
        rappi.setFormaPagamento(formaPagamento);
        assertEquals(60.5f, rappi.calcularTotalCompra(), 0.01f);
    }
    @Test
    void deveRetornarRappiComDebito() {
        FormaPagamento formaPagamento = new Debito();
        Rappi rappi = new Rappi(50.0f);
        rappi.setFormaPagamento(formaPagamento);
        assertEquals(50.5f, rappi.calcularTotalCompra(), 0.01f);
    }

    @Test
    void deveRetornarRappiComPix() {
        FormaPagamento formaPagamento = new Pix();
        Rappi rappi = new Rappi(50.0f);
        rappi.setFormaPagamento(formaPagamento);
        assertEquals(50.0f, rappi.calcularTotalCompra(), 0.01f);
    }

    @Test
    void deveRetornarRappiComDinheiro() {
        FormaPagamento formaPagamento = new Dinheiro();
        Rappi rappi = new Rappi(50.0f);
        rappi.setFormaPagamento(formaPagamento);
        assertEquals(50.0f, rappi.calcularTotalCompra(), 0.01f);
    }

    @Test
    void deveRetornarRappiComTicket() {
        FormaPagamento formaPagamento = new Ticket();
        Rappi rappi = new Rappi(50.0f);
        rappi.setFormaPagamento(formaPagamento);
        assertEquals(57.5f, rappi.calcularTotalCompra(), 0.01f);
    }
}
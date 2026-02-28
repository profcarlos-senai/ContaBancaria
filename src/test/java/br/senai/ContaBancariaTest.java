package br.senai;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContaBancariaTest {

    private ContaBancaria conta;

    @BeforeEach
    void setUp() {
        conta = new ContaBancaria();
    }

    @Test
    @DisplayName("Saldo inicial deve ser zero")
    void testSaldoInicial() {
        assertEquals(0.0, conta.getSaldo());
    }

    @Test
    @DisplayName("Depositar valor válido deve aumentar o saldo")
    void testDepositoValido() {
        conta.deposita(100.0);
        assertEquals(100.0, conta.getSaldo());
    }

    @Test
    @DisplayName("Depositar múltiplos valores")
    void testMultiplosDepositos() {
        conta.deposita(100.0);
        conta.deposita(50.0);
        assertEquals(150.0, conta.getSaldo());
    }

    @Test
    @DisplayName("Depositar valor negativo deve lançar exceção")
    void testDepositoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            conta.deposita(-10.0);
        });
    }

    @Test
    @DisplayName("Sacar valor válido deve diminuir o saldo")
    void testSaqueValido() {
        conta.deposita(100.0);
        conta.saca(40.0);
        assertEquals(60.0, conta.getSaldo());
    }

    @Test
    @DisplayName("Sacar todo o saldo")
    void testSaqueTotal() {
        conta.deposita(100.0);
        conta.saca(100.0);
        assertEquals(0.0, conta.getSaldo());
    }

    @Test
    @DisplayName("Sacar valor maior que o saldo deve lançar exceção")
    void testSaqueSaldoInsuficiente() {
        conta.deposita(50.0);

        assertThrows(IllegalArgumentException.class, () -> {
            conta.saca(100.0);
        });
    }

    @Test
    @DisplayName("Sacar valor negativo deve lançar exceção")
    void testSaqueNegativo() {
        conta.deposita(100.0);

        assertThrows(IllegalArgumentException.class, () -> {
            conta.saca(-10.0);
        });
    }

    @Test
    @DisplayName("Sequência de operações")
    void testSequenciaOperacoes() {

        conta.deposita(200.0);
        conta.saca(50.0);
        conta.deposita(25.0);
        conta.saca(75.0);

        assertEquals(100.0, conta.getSaldo());
    }
}
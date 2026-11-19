import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {

    @Test
    void criaConta(){
        ContaBancaria conta = new ContaBancaria();
        assertNotNull(conta, "Conta está NULL depois de criar");
    }

    @Test
    void criaComSaldoZero(){
        ContaBancaria conta = new ContaBancaria();
        assertEquals(0.0, conta.getSaldo(), "Saldo não está zerado na criação");
    }

    @Test
    void depositaAtualizaSaldo(){
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000.0);
        assertEquals(1000.0, conta.getSaldo(), "valor depositado não apareceu no saldo");
    }

    @Test
    void depositoZeroOuNegativo(){
        ContaBancaria conta = new ContaBancaria();
        assertThrows(IllegalArgumentException.class, ()-> conta.depositar(0.0), "aceita depósito zerado");
        assertThrows(IllegalArgumentException.class, ()->conta.depositar(-1.0), "aceita depósito negativo");
    }

    @Test
    void saqueZeroOuNegativo(){
        ContaBancaria conta = new ContaBancaria();
        assertThrows(IllegalArgumentException.class, ()->conta.sacar(0.0), "aceita saque zerado");
        assertThrows(IllegalArgumentException.class, ()->conta.sacar(-1.0), "aceita saque negativo");
    }

    @Test
    void sacarMaisQueSaldo(){
        ContaBancaria conta = new ContaBancaria();
        assertThrows(IllegalStateException.class, ()->conta.sacar(1000.0), "aceita saque zerado");
    }

    @Test
    void sacaAtualizaSaldo(){
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000.0);
        conta.sacar(1000.0);
        assertEquals(0.0, conta.getSaldo(), "saldo incorreto depois do saque");
    }


}

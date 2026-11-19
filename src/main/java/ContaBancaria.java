public class ContaBancaria { //
    private double saldo;

    public void  depositar(double valor){
        if(valor <= 0) throw new IllegalArgumentException("Valor não pode ser zero ou negativo!");
        saldo += valor;
    }

    public void  sacar(double valor){
        if(valor <= 0) throw new IllegalArgumentException("Valor não pode ser zero ou negativo!");
        if(valor > getSaldo()) throw new IllegalStateException("Não pode sacar mais que o saldo!");
        saldo -= valor;
    }

    public double getSaldo(){
        return saldo;
    }
}

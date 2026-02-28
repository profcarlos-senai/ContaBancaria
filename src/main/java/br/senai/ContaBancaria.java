package br.senai;

public class ContaBancaria {
    private double saldo;
    
    public void deposita(double valor){
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor depositado não pode ser zero ou negativo.");
        }
        this.saldo += valor;
    }

    public void saca(double valor){
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor sacado não pode ser zero ou negativo.");
        }
        if(valor > saldo){
            throw new IllegalArgumentException("Tentativa de sacar valor maior que o saldo");
        }
        this.saldo -= valor;
    }

    public double getSaldo(){
        return this.saldo;
    }
}

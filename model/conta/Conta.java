package model.conta;

interface Conta {
    final double taxa = 1.25;
    
    void depositar(double valor);
    void sacar(double valor);
    void verSaldo();
}
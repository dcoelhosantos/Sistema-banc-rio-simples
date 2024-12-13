package model.conta;

public class Poupanca implements Conta{

	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void depositar(double valor) {
		if (valor > 0) {
            this.saldo = valor * taxa;
            System.out.println("Deposito realizado com sucesso...");
        } else {
            System.out.println("Deposito não realizado...");
        }
	}
    
	@Override
	public void sacar(double valor) {
		if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso...");
        } else {
            System.out.println("Saque não realizado...");
        }
	}
	
	@Override
	public void verSaldo() {
		System.out.println("Saldo: " + saldo);
	}
}

    


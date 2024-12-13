package model.pessoa;
import model.conta.*;

public abstract class Pessoa{
    private String nome;
    private Corrente contaCorrente;
    private Poupanca contaPoupanca;
    
	public Pessoa(String nome, Corrente contaCorrente, Poupanca contaPoupanca) {
		this.nome = nome;
		this.contaCorrente = contaCorrente;
		this.contaPoupanca = contaPoupanca;
	}
	
	public Pessoa() {
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Corrente getContaCorrente() {
		return contaCorrente;
	}
	public void setContaCorrente(Corrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	public Poupanca getContaPoupanca() {
		return contaPoupanca;
	}
	public void setContaPoupanca(Poupanca contaPoupanca) {
		this.contaPoupanca = contaPoupanca;
	}
   
}
    


   
    


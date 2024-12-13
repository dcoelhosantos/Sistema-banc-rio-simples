package utils;

import DAO.BancoDAO;
import model.conta.Corrente;
import model.conta.Poupanca;
import model.pessoa.Pessoa;
import model.pessoa.PessoaFisica;

public class BankFunctions {
	
	public static BancoDAO banco = BancoDAO.getIntance();
	
	public static void cadastrarClientePF(String nome, String cpf, String dataNascimento) {
		PessoaFisica pf = new PessoaFisica();
		pf.setNome(nome);
		pf.setCpf(cpf);
		pf.setDataNascimento(dataNascimento);
		pf.setContaCorrente(new Corrente());
		pf.setContaPoupanca(new Poupanca());
		pf.getContaPoupanca().setSaldo(0);
		pf.getContaCorrente().setSaldo(0);
		banco.getArrayPessoas().add(pf);
		System.out.println("\n##########################");
		System.out.println("Pessoa cadastrada com sucesso!");
		System.out.println("##########################\n");
	}
	
	public static void removerClientePF(String cpf) {
		boolean b = banco.getArrayPessoas().remove(buscarPessoa(cpf));
		if(b) {
			System.out.println("\n##########################");
			System.out.println("Pessoa removida com sucesso!");
			System.out.println("##########################\n");
		}
		else {
			System.out.println("\n##########################");
			System.out.println("Pessoa não encontrada!");
			System.out.println("##########################\n");
		}
	}
	
	public static void depositarCC(double valor, String cpf) {
		Pessoa p = buscarPessoa(cpf);
		if(p != null) {
			p.getContaCorrente().depositar(valor);		
		}
		else {
			System.out.println("\n##########################");
			System.out.println("Pessoa não encontrada!");
			System.out.println("##########################\n");
		}
	}
	
	public static void sacarCC(double valor, String cpf) {
		Pessoa p = buscarPessoa(cpf);
		if(p != null) {
			p.getContaCorrente().sacar(valor);	
		}
		else {
			System.out.println("\n##########################");
			System.out.println("Pessoa não encontrada!");
			System.out.println("##########################\n");
		}
	}
	
	public static void depositarCP(double valor, String cpf) {
		Pessoa p = buscarPessoa(cpf);
		if(p != null) {
			p.getContaPoupanca().depositar(valor);	
		}
		else {
			System.out.println("\n##########################");
			System.out.println("Pessoa não encontrada!");
			System.out.println("##########################\n");
		}
	}
	
	public static void sacarCP(double valor, String cpf) {
		Pessoa p = buscarPessoa(cpf);
		if(p != null) {
			p.getContaPoupanca().sacar(valor);
		}
		else {
			System.out.println("\n##########################");
			System.out.println("Pessoa não encontrada!");
			System.out.println("##########################\n");
		}
	}
	
	public static void verSaldoCC(String cpf) {
		Pessoa p = buscarPessoa(cpf);
		if(p != null) {
			p.getContaCorrente().verSaldo();
		}
		else {
			System.out.println("\n##########################");
			System.out.println("Pessoa não encontrada!");
			System.out.println("##########################\n");
		}
	}
	
	public static void verSaldoCP(String cpf) {
		Pessoa p = buscarPessoa(cpf);
		if(p != null) {
			p.getContaPoupanca().verSaldo();
		}
		else {
			System.out.println("\n##########################");
			System.out.println("Pessoa não encontrada!");
			System.out.println("##########################\n");
		}
	}
	
	public static Pessoa buscarPessoa(String cpf) {
		for(Pessoa p : banco.getArrayPessoas()) {
			if(((PessoaFisica) p).getCpf().equals(cpf)) {
				return p;
			}
		}
		return null;
	}
}

    



    
    

    

    

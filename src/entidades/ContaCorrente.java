package entidades;

import excecao.DomainExceptions;

public abstract class ContaCorrente {

	private Integer numero;
	private String nome;
	private Double saldo;
	private Double limiteSaque;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(Integer numero, String nome, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}
	

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void saque(double valor) {
		if(valor>limiteSaque) {
			throw new DomainExceptions ("Limite de saque excedido!");
		}
		if(valor>saldo) {
			throw new DomainExceptions ("Saldo insufuciente!");
		}
		saldo-=valor;
	}
	public void deposito(double valor) {
		saldo+=valor;
	}

	@Override
	public String toString() {
		return "ContaCorrente [numero= " + numero + ", nome= " + nome + ", saldo= " + saldo + ", limiteSaque= "
				+ limiteSaque + "]";
	}
	
}

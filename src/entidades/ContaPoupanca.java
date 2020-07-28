package entidades;

public class ContaPoupanca extends ContaCorrente {
	
	private Double taxaJuros = 2.25;

	
	public ContaPoupanca(Integer numero, String nome, Double saldo, Double limiteSaque, Double taxaJuros) {
		super(numero, nome, saldo, limiteSaque);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizacaoSaldo(Double saldo) {
		saldo+=saldo*taxaJuros;
	}

	@Override
	public void saque(double valor) {
		super.saque(valor);
		
	}

	@Override
	public void deposito(double valor) {
		// TODO Auto-generated method stub
		super.deposito(valor);
	}
	
	
}

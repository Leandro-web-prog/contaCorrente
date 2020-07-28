package entidades;

public class ContaPessoaFisica extends ContaCorrente {
	
	private String CPF;
	private Double limiteSaque = 500.00;
	
	public ContaPessoaFisica() {
		
	}
	
	public ContaPessoaFisica(Integer numero, String nome, Double saldo, Double limiteSaque, String cPF,
			Double limiteSaque2) {
		super(numero, nome, saldo, limiteSaque);
		CPF = cPF;
		limiteSaque = limiteSaque2;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public Double getLimiteSaque() {
		return limiteSaque;
	}
	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	@Override
	public void saque(double valor) {
		// TODO Auto-generated method stub
		super.saque(valor);
	}

	@Override
	public void deposito(double valor) {
		// TODO Auto-generated method stub
		super.deposito(valor);
	}

	@Override
	public String toString() {
		return "ContaPessoaFisica [CPF= " + CPF + ", limiteSaque= " + limiteSaque + "]";
	}

}

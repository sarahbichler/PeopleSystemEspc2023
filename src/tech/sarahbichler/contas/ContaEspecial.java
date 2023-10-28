package tech.sarahbichler.contas;

public class ContaEspecial extends Conta {
	private double limite;
	
	public boolean sacar(double valor) {
		if(getSaldo() >= valor) {
			setSaldo(getSaldo() - (valor * 0.99));
			return true;
		} 
		else {
			return false;
		}
	}

	public ContaEspecial(int numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;
	}

}

package laboratorio1;

abstract public class Conta {

	protected double saldo;
	protected double limite;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public double saldo() {
		return saldo;
	}

	public void criaLimite(double limite) {
		this.limite = limite;
	}

	public double deposito(double valor) {
		saldo += valor;
		return saldo;
	}

	abstract public double saque(double valor);

}
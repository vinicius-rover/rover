
/**
 * 2)
 * Os atributos titular e saldo não estão encapsulados, violando o encapsulamento.
 * 
 * Qualquer classe pode alterar o saldo diretamente (conta.saldo = -1000).
 * 
 * Não há validação para valores negativos em depositar e sacar.
 * 
 * A classe não protege seus invariantes (ex: saldo não deveria ser negativo).
 */
public class ContaBancaria {

	private String titular;
	private double saldo;

	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			throw new RuntimeException(("Valor Invalido"));
		}
		saldo += valor;
	}

	public void sacar(double valor) {
		if (valor <= 0 || valor > saldo) {
			throw new RuntimeException(("Valor Invalido"));
		}
		saldo -= valor;
	}
}

/**
 * 1)
 * O imposto está fixo em 10%, dificultando adaptação a novas regras.
 *
 * Não há forma de incluir novos cálculos (ex: desconto) sem alterar o método.
 *
 * Violação do princípio aberto/fechado.
 *
 * Método com responsabilidade rígida e pouco extensível.
 */
public class CalculadoraDePreco {

	private double preco;
	private static final double imposto = 0.10;

	public double calcularImposto(double preco) {
		double resultado = preco;

		resultado = resultado + (preco * imposto);
		return resultado;
	}

	public static void main(String[] args) {
		CalculadoraDePreco calculadoraDePreco = new CalculadoraDePreco();
		System.out.println(calculadoraDePreco.calcularImposto(100));
	}
}

package strategy.investimentos;

public class Moderado implements Investimento {

	private boolean escolhido;

	public Moderado() {
		this.escolhido = new java.util.Random().nextDouble() > 0.50;
	}

	@Override
	public double calcula(Investidor investidor) {

		if (escolhido) {
			return (investidor.getValor() * 0.007) * 0.75;
		}

		return (investidor.getValor() * 0.025) * 0.75;
	}

}

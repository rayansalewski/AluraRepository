package strategy.investimentos;

public class Arrojado implements Investimento {

	private double escolhido;

	public Arrojado() {
		this.escolhido = new java.util.Random().nextDouble();
	}

	@Override
	public double calcula(Investidor investidor) {

		if (escolhido > 0.50) {
			return (investidor.getValor() * 0.006) * 0.75;
		} else if (escolhido < 0.20) {
			return (investidor.getValor() * 0.05) * 0.75;
		}

		return (investidor.getValor() * 0.03) * 0.75;
	}

}

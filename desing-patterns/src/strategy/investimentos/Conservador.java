package strategy.investimentos;

public class Conservador implements Investimento {

	@Override
	public double calcula(Investidor investidor) {
		return (investidor.getValor() * 0.008) * 0.75;
	}

}

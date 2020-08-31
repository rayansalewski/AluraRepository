package strategy;

public class ISS implements Impostos{

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.30;
	}

}

package strategy;

public class ICCC implements Impostos{

	@Override
	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() < 1000.00) {
			return orcamento.getValor() * 0.05;
		} else if (orcamento.getValor() > 3000.00) {
			return orcamento.getValor() * 0.07;
		}
		
		return orcamento.getValor() * 0.08 + 30;
	}

}

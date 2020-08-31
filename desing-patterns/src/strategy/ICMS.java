package strategy;

public class ICMS implements Impostos {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

}

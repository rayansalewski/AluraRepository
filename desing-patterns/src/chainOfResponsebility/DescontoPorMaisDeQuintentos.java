package chainOfResponsebility;

public class DescontoPorMaisDeQuintentos implements Desconto {

	private Desconto proximoDesconto;

	@Override
	public double desconto(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		} else {
			return proximoDesconto.desconto(orcamento);
		}
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		this.proximoDesconto = desconto;
	}
	
}

package chainOfResponsebility;

public class DescontoPorMaisDeCincoItens implements Desconto {

	private Desconto proximoDesconto;

	@Override
	public double desconto(Orcamento orcamento) {
		if (orcamento.getItens().size() >= 5) {
			return orcamento.getValor() * 0.1;
		} else {
			return proximoDesconto.desconto(orcamento);
		}
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		this.proximoDesconto = desconto;
	}
}

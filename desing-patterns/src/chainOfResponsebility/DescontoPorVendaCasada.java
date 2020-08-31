package chainOfResponsebility;

public class DescontoPorVendaCasada implements Desconto{

	private Desconto proximoDesconto;

	@Override
	public double desconto(Orcamento orcamento) {
		if (contemItemDeNome("LAPIS", orcamento) && contemItemDeNome("CANETA", orcamento)) {
			return orcamento.getValor() * 0.05;
		} else {
			return proximoDesconto.desconto(orcamento);
		}
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		this.proximoDesconto = desconto;
	}
	
	private boolean contemItemDeNome(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if (item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }

}

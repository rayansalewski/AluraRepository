package chainOfResponsebility;

public class CorrenteDesconto {

	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorMaisDeCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuintentos();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();

		d1.setProximoDesconto(d2);
		d2.setProximoDesconto(d3);
		d3.setProximoDesconto(d4);
		
		return d1.desconto(orcamento);
	}
}

package chainOfResponsebility;

public class SemDesconto implements Desconto{

	@Override
	public double desconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximoDesconto(Desconto desconto) {
		// Não tem proximo
	}

}

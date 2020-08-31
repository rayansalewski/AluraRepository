package chainOfResponsebility;

public interface Desconto {

	double desconto(Orcamento orcamento);
	void setProximoDesconto(Desconto desconto);
}

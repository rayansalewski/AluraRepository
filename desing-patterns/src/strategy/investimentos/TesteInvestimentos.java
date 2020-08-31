package strategy.investimentos;

public class TesteInvestimentos {

	public static void main(String[] args) {
		Investidor investidor = new Investidor(500.00);

		Conservador investidorConservador = new Conservador();
		Moderado investidorModerado = new Moderado();
		Arrojado investidorArrojado = new Arrojado();

		CalculaInvestimento calcula = new CalculaInvestimento();

		calcula.lucroInvestimento(investidorConservador, investidor);
		calcula.lucroInvestimento(investidorModerado, investidor);
		calcula.lucroInvestimento(investidorArrojado, investidor);
	}

}

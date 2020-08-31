package strategy.investimentos;

public class CalculaInvestimento {

	public void lucroInvestimento(Investimento investimento, Investidor investidor) {
		System.out.printf("O tipo de investidor � %s, o retorno do investimento � de %s \n",
				investimento.getClass().getSimpleName(), investimento.calcula(investidor));
	}

}

package strategy.investimentos;

public class CalculaInvestimento {

	public void lucroInvestimento(Investimento investimento, Investidor investidor) {
		System.out.printf("O tipo de investidor é %s, o retorno do investimento é de %s \n",
				investimento.getClass().getSimpleName(), investimento.calcula(investidor));
	}

}

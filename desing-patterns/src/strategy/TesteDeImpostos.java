package strategy;

public class TesteDeImpostos {
	public static void main(String[] args) {
		Impostos iss = new ISS();
		Impostos icms = new ICMS();
		Impostos iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento(500.00);
		
		CalculadorDeImpostos calculo = new CalculadorDeImpostos();
		
		calculo.realizaCalculo(orcamento, iss);
		calculo.realizaCalculo(orcamento, icms);
		calculo.realizaCalculo(orcamento, iccc);
	}
}

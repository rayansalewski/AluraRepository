package strategy;

public class CalculadorDeImpostos {
	
	public void realizaCalculo(Orcamento orcamento, Impostos imposto) {
		System.out.printf("O valor do imposto %s é %s \n", imposto.getClass().getSimpleName(), imposto.calcula(orcamento) );
	}

}

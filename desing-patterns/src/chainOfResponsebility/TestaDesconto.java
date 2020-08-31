package chainOfResponsebility;

public class TestaDesconto {
	
	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(500.00);
		orcamento.adicionaItem(new Item("CANETA", 250.00));
		orcamento.adicionaItem(new Item("LAPIS", 250.00));
		
		CorrenteDesconto correnteDesconto = new CorrenteDesconto();
		
		System.out.printf("O Valor do desconto é de %s", correnteDesconto.calcula(orcamento));
		
	}
}

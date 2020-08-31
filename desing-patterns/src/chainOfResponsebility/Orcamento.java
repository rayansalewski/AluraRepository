package chainOfResponsebility;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private final double valor;
	private List<Item> itens;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void adicionaItem(Item item) {
		this.itens.add(item);
	}

}

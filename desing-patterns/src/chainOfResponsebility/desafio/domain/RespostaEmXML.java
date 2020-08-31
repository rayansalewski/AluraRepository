package chainOfResponsebility.desafio.domain;

import chainOfResponsebility.desafio.enums.Formato;

public class RespostaEmXML implements Resposta {

	private Resposta resposta;

	public RespostaEmXML(Resposta resposta) {
		this.resposta = resposta;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.XML)) {
			System.out.printf("<conta><titular>%s</titular><saldo>%s</saldo></conta>", conta.getNome(),
					conta.getSaldo());
		} else {
			resposta.responde(req, conta);
		}

	}
}

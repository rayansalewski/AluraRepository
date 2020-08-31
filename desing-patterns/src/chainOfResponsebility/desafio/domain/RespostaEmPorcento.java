package chainOfResponsebility.desafio.domain;

import chainOfResponsebility.desafio.enums.Formato;

public class RespostaEmPorcento implements Resposta {
	private Resposta resposta;

	public RespostaEmPorcento(Resposta resposta) {
		this.resposta = resposta;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.XML)) {
			System.out.print(conta.getNome() + "%" + conta.getSaldo());
		} else {
			resposta.responde(req, conta);
		}

	}
}

package chainOfResponsebility.desafio.domain;

import chainOfResponsebility.desafio.enums.Formato;

public class RespostaEmCSV implements Resposta{

	private Resposta resposta;
	
	public RespostaEmCSV(Resposta resposta) {
		this.resposta = resposta;
	}


	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato().equals(Formato.CSV)) {
			System.out.printf("titular, saldo\n%s,%s",conta.getNome(), conta.getSaldo());
		} else {
			resposta.responde(req, conta);
		}

	}
}

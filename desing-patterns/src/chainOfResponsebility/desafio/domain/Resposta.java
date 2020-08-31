package chainOfResponsebility.desafio.domain;

public interface Resposta {
	void responde(Requisicao req, Conta conta);
}
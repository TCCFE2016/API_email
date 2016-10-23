package br.com.api.email.bean;

public class Email {

	private String assunto;
	private String mensagem;
	
	
	public String getAssunto() {
		return assunto;
	}
	
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(Dados dados) {
		mensagem = "Solicitação de pedido ao Banco de Leite"
				+ "Matricula: " + dados.getMatricula() 
				+ "Nome: " + dados.getNome()
				+ "Data de Nascimento: " + dados.getDataNascimento()
				+ "Data do Parto: "+ dados.getDataParto()
				+ "Endereço: " + dados.getEndereco()
				+ "Telefone: " + dados.getTelefone()
				+ "Quantidade de Frascos Cheios: " + dados.getQuantidadeFrascosCheio()
				+ "Quantidade de Frascos Vazios: " + dados.getQuantidadeFrascosVazio();
	}	
}

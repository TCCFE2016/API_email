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
		String quebraDeLinha = System.getProperty("line.separator");
		mensagem = "Solicitação de pedido ao Banco de Leite " + quebraDeLinha
				+ "Matricula: " + dados.getMatricula() + quebraDeLinha
				+ "Nome: " + dados.getNome() + quebraDeLinha
				+ "Data de Nascimento: " + dados.getDataNascimento() + quebraDeLinha
				+ "Data do Parto: "+ dados.getDataParto() + quebraDeLinha
				+ "Endereço: " + dados.getEndereco() + quebraDeLinha
				+ "Telefone: " + dados.getTelefone() + quebraDeLinha
				+ "Quantidade de Frascos Cheios: " + dados.getQuantidadeFrascosCheio() + quebraDeLinha
				+ "Quantidade de Frascos Vazios: " + dados.getQuantidadeFrascosVazio() + quebraDeLinha; 
	}	
}

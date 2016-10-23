package br.com.api.email.bean;

public class Dados {

	private String matricula;
	private String nome;
	private String dataNascimento;
	private String dataParto;
	private String endereco;
	private String telefone;
	private Integer quantidadeFrascosCheio;
	private Integer quantidadeFrascosVazio;
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getDataParto() {
		return dataParto;
	}
	public void setDataParto(String dataParto) {
		this.dataParto = dataParto;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Integer getQuantidadeFrascosCheio() {
		return quantidadeFrascosCheio;
	}
	public void setQuantidadeFrascosCheio(Integer quantidadeFrascosCheio) {
		this.quantidadeFrascosCheio = quantidadeFrascosCheio;
	}
	public Integer getQuantidadeFrascosVazio() {
		return quantidadeFrascosVazio;
	}
	public void setQuantidadeFrascosVazio(Integer quantidadeFrascosVazio) {
		this.quantidadeFrascosVazio = quantidadeFrascosVazio;
	}	
}

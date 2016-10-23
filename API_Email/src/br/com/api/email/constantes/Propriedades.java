package br.com.api.email.constantes;

public enum Propriedades {

	DESCRICAO_HOST("mail.smtp.host"),
	SMTP_GMAIL("smtp.gmail.com"),
	DESCRICAO_PORT_SOCKET("mail.smtp.socketFactory.port"),
	PORTA("465"),
	DESCRICAO_SOCKET_CLASS("mail.smtp.socketFactory.class"),
	SOCKET("javax.net.ssl.SSLSocketFactory"),
	DESCRICAO_AUTH("mail.smtp.auth"),
	AUTH("true"),
	DESCRICAO_PORT("mail.smtp.port"),
	EMAIL_REMETENTE("blhtcc2016@gmail.com"),
	SENHA_REMETENTE("d81cb2b1"),
	DESTINATARIO("silva20102@gmail.com");
	
	
	
	private String prop;
	
	private Propriedades(String prop) {
		this.prop = prop;
	}
	
	public String prop(){
		return this.prop;
	}
}

package br.com.api.email.propriedades;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import br.com.api.email.constantes.Propriedades;

public class Email {

	private Properties prop;
	
	public Email() {
		prop = new Properties();
	}
	
	public Properties carregarPropriedades(){
		prop.put(Propriedades.DESCRICAO_HOST.prop(), Propriedades.SMTP_GMAIL.prop());
		prop.put(Propriedades.DESCRICAO_PORT_SOCKET.prop(), Propriedades.PORTA.prop());
		prop.put(Propriedades.DESCRICAO_SOCKET_CLASS.prop(), Propriedades.SOCKET.prop());
		prop.put(Propriedades.DESCRICAO_AUTH.prop(), Propriedades.AUTH.prop());
		prop.put(Propriedades.DESCRICAO_PORT.prop(), Propriedades.PORTA.prop());
		
		return prop;
	}
	
	public Session sessaoDeEmail(Properties prop){
		Session sessao = Session.getDefaultInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(Propriedades.EMAIL_REMETENTE.prop(), Propriedades.SENHA_REMETENTE.prop());
			}
		});
		
		sessao.setDebug(true);
		
		return sessao;
	}
}

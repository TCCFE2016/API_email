package com.br.email.api;

import java.util.Properties;

import javax.ejb.Stateless;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.google.gson.Gson;

import br.com.api.email.bean.Dados;
import br.com.api.email.constantes.Propriedades;
import br.com.api.email.propriedades.Email;

@Stateless
public class Api extends Email {

	private Gson gson;
	
	public Api() {
		gson = new Gson();
	}
	
	@SuppressWarnings("finally")
	public String enviarEmail(br.com.api.email.bean.Email email) {
		boolean error = false;
		try {
			Properties propriedades = carregarPropriedades();
			Message mensagem = new MimeMessage(sessaoDeEmail(propriedades));
			mensagem.setFrom(new InternetAddress(Propriedades.EMAIL_REMETENTE.prop()));
			
			Address[] destinatario = InternetAddress.parse(Propriedades.DESTINATARIO.prop());
			mensagem.setRecipients(Message.RecipientType.TO, destinatario);
			mensagem.setSubject(email.getAssunto());
			mensagem.setText(email.getMensagem());
			Transport.send(mensagem);
		} catch (MessagingException e) {
			error = true;
			throw new RuntimeException(e);
		} catch (Exception e) {
			error = true;
			throw new RuntimeException(e);
		} finally {
			if (error) {
				return "Erro ao Enviar E-mail";
			} else {
				return "Enviado com sucesso";
			}
		}
	}

	public br.com.api.email.bean.Email montarEmail(String dados) {		
		Dados dado = gson.fromJson(dados, Dados.class);
		br.com.api.email.bean.Email email = new br.com.api.email.bean.Email();
		
		email.setMensagem(dado);
		email.setAssunto("Solicitação de Atendimento");
		return email;
	}
}

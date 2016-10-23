package com.br.email.api;

import javax.ejb.Stateless;

import com.google.gson.Gson;

import br.com.api.email.bean.Dados;
import br.com.api.email.propriedades.Email;

@Stateless
public class Api extends Email {

	private Gson gson;
	
	public Api() {
		gson = new Gson();
	}
	
	public String enviarEmail() {
		return "Enviado com Sucesso";
	}

	public br.com.api.email.bean.Email montarEmail(String dados) {		
		Dados dado = gson.fromJson(dados, Dados.class);
		br.com.api.email.bean.Email email = new br.com.api.email.bean.Email();
		
		email.setMensagem(dado);
		email.setAssunto("Solicitação de Atendimento");
		return email;
	}
}

package br.com.api.email.rest;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.br.email.api.Api;

import br.com.api.email.bean.Email;

@Path("email")
@Stateless
public class ApiRest {
	
	@Inject
	private Api api;

	@POST
	@Produces("application/json")
	public String enviarEmail(String json){
		Email email = api.montarEmail(json);
		return "";
	}
}

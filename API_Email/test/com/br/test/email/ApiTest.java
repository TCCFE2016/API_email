package com.br.test.email;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.br.email.api.Api;
import com.google.gson.Gson;

import br.com.api.email.bean.Dados;
import br.com.api.email.bean.Email;

public class ApiTest {

	private Api api;
	private Properties prop;
	private Email email;
	
	
	public ApiTest() {
		api = new Api();
		email = new Email();
	}
	
	@Before
	@Test
	public void deveraRetornarPropriedadePreenchida(){
		prop = api.carregarPropriedades();
		Assert.assertEquals("smtp.gmail.com", prop.getProperty("mail.smtp.host"));
		Assert.assertEquals("465", prop.getProperty("mail.smtp.socketFactory.port"));
		Assert.assertEquals("javax.net.ssl.SSLSocketFactory", prop.getProperty("mail.smtp.socketFactory.class"));
		Assert.assertEquals("true", prop.getProperty("mail.smtp.auth"));
		Assert.assertEquals("465", prop.getProperty("mail.smtp.port"));
	}
	
	@Test
	public void deveraTerUmaSessaoInstanciada(){
		Assert.assertEquals(true, api.sessaoDeEmail(prop) != null);
	}
	
	@Before
	@Test
	public void deveraMontarUmEmail(){
		Dados dados = new Dados();
		Gson gson = new Gson();
		
		dados.setMatricula("1234");
		dados.setNome("Maria da Silva Sauro");
		dados.setDataNascimento("01/01/0001");
		dados.setDataParto("01/09/0001");
		dados.setEndereco("Floresta dos Dinossauros rua 3 casa 0");
		dados.setTelefone("(99)0000-0001");
		dados.setQuantidadeFrascosCheio(0);
		dados.setQuantidadeFrascosVazio(10);
		
		String json = gson.toJson(dados);
		
		this.email = api.montarEmail(json);
		Assert.assertEquals(true, this.email != null);
	}
	
	@Test
	public void deveraEnviarEmail(){
		Assert.assertEquals("Enviado com sucesso", api.enviarEmail(this.email));
	}
}

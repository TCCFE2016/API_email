package com.br.test.email;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.br.email.api.Api;

public class ApiTest {

	private Api api;
	private Properties prop;
	
	
	public ApiTest() {
		this.api = new Api();
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
	
	@Test
	public void testarRespostaAPI(){
		Assert.assertEquals("Enviado com Sucesso", api.enviarEmail());
	}
	
	@Test
	public void deveraMontarUmEmail(){
		Assert.assertEquals(true, api.montarEmail("") != null);
	}
}

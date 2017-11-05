package br.com.fiap.transportadora.servico;

import org.glassfish.jersey.server.ResourceConfig;

public class AplicacaoConfig extends ResourceConfig{
	
	public AplicacaoConfig(){
		packages("br.com.fiap.transportadora.servico");
	}

}

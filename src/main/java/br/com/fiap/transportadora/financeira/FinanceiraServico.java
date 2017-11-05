package br.com.fiap.transportadora.financeira;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

public class FinanceiraServico {
	
	public Boolean cobranca(String cpf_cnpj,Double valor){
		
		boolean resultado = false;
		
		FinanceiroWebService port = new FinanceiroWebServiceService().
				getFinanceiroWebServicePort();
		
		Map<String,Object> req_ctx = ((BindingProvider)port).getRequestContext();
		Map<String, List<String>> headers = new HashMap<>();
		headers.put("Usuario", Collections.singletonList("estabelecimento"));
		headers.put("Senha", Collections.singletonList("estabelecimento123"));
		req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		
		CobrancaRequestPojo pojo = new CobrancaRequestPojo();
		CobrancaResponsePojo pojoResponse = new CobrancaResponsePojo();
		
		pojo.setCpfCnpj(cpf_cnpj);
		pojo.setValor(valor);
		
		CobrancaRequest request = new CobrancaRequest();
		CobrancaResponse response = new CobrancaResponse();
		
		request.setCobranca(pojo);
		
		try {
			response = port.cobranca(request);
			pojoResponse = response.getResultadoCobranca();
			resultado = pojoResponse.resultado;
		} catch (FinanceiraException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resultado;		
	}

}

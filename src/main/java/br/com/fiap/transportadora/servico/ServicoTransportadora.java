package br.com.fiap.transportadora.servico;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.rpc.ServiceException;

import br.com.fiap.transportadora.entidades.Remessa;
import br.com.fiap.transportadora.financeira.FinanceiraServico;
import government.fiap.com.br.GovernoService;

@Path("servico")
public class ServicoTransportadora {
	
	static private List<Remessa> remessas = new ArrayList<>();
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/listar")
	public List<Remessa> listarRemessa(){
		return remessas;
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/calcular_frete/{numeroProdutos}/{valorTotalRemessa}")
	public Double calcularFrete(@PathParam("numeroProdutos") int numeroProdutos,
			@PathParam("valorTotalRemessa") double valorRemessa) throws RemoteException, ServiceException{
		
		double valorFrete = 0;
		
		/**
		 * Chamada Governo
		 */
		double impostos = new GovernoService().calculaImpostos(valorRemessa);
		
		//double impostos = 0.12 * valorRemessa;
		
		valorFrete = calcular(numeroProdutos, valorRemessa, impostos);
		
		return valorFrete;
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/gerar_frete/{cpfCnpjRemetente}/{cpfCnpjDestinatario}/{numeroProdutos}/{valorRemessa}")
	public boolean gerarFrete(@PathParam("cpfCnpjRemetente") String cpfCnpjRemetente,
			@PathParam("cpfCnpjDestinatario") String cpfCnpjDestinatario,
			@PathParam("numeroProdutos") int numeroProdutos,
			@PathParam("valorRemessa") double valorRemessa){
		
		
		double valorFrete = 0;
		boolean debitoValorFrete = false;
		boolean notaFiscalEmitida = false;
		
		valorFrete = calcular(numeroProdutos, valorRemessa, 0);
		
		/**
		 *FINANCEIRA DEBITO FRETE TRUE/FALSE
		 */
		debitoValorFrete = new FinanceiraServico().cobranca(cpfCnpjRemetente, valorFrete);
		
		/**
		 * NOTA FISCAL EMETIDAA GOVERNO
		 */
		
		if(debitoValorFrete){
			notaFiscalEmitida = new GovernoService().gerarNota(cpfCnpjRemetente, valorRemessa);
		}
		
		/**
		 * Valor dos impostos Governo
		 */
		
		if(debitoValorFrete && notaFiscalEmitida){
			Remessa remessa = new Remessa();
			remessa.setCpfCnpjDestinatario(cpfCnpjDestinatario);
			remessa.setCpfCnpjRemetente(cpfCnpjRemetente);
			remessa.setValorFrete(valorFrete);
			remessas.add(remessa);
		}
		
		return debitoValorFrete && notaFiscalEmitida;
	}
	
	private double calcular(int numeroProdutos, double valorRemessa, double impostos){
		return (numeroProdutos * 25) + (valorRemessa * 0.01) + impostos;
	}
}

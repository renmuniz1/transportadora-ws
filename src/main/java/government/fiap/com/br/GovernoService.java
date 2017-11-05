package government.fiap.com.br;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Stub;

public class GovernoService {
	
	public double calculaImpostos(Double valorRemessa) throws ServiceException, RemoteException{
		Double valorImpostos = 0.0;
		Double aux = 0.0;
		Taxes_ServiceLocator locator = new Taxes_ServiceLocator();
		Taxes_PortType service = locator.getTaxesPort();

		((Stub) service).setHeader("", "username", "transportadora");
		((Stub) service).setHeader("", "password", "transportadora");
		
		for(Tax taxa : service.list()){
			aux += taxa.getPercent();
		}
		valorImpostos = aux / 100 * valorRemessa;
		
		return valorImpostos;
	}
	
	public boolean gerarNota(String cpfCnpjRemetente,Double valorRemessa){
		try {
			Invoice_ServiceLocator locator = new Invoice_ServiceLocator();
			Invoice_PortType service = locator.getInvoicePort();
			InvoiceRequest request = new InvoiceRequest();
			InvoiceResponse response = new InvoiceResponse();
			
			Document documento = new Document();
			
			if(cpfCnpjRemetente.length() <= 11){
				documento.setType(Type.CPF);
			} else if(cpfCnpjRemetente.length() > 11){
				documento.setType(Type.CNPJ);
			}
			
			documento.setValue(cpfCnpjRemetente);
			
			request.setDocument(documento);
			request.setValue(valorRemessa);
			
			Generate generate = new Generate();
			generate.setArg0(request);
			
			GenerateResponse responseGenerate =   service.generate(generate, "transportadora","transportadora");
			
			response =  responseGenerate.getGenerate();
			
			Invoice invoice =   response.getInvoice();
			
			if(invoice.getValueWithTax() != null || invoice.getValueWithTax() != 0){
				return true;
			} else {
				return false;
			}
			
		} catch (ServiceException e) {
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} catch (RemoteException e) {
			e.printStackTrace();
			return false;
		}
	}

}

package government.fiap.com.br;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class Main {

	public static void main(String[] args) throws ServiceException, RemoteException {
		Invoice_ServiceLocator locator = new Invoice_ServiceLocator();
		Invoice_PortType service = locator.getInvoicePort();
		
		//Taxes_ServiceLocator locator = new Taxes_ServiceLocator();
		//Taxes_PortType service = locator.getTaxesPort();

		//((Stub) service).setHeader("", "username", "transportadora");
		//((Stub) service).setHeader("", "password", "transportadora");
		
		InvoiceRequest request = new InvoiceRequest();
		//InvoiceResponse response = new InvoiceResponse();
		Document documento = new Document();
		documento.setType(Type.CPF);
		documento.setValue("24982598053");
		
		request.setDocument(documento);
		request.setValue(100d);
		
		Generate generate = new Generate();
		
		generate.setArg0(request);
		
		
		 GenerateResponse response =   service.generate(generate, "transportadora","transportadora");
		 
		 InvoiceResponse resposta =  response.getGenerate();
		 
		 Invoice invoice =   resposta.getInvoice();
		 
		 System.out.println(invoice.getValueWithTax());
		
		 //service.generate(new InvoiceRequest(new Document(Type.CPF, "24982598053"), 1d));
		 
		/**for(Invoice invoice : service.list()) {
			System.out.println(invoice.getValueWithTax());
		}**/
		
		/**for(Tax taxa : service.list()){
			System.out.println(taxa.getName());
			System.out.println(taxa.getPercent());
		} **/
	}

}

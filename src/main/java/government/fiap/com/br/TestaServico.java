package government.fiap.com.br;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class TestaServico {
	
	public static void main(String[] args) {
		GovernoService gov = new GovernoService();
		try {
			double resultado = gov.calculaImpostos(10.0);
			System.out.println(resultado);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

/**
 * Invoice_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package government.fiap.com.br;

public interface Invoice_PortType extends java.rmi.Remote {
    public government.fiap.com.br.ListResponse list(government.fiap.com.br.List parameters, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public government.fiap.com.br.GenerateResponse generate(government.fiap.com.br.Generate parameters, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, government.fiap.com.br.Exception;
}

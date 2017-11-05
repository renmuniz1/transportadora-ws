package government.fiap.com.br;

public class InvoiceProxy implements government.fiap.com.br.Invoice_PortType {
  private String _endpoint = null;
  private government.fiap.com.br.Invoice_PortType invoice_PortType = null;
  
  public InvoiceProxy() {
    _initInvoiceProxy();
  }
  
  public InvoiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initInvoiceProxy();
  }
  
  private void _initInvoiceProxy() {
    try {
      invoice_PortType = (new government.fiap.com.br.Invoice_ServiceLocator()).getInvoicePort();
      if (invoice_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)invoice_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)invoice_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (invoice_PortType != null)
      ((javax.xml.rpc.Stub)invoice_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public government.fiap.com.br.Invoice_PortType getInvoice_PortType() {
    if (invoice_PortType == null)
      _initInvoiceProxy();
    return invoice_PortType;
  }
  
  public government.fiap.com.br.ListResponse list(government.fiap.com.br.List parameters, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (invoice_PortType == null)
      _initInvoiceProxy();
    return invoice_PortType.list(parameters, username, password);
  }
  
  public government.fiap.com.br.GenerateResponse generate(government.fiap.com.br.Generate parameters, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, government.fiap.com.br.Exception{
    if (invoice_PortType == null)
      _initInvoiceProxy();
    return invoice_PortType.generate(parameters, username, password);
  }
  
  
}
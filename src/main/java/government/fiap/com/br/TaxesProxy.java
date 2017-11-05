package government.fiap.com.br;

public class TaxesProxy implements government.fiap.com.br.Taxes_PortType {
  private String _endpoint = null;
  private government.fiap.com.br.Taxes_PortType taxes_PortType = null;
  
  public TaxesProxy() {
    _initTaxesProxy();
  }
  
  public TaxesProxy(String endpoint) {
    _endpoint = endpoint;
    _initTaxesProxy();
  }
  
  private void _initTaxesProxy() {
    try {
      taxes_PortType = (new government.fiap.com.br.Taxes_ServiceLocator()).getTaxesPort();
      if (taxes_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)taxes_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)taxes_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (taxes_PortType != null)
      ((javax.xml.rpc.Stub)taxes_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public government.fiap.com.br.Taxes_PortType getTaxes_PortType() {
    if (taxes_PortType == null)
      _initTaxesProxy();
    return taxes_PortType;
  }
  
  public government.fiap.com.br.Tax[] list() throws java.rmi.RemoteException{
    if (taxes_PortType == null)
      _initTaxesProxy();
    return taxes_PortType.list();
  }
  
  
}
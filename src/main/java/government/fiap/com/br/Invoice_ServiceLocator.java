/**
 * Invoice_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package government.fiap.com.br;

public class Invoice_ServiceLocator extends org.apache.axis.client.Service implements government.fiap.com.br.Invoice_Service {

    public Invoice_ServiceLocator() {
    }


    public Invoice_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Invoice_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for InvoicePort
    private java.lang.String InvoicePort_address = "http://fiap-29scj-government.herokuapp.com/Service/Invoice";

    public java.lang.String getInvoicePortAddress() {
        return InvoicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String InvoicePortWSDDServiceName = "InvoicePort";

    public java.lang.String getInvoicePortWSDDServiceName() {
        return InvoicePortWSDDServiceName;
    }

    public void setInvoicePortWSDDServiceName(java.lang.String name) {
        InvoicePortWSDDServiceName = name;
    }

    public government.fiap.com.br.Invoice_PortType getInvoicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(InvoicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getInvoicePort(endpoint);
    }

    public government.fiap.com.br.Invoice_PortType getInvoicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            government.fiap.com.br.InvoiceSoapBindingStub _stub = new government.fiap.com.br.InvoiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getInvoicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setInvoicePortEndpointAddress(java.lang.String address) {
        InvoicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (government.fiap.com.br.Invoice_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                government.fiap.com.br.InvoiceSoapBindingStub _stub = new government.fiap.com.br.InvoiceSoapBindingStub(new java.net.URL(InvoicePort_address), this);
                _stub.setPortName(getInvoicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("InvoicePort".equals(inputPortName)) {
            return getInvoicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://br.com.fiap.government/", "Invoice");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://br.com.fiap.government/", "InvoicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("InvoicePort".equals(portName)) {
            setInvoicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

/**
 * Taxes_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package government.fiap.com.br;

public class Taxes_ServiceLocator extends org.apache.axis.client.Service implements government.fiap.com.br.Taxes_Service {

    public Taxes_ServiceLocator() {
    }


    public Taxes_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Taxes_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TaxesPort
    private java.lang.String TaxesPort_address = "http://fiap-29scj-government.herokuapp.com/Service/Taxes";

    public java.lang.String getTaxesPortAddress() {
        return TaxesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TaxesPortWSDDServiceName = "TaxesPort";

    public java.lang.String getTaxesPortWSDDServiceName() {
        return TaxesPortWSDDServiceName;
    }

    public void setTaxesPortWSDDServiceName(java.lang.String name) {
        TaxesPortWSDDServiceName = name;
    }

    public government.fiap.com.br.Taxes_PortType getTaxesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TaxesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTaxesPort(endpoint);
    }

    public government.fiap.com.br.Taxes_PortType getTaxesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            government.fiap.com.br.TaxesSoapBindingStub _stub = new government.fiap.com.br.TaxesSoapBindingStub(portAddress, this);
            _stub.setPortName(getTaxesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTaxesPortEndpointAddress(java.lang.String address) {
        TaxesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (government.fiap.com.br.Taxes_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                government.fiap.com.br.TaxesSoapBindingStub _stub = new government.fiap.com.br.TaxesSoapBindingStub(new java.net.URL(TaxesPort_address), this);
                _stub.setPortName(getTaxesPortWSDDServiceName());
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
        if ("TaxesPort".equals(inputPortName)) {
            return getTaxesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://br.com.fiap.government/", "Taxes");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://br.com.fiap.government/", "TaxesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TaxesPort".equals(portName)) {
            setTaxesPortEndpointAddress(address);
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

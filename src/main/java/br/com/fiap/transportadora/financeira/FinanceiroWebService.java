
package br.com.fiap.transportadora.financeira;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FinanceiroWebService", targetNamespace = "http://servico.financeira.fiap.com.br/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FinanceiroWebService {


    /**
     * 
     * @param parameters
     * @return
     *     returns br.com.fiap.transportadora.financeira.CobrancaResponse
     * @throws FinanceiraException
     */
    @WebMethod(action = "cobrancaRequest")
    @WebResult(name = "cobrancaResponse", targetNamespace = "http://servico.financeira.fiap.com.br/", partName = "parameters")
    @Action(input = "cobrancaRequest", output = "cobrancaResponse", fault = {
        @FaultAction(className = FinanceiraException.class, value = "cobrancaFault")
    })
    public CobrancaResponse cobranca(
        @WebParam(name = "cobrancaRequest", targetNamespace = "http://servico.financeira.fiap.com.br/", partName = "parameters")
        CobrancaRequest parameters)
        throws FinanceiraException
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns br.com.fiap.transportadora.financeira.SaldoResponse
     * @throws FinanceiraException
     */
    @WebMethod(action = "saldoRequest")
    @WebResult(name = "saldoResponse", targetNamespace = "http://servico.financeira.fiap.com.br/", partName = "parameters")
    @Action(input = "saldoRequest", output = "saldoResponse", fault = {
        @FaultAction(className = FinanceiraException.class, value = "saldoFault")
    })
    public SaldoResponse saldo(
        @WebParam(name = "saldoRequest", targetNamespace = "http://servico.financeira.fiap.com.br/", partName = "parameters")
        SaldoRequest parameters)
        throws FinanceiraException
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns br.com.fiap.transportadora.financeira.CadastrarClienteResponse
     * @throws FinanceiraException
     */
    @WebMethod(action = "cadastrarClienteRequest")
    @WebResult(name = "cadastrarClienteResponse", targetNamespace = "http://servico.financeira.fiap.com.br/", partName = "parameters")
    @Action(input = "cadastrarClienteRequest", output = "cadastrarClienteResponse", fault = {
        @FaultAction(className = FinanceiraException.class, value = "cadastrarClienteFault")
    })
    public CadastrarClienteResponse cadastrarCliente(
        @WebParam(name = "cadastrarClienteRequest", targetNamespace = "http://servico.financeira.fiap.com.br/", partName = "parameters")
        CadastrarClienteRequest parameters)
        throws FinanceiraException
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns br.com.fiap.transportadora.financeira.CobrancaMensalidadeResponse
     * @throws FinanceiraException
     */
    @WebMethod(action = "cobrancaMensalidadeRequest")
    @WebResult(name = "cobrancaMensalidadeResponse", targetNamespace = "http://servico.financeira.fiap.com.br/", partName = "parameters")
    @Action(input = "cobrancaMensalidadeRequest", output = "cobrancaMensalidadeResponse", fault = {
        @FaultAction(className = FinanceiraException.class, value = "cobrancaMensalidadeFault")
    })
    public CobrancaMensalidadeResponse cobrancaMensalidade(
        @WebParam(name = "cobrancaMensalidadeRequest", targetNamespace = "http://servico.financeira.fiap.com.br/", partName = "parameters")
        CobrancaMensalidadeRequest parameters)
        throws FinanceiraException
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns br.com.fiap.transportadora.financeira.ListarClienteResponse
     * @throws FinanceiraException
     */
    @WebMethod(action = "listarClienteRequest")
    @WebResult(name = "listarClienteResponse", targetNamespace = "http://servico.financeira.fiap.com.br/", partName = "parameters")
    @Action(input = "listarClienteRequest", output = "listarClienteResponse", fault = {
        @FaultAction(className = FinanceiraException.class, value = "listarClienteFault")
    })
    public ListarClienteResponse listarCliente(
        @WebParam(name = "listarClienteRequest", targetNamespace = "http://servico.financeira.fiap.com.br/", partName = "parameters")
        ListarClienteRequest parameters)
        throws FinanceiraException
    ;

}

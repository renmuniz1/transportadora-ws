
package br.com.fiap.transportadora.financeira;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cadastrarClienteRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarClienteRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cliente" type="{http://servico.financeira.fiap.com.br/}cadastroClienteRequestPojo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarClienteRequest", propOrder = {
    "cliente"
})
public class CadastrarClienteRequest {

    protected CadastroClienteRequestPojo cliente;

    /**
     * Obt�m o valor da propriedade cliente.
     * 
     * @return
     *     possible object is
     *     {@link CadastroClienteRequestPojo }
     *     
     */
    public CadastroClienteRequestPojo getCliente() {
        return cliente;
    }

    /**
     * Define o valor da propriedade cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link CadastroClienteRequestPojo }
     *     
     */
    public void setCliente(CadastroClienteRequestPojo value) {
        this.cliente = value;
    }

}

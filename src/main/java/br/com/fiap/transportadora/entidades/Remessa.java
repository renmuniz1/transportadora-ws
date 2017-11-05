package br.com.fiap.transportadora.entidades;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Remessa implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String cpfCnpjRemetente;
	private String cpfCnpjDestinatario;
	private double valorFrete;
	
	public String getCpfCnpjRemetente() {
		return cpfCnpjRemetente;
	}
	public void setCpfCnpjRemetente(String cpfCnpjRemetente) {
		this.cpfCnpjRemetente = cpfCnpjRemetente;
	}
	public String getCpfCnpjDestinatario() {
		return cpfCnpjDestinatario;
	}
	public void setCpfCnpjDestinatario(String cpfCnpjDestinatario) {
		this.cpfCnpjDestinatario = cpfCnpjDestinatario;
	}
	public double getValorFrete() {
		return valorFrete;
	}
	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}
	
}

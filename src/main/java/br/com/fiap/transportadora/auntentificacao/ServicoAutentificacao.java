package br.com.fiap.transportadora.auntentificacao;

import java.io.IOException;
import java.util.Base64;
import java.util.StringTokenizer;

public class ServicoAutentificacao {
	
	private StringTokenizer recuperaUsuarioSenha(String authCredencials){
		final String encodeUserPassword = authCredencials.replaceFirst("Basic" + " ", "");
		System.out.println("encodeUserPassword: " + encodeUserPassword);
		
		String usernameAndApassword = null;
		
		try {
			byte[] decodeBytes = Base64.getDecoder().decode(encodeUserPassword);
			usernameAndApassword = new String(decodeBytes, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		final StringTokenizer tokenizer = new StringTokenizer(usernameAndApassword, ":");
		return tokenizer;
	}
	
	public boolean verificaAdministrador(String authCredencials){
		if(authCredencials == null) {
			return false;
		} else {
			final StringTokenizer tokenizer = recuperaUsuarioSenha(authCredencials);
			if(tokenizer.countTokens() < 2){
				return false;
			} else {
				String username = tokenizer.nextToken();
				String password = tokenizer.nextToken();
				
				return "administrador".equals(username) && "administrador123".equals(password);
			}
		}
	}
	
	public boolean verificaCliente(String authCredencials){
		if(authCredencials == null) {
			return false;
		} else {
			final StringTokenizer tokenizer = recuperaUsuarioSenha(authCredencials);
			if(tokenizer.countTokens() < 2){
				return false;
			} else {
				String username = tokenizer.nextToken();
				String password = tokenizer.nextToken();
				
				return "cliente".equals(username) && "cliente123".equals(password);
			}
		}
	}
}

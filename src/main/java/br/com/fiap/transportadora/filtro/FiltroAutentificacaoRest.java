package br.com.fiap.transportadora.filtro;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.transportadora.auntentificacao.ServicoAutentificacao;

public class FiltroAutentificacaoRest implements Filter{
	public final String AUTHENTICATION_HEADER = "Authorization";

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if(request instanceof HttpServletRequest){
			
			HttpServletRequest httpServletRequest = (HttpServletRequest) request;
			ServicoAutentificacao autentificacao = new ServicoAutentificacao();
			String url = httpServletRequest.getRequestURI();
			String authCredencials = httpServletRequest.getHeader(AUTHENTICATION_HEADER);
			boolean autenticado = false;
			
			if(url.contains("lista")){
				autenticado = autentificacao.verificaAdministrador(authCredencials);
			} else if(url.contains("calcular_frete") || url.contains("gerar_frete")){
				autenticado = autentificacao.verificaCliente(authCredencials);
			}
			
			if(autenticado){
				chain.doFilter(request, response);
			} else {
				HttpServletResponse httpServletResponse = (HttpServletResponse) response; 
				httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				httpServletResponse.getWriter().write("Acesso ao serviço não autorizado");
				httpServletResponse.getWriter().flush();
				httpServletResponse.getWriter().close();
			}
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}

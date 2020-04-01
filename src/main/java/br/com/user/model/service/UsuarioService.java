package br.com.user.model.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

	public boolean isValid(String login, String senha) {
		return "admin".equalsIgnoreCase(login) && "admin".equalsIgnoreCase(senha);
	}
	
	public List<String> obterLista(){
		return Arrays.asList("joao", "maria", "jose");
	}
}
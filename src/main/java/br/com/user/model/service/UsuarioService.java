package br.com.user.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.user.model.negocio.Usuario;
import br.com.user.model.repository.IUsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioRepository repository;

	public boolean isValid(String login, String senha) {
		return "admin".equalsIgnoreCase(login) && "admin".equalsIgnoreCase(senha);
	}
	
	public List<Usuario> obterLista(){
		return (List<Usuario>)repository.findAll();
	}

	public void incluir(Usuario usuario) {
		repository.save(usuario);
	}

	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IUsuarioRepository getRepository() {
		return repository;
	}
	public void setRepository(IUsuarioRepository repository) {
		this.repository = repository;
	}
}
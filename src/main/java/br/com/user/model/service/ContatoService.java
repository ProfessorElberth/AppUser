package br.com.user.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.user.model.negocio.Contato;
import br.com.user.model.repository.IContatoRepository;

@Service
public class ContatoService {
	
	@Autowired
	private IContatoRepository repository;

	public List<Contato> obterLista(){
		return (List<Contato>)repository.findAll();
	}

	public void incluir(Contato contato) {
		repository.save(contato);
	}

	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public IContatoRepository getRepository() {
		return repository;
	}
	public void setRepository(IContatoRepository repository) {
		this.repository = repository;
	}
}
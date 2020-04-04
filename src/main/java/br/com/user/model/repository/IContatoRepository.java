package br.com.user.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.user.model.negocio.Contato;

@Repository
public interface IContatoRepository extends CrudRepository<Contato, Integer> {
}
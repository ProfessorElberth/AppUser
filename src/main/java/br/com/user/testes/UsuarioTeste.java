package br.com.user.testes;

import br.com.user.model.negocio.Contato;
import br.com.user.model.negocio.Usuario;

public class UsuarioTeste {

	public static void main(String[] args) {
		
		Contato c = new Contato();
		c.setEmail("asdfasdf");
		c.setWhatsapp("1241234123");
		
		Usuario u = new Usuario();
		u.setLogin("login");
		u.setNome("nome");
		u.setSenha("asdfasdf");
		u.setContato(c);
	}
}
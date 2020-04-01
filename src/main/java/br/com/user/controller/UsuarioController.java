package br.com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.user.model.service.UsuarioService;

@Controller
@SessionAttributes("user")
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showInit() {
		return this.showLogin();
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showHome(
				Model model,
				@RequestParam String login,
				@RequestParam String senha
			) {
		
		if(!service.isValid(login, senha)) {
			model.addAttribute("msg", "Credenciais inválidas!");
			
			return "login";
		}
		model.addAttribute("user", login);

		return "home";
	}
	
	@RequestMapping(value = "/usuarios", method = RequestMethod.GET)
	public String obterLista(
				Model model
			) {		
		model.addAttribute("usuariosLista", service.obterLista());
		
		return "usuario/lista";
	}

	public UsuarioService getService() {
		return service;
	}
	public void setService(UsuarioService service) {
		this.service = service;
	}
}
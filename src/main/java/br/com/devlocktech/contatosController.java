package br.com.devlocktech;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class contatosController {
	
	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
	
	static {
		LISTA_CONTATOS.add(new Contato("1", "João", "97 99797 9797"));
		LISTA_CONTATOS.add(new Contato("2", "Elza", "97 99797 9797"));
		LISTA_CONTATOS.add(new Contato("3", "Marcos", "92 99797 9797"));
		LISTA_CONTATOS.add(new Contato("4", "Poliane", "92 99797 9797"));
		LISTA_CONTATOS.add(new Contato("5", "Ellen", "92 99797 9797"));
	}
		
	
		
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	
	@GetMapping("/contatos")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("listar");
		
		modelAndView.addObject("contatos", LISTA_CONTATOS);
		
		return modelAndView;
	}
	
	
	@GetMapping("/contatos/novo")
	public ModelAndView novoContato() {
		ModelAndView modelAndView = new ModelAndView("formulario");
		modelAndView.addObject("contato", new Contato());
		
		return modelAndView;
	}

	


}

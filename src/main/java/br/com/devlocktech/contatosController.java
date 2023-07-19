package br.com.devlocktech;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
		return "index.html";
	}
	@GetMapping("/contatos")
	public String listar() {
		return "listar.html";
	}

	
	@GetMapping("/contatos/novo")
	public String formulario() {
		return "formulario.html";
	}


}

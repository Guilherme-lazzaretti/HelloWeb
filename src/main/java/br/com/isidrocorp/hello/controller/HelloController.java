package br.com.isidrocorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.hello.model.Produto;

// habilita a classe atender solicitações web
// endereço da máquina: localhost
// porta padrão do Tomcat é 8080

@RestController

public class HelloController {

	@GetMapping("/hello")
	public String sayHello() {
		return "TESTEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!";

	}
	
	@GetMapping ("/Produto")
		public Produto exibirProduto() {
		Produto prod = new Produto();
		prod.setId(10012);;
		prod.setDescricao("Mesa gamer");
		prod.setPreco(998.56);
		prod.setQtdeEstoque(1);;
		return prod;
	}
	
	@PostMapping ("/novoProduto")
		public String cadastrarProduto (@RequestBody Produto novo) {
		System.out.println ("recebi  "+novo.getId()+"/"+novo.getDescricao()+
				"/"+novo.getPreco()+"/"+novo.getQtdeEstoque());
		return "Produto Cadastrado";
		
		
	}
}

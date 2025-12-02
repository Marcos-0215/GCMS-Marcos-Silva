package com.example.WebApp;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World!";
	}
	
	@RequestMapping("/marcos")
	public @ResponseBody String greetingMarcos() {
		return "Hello, Marcos!";
	}
	
	@RequestMapping("/teste")
	public @ResponseBody String greetingTeste() {
		return "Olá. Sou uma copia";
	}
	
	@RequestMapping("/hotfix")
	public @ResponseBody String hotfixEndpoint() {
	    return "Hotfix funcionando!";
	}

}

package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Funciona similar a la Servlet
public class HomeController {
	
	
			//Responde a la raiz del proyecto
	@RequestMapping("/")
	public String index() {
		
		System.out.println("Cargando página de inicio");
		
				//retorna un archivo
		return "carpeta/nombre_pagina";
	}
	
	
	@RequestMapping("/menu")
	public String menu() {
		
		System.out.println("Cargando página de inicio");
		
				//retorna un archivo
		return "view/templates/menu";
	}
	
	

}

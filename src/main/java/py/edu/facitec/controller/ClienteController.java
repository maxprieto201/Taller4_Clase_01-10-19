package py.edu.facitec.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.dao.ClienteDAO;
import py.edu.facitec.model.Cliente;

//Manejador de transaciones
@Transactional
@Controller
public class ClienteController {

	// Inicializa un componente
	// Inyección de dependencia
	@Autowired
	private ClienteDAO clienteDAO;

	@RequestMapping("/clientes")
	public String cargar() {

		System.out.println("Cargando form cliente");
		return "view/cliente/form";
	}

	@RequestMapping("/registrar")
	public String registrar(Cliente cliente) {

		clienteDAO.insertar(cliente);

		return "view/cliente/form";
	}

}

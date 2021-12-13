package mz.co.amanjate.pais.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mz.co.amanjate.pais.entity.Pais;
import mz.co.amanjate.pais.service.PaisService;

@RestController
@RequestMapping("/pais-api")
public class PaisController {
	
	@Autowired
	private PaisService paisService;
	
	@PostMapping("/paises")
	public void addPais(@RequestBody Pais pais) {
		paisService.addPais(pais);
	}
	
	@GetMapping("/paises")
	public List<Pais> getAllPaises() {
		return paisService.getAllPaises();
	}
	
	@PutMapping("/paises")
	public void updatePais(@RequestBody Pais pais) {
		paisService.updatePais(pais);
	}
	
	@DeleteMapping("/paises/{id}")
	public void removePais(@PathVariable int id) {
		paisService.removePais(id);
	}
	
	@GetMapping("/paises/{orderby}")
	public List<Pais> getAllPaises(@PathVariable String orderby) {
		return paisService.getAllPaises(orderby);
	}
	
}

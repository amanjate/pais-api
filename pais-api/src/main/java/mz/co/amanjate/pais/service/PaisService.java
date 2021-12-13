package mz.co.amanjate.pais.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import mz.co.amanjate.pais.entity.Pais;
import mz.co.amanjate.pais.repository.PaisRepository;

@Service
public class PaisService {

	@Autowired
	private PaisRepository paisRepository;
	
	public void addPais(Pais pais) {
		paisRepository.save(pais);
	}

	public List<Pais> getAllPaises() {
		List<Pais> paises = new ArrayList<>();
		
		paisRepository.findAll().forEach(paises::add);
		
		return paises;
	}

	public void updatePais(Pais pais) {
		paisRepository.findById(pais.getId()).ifPresent(p -> paisRepository.save(pais));
	}
	
	public void removePais(int id) {
		paisRepository.findById(id).ifPresent(paisRepository::delete);
	}
	
	public List<Pais> getAllPaises(String orderby) {
		List<Pais> paises = new ArrayList<>();
		
		paisRepository.findAll(Sort.by(Sort.Direction.ASC, orderby)).forEach(paises::add);
		
		return paises;
	}

}

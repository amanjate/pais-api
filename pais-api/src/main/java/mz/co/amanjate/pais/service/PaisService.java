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
		Pais p = getPais(pais.getId());
		
		if (p != null) {
			p = pais;
			paisRepository.save(p);
		}
		
	}
	
	public void removePais(int id) {
		paisRepository.delete(id);
	}
	
	public Pais getPais(int id) {
		return paisRepository.findOne(id);
	}
	
	public List<Pais> getAllSortedPaises(String orderby) {
		List<Pais> paises = new ArrayList<>();
		
		paisRepository.findAll(new Sort(Sort.Direction.ASC, orderby)).forEach(paises::add);
		
		return paises;
	}

}

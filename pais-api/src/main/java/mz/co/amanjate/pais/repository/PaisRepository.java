 	package mz.co.amanjate.pais.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mz.co.amanjate.pais.entity.Pais;

@Repository
@Transactional
public interface PaisRepository extends JpaRepository<Pais, Integer>{

}

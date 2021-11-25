package mz.co.amanjate.pais.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Pais implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "agente_id_generator")
	@GenericGenerator(name = "agente_id_generator", strategy = "increment")
	private int id;
	
	private String nome;
	private String capital;
	private String regiao;
	private String subRegiao;
	private int area;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCapital() {
		return capital;
	}
	
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	public String getRegiao() {
		return regiao;
	}
	
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	public String getSubRegiao() {
		return subRegiao;
	}
	
	public void setSubRegiao(String subRegiao) {
		this.subRegiao = subRegiao;
	}
	
	public int getArea() {
		return area;
	}
	
	public void setArea(int area) {
		this.area = area;
	}
	
}

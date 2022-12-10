package com.chaima.cosmetiques.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Rayon {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idRay;
	private String nomRay;
	private String descriptionRay;
	
	@JsonIgnore
	@OneToMany (mappedBy ="rayon")
	private List<Cosmetique> cosmetiques;
	
	
	public Long getIdRay() {
		return idRay;
	}
	public void setIdRay(Long idRay) {
		this.idRay = idRay;
	}
	public String getNomRay() {
		return nomRay;
	}
	public void setNomRay(String nomRay) {
		this.nomRay = nomRay;
	}
	public String getDescriptionRay() {
		return descriptionRay;
	}
	public void setDescriptionRay(String descriptionRay) {
		this.descriptionRay = descriptionRay;
	}

	public List<Cosmetique> getCosmetiques() {
		return cosmetiques;
	}

	public void setCosmetiques(List<Cosmetique> cosmetiques) {
		this.cosmetiques = cosmetiques;
	}
	
	

}

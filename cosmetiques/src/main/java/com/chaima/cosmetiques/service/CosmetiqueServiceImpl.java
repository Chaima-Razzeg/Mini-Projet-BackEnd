package com.chaima.cosmetiques.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaima.cosmetiques.entities.Cosmetique;
import com.chaima.cosmetiques.entities.Rayon;
import com.chaima.cosmetiques.repos.CosmetiqueRepository;

@Service
public class CosmetiqueServiceImpl implements CosmetiqueService {

    @Autowired
	CosmetiqueRepository cosmetiqueRepository;
	
	@Override
	public Cosmetique saveCosmetique(Cosmetique c) {
		return cosmetiqueRepository.save(c);
	}

	@Override
	public Cosmetique updateCosmetique(Cosmetique c) {
		return cosmetiqueRepository.save(c);

	}

	@Override
	public void deleteCosmetique(Cosmetique c) {
		cosmetiqueRepository.delete(c);
		
	}

	@Override
	public void deleteCosmetiqueById(Long id) {
		cosmetiqueRepository.deleteById(id);

	}

	@Override
	public Cosmetique getCosmetique(Long id) {
		return cosmetiqueRepository.findById(id).get();

	}

	@Override
	public List<Cosmetique> getAllCosmetiques() {
		return cosmetiqueRepository.findAll();
	}

	@Override
	public List<Cosmetique> findByNomCosmetique(String nom) {
		return cosmetiqueRepository.findByNomCosmetique(nom);
	}

	@Override
	public List<Cosmetique> findByNomCosmetiqueContains(String nom) {
		return cosmetiqueRepository.findByNomCosmetiqueContains(nom);
	}

	@Override
	public List<Cosmetique> findByNomPrix(String nom, Double prix) {
		return cosmetiqueRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Cosmetique> findByRayon(Rayon rayon) {
		return cosmetiqueRepository.findByRayon(rayon);
	}

	@Override
	public List<Cosmetique> findByRayonIdRay(Long id) {
		return cosmetiqueRepository.findByRayonIdRay(id);
	}

	@Override
	public List<Cosmetique> findByOrderByNomCosmetiqueAsc() {
		return cosmetiqueRepository.findByOrderByNomCosmetiqueAsc();
	}

	@Override
	public List<Cosmetique> trierCosmetiquesNomsPrix() {
		return cosmetiqueRepository.trierCosmetiquesNomsPrix();
	}

}

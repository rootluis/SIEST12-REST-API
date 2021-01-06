package com.edu.mx.rest.est.siest12.service;

import java.util.List;

import com.edu.mx.rest.est.siest12.entity.Allergy;

public interface AllergyService {

	public List<Allergy> findAll();

	public Allergy findAlergia(int idAlergia);

	public void save(Allergy objAlergia);

	public void delete(int idAlergia);
}

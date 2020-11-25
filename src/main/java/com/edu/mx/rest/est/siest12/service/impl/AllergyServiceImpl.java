package com.edu.mx.rest.est.siest12.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.mx.rest.est.siest12.dao.AllergyRepository;
import com.edu.mx.rest.est.siest12.entity.Allergy;
import com.edu.mx.rest.est.siest12.service.AllergyService;

@Service
public class AllergyServiceImpl implements AllergyService {
	
	private AllergyRepository alergiaRepository;

	@Autowired
	public AllergyServiceImpl(AllergyRepository alergiaRepository) {
		this.alergiaRepository = alergiaRepository;
	}

	@Override
	public List<Allergy> findAll() {
		return alergiaRepository.findAll();
	}

	@Override
	public Allergy findAlergia(int idAlergia) {
		Optional<Allergy> result = alergiaRepository.findById(idAlergia);
		Allergy theAlergy = null;

		if (result.isPresent()) {
			theAlergy = result.get();
		} else {
			throw new RuntimeException("No se encontro la Alergia " + idAlergia);
		}
		return theAlergy;
	}

	@Override
	public void save(Allergy objAlergia) {
		alergiaRepository.save(objAlergia);

	}

	@Override
	public void delete(int idAlergia) {
		alergiaRepository.deleteById(idAlergia);

	}
	
}

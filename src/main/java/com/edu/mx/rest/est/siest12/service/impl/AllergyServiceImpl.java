package com.edu.mx.rest.est.siest12.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.MessageFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.mx.rest.est.siest12.dao.AllergyRepository;
import com.edu.mx.rest.est.siest12.entity.Allergy;
import com.edu.mx.rest.est.siest12.service.AllergyService;
import com.edu.mx.rest.est.siest12.utils.Constants;

@Service
public class AllergyServiceImpl implements AllergyService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AllergyServiceImpl.class);
	private static final String MSG_SERVICE = "Ejecutando " + AllergyServiceImpl.class.getName();
	
	private AllergyRepository alergiaRepository;

	@Autowired
	public AllergyServiceImpl(AllergyRepository alergiaRepository) {
		this.alergiaRepository = alergiaRepository;
	}

	@Override
	public List<Allergy> findAll() {
		LOGGER.info(MessageFormatter.format(Constants.LOG_FULL, MSG_SERVICE, "findAll()").getMessage());
		return alergiaRepository.findAll();
	}

	@Override
	public Allergy findAlergia(int idAlergia) {
		LOGGER.info(MessageFormatter.format(Constants.LOG_FULL, MSG_SERVICE, "findAlergia()").getMessage());
		Optional<Allergy> result = alergiaRepository.findById(idAlergia);
		Allergy theAlergy = null;

		if (result.isPresent()) {
			theAlergy = result.get();
		} else {
			LOGGER.warn(MessageFormatter.format(Constants.LOG_FULL, "No se encontro la Alergia", idAlergia).getMessage());
			throw new RuntimeException("No se encontro la Alergia " + idAlergia);
		}
		return theAlergy;
	}

	@Override
	public void save(Allergy objAlergia) {
		LOGGER.info(MessageFormatter.format(Constants.LOG_FULL, MSG_SERVICE, "save()").getMessage());
		alergiaRepository.save(objAlergia);

	}

	@Override
	public void delete(int idAlergia) {
		LOGGER.info(MessageFormatter.format(Constants.LOG_FULL, MSG_SERVICE, "delete()").getMessage());
		alergiaRepository.deleteById(idAlergia);

	}
	
}

package com.edu.mx.rest.est.siest12.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.MessageFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.mx.rest.est.siest12.entity.Allergy;
import com.edu.mx.rest.est.siest12.service.AllergyService;
import com.edu.mx.rest.est.siest12.utils.Constants;

@RestController
@RequestMapping("/allergy")
public class AllergyController {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AllergyController.class);
	private static final String CLASS_NAME = "Ejecutando " + AllergyController.class.getName();
	
	private AllergyService allergyService;

	@Autowired
	public AllergyController(AllergyService allergyService) {
		this.allergyService = allergyService;
	}

	@GetMapping("/allergies")
	public List<Allergy> getAllergys() {
		LOGGER.info(MessageFormatter.format(Constants.LOG_FULL, CLASS_NAME, "getAllergys()").getMessage());
		return allergyService.findAll();
	}

	@GetMapping("/allergies/{idAllergy}")
	public Allergy getAllergy(@PathVariable int idAllergy) {
		LOGGER.info(MessageFormatter.format(Constants.LOG_FULL, CLASS_NAME, "getAllergy()").getMessage());
		Allergy theAllergy = allergyService.findAlergia(idAllergy);
		if (theAllergy == null) {
			LOGGER.info(MessageFormatter.format(Constants.LOG_FULL, "No se ha encontrado la clave de la Alergia", idAllergy).getMessage());
			throw new RuntimeException("No se ha encontrado la clave de la Alergia: " + idAllergy);
		}
		return theAllergy;
	}

	@PostMapping("/allergies")
	public Allergy addAllergy(@RequestBody Allergy objAllergy) {
		LOGGER.info(MessageFormatter.format(Constants.LOG_FULL, CLASS_NAME, "getAllergy()").getMessage());
		objAllergy.setCdAlergia(0);
		allergyService.save(objAllergy);
		return objAllergy;
	}

	@PutMapping("/allergies")
	public Allergy updateAllergy(@RequestBody Allergy objAllergy) {
		LOGGER.info(MessageFormatter.format(Constants.LOG_FULL, CLASS_NAME, "updateAllergy()").getMessage());
		allergyService.save(objAllergy);
		return objAllergy;
	}

	@DeleteMapping("/allergies/{idAllergy}")
	public String deleteAllergy(@PathVariable int idAllergy) {
		LOGGER.info(MessageFormatter.format(Constants.LOG_FULL, "Ejecutando " + CLASS_NAME, "deleteAllergy()").getMessage());
		Allergy theAllergy = allergyService.findAlergia(idAllergy);
		if (theAllergy == null) {
			LOGGER.info(MessageFormatter.format(Constants.LOG_FULL, "No es posible eliminar la clave de alergia: " + idAllergy, "debido a que no se ha encontrado en la BD").getMessage());
			throw new RuntimeException("No es posible eliminar la clave de alergia: " + idAllergy
					+ " debido a que no se ha encontrado en la BD");
		}
		allergyService.delete(idAllergy);
		return "La alergia se ha eliminado exitosamente";
	}

}

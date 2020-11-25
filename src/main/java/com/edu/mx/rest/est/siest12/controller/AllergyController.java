package com.edu.mx.rest.est.siest12.controller;

import java.util.List;

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

@RestController
@RequestMapping("/allergy")
public class AllergyController {
	
	private AllergyService allergyService;

	@Autowired
	public AllergyController(AllergyService allergyService) {
		this.allergyService = allergyService;
	}

	@GetMapping("/allergies")
	public List<Allergy> getAllergys() {
		return allergyService.findAll();
	}

	@GetMapping("/allergies/{idAllergy}")
	public Allergy getAllergy(@PathVariable int idAllergy) {
		Allergy theAllergy = allergyService.findAlergia(idAllergy);
		if (theAllergy == null) {
			throw new RuntimeException("No se ha encontrado la clave de la Alergia: " + idAllergy);
		}
		return theAllergy;
	}

	@PostMapping("/allergies")
	public Allergy addAllergy(@RequestBody Allergy objAllergy) {
		objAllergy.setCdAlergia(0);
		allergyService.save(objAllergy);
		return objAllergy;
	}

	@PutMapping("/allergies")
	public Allergy updateAllergy(@RequestBody Allergy objAllergy) {
		allergyService.save(objAllergy);
		return objAllergy;
	}

	@DeleteMapping("/allergies/{idAllergy}")
	public String deleteAllergy(@PathVariable int idAllergy) {
		Allergy theAllergy = allergyService.findAlergia(idAllergy);
		if (theAllergy == null) {
			throw new RuntimeException("No es posible eliminar la clave de alergia: " + idAllergy
					+ " debido a que no se ha encontrado en la BD");
		}
		allergyService.delete(idAllergy);
		return "La alergia se ha eliminado exitosamente";
	}

}

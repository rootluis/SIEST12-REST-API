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

import com.edu.mx.rest.est.siest12.entity.Disability;
import com.edu.mx.rest.est.siest12.service.DisabilityService;

@RestController
@RequestMapping("/disability")
public class DisabilityController {
	
	private DisabilityService disabilityService;	
	
	@Autowired
	public DisabilityController(DisabilityService disabilityService) {
		this.disabilityService = disabilityService;
	}

	@GetMapping("/listDiscapacidad")
	public List<Disability> getDisabilitys() {
		return disabilityService.getDisabilitys();
	}
	
	@GetMapping("/listDiscapacidad/{idDisability}")
	public Disability getDisability(@PathVariable int idDisability) {
		return disabilityService.getDisability(idDisability);
	}
	
	@PostMapping("/addDisability")
	public Disability addDisability(@RequestBody Disability objDisability) {
		objDisability.setIdDisability(0);
		disabilityService.addDisability(objDisability);
		return objDisability;
	}
	
	@PutMapping("/updateDisability")
	public Disability updateDisability(@RequestBody Disability objDisability) {
		disabilityService.addDisability(objDisability);
		return objDisability;
	}
	
	@DeleteMapping("/deleteDisability/{idDisability}")
	public String deleteDisability(@PathVariable int idDisability) {
		Disability objDisability = disabilityService.getDisability(idDisability);
		if (objDisability != null) {
			disabilityService.deleteDisability(idDisability);
		}
		
		return "La Discapacidad se ha eliminado correctamente";
	}
	

}

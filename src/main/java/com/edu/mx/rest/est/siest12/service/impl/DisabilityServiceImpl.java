package com.edu.mx.rest.est.siest12.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.mx.rest.est.siest12.dao.DisabilityRepository;
import com.edu.mx.rest.est.siest12.entity.Disability;
import com.edu.mx.rest.est.siest12.service.DisabilityService;

@Service
public class DisabilityServiceImpl implements DisabilityService {
	
	private DisabilityRepository disabilityService;
	
	@Autowired
	public DisabilityServiceImpl(DisabilityRepository disabilityService) {
		this.disabilityService = disabilityService;
	}

	@Override
	public List<Disability> getDisabilitys() {		
		return disabilityService.findAll();
	}

	@Override
	public Disability getDisability(int idDisability) {		
		Optional<Disability> optDisability = disabilityService.findById(idDisability);
		Disability objDisability = null;
		
		if (optDisability.isPresent()) {
			objDisability = optDisability.get();
		}else {
			throw new RuntimeException("No se encontro la discapacidad con el id: " + idDisability);
		}
		
		return objDisability;
	}

	@Override
	public void addDisability(Disability objDisability) {
		disabilityService.save(objDisability);		
	}

	@Override
	public void deleteDisability(int idDisability) {
		disabilityService.deleteById(idDisability);
		
	}

}

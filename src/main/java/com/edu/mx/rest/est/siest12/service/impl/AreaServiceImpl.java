package com.edu.mx.rest.est.siest12.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.mx.rest.est.siest12.dao.AreaRepository;
import com.edu.mx.rest.est.siest12.entity.Area;
import com.edu.mx.rest.est.siest12.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {

	private AreaRepository areaRepository;

	@Autowired
	public AreaServiceImpl(AreaRepository areaRepository) {
		this.areaRepository = areaRepository;
	}

	@Override
	public List<Area> getAreas() {
		return areaRepository.findAll();
	}

	@Override
	public Area getArea(int idArea) {
		Optional<Area> optArea = areaRepository.findById(idArea);
		Area objArea = null;

		if (optArea.isPresent()) {
			objArea = optArea.get();
		} else {
			throw new RuntimeException("No es posible encontrar el Area con el id: " + idArea);
		}
		return objArea;
	}

	@Override
	public void addArea(Area objArea) {
		areaRepository.save(objArea);
	}

	@Override
	public void deleteArea(int idArea) {
		areaRepository.deleteById(idArea);
	}

}

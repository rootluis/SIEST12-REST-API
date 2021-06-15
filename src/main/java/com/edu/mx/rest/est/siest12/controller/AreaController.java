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

import com.edu.mx.rest.est.siest12.entity.Area;
import com.edu.mx.rest.est.siest12.service.AreaService;

@RestController
@RequestMapping("/area")
public class AreaController {

	private AreaService areaService;

	@Autowired
	public AreaController(AreaService areaService) {
		this.areaService = areaService;
	}

	@GetMapping("/getAll")
	public List<Area> getListAreas() {
		return areaService.getAreas();
	}

	@GetMapping("getArea/{idArea}")
	public Area getArea(@PathVariable int idArea) {
		return areaService.getArea(idArea);
	}

	@PostMapping("/addArea")
	public Area addArea(@RequestBody Area objArea) {
		objArea.setCdArea(0);
		areaService.addArea(objArea);
		return objArea;
	}

	@PutMapping("/updateArea")
	public Area updateArea(@RequestBody Area objArea) {
		areaService.addArea(objArea);
		return objArea;
	}

	@DeleteMapping("/deleteArea/{idArea}")
	public String deleteArea(@PathVariable int idArea) {
		Area objArea = areaService.getArea(idArea);
		if (objArea != null) {
			areaService.deleteArea(idArea);
		}
		return "El Area" + idArea + " eliminada de forma correcta";
	}

}

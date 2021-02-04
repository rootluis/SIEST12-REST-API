package com.edu.mx.rest.est.siest12.service;

import java.util.List;

import com.edu.mx.rest.est.siest12.entity.Area;

public interface AreaService {

	public List<Area> getAreas();

	public Area getArea(int idArea);

	public void addArea(Area objArea);

	public void deleteArea(int idArea);

}

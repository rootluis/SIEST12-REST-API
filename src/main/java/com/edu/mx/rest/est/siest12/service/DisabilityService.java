package com.edu.mx.rest.est.siest12.service;

import java.util.List;

import com.edu.mx.rest.est.siest12.entity.Disability;

public interface DisabilityService {

	public List<Disability> getDisabilitys();

	public Disability getDisability(int idDisability);

	public void addDisability(Disability objDisability);

	public void deleteDisability(int idDisability);

}

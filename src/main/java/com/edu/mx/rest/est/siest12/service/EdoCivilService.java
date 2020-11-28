package com.edu.mx.rest.est.siest12.service;

import com.edu.mx.rest.est.siest12.entity.EdoCivil;

import java.util.List;

public interface EdoCivilService {

    public List<EdoCivil> getEdoCivils();

    public EdoCivil getEdoCivil(int idEdoCivil);

    public EdoCivil saveEdoCivil(EdoCivil objEdoCivil);

    public void deleteEdoCivil(int idEdoCivil);
}

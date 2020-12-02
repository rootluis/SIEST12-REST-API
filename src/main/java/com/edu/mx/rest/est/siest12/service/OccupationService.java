package com.edu.mx.rest.est.siest12.service;

import com.edu.mx.rest.est.siest12.entity.Occupation;

import java.util.List;

public interface OccupationService {

    public List<Occupation> occupations();

    public Occupation getOccupation(int idOccupation);

    public void saveOccupation(Occupation objOccupation);

    public void deleteOccupation(int idOccupation);
}

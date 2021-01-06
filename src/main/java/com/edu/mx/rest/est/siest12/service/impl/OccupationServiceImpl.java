package com.edu.mx.rest.est.siest12.service.impl;

import com.edu.mx.rest.est.siest12.dao.OccupationRepository;
import com.edu.mx.rest.est.siest12.entity.Occupation;
import com.edu.mx.rest.est.siest12.service.OccupationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OccupationServiceImpl implements OccupationService {

    private OccupationRepository occupationRepository;

    public OccupationServiceImpl(OccupationRepository occupationRepository) {
        this.occupationRepository = occupationRepository;
    }

    @Override
    public List<Occupation> occupations() {
        return occupationRepository.findAll();
    }

    @Override
    public Occupation getOccupation(int idOccupation) {
        Optional<Occupation> optOccupation = occupationRepository.findById(idOccupation);
        Occupation objOccupation = null;

        if (optOccupation.isPresent()){
            objOccupation = optOccupation.get();
        }else{
            throw new RuntimeException("No se a encontrado la Ocupacion: " + idOccupation);
        }

        return objOccupation;
    }

    @Override
    public void saveOccupation(Occupation objOccupation) {
        occupationRepository.save(objOccupation);
    }

    @Override
    public void deleteOccupation(int idOccupation) {
        occupationRepository.deleteById(idOccupation);
    }
}

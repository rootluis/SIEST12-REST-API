package com.edu.mx.rest.est.siest12.service.impl;

import com.edu.mx.rest.est.siest12.dao.EdoCivilRepository;
import com.edu.mx.rest.est.siest12.entity.EdoCivil;
import com.edu.mx.rest.est.siest12.service.EdoCivilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EdoCivilServiceImpl implements EdoCivilService {

    private EdoCivilRepository edoCivilRepository;

    @Autowired
    public EdoCivilServiceImpl(EdoCivilRepository edoCivilRepository) {
        this.edoCivilRepository = edoCivilRepository;
    }

    @Override
    public List<EdoCivil> getEdoCivils() {
        return edoCivilRepository.findAll();
    }

    @Override
    public EdoCivil getEdoCivil(int idEdoCivil) {
        Optional<EdoCivil> optEdoCivil = edoCivilRepository.findById(idEdoCivil);
        EdoCivil objEdoCivil = null;

        if (optEdoCivil.isPresent()){
            objEdoCivil=optEdoCivil.get();
        }else{
            throw new RuntimeException("No se encontro el Estado Civil: " + idEdoCivil);
        }
        return objEdoCivil;
    }

    @Override
    public EdoCivil saveEdoCivil(EdoCivil objEdoCivil) {
        edoCivilRepository.save(objEdoCivil);
        return objEdoCivil;
    }

    @Override
    public void deleteEdoCivil(int idEdoCivil) {
        edoCivilRepository.deleteById(idEdoCivil);
    }
}

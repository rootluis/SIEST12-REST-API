package com.edu.mx.rest.est.siest12.service.impl;

import com.edu.mx.rest.est.siest12.dao.BloodRepository;
import com.edu.mx.rest.est.siest12.entity.Blood;
import com.edu.mx.rest.est.siest12.service.BloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BloodServiceImpl implements BloodService {

    private BloodRepository bloodRepository;

    @Autowired
    public BloodServiceImpl(BloodRepository bloodRepository) {
        this.bloodRepository = bloodRepository;
    }

    @Override
    public List<Blood> bloods() {
        return bloodRepository.findAll();
    }

    @Override
    public Blood getBlood(int idBlood) {
        Optional<Blood> optBlood = bloodRepository.findById(idBlood);
        Blood objBlood = null;

        if (optBlood.isPresent()){
            objBlood=optBlood.get();
        }else{
            throw new RuntimeException("No se encontro el codigo de Sangre: " + idBlood);
        }

        return objBlood;
    }

    @Override
    public Blood saveBlood(Blood objBlood) {
        bloodRepository.save(objBlood);
        return objBlood;
    }

    @Override
    public void deleteBlood(int idBlood) {
        bloodRepository.deleteById(idBlood);
    }
}

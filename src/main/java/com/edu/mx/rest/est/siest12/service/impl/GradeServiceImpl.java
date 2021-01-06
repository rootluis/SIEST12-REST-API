package com.edu.mx.rest.est.siest12.service.impl;

import com.edu.mx.rest.est.siest12.dao.GradeRepository;
import com.edu.mx.rest.est.siest12.entity.Grade;
import com.edu.mx.rest.est.siest12.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GradeServiceImpl implements GradeService {

    private GradeRepository gradeRepository;

    @Autowired
    public GradeServiceImpl(GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }

    @Override
    public List<Grade> getGrades() {
        return gradeRepository.findAll();
    }

    @Override
    public Grade getGrade(int idGrade) {
        Optional<Grade> optGrade = gradeRepository.findById(idGrade);
        Grade objGrade = null;

        if(optGrade.isPresent()){
            objGrade = optGrade.get();
        }else{
            throw new RuntimeException("No se encontro el codigo del Grado: " + idGrade);
        }

        return objGrade;
    }

    @Override
    public Grade addGrade(Grade objGrade) {
        gradeRepository.save(objGrade);
        return null;
    }

    @Override
    public void deleteGrade(int idGrade) {
    gradeRepository.deleteById(idGrade);
    }
}

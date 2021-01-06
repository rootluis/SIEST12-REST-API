package com.edu.mx.rest.est.siest12.service.impl;

import com.edu.mx.rest.est.siest12.dao.ScholarshipRepository;
import com.edu.mx.rest.est.siest12.entity.Scholarship;
import com.edu.mx.rest.est.siest12.service.ScholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScholarshipServiceImpl implements ScholarshipService {

    private ScholarshipRepository scholarshipRepository;

    @Autowired
    public ScholarshipServiceImpl(ScholarshipRepository scholarshipRepository) {
        this.scholarshipRepository = scholarshipRepository;
    }

    @Override
    public List<Scholarship> getScholarships() {
        return scholarshipRepository.findAll();
    }

    @Override
    public Scholarship getScholarship(int idScholarship) {
        Optional<Scholarship> optScholarship = scholarshipRepository.findById(idScholarship);
        Scholarship objScholarship = null;

        if (optScholarship.isPresent()){
            objScholarship = optScholarship.get();
        }else{
            throw new RuntimeException("No se ha encontrado la Beca con el identificador: " + idScholarship);
        }
        return objScholarship;
    }

    @Override
    public void addScholarship(Scholarship objScholarship) {
        scholarshipRepository.save(objScholarship);
    }

    @Override
    public void deleteScholarship(int idScholarship) {
        scholarshipRepository.deleteById(idScholarship);
    }
}

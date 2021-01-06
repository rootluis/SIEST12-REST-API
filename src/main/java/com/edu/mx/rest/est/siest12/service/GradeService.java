package com.edu.mx.rest.est.siest12.service;

import com.edu.mx.rest.est.siest12.entity.Grade;

import java.util.List;

public interface GradeService {

    public List<Grade> getGrades();

    public Grade getGrade(int idGrade);

    public void addGrade(Grade objGrade);

    public void deleteGrade(int idGrade);
}

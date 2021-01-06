package com.edu.mx.rest.est.siest12.service;

import com.edu.mx.rest.est.siest12.entity.Scholarship;

import java.util.List;

public interface ScholarshipService {

    public List<Scholarship> getScholarships();

    public Scholarship getScholarship(int idScholarship);

    public void addScholarship(Scholarship objScholarship);

    public void deleteScholarship(int idScholarship);
}

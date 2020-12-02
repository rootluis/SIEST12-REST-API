package com.edu.mx.rest.est.siest12.service;

import com.edu.mx.rest.est.siest12.entity.Blood;

import java.util.List;

public interface BloodService {

    public List<Blood> bloods();

    public Blood getBlood(int idBlood);

    public Blood saveBlood(Blood objBlood);

    public void deleteBlood(int idBlood);
}

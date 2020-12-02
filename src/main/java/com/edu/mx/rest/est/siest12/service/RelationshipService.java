package com.edu.mx.rest.est.siest12.service;

import com.edu.mx.rest.est.siest12.entity.Relationship;

import java.util.List;

public interface RelationshipService {

    public List<Relationship> relationships();

    public Relationship getRelationship(int idRelationShip);

    public Relationship saveRelationship(Relationship objRelationship);

    public Relationship updateRelationship(Relationship objRelationship);

    public void deleteRelationship(int idRelationship);
}

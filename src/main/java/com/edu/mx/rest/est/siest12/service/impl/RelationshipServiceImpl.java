package com.edu.mx.rest.est.siest12.service.impl;

import com.edu.mx.rest.est.siest12.dao.RelationshipRepository;
import com.edu.mx.rest.est.siest12.entity.Relationship;
import com.edu.mx.rest.est.siest12.service.RelationshipService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RelationshipServiceImpl implements RelationshipService {

    private RelationshipRepository relationshipRepository;

    public RelationshipServiceImpl(RelationshipRepository relationshipRepository) {
        this.relationshipRepository = relationshipRepository;
    }

    @Override
    public List<Relationship> relationships() {
        return relationshipRepository.findAll();
    }

    @Override
    public Relationship getRelationship(int idRelationShip) {
        Optional<Relationship> optRelationship = relationshipRepository.findById(idRelationShip);
        Relationship objRelationship = null;

        if (optRelationship.isPresent()){
            objRelationship = optRelationship.get();
        }
        return objRelationship;
    }

    @Override
    public Relationship saveRelationship(Relationship objRelationship) {
        objRelationship.setIdRelationship(0);
        relationshipRepository.save(objRelationship);
        return objRelationship;
    }

    @Override
    public Relationship updateRelationship(Relationship objRelationship) {
        relationshipRepository.save(objRelationship);
        return objRelationship;
    }

    @Override
    public void deleteRelationship(int idRelationship) {
        relationshipRepository.deleteById(idRelationship);
    }
}

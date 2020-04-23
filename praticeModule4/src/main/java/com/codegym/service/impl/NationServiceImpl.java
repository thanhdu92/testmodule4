package com.codegym.service.impl;

import com.codegym.model.Nation;
import com.codegym.repository.NationRepository;
import com.codegym.service.NationService;
import org.springframework.beans.factory.annotation.Autowired;

public class NationServiceImpl implements NationService {
    @Autowired
    private NationRepository nationRepository;

    @Override
    public Iterable<Nation> findAll() {
        return nationRepository.findAll();
    }

    @Override
    public Nation findById(Long nationID) {
        return nationRepository.findOne(nationID);
    }

    @Override
    public void save(Nation nation) {
        nationRepository.save(nation);
    }

    @Override
    public void remove(Long nationID) {
        nationRepository.delete(nationID);
    }
}

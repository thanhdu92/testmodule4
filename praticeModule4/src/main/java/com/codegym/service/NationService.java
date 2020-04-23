package com.codegym.service;

import com.codegym.model.Nation;

public interface NationService {
    Iterable<Nation> findAll();

    Nation findById(Long nationID);

    void save(Nation nation);

    void remove(Long nationID);
}

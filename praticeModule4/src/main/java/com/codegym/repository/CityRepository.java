package com.codegym.repository;

import com.codegym.model.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CityRepository  extends PagingAndSortingRepository<City, Long> {
    Iterable<City> findAllByNation(Nation nation);

    Page<City> findAllByCityNameContaining(String cityName, Pageable pageable);
}

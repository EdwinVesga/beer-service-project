package com.evesga.beerserviceproject.web.repository;

import com.evesga.beerserviceproject.web.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}

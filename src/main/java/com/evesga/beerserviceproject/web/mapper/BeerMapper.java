package com.evesga.beerserviceproject.web.mapper;

import com.evesga.beerserviceproject.web.domain.Beer;
import com.evesga.beerserviceproject.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto dto);
}

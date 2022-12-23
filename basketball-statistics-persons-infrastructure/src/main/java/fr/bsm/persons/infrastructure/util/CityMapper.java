package fr.bsm.persons.infrastructure.util;

import org.mapstruct.Mapper;

import fr.bsm.persons.common.entity.location.CityEntity;
import fr.bsm.persons.infrastructure.data.locations.CityDto;


@Mapper(componentModel = "spring", uses = {})
public interface CityMapper {

	CityEntity dtoToEntity(CityDto cityDto);
	

	
}

package fr.bsm.persons.exposition.util;

import org.mapstruct.Mapper;

import fr.bsm.persons.common.entity.location.CityEntity;
import fr.bsm.persons.exposition.dto.CityDto;


@Mapper(componentModel = "spring", uses = {})
public interface CityDtoMapper {

	CityDto entityToDto(CityEntity cityEntity);

	
}

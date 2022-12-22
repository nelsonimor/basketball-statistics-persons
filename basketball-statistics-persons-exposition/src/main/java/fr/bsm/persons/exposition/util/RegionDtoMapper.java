package fr.bsm.persons.exposition.util;

import org.mapstruct.Mapper;

import fr.bsm.persons.common.entity.location.RegionEntity;
import fr.bsm.persons.exposition.dto.RegionDto;


@Mapper(componentModel = "spring", uses = {})
public interface RegionDtoMapper {

	RegionDto entityToDto(RegionEntity regionEntity);

	
}

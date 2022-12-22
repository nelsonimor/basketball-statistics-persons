package fr.bsm.persons.exposition.util;

import org.mapstruct.Mapper;

import fr.bsm.persons.common.entity.location.ContinentEntity;
import fr.bsm.persons.exposition.dto.ContinentDto;


@Mapper(componentModel = "spring", uses = {})
public interface ContinentDtoMapper {

	ContinentDto entityToDto(ContinentEntity continentEntity);

}

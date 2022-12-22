package fr.bsm.persons.exposition.util;

import org.mapstruct.Mapper;

import fr.bsm.persons.common.entity.location.CountryEntity;
import fr.bsm.persons.exposition.dto.CountryDto;


@Mapper(componentModel = "spring", uses = {})
public interface CountryDtoMapper {

	CountryDto entityToDto(CountryEntity countryEntity);

}

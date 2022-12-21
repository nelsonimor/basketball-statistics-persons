package fr.bsm.persons.exposition.util;

import org.mapstruct.Mapper;

import fr.bsm.persons.common.entity.person.PersonEntity;
import fr.bsm.persons.common.entity.person.PersonsEntity;
import fr.bsm.persons.exposition.dto.PersonDto;
import fr.bsm.persons.exposition.dto.PersonsDto;


@Mapper(componentModel = "spring", uses = {})
public interface PersonDtoMapper {

	PersonDto entityToDto(PersonEntity personEntity);
	
	PersonsDto entityToPersonsDto(PersonsEntity personsEntity);
	
}

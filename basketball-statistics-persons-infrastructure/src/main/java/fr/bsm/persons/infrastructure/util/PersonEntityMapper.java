package fr.bsm.persons.infrastructure.util;

import org.mapstruct.Mapper;

import fr.bsm.persons.common.entity.person.PersonEntity;
import fr.bsm.persons.infrastructure.data.persons.PersonData;

@Mapper(componentModel = "spring")
public interface PersonEntityMapper {


  //PersonEntity dataToEntity(PersonData continentData);

  //PersonData entityToData(PersonEntity continentEntity);
}

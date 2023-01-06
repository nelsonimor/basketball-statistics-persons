package fr.bsm.persons.infrastructure.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import fr.bsm.persons.common.entity.location.CityEntity;
import fr.bsm.persons.common.entity.person.PersonEntity;
import fr.bsm.persons.infrastructure.data.persons.PersonData;

@Mapper(componentModel = "spring")
public interface PersonEntityMapper {

  @Mapping(target = "birthplacecity", source = "birthplacecity", qualifiedByName = "mapBirthCity")
  PersonEntity dataToEntity(PersonData personData);
  
  @Named("mapBirthCity") 
  default CityEntity mapBirthCity(Integer birthCityId){
	  CityEntity cityEntity = new CityEntity();
	  cityEntity.setId(birthCityId);
      return cityEntity;
  }

  //PersonData entityToData(PersonEntity continentEntity);
}

package fr.bsm.persons.infrastructure.repository.persons;

import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import fr.bsm.persons.common.entity.location.CityEntity;
import fr.bsm.persons.common.entity.person.PersonEntity;
import fr.bsm.persons.common.entity.person.PersonsEntity;
import fr.bsm.persons.domain.repository.PersonRepository;
import fr.bsm.persons.infrastructure.data.persons.PersonData;
import fr.bsm.persons.infrastructure.util.PersonEntityMapper;

@Repository
public class PersonRepositoryImpl implements PersonRepository {
	
	private final PersonJpaRepository personJpaRepository;
	
	private final PersonEntityMapper personEntityMapper;

	public PersonRepositoryImpl(PersonJpaRepository personJpaRepository,PersonEntityMapper personEntityMapper) {
		this.personJpaRepository = personJpaRepository;
		this.personEntityMapper = personEntityMapper;
	}

	@Override
	public PersonsEntity findAll() {
		return PersonsEntity.builder().items(personJpaRepository.findAll().stream().map(personEntityMapper::dataToEntity).collect(Collectors.toList())).build();
	}
	
	
	/*public PersonEntity dataToEntity(PersonData data) {
		PersonEntity entity = new PersonEntity();
		entity.setLastname(data.getLastname());
		entity.setFirstname(data.getFirstname());
		
		CityEntity cityEntity = new CityEntity();
		cityEntity.setId(data.getBirthplacecity());
		entity.setBirthplacecity(cityEntity);
		return entity;
	}*/


}

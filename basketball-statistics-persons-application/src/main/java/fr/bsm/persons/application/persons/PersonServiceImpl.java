package fr.bsm.persons.application.persons;

import java.util.Iterator;

import org.springframework.stereotype.Service;

import fr.bsm.persons.common.entity.person.PersonEntity;
import fr.bsm.persons.common.entity.person.PersonsEntity;
import fr.bsm.persons.domain.repository.LocationRepository;
import fr.bsm.persons.domain.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	private final PersonRepository personRepository;
	
	private final LocationRepository locationRepository;
	
	public PersonServiceImpl(PersonRepository personRepository,LocationRepository locationRepository) {
		this.personRepository = personRepository;
		this.locationRepository = locationRepository;
	}

	
	@Override
	public PersonsEntity findAll() {
		
		PersonsEntity personsEntity = personRepository.findAll();
		
		for (Iterator iterator = personsEntity.getItems().iterator(); iterator.hasNext();) {
			PersonEntity personEntity = (PersonEntity) iterator.next();
			personEntity.setBirthplacecity(locationRepository.getCity(personEntity.getBirthplacecity().getId()).get());
		}
		
		
		return personsEntity;
	}



}

package fr.bsm.persons.application.persons;

import org.springframework.stereotype.Service;

import fr.bsm.persons.common.entity.person.PersonsEntity;
import fr.bsm.persons.domain.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	private final PersonRepository personRepository;
	
	public PersonServiceImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	
	@Override
	public PersonsEntity findAll() {
		return personRepository.findAll();
	}



}

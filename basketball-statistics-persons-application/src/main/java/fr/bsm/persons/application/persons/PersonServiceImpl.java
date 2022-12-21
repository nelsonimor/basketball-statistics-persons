package fr.bsm.persons.application.persons;

import java.util.List;
import java.util.Vector;

import org.springframework.stereotype.Service;

import fr.bsm.persons.common.entity.person.PersonEntity;
import fr.bsm.persons.common.entity.person.PersonsEntity;

@Service
public class PersonServiceImpl implements PersonService {


	
	//private final ContinentRepository continentRepository;
	
	//public PersonServiceImpl(ContinentRepository continentRepository) {
	//	this.continentRepository = continentRepository;
	//}

	
	@Override
	public PersonsEntity findAll() {
		
		
		PersonsEntity personsDto = new PersonsEntity();
		List<PersonEntity> persons = new Vector<PersonEntity>();
		
		PersonEntity personDto = new PersonEntity();
		personDto.setFirstname("LeBron");
		personDto.setLastname("James");
		personDto.setId(1);
		personDto.setHeight(203);
		personDto.setProfilPictureUrl("https://basketball.realgm.com/images/nba/4.2/profiles/photos/2006/James_Lebron_lal22.jpg");
		persons.add(personDto);
		
		personsDto.setItems(persons);
		
		return personsDto;
	}



}

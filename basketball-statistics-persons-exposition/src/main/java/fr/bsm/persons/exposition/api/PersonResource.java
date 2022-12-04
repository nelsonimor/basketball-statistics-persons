package fr.bsm.persons.exposition.api;

import java.util.List;
import java.util.Vector;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.bsm.persons.exposition.dto.PersonDto;
import fr.bsm.persons.exposition.dto.PersonsDto;
import lombok.extern.slf4j.Slf4j;

@RestController
@Validated
@Slf4j
public class PersonResource {




	@GetMapping("/persons")
	ResponseEntity<PersonsDto> findAll() {
		
		PersonsDto personsDto = new PersonsDto();
		
		List<PersonDto> persons = new Vector<PersonDto>();
		
		
		PersonDto personDto = new PersonDto();
		personDto.setFirstname("LeBron");
		personDto.setLastname("James");
		personDto.setId(1);
		personDto.setHeight(203);
		personDto.setWeight(120);
		personDto.setProfilPictureUrl("https://basketball.realgm.com/images/nba/4.2/profiles/photos/2006/James_Lebron_lal22.jpg");
		persons.add(personDto);
		

		personsDto.setItems(persons);
		
		
		
		return ResponseEntity.ok(personsDto);
	}




}

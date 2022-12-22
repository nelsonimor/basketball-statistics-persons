package fr.bsm.persons.exposition.api;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.bsm.persons.application.persons.PersonService;
import fr.bsm.persons.common.entity.person.PersonsEntity;
import fr.bsm.persons.exposition.dto.PersonsDto;
import fr.bsm.persons.exposition.util.PersonDtoMapper;
import lombok.extern.slf4j.Slf4j;

@RestController
@Validated
@Slf4j
public class PersonResource {

	private final PersonService personService;
	
	private final PersonDtoMapper personDtoMapper;
	
	public PersonResource(PersonService personService,PersonDtoMapper personDtoMapper) {
		this.personService = personService;
		this.personDtoMapper = personDtoMapper;
	}


	@GetMapping("/persons")
	ResponseEntity<PersonsDto> findAll() {
		
		
		PersonsEntity personsEntity = personService.findAll();
		if (personsEntity != null && personsEntity.getItems().isEmpty()) {
			log.error("No persons found");
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(personDtoMapper.entityToPersonsDto(personsEntity));
	}




}

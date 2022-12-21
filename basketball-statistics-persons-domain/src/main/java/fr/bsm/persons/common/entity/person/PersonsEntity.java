package fr.bsm.persons.common.entity.person;
import java.util.List;

import fr.bsm.persons.domain.ddd.DDD;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@DDD.AggregateRoot
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonsEntity {
	
	private List<PersonEntity> items;
	
}


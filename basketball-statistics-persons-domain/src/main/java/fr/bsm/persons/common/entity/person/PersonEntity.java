package fr.bsm.persons.common.entity.person;

import javax.validation.constraints.NotNull;

import fr.bsm.persons.domain.ddd.DDD;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@DDD.Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonEntity {


	/**
	 * Entity object Id
	 */
	@NotNull
	@EqualsAndHashCode.Include
	private Integer id;

	@NotNull
	private String lastname;

	@NotNull
	private String firstname;

	private Integer height;

	private String profilPictureUrl;





}

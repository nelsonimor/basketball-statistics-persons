package fr.bsm.persons.exposition.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {
	
	private Integer id;
	private String lastname;
	private String firstname;
	private Integer height;
	private String profilpictureurl;

}

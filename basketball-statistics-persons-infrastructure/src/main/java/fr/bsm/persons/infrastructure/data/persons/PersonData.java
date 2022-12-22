package fr.bsm.persons.infrastructure.data.persons;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import fr.bsm.persons.infrastructure.data.CoreData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_person")
public class PersonData extends CoreData {
	

	@NotNull
	private String lastname;

	@NotNull
	private String firstname;

	private Integer height;

	private String profilpictureurl;
	
	

	@Builder
	public PersonData(Integer id,Timestamp creationDate,Timestamp updateDate,String lastname,String firstname,Integer height,String profilpictureurl) {
		super(id,creationDate,updateDate);
		this.lastname = lastname;
		this.firstname = firstname;
		this.height = height;
		this.profilpictureurl = profilpictureurl;
	}

}

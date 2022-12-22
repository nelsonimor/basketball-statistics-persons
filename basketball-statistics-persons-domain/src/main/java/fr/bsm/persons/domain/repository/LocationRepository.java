package fr.bsm.persons.domain.repository;

import fr.bsm.persons.common.entity.location.CityEntity;

public interface LocationRepository {
	
	CityEntity getCity(Integer idCity);
	


}

package fr.bsm.persons.domain.repository;

import java.util.Optional;

import fr.bsm.persons.common.entity.location.CityEntity;

public interface LocationRepository {
	
	Optional<CityEntity> getCity(Integer idCity);
	


}

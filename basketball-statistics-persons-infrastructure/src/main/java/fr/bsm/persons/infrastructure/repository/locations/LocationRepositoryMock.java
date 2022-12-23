package fr.bsm.persons.infrastructure.repository.locations;

import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;

import fr.bsm.persons.common.entity.location.CityEntity;
import fr.bsm.persons.domain.repository.LocationRepository;
import fr.bsm.persons.infrastructure.config.SpringProfileConstants;
import fr.bsm.persons.infrastructure.data.locations.CityDto;
import fr.bsm.persons.infrastructure.util.CityMapper;
import lombok.extern.slf4j.Slf4j;

@Repository
@Profile(SpringProfileConstants.MOCK_GEOCODING)
@Slf4j
public class LocationRepositoryMock implements LocationRepository {

	@Value("classpath:mock-locations-response.json")
	private Resource jsonFile;

	private final ObjectMapper objectMapper;
	
	private final CityMapper cityMapper;

	public LocationRepositoryMock(ObjectMapper objectMapper,CityMapper cityMapper) {
		this.objectMapper = objectMapper;
		this.cityMapper = cityMapper;
	}


	@Override
	public Optional<CityEntity> getCity(Integer id) {
		try {
		    CityDto dto = Arrays.asList(objectMapper.readValue(jsonFile.getInputStream(), CityDto.class)).stream().filter(x -> x.getId().equals(id)).findAny().orElse(null);
		    
		    if(dto == null) {
		    	return Optional.empty();
		    }
		    else {
		    	CityEntity cityEntity = cityMapper.dtoToEntity(dto);
				return Optional.of(cityEntity);
		    }
	
		} catch (IOException e) {
			log.error("Geocoding error",e);
			return Optional.empty();
		}
	}

}

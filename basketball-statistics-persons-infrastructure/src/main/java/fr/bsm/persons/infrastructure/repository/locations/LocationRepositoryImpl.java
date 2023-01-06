package fr.bsm.persons.infrastructure.repository.locations;



import java.util.Optional;

import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import fr.bsm.persons.common.entity.location.CityEntity;
import fr.bsm.persons.domain.repository.LocationRepository;
import fr.bsm.persons.infrastructure.config.LocationProperties;
import fr.bsm.persons.infrastructure.config.SpringProfileConstants;
import fr.bsm.persons.infrastructure.data.locations.CityDto;
import fr.bsm.persons.infrastructure.util.CityMapper;



@Repository
@Profile(SpringProfileConstants.UNMOCK_GEOCODING)
public class LocationRepositoryImpl implements LocationRepository {
	
	private static final String NA = "Not available";
	
	private final LocationProperties locationProperties;
	
	private final CityMapper cityMapper;
	
	public LocationRepositoryImpl(LocationProperties locationProperties,CityMapper cityMapper) {
		this.cityMapper = cityMapper;
		this.locationProperties = locationProperties;
	}


	
	@Override
	public Optional<CityEntity> getCity(Integer idCity) {
		System.out.println("LocationRepositoryImpl.getCity() with cityId = "+idCity +" and url = "+locationProperties.getUrl());
		CityDto result = WebClient.builder()
				.baseUrl(locationProperties.getUrl())
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.build().get()
				.uri(uriBuilder -> uriBuilder
						.path("/"+idCity)
						.build())
				.retrieve()
				.bodyToMono(CityDto.class).share()
				.block();

		
		if(result == null) {
			return Optional.empty();
		}

		
		CityEntity cityEntity = cityMapper.dtoToEntity(result);
		return Optional.of(cityEntity);
	}
}

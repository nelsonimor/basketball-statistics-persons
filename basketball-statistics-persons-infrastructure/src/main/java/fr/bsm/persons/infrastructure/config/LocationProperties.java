package fr.bsm.persons.infrastructure.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("location.cities")
public class LocationProperties {
	
	private String url;
	
}

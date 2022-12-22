package fr.bsm.persons.common.entity.location;

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
public class CityEntity {

  /**
   * Entity object Id
   */
  @NotNull
  @EqualsAndHashCode.Include
  private Integer id;
   
  @NotNull
  private String name;
  
  @NotNull
  private Double longitude;
  
  @NotNull
  private Double latitude;
  
  @NotNull
  private String state;
  
  @NotNull
  private String county;
  
  @NotNull
  private CountryEntity country;


}

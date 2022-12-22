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
public class CountryEntity {

  /**
   * Entity object Id
   */
  @NotNull
  @EqualsAndHashCode.Include
  private Integer id;
   
  @NotNull
  private String name;
  
  @NotNull
  private String fullname;
  
  @NotNull
  private String codeiso2;
  
  @NotNull
  private String codeiso3;
  
  @NotNull
  private String number;
  
  @NotNull
  private ContinentEntity continent;
  
  @NotNull
  private RegionEntity region;


}

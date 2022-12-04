package fr.bsm.persons.exposition.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class PersonsDto {

  @NotNull
  private List<PersonDto> items;
}

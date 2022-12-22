package fr.bsm.persons.infrastructure.repository.persons;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.bsm.persons.infrastructure.data.persons.PersonData;

@Repository
public interface PersonJpaRepository extends JpaRepository<PersonData, Integer> {

}

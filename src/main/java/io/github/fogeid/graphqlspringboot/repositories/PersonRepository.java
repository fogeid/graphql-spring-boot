package io.github.fogeid.graphqlspringboot.repositories;

import io.github.fogeid.graphqlspringboot.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}

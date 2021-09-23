package io.github.fogeid.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.github.fogeid.inputs.PersonInput;
import io.github.fogeid.models.Person;
import io.github.fogeid.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class PersonResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
    @Autowired
    private PersonRepository personRepository;

    public Collection<Person> findAllPeoples() {
        return personRepository.findAll();
    }

    public Person findPersonById(Long id) {
        return personRepository.findById(id).get();
    }

    public Person savePerson(PersonInput input) {
        return personRepository.save(new Person(
                input.getName(),
                input.getAge(),
                input.getGender()
            ));
    }

    public Person updateAge(Long id, Integer age) {
        Person person = personRepository.findById(id).get();
        person.setAge(age);
        return personRepository.save(person);
    }
}

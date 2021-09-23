package io.github.fogeid.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import io.github.fogeid.inputs.PetInput;
import io.github.fogeid.models.Person;
import io.github.fogeid.models.Pet;
import io.github.fogeid.repositories.PersonRepository;
import io.github.fogeid.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class PetResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
    @Autowired
    private PetRepository petRepository;

    @Autowired
    private PersonRepository personRepository;

    public Collection<Pet> findAllPets() {
        return petRepository.findAll();
    }

    public Pet savePet(PetInput input) {
        Person owner = personRepository.findById(input.getOwnerId()).get();
        return petRepository.save(new Pet(input.getName(), owner));
    }
}

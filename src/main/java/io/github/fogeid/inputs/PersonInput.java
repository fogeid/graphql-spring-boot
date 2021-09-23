package io.github.fogeid.inputs;

import graphql.schema.GraphQLInputType;
import io.github.fogeid.models.Gender;

public class PersonInput implements GraphQLInputType {
    private String name;
    private Integer age;
    private Gender gender;

    @Override
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
}

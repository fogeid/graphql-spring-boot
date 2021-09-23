package io.github.fogeid.inputs;

import graphql.schema.GraphQLInputType;

public class PetInput implements GraphQLInputType {
    private String name;
    private Long ownerId;

    @Override
    public String getName() {
        return name;
    }

    public Long getOwnerId() {
        return ownerId;
    }
}

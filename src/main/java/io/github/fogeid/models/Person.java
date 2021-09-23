package io.github.fogeid.models;

import javax.persistence.*;

@Entity
@Table(name = "tb_person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;

    @Enumerated(value = EnumType.STRING)
    private Gender gener;

    public Person() {
    }

    public Person(String name, Integer age, Gender gener) {
        this.name = name;
        this.age = age;
        this.gener = gener;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getGener() {
        return gener;
    }
}

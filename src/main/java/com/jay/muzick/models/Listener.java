//all of our entity's
//Represent a single entity
//Tables in database
package com.jay.muzick.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//let jpa spring-boot now that is part of database
@Entity
public class Listener {

    @Id
    //automatic giving id, sql to generate id automatic
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;

    public Listener() {
    }

    //Constructor
    public Listener(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

package com.chandra.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Pet Model class
 */
@Entity
public class Pet implements Serializable {

    @Id
    private int id;
    private String name;
    private int age;
    private String color;

    public Pet() {

    }

    public Pet(int id, String name, int age, String color) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

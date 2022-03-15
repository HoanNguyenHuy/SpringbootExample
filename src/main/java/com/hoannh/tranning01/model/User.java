package com.hoannh.tranning01.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int age;
    private long groupId;
    private String identityNumber;

    public User(String name, int age, long groupId, String identityNumber) {
        super();
        this.name = name;
        this.age= age;
        this.groupId = groupId;
        this.identityNumber = identityNumber;
    }

    public User() {
    }
}

package com.hoannh.tranning01.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name = "group")
public class Group {
    @Id
    @GeneratedValue
    private long id;
    private String name;
}

package io.github.springbootredisinit.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private int age;
}

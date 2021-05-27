package com.learn.aws.model;

import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String department;

    @Column
    private int salary;
}


package com.problemfighter.pfspring.security.model.entity;

import javax.persistence.*;

@Entity
public class Operator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String identifier;

    @Column(nullable = false)
    public String password;

    public String email;

    public String mobile;
}

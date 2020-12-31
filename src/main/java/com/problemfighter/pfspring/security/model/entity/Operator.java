package com.problemfighter.pfspring.security.model.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    @ManyToMany(mappedBy = "operator")
    public Set<Authority> authority= new HashSet<>();
}

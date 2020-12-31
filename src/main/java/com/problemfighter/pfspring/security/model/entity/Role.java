package com.problemfighter.pfspring.security.model.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String name;

    public String description;

    @ManyToMany(mappedBy = "role")
    public Set<Authority> authorities = new HashSet<>();

}

package com.problemfighter.pfspring.security.model.entity;

import com.problemfighter.pfspring.security.model.data.AuthorityName;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public AuthorityName name;

    public String displayName;

    @Column(nullable = false)
    public String appUrl;


    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "authority_group_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    public AuthorityGroup authorityGroup;

    @JoinTable
    @ManyToMany(cascade = CascadeType.ALL)
    public Set<Role> roles = new HashSet<>();


    @JoinTable
    @ManyToMany(cascade = CascadeType.ALL)
    public Set<Operator> operators = new HashSet<>();
}

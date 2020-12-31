package com.problemfighter.pfspring.security.model.entity;

import com.problemfighter.pfspring.security.model.data.NavGroup;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class AuthorityGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String displayName;

    @Column(nullable = false)
    public NavGroup navGroup;

    public String appUrl;
    public String uiUrl;

    @OneToMany(mappedBy = "authorityGroup", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public Set<Authority> authorities = new HashSet<>();


}

package com.problemfighter.pfspring.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class OperatorDetailsService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Map<String, UserDetails> data = new LinkedHashMap<>();
        data.put("admin", User.builder().username("admin").password(passwordEncoder.encode("admin")).roles("ADMIN").build());
        data.put("touhid", User.builder().username("touhid").password(passwordEncoder.encode("touhid")).roles("MANAGER").build());
        data.put("sales", User.builder().username("sales").password(passwordEncoder.encode("sales")).roles("SALES").build());
        return data.get(username);
    }

}

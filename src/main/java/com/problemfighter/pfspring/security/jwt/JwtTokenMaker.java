package com.problemfighter.pfspring.security.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Map;

public class JwtTokenMaker {

    private JWTCreator.Builder tokenBuilder = null;
    private String token;
    private String algorithm;

    public JwtTokenMaker(String token, String algorithm) {
        this.tokenBuilder = JWT.create();
        this.token = token;
        this.algorithm = algorithm;
    }

    public JwtTokenMaker setClaim(String name, Map<String, ?> map) {
        return this;
    }

    public JwtTokenMaker setExpiration(Integer minutes) {
        return this;
    }

    public String getToken() {
        return null;
    }

    public String getToken(String issuer) {
        return null;
    }

    public String getToken(String issuer, String subject) {
        return null;
    }

    public DecodedJWT validateToken(String token){
        return null;
    }

}

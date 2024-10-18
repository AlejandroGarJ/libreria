package com.biblioteca;

import org.junit.jupiter.api.Test;

import com.biblioteca.biblioteca.security.JwtUtil;

public class JwtUtilTest {

    @Test
    public void testGenerateToken(){
        JwtUtil jwtUtil = new JwtUtil();

        String token = jwtUtil.generateToken("testUser");

        if(jwtUtil.validateToken(token+"1")){
            System.out.println("Validación correcta");
        } else {
            System.out.println("Validacion incorrecta, el token no es valido");
        }
    }
    
}

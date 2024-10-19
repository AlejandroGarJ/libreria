package com.biblioteca.biblioteca.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private UsuarioDetailsService usuarioDetailsService;
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Deshabilitar CSRF si no es necesario
            .authorizeHttpRequests(request ->
                request
                    .requestMatchers("/usuario/create").permitAll() // Permitir acceso a la ruta de creación de usuario
                    .requestMatchers("/login").permitAll() // Permitir acceso a la ruta de inicio de sesión
                    .anyRequest().authenticated() // Requiere autenticación para cualquier otra ruta
            )
            .formLogin(formLogin -> formLogin
               

                .defaultSuccessUrl("/home", true) // Redirigir a esta página al iniciar sesión con éxito
                .failureUrl("/login?error=true") // Redirigir a login con error en caso de fallo
                .permitAll() // Permitir acceso a todos los usuarios, incluidos los no autenticados
            )
            .logout(logout -> logout
                .logoutUrl("/logout") // URL de cierre de sesión
                .logoutSuccessUrl("/login?logout=true") // Redirigir a esta página al cerrar sesión
                .permitAll() // Permitir acceso a todos los usuarios
            );
        return http.build();
    }

    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

     @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(usuarioDetailsService).passwordEncoder(passwordEncoder());
    }
   
   
}

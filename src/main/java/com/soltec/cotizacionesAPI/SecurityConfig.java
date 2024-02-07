package com.soltec.cotizacionesAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authz -> authz
                        .requestMatchers("/api/usuarios/registro", "/api/usuarios/login").permitAll() // Permite todos los accesos a estas rutas
                        .anyRequest().authenticated() // Todos los demás requerimientos deben ser autenticados
                )
                .formLogin(form -> form
                        .loginProcessingUrl("/api/usuarios/login") // URL para procesar el nombre de usuario y la contraseña
                        .defaultSuccessUrl("/home") // Página a la que se redirige al usuario después de un inicio de sesión exitoso
                        .failureUrl("/login?error=true") // Página a la que se redirige al usuario después de un inicio de sesión fallido
                        .permitAll() // Permite a todos acceder a la página de inicio de sesión
                )
                .logout(logout -> logout
                        .logoutUrl("/api/usuarios/logout") // URL para procesar el logout
                        .logoutSuccessUrl("/login") // Página a la que se redirige al usuario después del logout
                        .permitAll() // Permite a todos acceder a la página de logout
                );

        return http.build();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Configuración adicional si es necesario
}

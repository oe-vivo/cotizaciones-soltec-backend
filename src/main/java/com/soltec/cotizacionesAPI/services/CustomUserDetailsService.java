package com.soltec.cotizacionesAPI.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soltec.cotizacionesAPI.model.Usuario;
import com.soltec.cotizacionesAPI.repository.UsuarioRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public CustomUserDetailsService(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByCorreo(username);

        return User.builder()
                .username(usuario.getCorreo())
                .password(usuario.getContraseña()) // Asumiendo que la contraseña ya está cifrada en la base de datos
                .authorities("ROLE_USER") // Aquí debes ajustar los roles/autoridades según tu modelo
                // .disabled(!usuario.isActivo()) // Si tienes un campo para manejar la activación del usuario
                .build();
    }
}

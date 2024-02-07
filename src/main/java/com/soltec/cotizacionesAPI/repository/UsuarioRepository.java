package com.soltec.cotizacionesAPI.repository;

import com.soltec.cotizacionesAPI.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Aquí puedes definir métodos de consulta personalizados si es necesario.
    // Por ejemplo, encontrar un usuario por correo:
    Usuario findByCorreo(String correo);

    boolean existsByCorreo(String correo);
}

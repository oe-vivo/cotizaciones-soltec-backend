package com.soltec.cotizacionesAPI.repository;

import com.soltec.cotizacionesAPI.model.RelacionProductoPrecioProveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelacionProductoPrecioProveedorRepository extends JpaRepository<RelacionProductoPrecioProveedor, Long> {
    // Métodos personalizados de consulta si es necesario.
}

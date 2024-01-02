package com.soltec.cotizacionesAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.soltec.cotizacionesAPI.model.RelacionProductoPrecioMayorista;

public interface RelacionProductoPrecioMayoristaRepository extends JpaRepository<RelacionProductoPrecioMayorista, Long> {
    // Métodos personalizados si se requieren
}


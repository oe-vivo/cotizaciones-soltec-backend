package com.soltec.cotizacionesAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.soltec.cotizacionesAPI.model.Precio;

public interface PrecioRepository extends JpaRepository<Precio, Long> {
    // Aquí puedes añadir métodos personalizados si lo necesitas
}

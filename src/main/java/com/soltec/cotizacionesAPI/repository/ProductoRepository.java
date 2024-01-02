package com.soltec.cotizacionesAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.soltec.cotizacionesAPI.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Métodos personalizados si se requieren
}


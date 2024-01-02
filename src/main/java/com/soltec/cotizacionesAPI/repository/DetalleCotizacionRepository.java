package com.soltec.cotizacionesAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.soltec.cotizacionesAPI.model.DetalleCotizacion;

public interface DetalleCotizacionRepository extends JpaRepository<DetalleCotizacion, Long> {
    // Métodos personalizados si se requieren
}


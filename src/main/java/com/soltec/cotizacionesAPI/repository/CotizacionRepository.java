package com.soltec.cotizacionesAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.soltec.cotizacionesAPI.model.Cotizacion;

public interface CotizacionRepository extends JpaRepository<Cotizacion, Long> {
    // Aquí puedes añadir métodos personalizados si lo necesitas
}


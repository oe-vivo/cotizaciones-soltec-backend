package com.soltec.cotizacionesAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.soltec.cotizacionesAPI.model.Mayorista;

public interface MayoristaRepository extends JpaRepository<Mayorista, Long> {
    // Aquí puedes añadir métodos personalizados si lo necesitas
}

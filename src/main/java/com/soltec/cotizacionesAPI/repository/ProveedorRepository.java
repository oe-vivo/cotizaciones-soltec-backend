package com.soltec.cotizacionesAPI.repository;

import com.soltec.cotizacionesAPI.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
    // Aquí puedes definir métodos de consulta personalizados si es necesario.
}

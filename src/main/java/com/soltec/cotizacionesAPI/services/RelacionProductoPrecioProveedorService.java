package com.soltec.cotizacionesAPI.services;

import com.soltec.cotizacionesAPI.model.RelacionProductoPrecioProveedor;
import com.soltec.cotizacionesAPI.repository.RelacionProductoPrecioProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RelacionProductoPrecioProveedorService {

    private final RelacionProductoPrecioProveedorRepository relacionRepository;

    @Autowired
    public RelacionProductoPrecioProveedorService(RelacionProductoPrecioProveedorRepository relacionRepository) {
        this.relacionRepository = relacionRepository;
    }

    public RelacionProductoPrecioProveedor saveRelacion(RelacionProductoPrecioProveedor relacion) {
        return relacionRepository.save(relacion);
    }

    public Optional<RelacionProductoPrecioProveedor> getRelacionById(Long id) {
        return relacionRepository.findById(id);
    }

    public List<RelacionProductoPrecioProveedor> getAllRelaciones() {
        return relacionRepository.findAll();
    }

    public void deleteRelacion(Long id) {
        relacionRepository.deleteById(id);
    }

    // Puedes añadir más métodos según la lógica de negocio.
}

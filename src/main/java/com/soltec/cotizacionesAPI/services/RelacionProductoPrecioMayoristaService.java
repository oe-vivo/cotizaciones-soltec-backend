package com.soltec.cotizacionesAPI.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import com.soltec.cotizacionesAPI.model.RelacionProductoPrecioMayorista;
import com.soltec.cotizacionesAPI.repository.RelacionProductoPrecioMayoristaRepository;
@Service
public class RelacionProductoPrecioMayoristaService {

    @Autowired
    private RelacionProductoPrecioMayoristaRepository repository;

    public List<RelacionProductoPrecioMayorista> findAll() {
        return repository.findAll();
    }

    public Optional<RelacionProductoPrecioMayorista> findById(Long id) {
        return repository.findById(id);
    }

    public RelacionProductoPrecioMayorista save(RelacionProductoPrecioMayorista entidad) {
        return repository.save(entidad);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    // Más métodos según se requieran
}


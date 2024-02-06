package com.soltec.cotizacionesAPI.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import com.soltec.cotizacionesAPI.model.Precio;
import com.soltec.cotizacionesAPI.repository.PrecioRepository;

@Service
public class PrecioService {

    private final PrecioRepository precioRepository;

    @Autowired
    public PrecioService(PrecioRepository precioRepository) {
        this.precioRepository = precioRepository;
    }

    public Precio savePrecio(Precio precio) {
        return precioRepository.save(precio);
    }

    public Optional<Precio> getPrecioById(Long id) {
        return precioRepository.findById(id);
    }

    public List<Precio> getAllPrecios() {
        return precioRepository.findAll();
    }

    public void deletePrecio(Long id) {
        precioRepository.deleteById(id);
    }

    // Puedes añadir más métodos según la lógica de negocio.
}
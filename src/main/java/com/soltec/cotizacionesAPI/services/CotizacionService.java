package com.soltec.cotizacionesAPI.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import com.soltec.cotizacionesAPI.model.Cotizacion;
import com.soltec.cotizacionesAPI.repository.CotizacionRepository;
@Service
public class CotizacionService {

    @Autowired
    private CotizacionRepository cotizacionRepository;

    public List<Cotizacion> findAll() {
        return cotizacionRepository.findAll();
    }

    public Optional<Cotizacion> findById(Long id) {
        return cotizacionRepository.findById(id);
    }

    public Cotizacion save(Cotizacion cotizacion) {
        return cotizacionRepository.save(cotizacion);
    }

    public void delete(Long id) {
        cotizacionRepository.deleteById(id);
    }

    // Aquí puedes añadir más métodos según lo necesites
}


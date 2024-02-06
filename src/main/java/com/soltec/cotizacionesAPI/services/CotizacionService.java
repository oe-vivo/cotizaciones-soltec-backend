package com.soltec.cotizacionesAPI.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import com.soltec.cotizacionesAPI.model.Cotizacion;
import com.soltec.cotizacionesAPI.repository.CotizacionRepository;
@Service
public class CotizacionService {

    private final CotizacionRepository cotizacionRepository;

    @Autowired
    public CotizacionService(CotizacionRepository cotizacionRepository) {
        this.cotizacionRepository = cotizacionRepository;
    }

    public Cotizacion saveCotizacion(Cotizacion cotizacion) {
        return cotizacionRepository.save(cotizacion);
    }

    public Optional<Cotizacion> getCotizacionById(Long id) {
        return cotizacionRepository.findById(id);
    }

    public List<Cotizacion> getAllCotizaciones() {
        return cotizacionRepository.findAll();
    }

    public void deleteCotizacion(Long id) {
        cotizacionRepository.deleteById(id);
    }

    // Puedes añadir más métodos según la lógica de negocio.
}
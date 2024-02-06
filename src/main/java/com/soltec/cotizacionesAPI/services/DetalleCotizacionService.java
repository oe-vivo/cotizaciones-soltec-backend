package com.soltec.cotizacionesAPI.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import com.soltec.cotizacionesAPI.model.DetalleCotizacion;
import com.soltec.cotizacionesAPI.repository.DetalleCotizacionRepository;
@Service
public class DetalleCotizacionService {

    private final DetalleCotizacionRepository detalleCotizacionRepository;

    @Autowired
    public DetalleCotizacionService(DetalleCotizacionRepository detalleCotizacionRepository) {
        this.detalleCotizacionRepository = detalleCotizacionRepository;
    }

    public DetalleCotizacion saveDetalleCotizacion(DetalleCotizacion detalleCotizacion) {
        // Aquí puedes añadir lógica de negocio adicional antes de guardar el detalle
        return detalleCotizacionRepository.save(detalleCotizacion);
    }

    public Optional<DetalleCotizacion> getDetalleCotizacionById(Long id) {
        return detalleCotizacionRepository.findById(id);
    }

    public List<DetalleCotizacion> getAllDetallesCotizacion() {
        return detalleCotizacionRepository.findAll();
    }

    public void deleteDetalleCotizacion(Long id) {
        detalleCotizacionRepository.deleteById(id);
    }

    // Puedes añadir más métodos según la lógica de negocio.
}
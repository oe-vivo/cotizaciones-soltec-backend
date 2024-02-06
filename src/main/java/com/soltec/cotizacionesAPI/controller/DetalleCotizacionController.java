package com.soltec.cotizacionesAPI.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.soltec.cotizacionesAPI.model.DetalleCotizacion;
import com.soltec.cotizacionesAPI.services.DetalleCotizacionService;
@RestController
@RequestMapping("/api/detalle-cotizaciones")
public class DetalleCotizacionController {

    private final DetalleCotizacionService detalleCotizacionService;

    @Autowired
    public DetalleCotizacionController(DetalleCotizacionService detalleCotizacionService) {
        this.detalleCotizacionService = detalleCotizacionService;
    }

    @PostMapping
    public ResponseEntity<DetalleCotizacion> createDetalleCotizacion(@RequestBody DetalleCotizacion detalleCotizacion) {
        DetalleCotizacion nuevoDetalle = detalleCotizacionService.saveDetalleCotizacion(detalleCotizacion);
        return ResponseEntity.ok(nuevoDetalle);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleCotizacion> getDetalleCotizacionById(@PathVariable Long id) {
        return detalleCotizacionService.getDetalleCotizacionById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<DetalleCotizacion> getAllDetallesCotizacion() {
        return detalleCotizacionService.getAllDetallesCotizacion();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDetalleCotizacion(@PathVariable Long id) {
        if (!detalleCotizacionService.getDetalleCotizacionById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        detalleCotizacionService.deleteDetalleCotizacion(id);
        return ResponseEntity.ok().build();
    }

    // Aquí puedes añadir más endpoints según lo necesites.
}


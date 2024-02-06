package com.soltec.cotizacionesAPI.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.soltec.cotizacionesAPI.model.Cotizacion;
import com.soltec.cotizacionesAPI.services.CotizacionService;
@RestController
@RequestMapping("/api/cotizaciones")
public class CotizacionController {

    private final CotizacionService cotizacionService;

    @Autowired
    public CotizacionController(CotizacionService cotizacionService) {
        this.cotizacionService = cotizacionService;
    }

    @PostMapping
    public ResponseEntity<Cotizacion> createCotizacion(@RequestBody Cotizacion cotizacion) {
        Cotizacion nuevaCotizacion = cotizacionService.saveCotizacion(cotizacion);
        return ResponseEntity.ok(nuevaCotizacion);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cotizacion> getCotizacionById(@PathVariable Long id) {
        return cotizacionService.getCotizacionById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Cotizacion> getAllCotizaciones() {
        return cotizacionService.getAllCotizaciones();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCotizacion(@PathVariable Long id) {
        if (!cotizacionService.getCotizacionById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        cotizacionService.deleteCotizacion(id);
        return ResponseEntity.ok().build();
    }

    // Aquí puedes añadir más endpoints según lo necesites.
}


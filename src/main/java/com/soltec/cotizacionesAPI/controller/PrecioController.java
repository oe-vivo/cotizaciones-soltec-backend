package com.soltec.cotizacionesAPI.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.soltec.cotizacionesAPI.model.Precio;
import com.soltec.cotizacionesAPI.services.PrecioService;
@RestController
@RequestMapping("/api/precios")
public class PrecioController {

    private final PrecioService precioService;

    @Autowired
    public PrecioController(PrecioService precioService) {
        this.precioService = precioService;
    }

    @PostMapping
    public ResponseEntity<Precio> createPrecio(@RequestBody Precio precio) {
        Precio nuevoPrecio = precioService.savePrecio(precio);
        return ResponseEntity.ok(nuevoPrecio);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Precio> getPrecioById(@PathVariable Long id) {
        return precioService.getPrecioById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Precio> getAllPrecios() {
        return precioService.getAllPrecios();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePrecio(@PathVariable Long id) {
        if (!precioService.getPrecioById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        precioService.deletePrecio(id);
        return ResponseEntity.ok().build();
    }

    // Aquí puedes añadir más endpoints según lo necesites.
}
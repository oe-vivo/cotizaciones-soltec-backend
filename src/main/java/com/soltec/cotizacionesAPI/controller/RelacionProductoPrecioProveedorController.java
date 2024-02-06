package com.soltec.cotizacionesAPI.controller;

import com.soltec.cotizacionesAPI.model.RelacionProductoPrecioProveedor;
import com.soltec.cotizacionesAPI.services.RelacionProductoPrecioProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/relaciones-producto-precio-proveedor")
public class RelacionProductoPrecioProveedorController {

    private final RelacionProductoPrecioProveedorService relacionService;

    @Autowired
    public RelacionProductoPrecioProveedorController(RelacionProductoPrecioProveedorService relacionService) {
        this.relacionService = relacionService;
    }

    @PostMapping
    public ResponseEntity<RelacionProductoPrecioProveedor> createRelacion(@RequestBody RelacionProductoPrecioProveedor relacion) {
        RelacionProductoPrecioProveedor nuevaRelacion = relacionService.saveRelacion(relacion);
        return ResponseEntity.ok(nuevaRelacion);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RelacionProductoPrecioProveedor> getRelacionById(@PathVariable Long id) {
        return relacionService.getRelacionById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<RelacionProductoPrecioProveedor> getAllRelaciones() {
        return relacionService.getAllRelaciones();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRelacion(@PathVariable Long id) {
        if (!relacionService.getRelacionById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        relacionService.deleteRelacion(id);
        return ResponseEntity.ok().build();
    }

    // Aquí puedes añadir más endpoints según lo necesites.
}

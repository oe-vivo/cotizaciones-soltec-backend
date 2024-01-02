package com.soltec.cotizacionesAPI.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.soltec.cotizacionesAPI.model.RelacionProductoPrecioMayorista;
import com.soltec.cotizacionesAPI.services.RelacionProductoPrecioMayoristaService;

@RestController
@RequestMapping("/api/relacionProductoPrecioMayorista")
public class RelacionProductoPrecioMayoristaController {

    @Autowired
    private RelacionProductoPrecioMayoristaService service;

    @GetMapping
    public List<RelacionProductoPrecioMayorista> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public RelacionProductoPrecioMayorista getById(@PathVariable Long id) {
        return service.findById(id).orElse(null);
    }

    @PostMapping
    public RelacionProductoPrecioMayorista create(@RequestBody RelacionProductoPrecioMayorista entidad) {
        return service.save(entidad);
    }

    @PutMapping("/{id}")
    public RelacionProductoPrecioMayorista update(@PathVariable Long id, @RequestBody RelacionProductoPrecioMayorista entidad) {
        return service.save(entidad); // Asegúrate de manejar la actualización correctamente
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    // Más endpoints según se requieran
}


package com.soltec.cotizacionesAPI.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.soltec.cotizacionesAPI.model.Mayorista;
import com.soltec.cotizacionesAPI.services.MayoristaService;

@RestController
@RequestMapping("/api/mayoristas")
public class MayoristaController {

    private final MayoristaService mayoristaService;

    @Autowired
    public MayoristaController(MayoristaService mayoristaService) {
        this.mayoristaService = mayoristaService;
    }

    @PostMapping
    public ResponseEntity<Mayorista> createMayorista(@RequestBody Mayorista mayorista) {
        Mayorista nuevoMayorista = mayoristaService.saveMayorista(mayorista);
        return ResponseEntity.ok(nuevoMayorista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mayorista> getMayoristaById(@PathVariable Long id) {
        return mayoristaService.getMayoristaById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Mayorista> getAllMayoristas() {
        return mayoristaService.getAllMayoristas();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMayorista(@PathVariable Long id) {
        if (!mayoristaService.getMayoristaById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        mayoristaService.deleteMayorista(id);
        return ResponseEntity.ok().build();
    }

    // Aquí puedes añadir más endpoints según lo necesites.
}
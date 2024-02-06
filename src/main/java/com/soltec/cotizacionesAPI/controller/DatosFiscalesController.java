package com.soltec.cotizacionesAPI.controller;

import com.soltec.cotizacionesAPI.services.DatosFiscalesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.soltec.cotizacionesAPI.model.DatosFiscales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/datos-fiscales")
public class DatosFiscalesController {

    private final DatosFiscalesService datosFiscalesService;

    @Autowired
    public DatosFiscalesController(DatosFiscalesService datosFiscalesService) {
        this.datosFiscalesService = datosFiscalesService;
    }

    @PostMapping
    public ResponseEntity<DatosFiscales> createDatosFiscales(@RequestBody DatosFiscales datosFiscales) {
        DatosFiscales nuevosDatosFiscales = datosFiscalesService.saveDatosFiscales(datosFiscales);
        return ResponseEntity.ok(nuevosDatosFiscales);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosFiscales> getDatosFiscalesById(@PathVariable Long id) {
        return datosFiscalesService.getDatosFiscalesById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<DatosFiscales> getAllDatosFiscales() {
        return datosFiscalesService.getAllDatosFiscales();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDatosFiscales(@PathVariable Long id) {
        if (!datosFiscalesService.getDatosFiscalesById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        datosFiscalesService.deleteDatosFiscales(id);
        return ResponseEntity.ok().build();
    }

    // Aquí puedes añadir más endpoints según lo necesites.
}

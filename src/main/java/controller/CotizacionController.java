package controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import model.Cotizacion;
import services.CotizacionService;
@RestController
@RequestMapping("/api/cotizaciones")
public class CotizacionController {

    @Autowired
    private CotizacionService cotizacionService;

    @GetMapping
    public List<Cotizacion> getAllCotizaciones() {
        return cotizacionService.findAll();
    }

    @GetMapping("/{id}")
    public Cotizacion getCotizacionById(@PathVariable Long id) {
        return cotizacionService.findById(id).orElse(null);
    }

    @PostMapping
    public Cotizacion createCotizacion(@RequestBody Cotizacion cotizacion) {
        return cotizacionService.save(cotizacion);
    }

    @PutMapping("/{id}")
    public Cotizacion updateCotizacion(@PathVariable Long id, @RequestBody Cotizacion cotizacion) {
        // Aquí puedes agregar lógica para actualizar una cotización existente
        return cotizacionService.save(cotizacion);
    }

    @DeleteMapping("/{id}")
    public void deleteCotizacion(@PathVariable Long id) {
        cotizacionService.delete(id);
    }

    // Puedes agregar más métodos según lo necesites
}


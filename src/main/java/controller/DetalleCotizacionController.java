package controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import model.DetalleCotizacion;
import services.DetalleCotizacionService;
@RestController
@RequestMapping("/api/detalleCotizacion")
public class DetalleCotizacionController {

    @Autowired
    private DetalleCotizacionService service;

    @GetMapping
    public List<DetalleCotizacion> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public DetalleCotizacion getById(@PathVariable Long id) {
        return service.findById(id).orElse(null);
    }

    @PostMapping
    public DetalleCotizacion create(@RequestBody DetalleCotizacion detalle) {
        return service.save(detalle);
    }

    @PutMapping("/{id}")
    public DetalleCotizacion update(@PathVariable Long id, @RequestBody DetalleCotizacion detalle) {
        return service.save(detalle); // Asegúrate de manejar la actualización correctamente
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    // Más endpoints según se requieran
}


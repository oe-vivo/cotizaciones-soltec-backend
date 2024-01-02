package controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import model.Precio;
import services.PrecioService;
@RestController
@RequestMapping("/api/precios")
public class PrecioController {

    @Autowired
    private PrecioService precioService;

    @GetMapping
    public List<Precio> getAllPrecios() {
        return precioService.findAll();
    }

    @GetMapping("/{id}")
    public Precio getPrecioById(@PathVariable Long id) {
        return precioService.findById(id).orElse(null);
    }

    @PostMapping
    public Precio createPrecio(@RequestBody Precio precio) {
        return precioService.save(precio);
    }

    @PutMapping("/{id}")
    public Precio updatePrecio(@PathVariable Long id, @RequestBody Precio precio) {
        // Aquí puedes agregar lógica para actualizar un precio existente
        return precioService.save(precio);
    }

    @DeleteMapping("/{id}")
    public void deletePrecio(@PathVariable Long id) {
        precioService.delete(id);
    }

    // Puedes agregar más métodos según lo necesites
}

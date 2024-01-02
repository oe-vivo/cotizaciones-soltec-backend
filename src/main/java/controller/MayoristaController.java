package controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import model.Mayorista;
import services.MayoristaService;

@RestController
@RequestMapping("/api/mayoristas")
public class MayoristaController {

    @Autowired
    private MayoristaService mayoristaService;

    @GetMapping
    public List<Mayorista> getAllMayoristas() {
        return mayoristaService.findAll();
    }

    @GetMapping("/{id}")
    public Mayorista getMayoristaById(@PathVariable Long id) {
        return mayoristaService.findById(id).orElse(null);
    }

    @PostMapping
    public Mayorista createMayorista(@RequestBody Mayorista mayorista) {
        return mayoristaService.save(mayorista);
    }

    @PutMapping("/{id}")
    public Mayorista updateMayorista(@PathVariable Long id, @RequestBody Mayorista mayorista) {
        // Aquí puedes agregar lógica para actualizar un mayorista existente
        return mayoristaService.save(mayorista);
    }

    @DeleteMapping("/{id}")
    public void deleteMayorista(@PathVariable Long id) {
        mayoristaService.delete(id);
    }

    // Puedes agregar más métodos según lo necesites
}

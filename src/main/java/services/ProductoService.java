package services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import repository.ProductoRepository;
import model.Producto;
@Service
public class ProductoService {

    @Autowired
    private ProductoRepository repository;

    public List<Producto> findAll() {
        return repository.findAll();
    }

    public Optional<Producto> findById(Long id) {
        return repository.findById(id);
    }

    public Producto save(Producto producto) {
        return repository.save(producto);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    // Más métodos según se requieran
}


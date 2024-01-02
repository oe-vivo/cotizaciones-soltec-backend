package services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import model.Precio;
import repository.PrecioRepository;

@Service
public class PrecioService {

    @Autowired
    private PrecioRepository precioRepository;

    public List<Precio> findAll() {
        return precioRepository.findAll();
    }

    public Optional<Precio> findById(Long id) {
        return precioRepository.findById(id);
    }

    public Precio save(Precio precio) {
        return precioRepository.save(precio);
    }

    public void delete(Long id) {
        precioRepository.deleteById(id);
    }

    // Aquí puedes añadir más métodos según lo necesites
}


package services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import model.DetalleCotizacion;
import repository.DetalleCotizacionRepository;
@Service
public class DetalleCotizacionService {

    @Autowired
    private DetalleCotizacionRepository repository;

    public List<DetalleCotizacion> findAll() {
        return repository.findAll();
    }

    public Optional<DetalleCotizacion> findById(Long id) {
        return repository.findById(id);
    }

    public DetalleCotizacion save(DetalleCotizacion detalle) {
        return repository.save(detalle);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    // Más métodos según se requieran
}


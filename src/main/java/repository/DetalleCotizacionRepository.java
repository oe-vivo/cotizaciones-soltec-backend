package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.DetalleCotizacion;

public interface DetalleCotizacionRepository extends JpaRepository<DetalleCotizacion, Long> {
    // Métodos personalizados si se requieren
}


package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Cotizacion;

public interface CotizacionRepository extends JpaRepository<Cotizacion, Long> {
    // Aquí puedes añadir métodos personalizados si lo necesitas
}


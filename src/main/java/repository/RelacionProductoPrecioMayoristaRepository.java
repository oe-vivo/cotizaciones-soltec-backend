package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.RelacionProductoPrecioMayorista;

public interface RelacionProductoPrecioMayoristaRepository extends JpaRepository<RelacionProductoPrecioMayorista, Long> {
    // Métodos personalizados si se requieren
}


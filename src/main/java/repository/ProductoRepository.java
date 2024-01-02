package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Métodos personalizados si se requieren
}


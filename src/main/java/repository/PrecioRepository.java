package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Precio;

public interface PrecioRepository extends JpaRepository<Precio, Long> {
    // Aquí puedes añadir métodos personalizados si lo necesitas
}

package repository;

import model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Aquí puedes añadir métodos personalizados si lo necesitas
}
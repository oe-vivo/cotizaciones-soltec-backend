package com.soltec.cotizacionesAPI.services;

import com.soltec.cotizacionesAPI.model.Proveedor;
import com.soltec.cotizacionesAPI.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorService {

    private final ProveedorRepository proveedorRepository;

    @Autowired
    public ProveedorService(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    public Proveedor saveProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    public Optional<Proveedor> getProveedorById(Long id) {
        return proveedorRepository.findById(id);
    }

    public List<Proveedor> getAllProveedores() {
        return proveedorRepository.findAll();
    }

    public void deleteProveedor(Long id) {
        proveedorRepository.deleteById(id);
    }

    // Puedes añadir más métodos según la lógica de negocio.
}

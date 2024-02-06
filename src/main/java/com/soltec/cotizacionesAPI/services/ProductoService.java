package com.soltec.cotizacionesAPI.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import com.soltec.cotizacionesAPI.repository.ProductoRepository;
import com.soltec.cotizacionesAPI.model.Producto;
@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Optional<Producto> getProductoById(Long id) {
        return productoRepository.findById(id);
    }

    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    public void deleteProducto(Long id) {
        productoRepository.deleteById(id);
    }

    // Puedes añadir más métodos según la lógica de negocio.
}
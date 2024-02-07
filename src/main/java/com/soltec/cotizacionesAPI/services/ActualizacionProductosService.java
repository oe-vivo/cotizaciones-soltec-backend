package com.soltec.cotizacionesAPI.services;

import com.soltec.cotizacionesAPI.model.Producto;
import com.soltec.cotizacionesAPI.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActualizacionProductosService {

    private final ProductoRepository productoRepository;
    private final SyscommApiService syscommApiService;

    private final CtApiService ctApiService;

    @Autowired
    public ActualizacionProductosService(ProductoRepository productoRepository, SyscommApiService syscommApiService, CtApiService ctApiService) {
        this.productoRepository = productoRepository;
        this.syscommApiService = syscommApiService;
        this.ctApiService = ctApiService;
    }


    public void actualizarProductos() {
        Producto[] productosSyscomm = syscommApiService.obtenerProductos();
        Producto [] productosCt = ctApiService.obtenerProductos();
        for (Producto producto : productosSyscomm) {
            // Aquí implementa la lógica para actualizar tu base de datos
            // Esto puede incluir verificar si el producto ya existe y actualizarlo,
            // o insertar un nuevo producto si no existe.
        }
    }
}


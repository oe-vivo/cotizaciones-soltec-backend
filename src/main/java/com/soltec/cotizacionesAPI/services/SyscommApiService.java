package com.soltec.cotizacionesAPI.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.soltec.cotizacionesAPI.model.Producto;
@Service
public class SyscommApiService {

    private final RestTemplate restTemplate;
    private final String apiBaseUrl = "https://api.proveedor.com";

    public SyscommApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Producto[] obtenerProductos() {
        String url = apiBaseUrl + "/productos";
        return restTemplate.getForObject(url, Producto[].class);
    }

    // Puedes añadir más métodos para otros endpoints de la API.
}

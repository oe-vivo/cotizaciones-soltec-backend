package com.soltec.cotizacionesAPI.services;

import com.soltec.cotizacionesAPI.model.Producto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CtApiService {

    private final RestTemplate restTemplate;
    private final String apiBaseUrl = "https://api.proveedor.com";

    public CtApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Producto[] obtenerProductos() {
        String url = apiBaseUrl + "/productos";
        return restTemplate.getForObject(url, Producto[].class);
    }

    // Puedes añadir más métodos para otros endpoints de la API.

}

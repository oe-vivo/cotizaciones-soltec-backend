package com.soltec.cotizacionesAPI.model;

import jakarta.persistence.*;

@Entity
@Table(name = "producto_precio_proveedor")
public class RelacionProductoPrecioProveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "proveedor_id")
    private Proveedor proveedor;

    @ManyToOne
    @JoinColumn(name = "precio_id")
    private Precio precio;

    // Getters y setters...

    // El resto de tu código sigue igual, solo cambia los getters y setters de proveedor.
}

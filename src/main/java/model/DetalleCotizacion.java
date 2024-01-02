package model;

import jakarta.persistence.*;

@Entity
@Table(name = "detalle_cotizacion")
public class DetalleCotizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detalleId;

    @ManyToOne
    @JoinColumn(name = "cotizacion_id")
    private Cotizacion cotizacion;

    @ManyToOne
    @JoinColumn(name = "producto_mayorista_precio_id")
    private RelacionProductoPrecioMayorista productoMayoristaPrecio;

    // Otros campos como cantidad, precio unitario, etc.
    @Column(nullable = false)
    private int cantidad;

    @Column(nullable = false)
    private float precioUnitario;

    @Column(nullable = false)
    private float subTotal;

    // Getters y setters...

    public Long getDetalleId() {
        return detalleId;
    }

    public void setDetalleId(Long detalleId) {
        this.detalleId = detalleId;
    }

    public Cotizacion getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Cotizacion cotizacion) {
        this.cotizacion = cotizacion;
    }

    public RelacionProductoPrecioMayorista getProductoMayoristaPrecio() {
        return productoMayoristaPrecio;
    }

    public void setProductoMayoristaPrecio(RelacionProductoPrecioMayorista productoMayoristaPrecio) {
        this.productoMayoristaPrecio = productoMayoristaPrecio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }
}

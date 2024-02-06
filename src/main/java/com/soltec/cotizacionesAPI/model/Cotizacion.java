package com.soltec.cotizacionesAPI.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "cotizacion")
public class Cotizacion {

    public Cotizacion(){
        prePersist();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cotizacionId;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    // Otros campos como fecha, vigencia, etc.
    @Column (nullable = false,updatable = false)
    private LocalDateTime fechaVigencia;

    @Column(nullable = false)
    private int diasCredito;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false)
    private String formaPago;

    @Column(nullable = false, updatable = false)
    private LocalDateTime fechaCreacion;

    @Column(nullable = false)
    private LocalDateTime fechaActualizacion;


    @PrePersist
    public void prePersist() {
        fechaCreacion = fechaActualizacion = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        fechaActualizacion = LocalDateTime.now();
    }

    // Getters y setters...




    public Long getCotizacionId() {
        return cotizacionId;
    }

    public void setCotizacionId(Long cotizacionId) {
        this.cotizacionId = cotizacionId;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(LocalDateTime fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public int getDiasCredito() {
        return diasCredito;
    }

    public void setDiasCredito(int diasCredito) {
        this.diasCredito = diasCredito;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
}

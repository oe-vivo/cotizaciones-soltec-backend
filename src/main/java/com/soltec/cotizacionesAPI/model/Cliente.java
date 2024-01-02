package com.soltec.cotizacionesAPI.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteId;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String rfc;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private String numExt;

    @Column(nullable = false)
    private String numInt;

    @Column(nullable = false)
    private String colonia;

    @Column(nullable = false)
    private String municipio;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false, unique = true)
    private String constanciaFiscal;

    @Column(nullable = false, unique = true)
    private String actaConstitucional;
    // Otros campos...

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


    public Cliente(){

    }
    public Cliente(String nombre, String email, String rfc, String direccion, String numExt, String numInt, String colonia, String municipio, String estado, String constanciaFiscal, String actaConstitucional) {
        this.nombre = nombre;
        this.email = email;
        this.rfc = rfc;
        this.direccion = direccion;
        this.numExt = numExt;
        this.numInt = numInt;
        this.colonia = colonia;
        this.municipio = municipio;
        this.estado = estado;
        this.constanciaFiscal = constanciaFiscal;
        this.actaConstitucional = actaConstitucional;
        prePersist();
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumExt() {
        return numExt;
    }

    public void setNumExt(String numExt) {
        this.numExt = numExt;
    }

    public String getNumInt() {
        return numInt;
    }

    public void setNumInt(String numInt) {
        this.numInt = numInt;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getConstanciaFiscal() {
        return constanciaFiscal;
    }

    public void setConstanciaFiscal(String constanciaFiscal) {
        this.constanciaFiscal = constanciaFiscal;
    }

    public String getActaConstitucional() {
        return actaConstitucional;
    }

    public void setActaConstitucional(String actaConstitucional) {
        this.actaConstitucional = actaConstitucional;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}

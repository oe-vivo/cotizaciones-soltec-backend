package com.soltec.cotizacionesAPI.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "proveedor")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "datos_fiscales_id", referencedColumnName = "idDatosFiscales")
    private DatosFiscales datosFiscales;

    @Column
    private String telefono;
    @Column
    private String correoElectronico;

    @Column
    private LocalDateTime fechaActualizacion;
    @Column
    private LocalDateTime fechaCreacion;

    public Proveedor(){
        datosFiscales=new DatosFiscales();
        prePersist();
    }
    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DatosFiscales getDatosFiscales() {
        return datosFiscales;
    }

    public void setDatosFiscales(DatosFiscales datosFiscales) {
        this.datosFiscales = datosFiscales;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @PrePersist
    public void prePersist() {
         fechaCreacion = fechaActualizacion = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        fechaActualizacion = LocalDateTime.now();
    }
}

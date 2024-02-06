package com.soltec.cotizacionesAPI.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "mayorista")
public class Mayorista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mayoristaId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "datos_fiscales_id", referencedColumnName = "idDatosFiscales")
    private DatosFiscales datosFiscales;

    @Column(nullable = false, updatable = false)
    private LocalDateTime fechaCreacion;

    @Column(nullable = false)
    private LocalDateTime fechaActualizacion;

    public Mayorista() {
        prePersist();
        datosFiscales=new DatosFiscales();
    }

    @PrePersist    public void prePersist() {
        fechaCreacion = fechaActualizacion = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        fechaActualizacion = LocalDateTime.now();
    }

    // Getters y setters...


    public Long getMayoristaId() {
        return mayoristaId;
    }

    public void setMayoristaId(Long mayoristaId) {
        this.mayoristaId = mayoristaId;
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

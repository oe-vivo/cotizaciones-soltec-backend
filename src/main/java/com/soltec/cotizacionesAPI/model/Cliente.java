package com.soltec.cotizacionesAPI.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "datos_fiscales_id", referencedColumnName = "idDatosFiscales")
    private DatosFiscales datosFiscales;

    @ElementCollection
    @CollectionTable(name = "cliente_telefonos", joinColumns = @JoinColumn(name = "cliente_id"))
    @Column(name = "telefono")
    private Set<String> telefonos;

    @ElementCollection
    @CollectionTable(name = "cliente_emails", joinColumns = @JoinColumn(name = "cliente_id"))
    @Column(name = "email")
    private Set<String> correosElectronicos;


    @Column
    private LocalDateTime fechaActualizacion;
    @Column
    private LocalDateTime fechaCreacion;

    public Cliente(){
        datosFiscales=new DatosFiscales();
        correosElectronicos=new HashSet<>();
        telefonos=new HashSet<>();
        prePersist();
    }
    // Getters y setters...

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public DatosFiscales getDatosFiscales() {
        return datosFiscales;
    }

    public void setDatosFiscales(DatosFiscales datosFiscales) {
        this.datosFiscales = datosFiscales;
    }

    public Set<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(Set<String> telefonos) {
        this.telefonos = telefonos;
    }

    public Set<String> getCorreosElectronicos() {
        return correosElectronicos;
    }

    public void setCorreosElectronicos(Set<String> correosElectronicos) {
        this.correosElectronicos = correosElectronicos;
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

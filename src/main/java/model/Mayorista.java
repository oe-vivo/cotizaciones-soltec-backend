package model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "mayorista")
public class Mayorista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mayoristaId;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String rfc;

    @Column(nullable = false)
    private String constanciaFiscal;

    @Column(nullable = false)
    private boolean credito;

    @Column(nullable = false)
    private float montoCredito;

    @Column(nullable = false)
    private String estado;
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


    public Mayorista(String nombre, String email, String rfc, String constanciaFiscal, boolean credito, float montoCredito, String estado) {
        this.nombre = nombre;
        this.email = email;
        this.rfc = rfc;
        this.constanciaFiscal = constanciaFiscal;
        this.credito = credito;
        this.montoCredito = montoCredito;
        this.estado = estado;
        prePersist();
    }

    public Long getMayoristaId() {
        return mayoristaId;
    }

    public void setMayoristaId(Long mayoristaId) {
        this.mayoristaId = mayoristaId;
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

    public String getConstanciaFiscal() {
        return constanciaFiscal;
    }

    public void setConstanciaFiscal(String constanciaFiscal) {
        this.constanciaFiscal = constanciaFiscal;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    public float getMontoCredito() {
        return montoCredito;
    }

    public void setMontoCredito(float montoCredito) {
        this.montoCredito = montoCredito;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

package com.soltec.cotizacionesAPI.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "datos_fiscales")
public class DatosFiscales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDatosFiscales;

    @Column
    private String rfc;

    @Column
    private String razonSocial;

    @Column
    private String nombreComercial;

    @Column
    private String direccion;

    @Column
    private String numExt;

    @Column
    private String numInt;

    @Column
    private String colonia;

    @Column
    private String codigoPostal;

    @Column
    private String ciudad;

    @Column
    private String estado;

    @Column
    private String pais;

    @Column
    private String tipoSociedad;

    @Column
    private boolean personaMoral;

    @Column
    private String curp;

    @Column
    private boolean iva; //True= 16%, False= 8%


    @Column
    private LocalDateTime fechaActualizacion;
    @Column
    private LocalDateTime fechaCreacion;

    public DatosFiscales(){
        rfc=null;
        razonSocial=null;
        nombreComercial=null;
        direccion=null;
        numExt=null;
        numInt=null;
        colonia=null;
        codigoPostal=null;
        ciudad=null;
        estado=null;
        pais=null;
        tipoSociedad=null;
        personaMoral=false;
        curp=null;
        iva=false;
        prePersist();
    }

    public long getIdDatosFiscales(){
        return idDatosFiscales;
    }
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
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

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTipoSociedad() {
        return tipoSociedad;
    }

    public void setTipoSociedad(String tipoSociedad) {
        this.tipoSociedad = tipoSociedad;
    }

    public boolean isPersonaMoral() {
        return personaMoral;
    }

    public void setPersonaMoral(boolean personaMoral) {
        this.personaMoral = personaMoral;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public boolean isIva() {
        return iva;
    }

    public void setIva(boolean iva) {
        this.iva = iva;
    }

    public void setId(Long id) {
        this.idDatosFiscales = id;
    }

    public Long getId() {
        return idDatosFiscales;
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

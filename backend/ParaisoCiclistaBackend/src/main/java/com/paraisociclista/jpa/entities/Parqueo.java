/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paraisociclista.jpa.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bratc
 */
@Entity
@Table(name = "parqueo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parqueo.findAll", query = "SELECT p FROM Parqueo p")
    , @NamedQuery(name = "Parqueo.findByCodigoFicha", query = "SELECT p FROM Parqueo p WHERE p.codigoFicha = :codigoFicha")
    , @NamedQuery(name = "Parqueo.findByHoras", query = "SELECT p FROM Parqueo p WHERE p.horas = :horas")
    , @NamedQuery(name = "Parqueo.findByPrecio", query = "SELECT p FROM Parqueo p WHERE p.precio = :precio")
    , @NamedQuery(name = "Parqueo.findByFecha", query = "SELECT p FROM Parqueo p WHERE p.fecha = :fecha")})
public class Parqueo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "codigoFicha")
    private String codigoFicha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horas")
    private int horas;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private BigDecimal precio;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "idCliente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cliente idCliente;
    @JoinColumn(name = "matricula", referencedColumnName = "matricula")
    @ManyToOne(optional = false)
    private Bicicleta matricula;

    public Parqueo() {
    }

    public Parqueo(String codigoFicha) {
        this.codigoFicha = codigoFicha;
    }

    public Parqueo(String codigoFicha, int horas) {
        this.codigoFicha = codigoFicha;
        this.horas = horas;
    }

    public String getCodigoFicha() {
        return codigoFicha;
    }

    public void setCodigoFicha(String codigoFicha) {
        this.codigoFicha = codigoFicha;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Bicicleta getMatricula() {
        return matricula;
    }

    public void setMatricula(Bicicleta matricula) {
        this.matricula = matricula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoFicha != null ? codigoFicha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parqueo)) {
            return false;
        }
        Parqueo other = (Parqueo) object;
        if ((this.codigoFicha == null && other.codigoFicha != null) || (this.codigoFicha != null && !this.codigoFicha.equals(other.codigoFicha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paraisociclista.jpa.entities.Parqueo[ codigoFicha=" + codigoFicha + " ]";
    }
    
}

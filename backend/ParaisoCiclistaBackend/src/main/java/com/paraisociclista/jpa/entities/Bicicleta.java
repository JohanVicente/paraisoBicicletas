/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paraisociclista.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author bratc
 */
@Entity
@Table(name = "bicicleta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bicicleta.findAll", query = "SELECT b FROM Bicicleta b")
    , @NamedQuery(name = "Bicicleta.findByMatricula", query = "SELECT b FROM Bicicleta b WHERE b.matricula = :matricula")
    , @NamedQuery(name = "Bicicleta.findByModelo", query = "SELECT b FROM Bicicleta b WHERE b.modelo = :modelo")})
public class Bicicleta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "matricula")
    private String matricula;
    @Size(max = 45)
    @Column(name = "modelo")
    private String modelo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "matricula")
    private List<Parqueo> parqueoList;
    @JoinColumn(name = "idMarca", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Marca idMarca;

    public Bicicleta() {
    }

    public Bicicleta(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @XmlTransient
    public List<Parqueo> getParqueoList() {
        return parqueoList;
    }

    public void setParqueoList(List<Parqueo> parqueoList) {
        this.parqueoList = parqueoList;
    }

    public Marca getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Marca idMarca) {
        this.idMarca = idMarca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matricula != null ? matricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bicicleta)) {
            return false;
        }
        Bicicleta other = (Bicicleta) object;
        if ((this.matricula == null && other.matricula != null) || (this.matricula != null && !this.matricula.equals(other.matricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paraisociclista.jpa.entities.Bicicleta[ matricula=" + matricula + " ]";
    }
    
}

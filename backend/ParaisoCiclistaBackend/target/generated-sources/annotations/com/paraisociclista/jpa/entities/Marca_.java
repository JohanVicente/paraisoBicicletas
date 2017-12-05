package com.paraisociclista.jpa.entities;

import com.paraisociclista.jpa.entities.Bicicleta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-28T19:58:00")
@StaticMetamodel(Marca.class)
public class Marca_ { 

    public static volatile ListAttribute<Marca, Bicicleta> bicicletaList;
    public static volatile SingularAttribute<Marca, Integer> id;
    public static volatile SingularAttribute<Marca, String> nombre;

}
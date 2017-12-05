package com.paraisociclista.jpa.entities;

import com.paraisociclista.jpa.entities.Bicicleta;
import com.paraisociclista.jpa.entities.Cliente;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-28T19:58:00")
@StaticMetamodel(Parqueo.class)
public class Parqueo_ { 

    public static volatile SingularAttribute<Parqueo, Integer> horas;
    public static volatile SingularAttribute<Parqueo, Date> fecha;
    public static volatile SingularAttribute<Parqueo, BigDecimal> precio;
    public static volatile SingularAttribute<Parqueo, Cliente> idCliente;
    public static volatile SingularAttribute<Parqueo, String> codigoFicha;
    public static volatile SingularAttribute<Parqueo, Bicicleta> matricula;

}
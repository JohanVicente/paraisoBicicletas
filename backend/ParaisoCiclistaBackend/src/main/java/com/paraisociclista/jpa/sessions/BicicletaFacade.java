/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paraisociclista.jpa.sessions;

import com.paraisociclista.jpa.entities.Bicicleta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author bratc
 */
@Stateless
public class BicicletaFacade extends AbstractFacade<Bicicleta> {

    @PersistenceContext(unitName = "ParaisoCiclista_ParaisoCiclista_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BicicletaFacade() {
        super(Bicicleta.class);
    }
    
}

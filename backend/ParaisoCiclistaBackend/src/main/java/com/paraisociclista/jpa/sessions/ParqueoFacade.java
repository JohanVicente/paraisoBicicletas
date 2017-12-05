/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paraisociclista.jpa.sessions;

import com.paraisociclista.jpa.entities.Parqueo;
import com.paraisociclista.jpa.entities.Parqueo_;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author bratc
 */
@Stateless
public class ParqueoFacade extends AbstractFacade<Parqueo> {

    @PersistenceContext(unitName = "ParaisoCiclista_ParaisoCiclista_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParqueoFacade() {
        super(Parqueo.class);
    }

    public Parqueo findByCodigoFicha(String codigo) {
         CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Parqueo> cq = cb.createQuery(Parqueo.class);
        Root<Parqueo> ciudad = cq.from(Parqueo.class);
        
        Predicate restrictions = cb.conjunction();
        
       
        
        if(codigo != null){
            restrictions = cb.and(restrictions, cb.like(ciudad.get(Parqueo_.codigoFicha), codigo));
        }
        
        cq.where(restrictions);
        cq.orderBy(cb.asc(ciudad.get(Parqueo_.codigoFicha)));
        TypedQuery<Parqueo> q = em.createQuery(cq);
        try {
            return q.setMaxResults(10).getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }
    
}

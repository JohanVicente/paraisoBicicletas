/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paraisociclista.rest.services;

import com.paraisociclista.jpa.entities.Parqueo;
import com.paraisociclista.jpa.sessions.ParqueoFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author bratc
 */
@Stateless
@Path("parqueo")
public class ParqueoFacadeREST  {
    
    @EJB
    ParqueoFacade ejbParqueo;

    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Parqueo entity) {
        ejbParqueo.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") String id, Parqueo entity) {
        ejbParqueo.edit(entity);
    }

   

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Parqueo find(@PathParam("id") String id) {
      return ejbParqueo.find(id);
    }
    
    @GET
    @Path("find")
    @Produces(MediaType.APPLICATION_JSON)
    public Parqueo findByCodigoFicha(@QueryParam("codigo") String codigo) {
        return ejbParqueo.findByCodigoFicha(codigo);
    }

    @GET
   
    @Produces(MediaType.APPLICATION_JSON)
    public List<Parqueo> findAll() {
        return ejbParqueo.findAll();
    }

   
    
}

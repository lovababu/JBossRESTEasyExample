package org.avol.resteasy.client;

import org.avol.resteasy.jaxb.Project;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Lovababu on 9/5/2015.
 */
public interface ProjectServiceClientIface {

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    Response create(Project project);

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.TEXT_PLAIN)
    Response get(@PathParam("id") int id);
}

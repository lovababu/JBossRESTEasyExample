package org.avol.resteasy.service.impl;

import org.avol.resteasy.dto.ProjectDTO;
import org.avol.resteasy.entities.ProjectEntity;
import org.avol.resteasy.jaxb.Project;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lovababu on 9/6/2015.
 */
@Path("/project")
@Produces(MediaType.APPLICATION_XML)
public class ProjectServiceImpl {
    private static Map<Integer, ProjectEntity> projectStore = new HashMap();

    public ProjectServiceImpl() {
    }

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_XML)
    public Response create(Project project) throws InvocationTargetException, IllegalAccessException {
        projectStore.put(project.getId(), ProjectDTO.projectEntity(project));
        return Response.status(Response.Status.CREATED)
                .entity("Request processed successfully").build();
    }

    @GET
    @Path("/{id}")
    public Response get(@PathParam("id") int id) throws InvocationTargetException, IllegalAccessException {
        Project project = ProjectDTO.project((ProjectEntity)projectStore.get(Integer.valueOf(id)));
        return project != null ? Response.status(Response.Status.OK).entity(project).build() :
                Response.status(Response.Status.NOT_FOUND).entity("Supplied id not matched with any record.").build();
    }

    static {
        ProjectEntity projectEntity = new ProjectEntity();
        projectEntity.setId(Integer.valueOf(1));
        projectEntity.setName("DummyProjct");
        projectEntity.setTechnology("java");
        projectEntity.setTeamSize(10);
        projectStore.put(Integer.valueOf(1), projectEntity);
    }
}

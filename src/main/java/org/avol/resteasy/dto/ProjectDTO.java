package org.avol.resteasy.dto;

import org.apache.commons.beanutils.BeanUtils;
import org.avol.resteasy.entities.ProjectEntity;
import org.avol.resteasy.jaxb.Project;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Lovababu on 9/6/2015.
 */
public class ProjectDTO {

    public ProjectDTO() {
    }

    public static ProjectEntity projectEntity(Project project) throws InvocationTargetException, IllegalAccessException {
        if(project == null) {
            return null;
        } else {
            ProjectEntity projectEntity = new ProjectEntity();
            BeanUtils.copyProperties(projectEntity, project);
            return projectEntity;
        }
    }

    public static Project project(ProjectEntity projectEntity) throws InvocationTargetException, IllegalAccessException {
        if(projectEntity == null) {
            return null;
        } else {
            Project project = new Project();
            BeanUtils.copyProperties(project, projectEntity);
            return project;
        }
    }
}

package org.avol.resteasy.entities;

/**
 * Created by Lovababu on 9/6/2015.
 */
public class ProjectEntity {

    private String name;
    private String technology;
    private int teamSize;
    private Integer id;

    public ProjectEntity() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechnology() {
        return this.technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getTeamSize() {
        return this.teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables.pojos;

import com.epam.ta.reportportal.jooq.enums.ProjectRoleEnum;

import javax.annotation.Generated;
import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProjectUser implements Serializable {

    private static final long serialVersionUID = 2096031176;

    private Integer         userId;
    private Integer         projectId;
    private ProjectRoleEnum projectRole;

    public ProjectUser() {}

    public ProjectUser(ProjectUser value) {
        this.userId = value.userId;
        this.projectId = value.projectId;
        this.projectRole = value.projectRole;
    }

    public ProjectUser(
        Integer         userId,
        Integer         projectId,
        ProjectRoleEnum projectRole
    ) {
        this.userId = userId;
        this.projectId = projectId;
        this.projectRole = projectRole;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProjectId() {
        return this.projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public ProjectRoleEnum getProjectRole() {
        return this.projectRole;
    }

    public void setProjectRole(ProjectRoleEnum projectRole) {
        this.projectRole = projectRole;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProjectUser (");

        sb.append(userId);
        sb.append(", ").append(projectId);
        sb.append(", ").append(projectRole);

        sb.append(")");
        return sb.toString();
    }
}
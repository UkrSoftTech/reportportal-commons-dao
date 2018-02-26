/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables.pojos;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.Arrays;


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
public class DefectFormField implements Serializable {

    private static final long serialVersionUID = 2020070179;

    private Integer  id;
    private Integer  bugtrackingSystem;
    private String   fieldId;
    private String   type;
    private Boolean  required;
    private String[] values;

    public DefectFormField() {}

    public DefectFormField(DefectFormField value) {
        this.id = value.id;
        this.bugtrackingSystem = value.bugtrackingSystem;
        this.fieldId = value.fieldId;
        this.type = value.type;
        this.required = value.required;
        this.values = value.values;
    }

    public DefectFormField(
        Integer  id,
        Integer  bugtrackingSystem,
        String   fieldId,
        String   type,
        Boolean  required,
        String[] values
    ) {
        this.id = id;
        this.bugtrackingSystem = bugtrackingSystem;
        this.fieldId = fieldId;
        this.type = type;
        this.required = required;
        this.values = values;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBugtrackingSystem() {
        return this.bugtrackingSystem;
    }

    public void setBugtrackingSystem(Integer bugtrackingSystem) {
        this.bugtrackingSystem = bugtrackingSystem;
    }

    public String getFieldId() {
        return this.fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getRequired() {
        return this.required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public String[] getValues() {
        return this.values;
    }

    public void setValues(String... values) {
        this.values = values;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DefectFormField (");

        sb.append(id);
        sb.append(", ").append(bugtrackingSystem);
        sb.append(", ").append(fieldId);
        sb.append(", ").append(type);
        sb.append(", ").append(required);
        sb.append(", ").append(Arrays.toString(values));

        sb.append(")");
        return sb.toString();
    }
}
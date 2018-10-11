/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.enums.JActivityEntityEnum;
import com.epam.ta.reportportal.jooq.tables.JActivity;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JActivityRecord extends UpdatableRecordImpl<JActivityRecord> implements Record7<Long, Long, Long, JActivityEntityEnum, String, Object, Timestamp> {

    private static final long serialVersionUID = -1903988592;

    /**
     * Setter for <code>public.activity.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.activity.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.activity.user_id</code>.
     */
    public void setUserId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.activity.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.activity.project_id</code>.
     */
    public void setProjectId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.activity.project_id</code>.
     */
    public Long getProjectId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.activity.entity</code>.
     */
    public void setEntity(JActivityEntityEnum value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.activity.entity</code>.
     */
    public JActivityEntityEnum getEntity() {
        return (JActivityEntityEnum) get(3);
    }

    /**
     * Setter for <code>public.activity.action</code>.
     */
    public void setAction(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.activity.action</code>.
     */
    public String getAction() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.activity.details</code>.
     */
    public void setDetails(Object value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.activity.details</code>.
     */
    public Object getDetails() {
        return get(5);
    }

    /**
     * Setter for <code>public.activity.creation_date</code>.
     */
    public void setCreationDate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.activity.creation_date</code>.
     */
    public Timestamp getCreationDate() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, Long, JActivityEntityEnum, String, Object, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, Long, JActivityEntityEnum, String, Object, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JActivity.ACTIVITY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return JActivity.ACTIVITY.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return JActivity.ACTIVITY.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JActivityEntityEnum> field4() {
        return JActivity.ACTIVITY.ENTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return JActivity.ACTIVITY.ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field6() {
        return JActivity.ACTIVITY.DETAILS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return JActivity.ACTIVITY.CREATION_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityEntityEnum component4() {
        return getEntity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object component6() {
        return getDetails();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityEntityEnum value4() {
        return getEntity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value6() {
        return getDetails();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value2(Long value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value3(Long value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value4(JActivityEntityEnum value) {
        setEntity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value5(String value) {
        setAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value6(Object value) {
        setDetails(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord value7(Timestamp value) {
        setCreationDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JActivityRecord values(Long value1, Long value2, Long value3, JActivityEntityEnum value4, String value5, Object value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JActivityRecord
     */
    public JActivityRecord() {
        super(JActivity.ACTIVITY);
    }

    /**
     * Create a detached, initialised JActivityRecord
     */
    public JActivityRecord(Long id, Long userId, Long projectId, JActivityEntityEnum entity, String action, Object details, Timestamp creationDate) {
        super(JActivity.ACTIVITY);

        set(0, id);
        set(1, userId);
        set(2, projectId);
        set(3, entity);
        set(4, action);
        set(5, details);
        set(6, creationDate);
    }
}

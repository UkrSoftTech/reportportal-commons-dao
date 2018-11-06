/*
 *  Copyright (C) 2018 EPAM Systems
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;


import com.epam.ta.reportportal.jooq.enums.JLaunchModeEnum;
import com.epam.ta.reportportal.jooq.enums.JStatusEnum;
import com.epam.ta.reportportal.jooq.tables.JLaunch;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


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
public class JLaunchRecord extends UpdatableRecordImpl<JLaunchRecord> implements Record12<Long, String, Long, Long, String, String, Timestamp, Timestamp, Integer, Timestamp, JLaunchModeEnum, JStatusEnum> {

    private static final long serialVersionUID = 1176844186;

    /**
     * Setter for <code>public.launch.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.launch.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.launch.uuid</code>.
     */
    public void setUuid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.launch.uuid</code>.
     */
    public String getUuid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.launch.project_id</code>.
     */
    public void setProjectId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.launch.project_id</code>.
     */
    public Long getProjectId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.launch.user_id</code>.
     */
    public void setUserId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.launch.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.launch.name</code>.
     */
    public void setName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.launch.name</code>.
     */
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.launch.description</code>.
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.launch.description</code>.
     */
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.launch.start_time</code>.
     */
    public void setStartTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.launch.start_time</code>.
     */
    public Timestamp getStartTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>public.launch.end_time</code>.
     */
    public void setEndTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.launch.end_time</code>.
     */
    public Timestamp getEndTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>public.launch.number</code>.
     */
    public void setNumber(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.launch.number</code>.
     */
    public Integer getNumber() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.launch.last_modified</code>.
     */
    public void setLastModified(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.launch.last_modified</code>.
     */
    public Timestamp getLastModified() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>public.launch.mode</code>.
     */
    public void setMode(JLaunchModeEnum value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.launch.mode</code>.
     */
    public JLaunchModeEnum getMode() {
        return (JLaunchModeEnum) get(10);
    }

    /**
     * Setter for <code>public.launch.status</code>.
     */
    public void setStatus(JStatusEnum value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.launch.status</code>.
     */
    public JStatusEnum getStatus() {
        return (JStatusEnum) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, Long, Long, String, String, Timestamp, Timestamp, Integer, Timestamp, JLaunchModeEnum, JStatusEnum> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, Long, Long, String, String, Timestamp, Timestamp, Integer, Timestamp, JLaunchModeEnum, JStatusEnum> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JLaunch.LAUNCH.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return JLaunch.LAUNCH.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return JLaunch.LAUNCH.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return JLaunch.LAUNCH.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return JLaunch.LAUNCH.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return JLaunch.LAUNCH.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return JLaunch.LAUNCH.START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return JLaunch.LAUNCH.END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return JLaunch.LAUNCH.NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return JLaunch.LAUNCH.LAST_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JLaunchModeEnum> field11() {
        return JLaunch.LAUNCH.MODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JStatusEnum> field12() {
        return JLaunch.LAUNCH.STATUS;
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
    public String component2() {
        return getUuid();
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
    public Long component4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getLastModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLaunchModeEnum component11() {
        return getMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JStatusEnum component12() {
        return getStatus();
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
    public String value2() {
        return getUuid();
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
    public Long value4() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getLastModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLaunchModeEnum value11() {
        return getMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JStatusEnum value12() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLaunchRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLaunchRecord value2(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLaunchRecord value3(Long value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLaunchRecord value4(Long value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLaunchRecord value5(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLaunchRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLaunchRecord value7(Timestamp value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLaunchRecord value8(Timestamp value) {
        setEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLaunchRecord value9(Integer value) {
        setNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLaunchRecord value10(Timestamp value) {
        setLastModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLaunchRecord value11(JLaunchModeEnum value) {
        setMode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLaunchRecord value12(JStatusEnum value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JLaunchRecord values(Long value1, String value2, Long value3, Long value4, String value5, String value6, Timestamp value7, Timestamp value8, Integer value9, Timestamp value10, JLaunchModeEnum value11, JStatusEnum value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JLaunchRecord
     */
    public JLaunchRecord() {
        super(JLaunch.LAUNCH);
    }

    /**
     * Create a detached, initialised JLaunchRecord
     */
    public JLaunchRecord(Long id, String uuid, Long projectId, Long userId, String name, String description, Timestamp startTime, Timestamp endTime, Integer number, Timestamp lastModified, JLaunchModeEnum mode, JStatusEnum status) {
        super(JLaunch.LAUNCH);

        set(0, id);
        set(1, uuid);
        set(2, projectId);
        set(3, userId);
        set(4, name);
        set(5, description);
        set(6, startTime);
        set(7, endTime);
        set(8, number);
        set(9, lastModified);
        set(10, mode);
        set(11, status);
    }
}

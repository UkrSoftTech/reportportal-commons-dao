/*
 * Copyright (C) 2018 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.tables.JShareableEntity;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.11.7" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JShareableEntityRecord extends UpdatableRecordImpl<JShareableEntityRecord> implements Record4<Long, Boolean, String, Long> {

	private static final long serialVersionUID = 1287209404;

	/**
	 * Setter for <code>public.shareable_entity.id</code>.
	 */
	public void setId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.shareable_entity.id</code>.
	 */
	public Long getId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.shareable_entity.shared</code>.
	 */
	public void setShared(Boolean value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.shareable_entity.shared</code>.
	 */
	public Boolean getShared() {
		return (Boolean) get(1);
	}

	/**
	 * Setter for <code>public.shareable_entity.owner</code>.
	 */
	public void setOwner(String value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.shareable_entity.owner</code>.
	 */
	public String getOwner() {
		return (String) get(2);
	}

	/**
	 * Setter for <code>public.shareable_entity.project_id</code>.
	 */
	public void setProjectId(Long value) {
		set(3, value);
	}

	/**
	 * Getter for <code>public.shareable_entity.project_id</code>.
	 */
	public Long getProjectId() {
		return (Long) get(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Long, Boolean, String, Long> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Long, Boolean, String, Long> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JShareableEntity.SHAREABLE_ENTITY.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field2() {
		return JShareableEntity.SHAREABLE_ENTITY.SHARED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return JShareableEntity.SHAREABLE_ENTITY.OWNER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field4() {
		return JShareableEntity.SHAREABLE_ENTITY.PROJECT_ID;
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
	public Boolean component2() {
		return getShared();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component3() {
		return getOwner();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component4() {
		return getProjectId();
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
	public Boolean value2() {
		return getShared();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getOwner();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value4() {
		return getProjectId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JShareableEntityRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JShareableEntityRecord value2(Boolean value) {
		setShared(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JShareableEntityRecord value3(String value) {
		setOwner(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JShareableEntityRecord value4(Long value) {
		setProjectId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JShareableEntityRecord values(Long value1, Boolean value2, String value3, Long value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JShareableEntityRecord
	 */
	public JShareableEntityRecord() {
		super(JShareableEntity.SHAREABLE_ENTITY);
	}

	/**
	 * Create a detached, initialised JShareableEntityRecord
	 */
	public JShareableEntityRecord(Long id, Boolean shared, String owner, Long projectId) {
		super(JShareableEntity.SHAREABLE_ENTITY);

		set(0, id);
		set(1, shared);
		set(2, owner);
		set(3, projectId);
	}
}

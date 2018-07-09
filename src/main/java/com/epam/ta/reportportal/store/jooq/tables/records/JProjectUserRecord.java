/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.records;

import com.epam.ta.reportportal.store.jooq.enums.JProjectRoleEnum;
import com.epam.ta.reportportal.store.jooq.tables.JProjectUser;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JProjectUserRecord extends UpdatableRecordImpl<JProjectUserRecord> implements Record3<Long, Long, JProjectRoleEnum> {

	private static final long serialVersionUID = -1912135931;

	/**
	 * Setter for <code>public.project_user.user_id</code>.
	 */
	public void setUserId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.project_user.user_id</code>.
	 */
	public Long getUserId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.project_user.project_id</code>.
	 */
	public void setProjectId(Long value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.project_user.project_id</code>.
	 */
	public Long getProjectId() {
		return (Long) get(1);
	}

	/**
	 * Setter for <code>public.project_user.project_role</code>.
	 */
	public void setProjectRole(JProjectRoleEnum value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.project_user.project_role</code>.
	 */
	public JProjectRoleEnum getProjectRole() {
		return (JProjectRoleEnum) get(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<Long, Long> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Long, Long, JProjectRoleEnum> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Long, Long, JProjectRoleEnum> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JProjectUser.PROJECT_USER.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return JProjectUser.PROJECT_USER.PROJECT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<JProjectRoleEnum> field3() {
		return JProjectUser.PROJECT_USER.PROJECT_ROLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component1() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component2() {
		return getProjectId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JProjectRoleEnum component3() {
		return getProjectRole();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value2() {
		return getProjectId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JProjectRoleEnum value3() {
		return getProjectRole();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JProjectUserRecord value1(Long value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JProjectUserRecord value2(Long value) {
		setProjectId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JProjectUserRecord value3(JProjectRoleEnum value) {
		setProjectRole(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JProjectUserRecord values(Long value1, Long value2, JProjectRoleEnum value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JProjectUserRecord
	 */
	public JProjectUserRecord() {
		super(JProjectUser.PROJECT_USER);
	}

	/**
	 * Create a detached, initialised JProjectUserRecord
	 */
	public JProjectUserRecord(Long userId, Long projectId, JProjectRoleEnum projectRole) {
		super(JProjectUser.PROJECT_USER);

		set(0, userId);
		set(1, projectId);
		set(2, projectRole);
	}
}

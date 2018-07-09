/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables;

import com.epam.ta.reportportal.store.jooq.Indexes;
import com.epam.ta.reportportal.store.jooq.JPublic;
import com.epam.ta.reportportal.store.jooq.Keys;
import com.epam.ta.reportportal.store.jooq.enums.JLaunchModeEnum;
import com.epam.ta.reportportal.store.jooq.enums.JStatusEnum;
import com.epam.ta.reportportal.store.jooq.tables.records.JLaunchRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JLaunch extends TableImpl<JLaunchRecord> {

	private static final long serialVersionUID = 1527536316;

	/**
	 * The reference instance of <code>public.launch</code>
	 */
	public static final JLaunch LAUNCH = new JLaunch();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<JLaunchRecord> getRecordType() {
		return JLaunchRecord.class;
	}

	/**
	 * The column <code>public.launch.id</code>.
	 */
	public final TableField<JLaunchRecord, Long> ID = createField(
			"id", org.jooq.impl.SQLDataType.BIGINT.nullable(false)
					.defaultValue(org.jooq.impl.DSL.field("nextval('launch_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this,
			""
	);

	/**
	 * The column <code>public.launch.uuid</code>.
	 */
	public final TableField<JLaunchRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>public.launch.project_id</code>.
	 */
	public final TableField<JLaunchRecord, Long> PROJECT_ID = createField(
			"project_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>public.launch.user_id</code>.
	 */
	public final TableField<JLaunchRecord, Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.launch.name</code>.
	 */
	public final TableField<JLaunchRecord, String> NAME = createField(
			"name", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

	/**
	 * The column <code>public.launch.description</code>.
	 */
	public final TableField<JLaunchRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>public.launch.start_time</code>.
	 */
	public final TableField<JLaunchRecord, Timestamp> START_TIME = createField(
			"start_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

	/**
	 * The column <code>public.launch.end_time</code>.
	 */
	public final TableField<JLaunchRecord, Timestamp> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>public.launch.number</code>.
	 */
	public final TableField<JLaunchRecord, Integer> NUMBER = createField(
			"number", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.launch.last_modified</code>.
	 */
	public final TableField<JLaunchRecord, Timestamp> LAST_MODIFIED = createField(
			"last_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false)
					.defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

	/**
	 * The column <code>public.launch.mode</code>.
	 */
	public final TableField<JLaunchRecord, JLaunchModeEnum> MODE = createField(
			"mode",
			org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.epam.ta.reportportal.store.jooq.enums.JLaunchModeEnum.class),
			this, ""
	);

	/**
	 * The column <code>public.launch.status</code>.
	 */
	public final TableField<JLaunchRecord, JStatusEnum> STATUS = createField(
			"status",
			org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.epam.ta.reportportal.store.jooq.enums.JStatusEnum.class),
			this, ""
	);

	/**
	 * Create a <code>public.launch</code> table reference
	 */
	public JLaunch() {
		this(DSL.name("launch"), null);
	}

	/**
	 * Create an aliased <code>public.launch</code> table reference
	 */
	public JLaunch(String alias) {
		this(DSL.name(alias), LAUNCH);
	}

	/**
	 * Create an aliased <code>public.launch</code> table reference
	 */
	public JLaunch(Name alias) {
		this(alias, LAUNCH);
	}

	private JLaunch(Name alias, Table<JLaunchRecord> aliased) {
		this(alias, aliased, null);
	}

	private JLaunch(Name alias, Table<JLaunchRecord> aliased, Field<?>[] parameters) {
		super(alias, null, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Schema getSchema() {
		return JPublic.PUBLIC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Index> getIndexes() {
		return Arrays.<Index>asList(Indexes.LAUNCH_PK, Indexes.UNQ_NAME_NUMBER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<JLaunchRecord, Long> getIdentity() {
		return Keys.IDENTITY_LAUNCH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<JLaunchRecord> getPrimaryKey() {
		return Keys.LAUNCH_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<JLaunchRecord>> getKeys() {
		return Arrays.<UniqueKey<JLaunchRecord>>asList(Keys.LAUNCH_PK, Keys.UNQ_NAME_NUMBER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<JLaunchRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<JLaunchRecord, ?>>asList(Keys.LAUNCH__LAUNCH_PROJECT_ID_FKEY, Keys.LAUNCH__LAUNCH_USER_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLaunch as(String alias) {
		return new JLaunch(DSL.name(alias), this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JLaunch as(Name alias) {
		return new JLaunch(alias, this);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JLaunch rename(String name) {
		return new JLaunch(DSL.name(name), null);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JLaunch rename(Name name) {
		return new JLaunch(name, null);
	}
}

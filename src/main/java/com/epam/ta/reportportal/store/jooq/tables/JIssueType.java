/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables;

import com.epam.ta.reportportal.store.jooq.Indexes;
import com.epam.ta.reportportal.store.jooq.JPublic;
import com.epam.ta.reportportal.store.jooq.Keys;
import com.epam.ta.reportportal.store.jooq.tables.records.JIssueTypeRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JIssueType extends TableImpl<JIssueTypeRecord> {

	private static final long serialVersionUID = -603116796;

	/**
	 * The reference instance of <code>public.issue_type</code>
	 */
	public static final JIssueType ISSUE_TYPE = new JIssueType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<JIssueTypeRecord> getRecordType() {
		return JIssueTypeRecord.class;
	}

	/**
	 * The column <code>public.issue_type.id</code>.
	 */
	public final TableField<JIssueTypeRecord, Long> ID = createField(
			"id", org.jooq.impl.SQLDataType.BIGINT.nullable(false)
					.defaultValue(org.jooq.impl.DSL.field("nextval('issue_type_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)),
			this, ""
	);

	/**
	 * The column <code>public.issue_type.issue_group_id</code>.
	 */
	public final TableField<JIssueTypeRecord, Short> ISSUE_GROUP_ID = createField(
			"issue_group_id", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>public.issue_type.locator</code>.
	 */
	public final TableField<JIssueTypeRecord, String> LOCATOR = createField("locator", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

	/**
	 * The column <code>public.issue_type.issue_name</code>.
	 */
	public final TableField<JIssueTypeRecord, String> ISSUE_NAME = createField(
			"issue_name", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

	/**
	 * The column <code>public.issue_type.abbreviation</code>.
	 */
	public final TableField<JIssueTypeRecord, String> ABBREVIATION = createField(
			"abbreviation", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

	/**
	 * The column <code>public.issue_type.hex_color</code>.
	 */
	public final TableField<JIssueTypeRecord, String> HEX_COLOR = createField("hex_color", org.jooq.impl.SQLDataType.VARCHAR(7), this, "");

	/**
	 * Create a <code>public.issue_type</code> table reference
	 */
	public JIssueType() {
		this(DSL.name("issue_type"), null);
	}

	/**
	 * Create an aliased <code>public.issue_type</code> table reference
	 */
	public JIssueType(String alias) {
		this(DSL.name(alias), ISSUE_TYPE);
	}

	/**
	 * Create an aliased <code>public.issue_type</code> table reference
	 */
	public JIssueType(Name alias) {
		this(alias, ISSUE_TYPE);
	}

	private JIssueType(Name alias, Table<JIssueTypeRecord> aliased) {
		this(alias, aliased, null);
	}

	private JIssueType(Name alias, Table<JIssueTypeRecord> aliased, Field<?>[] parameters) {
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
		return Arrays.<Index>asList(Indexes.ISSUE_TYPE_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<JIssueTypeRecord, Long> getIdentity() {
		return Keys.IDENTITY_ISSUE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<JIssueTypeRecord> getPrimaryKey() {
		return Keys.ISSUE_TYPE_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<JIssueTypeRecord>> getKeys() {
		return Arrays.<UniqueKey<JIssueTypeRecord>>asList(Keys.ISSUE_TYPE_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<JIssueTypeRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<JIssueTypeRecord, ?>>asList(Keys.ISSUE_TYPE__ISSUE_TYPE_ISSUE_GROUP_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueType as(String alias) {
		return new JIssueType(DSL.name(alias), this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueType as(Name alias) {
		return new JIssueType(alias, this);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JIssueType rename(String name) {
		return new JIssueType(DSL.name(name), null);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JIssueType rename(Name name) {
		return new JIssueType(name, null);
	}
}

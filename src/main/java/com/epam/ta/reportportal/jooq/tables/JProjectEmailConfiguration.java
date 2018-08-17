/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JProjectEmailConfigurationRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


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
public class JProjectEmailConfiguration extends TableImpl<JProjectEmailConfigurationRecord> {

    private static final long serialVersionUID = -1581439233;

    /**
     * The reference instance of <code>public.project_email_configuration</code>
     */
    public static final JProjectEmailConfiguration PROJECT_EMAIL_CONFIGURATION = new JProjectEmailConfiguration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JProjectEmailConfigurationRecord> getRecordType() {
        return JProjectEmailConfigurationRecord.class;
    }

    /**
     * The column <code>public.project_email_configuration.id</code>.
     */
    public final TableField<JProjectEmailConfigurationRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('project_email_configuration_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.project_email_configuration.enabled</code>.
     */
    public final TableField<JProjectEmailConfigurationRecord, Boolean> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.project_email_configuration.email_from</code>.
     */
    public final TableField<JProjectEmailConfigurationRecord, String> EMAIL_FROM = createField("email_from", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * Create a <code>public.project_email_configuration</code> table reference
     */
    public JProjectEmailConfiguration() {
        this(DSL.name("project_email_configuration"), null);
    }

    /**
     * Create an aliased <code>public.project_email_configuration</code> table reference
     */
    public JProjectEmailConfiguration(String alias) {
        this(DSL.name(alias), PROJECT_EMAIL_CONFIGURATION);
    }

    /**
     * Create an aliased <code>public.project_email_configuration</code> table reference
     */
    public JProjectEmailConfiguration(Name alias) {
        this(alias, PROJECT_EMAIL_CONFIGURATION);
    }

    private JProjectEmailConfiguration(Name alias, Table<JProjectEmailConfigurationRecord> aliased) {
        this(alias, aliased, null);
    }

    private JProjectEmailConfiguration(Name alias, Table<JProjectEmailConfigurationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JProjectEmailConfiguration(Table<O> child, ForeignKey<O, JProjectEmailConfigurationRecord> key) {
        super(child, key, PROJECT_EMAIL_CONFIGURATION);
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
        return Arrays.<Index>asList(Indexes.PROJECT_EMAIL_CONFIGURATION_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JProjectEmailConfigurationRecord, Long> getIdentity() {
        return Keys.IDENTITY_PROJECT_EMAIL_CONFIGURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JProjectEmailConfigurationRecord> getPrimaryKey() {
        return Keys.PROJECT_EMAIL_CONFIGURATION_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JProjectEmailConfigurationRecord>> getKeys() {
        return Arrays.<UniqueKey<JProjectEmailConfigurationRecord>>asList(Keys.PROJECT_EMAIL_CONFIGURATION_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProjectEmailConfiguration as(String alias) {
        return new JProjectEmailConfiguration(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProjectEmailConfiguration as(Name alias) {
        return new JProjectEmailConfiguration(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JProjectEmailConfiguration rename(String name) {
        return new JProjectEmailConfiguration(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JProjectEmailConfiguration rename(Name name) {
        return new JProjectEmailConfiguration(name, null);
    }
}
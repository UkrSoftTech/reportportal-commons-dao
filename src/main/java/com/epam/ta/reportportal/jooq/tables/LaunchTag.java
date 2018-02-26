/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.Public;
import com.epam.ta.reportportal.jooq.tables.records.LaunchTagRecord;
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
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LaunchTag extends TableImpl<LaunchTagRecord> {

    private static final long serialVersionUID = 1400835985;

    /**
     * The reference instance of <code>public.launch_tag</code>
     */
    public static final LaunchTag LAUNCH_TAG = new LaunchTag();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LaunchTagRecord> getRecordType() {
        return LaunchTagRecord.class;
    }

    /**
     * The column <code>public.launch_tag.id</code>.
     */
    public final TableField<LaunchTagRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('launch_tag_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.launch_tag.value</code>.
     */
    public final TableField<LaunchTagRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.launch_tag.launch_id</code>.
     */
    public final TableField<LaunchTagRecord, Long> LAUNCH_ID = createField("launch_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.launch_tag</code> table reference
     */
    public LaunchTag() {
        this(DSL.name("launch_tag"), null);
    }

    /**
     * Create an aliased <code>public.launch_tag</code> table reference
     */
    public LaunchTag(String alias) {
        this(DSL.name(alias), LAUNCH_TAG);
    }

    /**
     * Create an aliased <code>public.launch_tag</code> table reference
     */
    public LaunchTag(Name alias) {
        this(alias, LAUNCH_TAG);
    }

    private LaunchTag(Name alias, Table<LaunchTagRecord> aliased) {
        this(alias, aliased, null);
    }

    private LaunchTag(Name alias, Table<LaunchTagRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.LAUNCH_TAG_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LaunchTagRecord, Long> getIdentity() {
        return Keys.IDENTITY_LAUNCH_TAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LaunchTagRecord> getPrimaryKey() {
        return Keys.LAUNCH_TAG_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LaunchTagRecord>> getKeys() {
        return Arrays.<UniqueKey<LaunchTagRecord>>asList(Keys.LAUNCH_TAG_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<LaunchTagRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LaunchTagRecord, ?>>asList(Keys.LAUNCH_TAG__LAUNCH_TAG_LAUNCH_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LaunchTag as(String alias) {
        return new LaunchTag(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LaunchTag as(Name alias) {
        return new LaunchTag(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LaunchTag rename(String name) {
        return new LaunchTag(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LaunchTag rename(Name name) {
        return new LaunchTag(name, null);
    }
}
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
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.tables.records.JCrosstab2Record;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;


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
public class JCrosstab2 extends TableImpl<JCrosstab2Record> {

    private static final long serialVersionUID = 387160818;

    /**
     * The reference instance of <code>public.crosstab2</code>
     */
    public static final JCrosstab2 CROSSTAB2 = new JCrosstab2();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JCrosstab2Record> getRecordType() {
        return JCrosstab2Record.class;
    }

    /**
     * The column <code>public.crosstab2.crosstab2</code>.
     */
    public final TableField<JCrosstab2Record, Object> CROSSTAB2_ = createField("crosstab2", org.jooq.impl.DefaultDataType.getDefaultDataType("\"tablefunc_crosstab_2\""), this, "");

    /**
     * Create a <code>public.crosstab2</code> table reference
     */
    public JCrosstab2() {
        this(DSL.name("crosstab2"), null);
    }

    /**
     * Create an aliased <code>public.crosstab2</code> table reference
     */
    public JCrosstab2(String alias) {
        this(DSL.name(alias), CROSSTAB2);
    }

    /**
     * Create an aliased <code>public.crosstab2</code> table reference
     */
    public JCrosstab2(Name alias) {
        this(alias, CROSSTAB2);
    }

    private JCrosstab2(Name alias, Table<JCrosstab2Record> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private JCrosstab2(Name alias, Table<JCrosstab2Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JCrosstab2(Table<O> child, ForeignKey<O, JCrosstab2Record> key) {
        super(child, key, CROSSTAB2);
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
    public JCrosstab2 as(String alias) {
        return new JCrosstab2(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JCrosstab2 as(Name alias) {
        return new JCrosstab2(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JCrosstab2 rename(String name) {
        return new JCrosstab2(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JCrosstab2 rename(Name name) {
        return new JCrosstab2(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public JCrosstab2 call(String __1) {
        return new JCrosstab2(DSL.name(getName()), null, new Field[] { 
              DSL.val(__1, org.jooq.impl.SQLDataType.CLOB)
        });
    }

    /**
     * Call this table-valued function
     */
    public JCrosstab2 call(Field<String> __1) {
        return new JCrosstab2(DSL.name(getName()), null, new Field[] { 
              __1
        });
    }
}

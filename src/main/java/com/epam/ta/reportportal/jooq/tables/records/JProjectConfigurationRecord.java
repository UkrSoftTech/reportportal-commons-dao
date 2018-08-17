/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.tables.JProjectConfiguration;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class JProjectConfigurationRecord extends UpdatableRecordImpl<JProjectConfigurationRecord> implements Record9<Long, String, String, String, String, Long, Object, Long, Timestamp> {

    private static final long serialVersionUID = 1750204734;

    /**
     * Setter for <code>public.project_configuration.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.project_configuration.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.project_configuration.project_type</code>.
     */
    public void setProjectType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.project_configuration.project_type</code>.
     */
    public String getProjectType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.project_configuration.interrupt_timeout</code>.
     */
    public void setInterruptTimeout(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.project_configuration.interrupt_timeout</code>.
     */
    public String getInterruptTimeout() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.project_configuration.keep_logs_interval</code>.
     */
    public void setKeepLogsInterval(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.project_configuration.keep_logs_interval</code>.
     */
    public String getKeepLogsInterval() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.project_configuration.keep_screenshots_interval</code>.
     */
    public void setKeepScreenshotsInterval(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.project_configuration.keep_screenshots_interval</code>.
     */
    public String getKeepScreenshotsInterval() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.project_configuration.project_analyzer_config_id</code>.
     */
    public void setProjectAnalyzerConfigId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.project_configuration.project_analyzer_config_id</code>.
     */
    public Long getProjectAnalyzerConfigId() {
        return (Long) get(5);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setMetadata(Object value) {
        set(6, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getMetadata() {
        return get(6);
    }

    /**
     * Setter for <code>public.project_configuration.project_email_config_id</code>.
     */
    public void setProjectEmailConfigId(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.project_configuration.project_email_config_id</code>.
     */
    public Long getProjectEmailConfigId() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>public.project_configuration.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.project_configuration.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, String, String, String, Long, Object, Long, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, String, String, String, Long, Object, Long, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JProjectConfiguration.PROJECT_CONFIGURATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return JProjectConfiguration.PROJECT_CONFIGURATION.PROJECT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JProjectConfiguration.PROJECT_CONFIGURATION.INTERRUPT_TIMEOUT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return JProjectConfiguration.PROJECT_CONFIGURATION.KEEP_LOGS_INTERVAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return JProjectConfiguration.PROJECT_CONFIGURATION.KEEP_SCREENSHOTS_INTERVAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return JProjectConfiguration.PROJECT_CONFIGURATION.PROJECT_ANALYZER_CONFIG_ID;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field7() {
        return JProjectConfiguration.PROJECT_CONFIGURATION.METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return JProjectConfiguration.PROJECT_CONFIGURATION.PROJECT_EMAIL_CONFIG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return JProjectConfiguration.PROJECT_CONFIGURATION.CREATED_ON;
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
        return getProjectType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getInterruptTimeout();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getKeepLogsInterval();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getKeepScreenshotsInterval();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getProjectAnalyzerConfigId();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component7() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getProjectEmailConfigId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreatedOn();
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
        return getProjectType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getInterruptTimeout();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getKeepLogsInterval();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getKeepScreenshotsInterval();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getProjectAnalyzerConfigId();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value7() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getProjectEmailConfigId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProjectConfigurationRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProjectConfigurationRecord value2(String value) {
        setProjectType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProjectConfigurationRecord value3(String value) {
        setInterruptTimeout(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProjectConfigurationRecord value4(String value) {
        setKeepLogsInterval(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProjectConfigurationRecord value5(String value) {
        setKeepScreenshotsInterval(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProjectConfigurationRecord value6(Long value) {
        setProjectAnalyzerConfigId(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public JProjectConfigurationRecord value7(Object value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProjectConfigurationRecord value8(Long value) {
        setProjectEmailConfigId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProjectConfigurationRecord value9(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProjectConfigurationRecord values(Long value1, String value2, String value3, String value4, String value5, Long value6, Object value7, Long value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JProjectConfigurationRecord
     */
    public JProjectConfigurationRecord() {
        super(JProjectConfiguration.PROJECT_CONFIGURATION);
    }

    /**
     * Create a detached, initialised JProjectConfigurationRecord
     */
    public JProjectConfigurationRecord(Long id, String projectType, String interruptTimeout, String keepLogsInterval, String keepScreenshotsInterval, Long projectAnalyzerConfigId, Object metadata, Long projectEmailConfigId, Timestamp createdOn) {
        super(JProjectConfiguration.PROJECT_CONFIGURATION);

        set(0, id);
        set(1, projectType);
        set(2, interruptTimeout);
        set(3, keepLogsInterval);
        set(4, keepScreenshotsInterval);
        set(5, projectAnalyzerConfigId);
        set(6, metadata);
        set(7, projectEmailConfigId);
        set(8, createdOn);
    }
}
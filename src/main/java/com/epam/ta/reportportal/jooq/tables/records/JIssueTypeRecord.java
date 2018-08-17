/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.tables.JIssueType;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

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
public class JIssueTypeRecord extends UpdatableRecordImpl<JIssueTypeRecord> implements Record6<Long, Short, String, String, String, String> {

    private static final long serialVersionUID = -1278987408;

    /**
     * Setter for <code>public.issue_type.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.issue_type.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.issue_type.issue_group_id</code>.
     */
    public void setIssueGroupId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.issue_type.issue_group_id</code>.
     */
    public Short getIssueGroupId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>public.issue_type.locator</code>.
     */
    public void setLocator(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.issue_type.locator</code>.
     */
    public String getLocator() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.issue_type.issue_name</code>.
     */
    public void setIssueName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.issue_type.issue_name</code>.
     */
    public String getIssueName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.issue_type.abbreviation</code>.
     */
    public void setAbbreviation(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.issue_type.abbreviation</code>.
     */
    public String getAbbreviation() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.issue_type.hex_color</code>.
     */
    public void setHexColor(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.issue_type.hex_color</code>.
     */
    public String getHexColor() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Short, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Short, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JIssueType.ISSUE_TYPE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return JIssueType.ISSUE_TYPE.ISSUE_GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JIssueType.ISSUE_TYPE.LOCATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return JIssueType.ISSUE_TYPE.ISSUE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return JIssueType.ISSUE_TYPE.ABBREVIATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return JIssueType.ISSUE_TYPE.HEX_COLOR;
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
    public Short component2() {
        return getIssueGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLocator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getIssueName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getAbbreviation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getHexColor();
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
    public Short value2() {
        return getIssueGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLocator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getIssueName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAbbreviation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getHexColor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JIssueTypeRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JIssueTypeRecord value2(Short value) {
        setIssueGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JIssueTypeRecord value3(String value) {
        setLocator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JIssueTypeRecord value4(String value) {
        setIssueName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JIssueTypeRecord value5(String value) {
        setAbbreviation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JIssueTypeRecord value6(String value) {
        setHexColor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JIssueTypeRecord values(Long value1, Short value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JIssueTypeRecord
     */
    public JIssueTypeRecord() {
        super(JIssueType.ISSUE_TYPE);
    }

    /**
     * Create a detached, initialised JIssueTypeRecord
     */
    public JIssueTypeRecord(Long id, Short issueGroupId, String locator, String issueName, String abbreviation, String hexColor) {
        super(JIssueType.ISSUE_TYPE);

        set(0, id);
        set(1, issueGroupId);
        set(2, locator);
        set(3, issueName);
        set(4, abbreviation);
        set(5, hexColor);
    }
}
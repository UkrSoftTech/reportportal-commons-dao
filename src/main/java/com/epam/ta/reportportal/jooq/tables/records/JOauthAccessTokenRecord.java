/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.enums.JAccessTokenTypeEnum;
import com.epam.ta.reportportal.jooq.tables.JOauthAccessToken;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JOauthAccessTokenRecord extends UpdatableRecordImpl<JOauthAccessTokenRecord> implements Record3<Long, String, JAccessTokenTypeEnum> {

    private static final long serialVersionUID = 1659990889;

    /**
     * Setter for <code>public.oauth_access_token.user_id</code>.
     */
    public void setUserId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.oauth_access_token.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.oauth_access_token.token</code>.
     */
    public void setToken(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.oauth_access_token.token</code>.
     */
    public String getToken() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.oauth_access_token.token_type</code>.
     */
    public void setTokenType(JAccessTokenTypeEnum value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.oauth_access_token.token_type</code>.
     */
    public JAccessTokenTypeEnum getTokenType() {
        return (JAccessTokenTypeEnum) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Long, JAccessTokenTypeEnum> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, String, JAccessTokenTypeEnum> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, String, JAccessTokenTypeEnum> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JOauthAccessToken.OAUTH_ACCESS_TOKEN.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return JOauthAccessToken.OAUTH_ACCESS_TOKEN.TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JAccessTokenTypeEnum> field3() {
        return JOauthAccessToken.OAUTH_ACCESS_TOKEN.TOKEN_TYPE;
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
    public String component2() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAccessTokenTypeEnum component3() {
        return getTokenType();
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
    public String value2() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JAccessTokenTypeEnum value3() {
        return getTokenType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JOauthAccessTokenRecord value1(Long value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JOauthAccessTokenRecord value2(String value) {
        setToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JOauthAccessTokenRecord value3(JAccessTokenTypeEnum value) {
        setTokenType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JOauthAccessTokenRecord values(Long value1, String value2, JAccessTokenTypeEnum value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JOauthAccessTokenRecord
     */
    public JOauthAccessTokenRecord() {
        super(JOauthAccessToken.OAUTH_ACCESS_TOKEN);
    }

    /**
     * Create a detached, initialised JOauthAccessTokenRecord
     */
    public JOauthAccessTokenRecord(Long userId, String token, JAccessTokenTypeEnum tokenType) {
        super(JOauthAccessToken.OAUTH_ACCESS_TOKEN);

        set(0, userId);
        set(1, token);
        set(2, tokenType);
    }
}

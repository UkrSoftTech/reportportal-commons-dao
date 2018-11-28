/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq;

import com.epam.ta.reportportal.jooq.tables.*;
import com.epam.ta.reportportal.jooq.tables.records.*;
import com.epam.ta.reportportal.jooq.udt.JTablefuncCrosstab_2;
import com.epam.ta.reportportal.jooq.udt.JTablefuncCrosstab_3;
import com.epam.ta.reportportal.jooq.udt.JTablefuncCrosstab_4;
import org.jooq.*;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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
public class JPublic extends SchemaImpl {

	private static final long serialVersionUID = -294368811;

    /**
     * The reference instance of <code>public</code>
     */
    public static final JPublic PUBLIC = new JPublic();

    /**
     * The table <code>public.acl_class</code>.
     */
    public final JAclClass ACL_CLASS = com.epam.ta.reportportal.jooq.tables.JAclClass.ACL_CLASS;

    /**
     * The table <code>public.acl_entry</code>.
     */
    public final JAclEntry ACL_ENTRY = com.epam.ta.reportportal.jooq.tables.JAclEntry.ACL_ENTRY;

    /**
     * The table <code>public.acl_object_identity</code>.
     */
    public final JAclObjectIdentity ACL_OBJECT_IDENTITY = com.epam.ta.reportportal.jooq.tables.JAclObjectIdentity.ACL_OBJECT_IDENTITY;

    /**
     * The table <code>public.acl_sid</code>.
     */
    public final JAclSid ACL_SID = com.epam.ta.reportportal.jooq.tables.JAclSid.ACL_SID;

    /**
     * The table <code>public.active_directory_config</code>.
     */
    public final JActiveDirectoryConfig ACTIVE_DIRECTORY_CONFIG = com.epam.ta.reportportal.jooq.tables.JActiveDirectoryConfig.ACTIVE_DIRECTORY_CONFIG;

    /**
     * The table <code>public.activity</code>.
     */
    public final JActivity ACTIVITY = com.epam.ta.reportportal.jooq.tables.JActivity.ACTIVITY;

    /**
     * The table <code>public.attribute</code>.
     */
    public final JAttribute ATTRIBUTE = com.epam.ta.reportportal.jooq.tables.JAttribute.ATTRIBUTE;

    /**
     * The table <code>public.auth_config</code>.
     */
    public final JAuthConfig AUTH_CONFIG = com.epam.ta.reportportal.jooq.tables.JAuthConfig.AUTH_CONFIG;

    /**
     * The table <code>public.bug_tracking_system</code>.
     */
    public final JBugTrackingSystem BUG_TRACKING_SYSTEM = com.epam.ta.reportportal.jooq.tables.JBugTrackingSystem.BUG_TRACKING_SYSTEM;

    /**
     * The table <code>public.connectby</code>.
     */
    public final JConnectby CONNECTBY = com.epam.ta.reportportal.jooq.tables.JConnectby.CONNECTBY;

    /**
     * Call <code>public.connectby</code>.
     */
	public static Result<JConnectbyRecord> CONNECTBY(Configuration configuration, String __1, String __2, String __3, String __4,
			Integer __5, String __6) {
		return configuration.dsl()
				.selectFrom(com.epam.ta.reportportal.jooq.tables.JConnectby.CONNECTBY.call(__1, __2, __3, __4, __5, __6))
				.fetch();
    }

    /**
     * Get <code>public.connectby</code> as a table.
     */
	public static JConnectby CONNECTBY(String __1, String __2, String __3, String __4, Integer __5, String __6) {
		return com.epam.ta.reportportal.jooq.tables.JConnectby.CONNECTBY.call(__1, __2, __3, __4, __5, __6);
    }

    /**
     * Get <code>public.connectby</code> as a table.
     */
	public static JConnectby CONNECTBY(Field<String> __1, Field<String> __2, Field<String> __3, Field<String> __4, Field<Integer> __5,
			Field<String> __6) {
		return com.epam.ta.reportportal.jooq.tables.JConnectby.CONNECTBY.call(__1, __2, __3, __4, __5, __6);
    }

    /**
     * The table <code>public.content_field</code>.
     */
    public final JContentField CONTENT_FIELD = com.epam.ta.reportportal.jooq.tables.JContentField.CONTENT_FIELD;

    /**
     * The table <code>public.crosstab</code>.
     */
    public final JCrosstab CROSSTAB = com.epam.ta.reportportal.jooq.tables.JCrosstab.CROSSTAB;

    /**
     * Call <code>public.crosstab</code>.
     */
    public static Result<JCrosstabRecord> CROSSTAB(Configuration configuration, String __1, Integer __2) {
        return configuration.dsl().selectFrom(com.epam.ta.reportportal.jooq.tables.JCrosstab.CROSSTAB.call(__1, __2)).fetch();
    }

    /**
     * Get <code>public.crosstab</code> as a table.
     */
    public static JCrosstab CROSSTAB(String __1, Integer __2) {
        return com.epam.ta.reportportal.jooq.tables.JCrosstab.CROSSTAB.call(__1, __2);
    }

    /**
     * Get <code>public.crosstab</code> as a table.
     */
    public static JCrosstab CROSSTAB(Field<String> __1, Field<Integer> __2) {
        return com.epam.ta.reportportal.jooq.tables.JCrosstab.CROSSTAB.call(__1, __2);
    }

    /**
     * The table <code>public.crosstab2</code>.
     */
    public final JCrosstab2 CROSSTAB2 = com.epam.ta.reportportal.jooq.tables.JCrosstab2.CROSSTAB2;

    /**
     * Call <code>public.crosstab2</code>.
     */
    public static Result<JCrosstab2Record> CROSSTAB2(Configuration configuration, String __1) {
        return configuration.dsl().selectFrom(com.epam.ta.reportportal.jooq.tables.JCrosstab2.CROSSTAB2.call(__1)).fetch();
    }

    /**
     * Get <code>public.crosstab2</code> as a table.
     */
    public static JCrosstab2 CROSSTAB2(String __1) {
        return com.epam.ta.reportportal.jooq.tables.JCrosstab2.CROSSTAB2.call(__1);
    }

    /**
     * Get <code>public.crosstab2</code> as a table.
     */
    public static JCrosstab2 CROSSTAB2(Field<String> __1) {
        return com.epam.ta.reportportal.jooq.tables.JCrosstab2.CROSSTAB2.call(__1);
    }

    /**
     * The table <code>public.crosstab3</code>.
     */
    public final JCrosstab3 CROSSTAB3 = com.epam.ta.reportportal.jooq.tables.JCrosstab3.CROSSTAB3;

    /**
     * Call <code>public.crosstab3</code>.
     */
    public static Result<JCrosstab3Record> CROSSTAB3(Configuration configuration, String __1) {
        return configuration.dsl().selectFrom(com.epam.ta.reportportal.jooq.tables.JCrosstab3.CROSSTAB3.call(__1)).fetch();
    }

    /**
     * Get <code>public.crosstab3</code> as a table.
     */
    public static JCrosstab3 CROSSTAB3(String __1) {
        return com.epam.ta.reportportal.jooq.tables.JCrosstab3.CROSSTAB3.call(__1);
    }

    /**
     * Get <code>public.crosstab3</code> as a table.
     */
    public static JCrosstab3 CROSSTAB3(Field<String> __1) {
        return com.epam.ta.reportportal.jooq.tables.JCrosstab3.CROSSTAB3.call(__1);
    }

    /**
     * The table <code>public.crosstab4</code>.
     */
    public final JCrosstab4 CROSSTAB4 = com.epam.ta.reportportal.jooq.tables.JCrosstab4.CROSSTAB4;

    /**
     * Call <code>public.crosstab4</code>.
     */
    public static Result<JCrosstab4Record> CROSSTAB4(Configuration configuration, String __1) {
        return configuration.dsl().selectFrom(com.epam.ta.reportportal.jooq.tables.JCrosstab4.CROSSTAB4.call(__1)).fetch();
    }

    /**
     * Get <code>public.crosstab4</code> as a table.
     */
    public static JCrosstab4 CROSSTAB4(String __1) {
        return com.epam.ta.reportportal.jooq.tables.JCrosstab4.CROSSTAB4.call(__1);
    }

    /**
     * Get <code>public.crosstab4</code> as a table.
     */
    public static JCrosstab4 CROSSTAB4(Field<String> __1) {
        return com.epam.ta.reportportal.jooq.tables.JCrosstab4.CROSSTAB4.call(__1);
    }

    /**
     * The table <code>public.dashboard</code>.
     */
    public final JDashboard DASHBOARD = com.epam.ta.reportportal.jooq.tables.JDashboard.DASHBOARD;

    /**
     * The table <code>public.dashboard_widget</code>.
     */
    public final JDashboardWidget DASHBOARD_WIDGET = com.epam.ta.reportportal.jooq.tables.JDashboardWidget.DASHBOARD_WIDGET;

    /**
     * The table <code>public.defect_field_allowed_value</code>.
     */
    public final JDefectFieldAllowedValue DEFECT_FIELD_ALLOWED_VALUE = com.epam.ta.reportportal.jooq.tables.JDefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE;

    /**
     * The table <code>public.defect_form_field</code>.
     */
    public final JDefectFormField DEFECT_FORM_FIELD = com.epam.ta.reportportal.jooq.tables.JDefectFormField.DEFECT_FORM_FIELD;

    /**
     * The table <code>public.defect_form_field_value</code>.
     */
    public final JDefectFormFieldValue DEFECT_FORM_FIELD_VALUE = com.epam.ta.reportportal.jooq.tables.JDefectFormFieldValue.DEFECT_FORM_FIELD_VALUE;

    /**
     * The table <code>public.filter</code>.
     */
    public final JFilter FILTER = com.epam.ta.reportportal.jooq.tables.JFilter.FILTER;

    /**
     * The table <code>public.filter_condition</code>.
     */
    public final JFilterCondition FILTER_CONDITION = com.epam.ta.reportportal.jooq.tables.JFilterCondition.FILTER_CONDITION;

    /**
     * The table <code>public.filter_sort</code>.
     */
    public final JFilterSort FILTER_SORT = com.epam.ta.reportportal.jooq.tables.JFilterSort.FILTER_SORT;

    /**
     * The table <code>public.integration</code>.
     */
    public final JIntegration INTEGRATION = com.epam.ta.reportportal.jooq.tables.JIntegration.INTEGRATION;

    /**
     * The table <code>public.integration_type</code>.
     */
    public final JIntegrationType INTEGRATION_TYPE = com.epam.ta.reportportal.jooq.tables.JIntegrationType.INTEGRATION_TYPE;

    /**
     * The table <code>public.issue</code>.
     */
    public final JIssue ISSUE = com.epam.ta.reportportal.jooq.tables.JIssue.ISSUE;

    /**
     * The table <code>public.issue_group</code>.
     */
    public final JIssueGroup ISSUE_GROUP = com.epam.ta.reportportal.jooq.tables.JIssueGroup.ISSUE_GROUP;

    /**
     * The table <code>public.issue_ticket</code>.
     */
    public final JIssueTicket ISSUE_TICKET = com.epam.ta.reportportal.jooq.tables.JIssueTicket.ISSUE_TICKET;

    /**
     * The table <code>public.issue_type</code>.
     */
    public final JIssueType ISSUE_TYPE = com.epam.ta.reportportal.jooq.tables.JIssueType.ISSUE_TYPE;

    /**
     * The table <code>public.issue_type_project</code>.
     */
    public final JIssueTypeProject ISSUE_TYPE_PROJECT = com.epam.ta.reportportal.jooq.tables.JIssueTypeProject.ISSUE_TYPE_PROJECT;

    /**
	 * The table <code>public.item_attribute</code>.
     */
	public final JItemAttribute ITEM_ATTRIBUTE = com.epam.ta.reportportal.jooq.tables.JItemAttribute.ITEM_ATTRIBUTE;

    /**
     * The table <code>public.launch</code>.
     */
    public final JLaunch LAUNCH = com.epam.ta.reportportal.jooq.tables.JLaunch.LAUNCH;

    /**
     * The table <code>public.ldap_config</code>.
     */
    public final JLdapConfig LDAP_CONFIG = com.epam.ta.reportportal.jooq.tables.JLdapConfig.LDAP_CONFIG;

    /**
     * The table <code>public.ldap_synchronization_attributes</code>.
     */
    public final JLdapSynchronizationAttributes LDAP_SYNCHRONIZATION_ATTRIBUTES = com.epam.ta.reportportal.jooq.tables.JLdapSynchronizationAttributes.LDAP_SYNCHRONIZATION_ATTRIBUTES;

    /**
     * The table <code>public.log</code>.
     */
    public final JLog LOG = com.epam.ta.reportportal.jooq.tables.JLog.LOG;

    /**
     * The table <code>public.normal_rand</code>.
     */
    public final JNormalRand NORMAL_RAND = com.epam.ta.reportportal.jooq.tables.JNormalRand.NORMAL_RAND;

    /**
     * Call <code>public.normal_rand</code>.
     */
    public static Result<JNormalRandRecord> NORMAL_RAND(Configuration configuration, Integer __1, Double __2, Double __3) {
        return configuration.dsl().selectFrom(com.epam.ta.reportportal.jooq.tables.JNormalRand.NORMAL_RAND.call(__1, __2, __3)).fetch();
    }

    /**
     * Get <code>public.normal_rand</code> as a table.
     */
    public static JNormalRand NORMAL_RAND(Integer __1, Double __2, Double __3) {
        return com.epam.ta.reportportal.jooq.tables.JNormalRand.NORMAL_RAND.call(__1, __2, __3);
    }

    /**
     * Get <code>public.normal_rand</code> as a table.
     */
    public static JNormalRand NORMAL_RAND(Field<Integer> __1, Field<Double> __2, Field<Double> __3) {
        return com.epam.ta.reportportal.jooq.tables.JNormalRand.NORMAL_RAND.call(__1, __2, __3);
    }

    /**
     * The table <code>public.oauth_access_token</code>.
     */
    public final JOauthAccessToken OAUTH_ACCESS_TOKEN = com.epam.ta.reportportal.jooq.tables.JOauthAccessToken.OAUTH_ACCESS_TOKEN;

    /**
     * The table <code>public.oauth_registration</code>.
     */
    public final JOauthRegistration OAUTH_REGISTRATION = com.epam.ta.reportportal.jooq.tables.JOauthRegistration.OAUTH_REGISTRATION;

    /**
     * The table <code>public.oauth_registration_restriction</code>.
     */
    public final JOauthRegistrationRestriction OAUTH_REGISTRATION_RESTRICTION = com.epam.ta.reportportal.jooq.tables.JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION;

    /**
     * The table <code>public.oauth_registration_scope</code>.
     */
    public final JOauthRegistrationScope OAUTH_REGISTRATION_SCOPE = com.epam.ta.reportportal.jooq.tables.JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE;

    /**
     * The table <code>public.parameter</code>.
     */
    public final JParameter PARAMETER = com.epam.ta.reportportal.jooq.tables.JParameter.PARAMETER;

    /**
     * The table <code>public.project</code>.
     */
    public final JProject PROJECT = com.epam.ta.reportportal.jooq.tables.JProject.PROJECT;

    /**
     * The table <code>public.project_attribute</code>.
     */
    public final JProjectAttribute PROJECT_ATTRIBUTE = com.epam.ta.reportportal.jooq.tables.JProjectAttribute.PROJECT_ATTRIBUTE;

    /**
     * The table <code>public.project_user</code>.
     */
    public final JProjectUser PROJECT_USER = com.epam.ta.reportportal.jooq.tables.JProjectUser.PROJECT_USER;

    /**
     * The table <code>public.restore_password_bid</code>.
     */
    public final JRestorePasswordBid RESTORE_PASSWORD_BID = com.epam.ta.reportportal.jooq.tables.JRestorePasswordBid.RESTORE_PASSWORD_BID;

    /**
     * The table <code>public.server_settings</code>.
     */
    public final JServerSettings SERVER_SETTINGS = com.epam.ta.reportportal.jooq.tables.JServerSettings.SERVER_SETTINGS;

    /**
     * The table <code>public.statistics</code>.
     */
    public final JStatistics STATISTICS = com.epam.ta.reportportal.jooq.tables.JStatistics.STATISTICS;

    /**
     * The table <code>public.statistics_field</code>.
     */
    public final JStatisticsField STATISTICS_FIELD = com.epam.ta.reportportal.jooq.tables.JStatisticsField.STATISTICS_FIELD;

    /**
     * The table <code>public.test_item</code>.
     */
    public final JTestItem TEST_ITEM = com.epam.ta.reportportal.jooq.tables.JTestItem.TEST_ITEM;

    /**
     * The table <code>public.test_item_results</code>.
     */
    public final JTestItemResults TEST_ITEM_RESULTS = com.epam.ta.reportportal.jooq.tables.JTestItemResults.TEST_ITEM_RESULTS;

    /**
     * The table <code>public.ticket</code>.
     */
    public final JTicket TICKET = com.epam.ta.reportportal.jooq.tables.JTicket.TICKET;

    /**
     * The table <code>public.user_creation_bid</code>.
     */
    public final JUserCreationBid USER_CREATION_BID = com.epam.ta.reportportal.jooq.tables.JUserCreationBid.USER_CREATION_BID;

    /**
     * The table <code>public.user_filter</code>.
     */
    public final JUserFilter USER_FILTER = com.epam.ta.reportportal.jooq.tables.JUserFilter.USER_FILTER;

    /**
     * The table <code>public.user_preference</code>.
     */
    public final JUserPreference USER_PREFERENCE = com.epam.ta.reportportal.jooq.tables.JUserPreference.USER_PREFERENCE;

    /**
     * The table <code>public.users</code>.
     */
    public final JUsers USERS = com.epam.ta.reportportal.jooq.tables.JUsers.USERS;

    /**
     * The table <code>public.widget</code>.
     */
    public final JWidget WIDGET = com.epam.ta.reportportal.jooq.tables.JWidget.WIDGET;

    /**
     * The table <code>public.widget_filter</code>.
     */
    public final JWidgetFilter WIDGET_FILTER = com.epam.ta.reportportal.jooq.tables.JWidgetFilter.WIDGET_FILTER;

    /**
     * No further instances allowed
     */
    private JPublic() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.ACL_CLASS_ID_SEQ,
            Sequences.ACL_ENTRY_ID_SEQ,
            Sequences.ACL_OBJECT_IDENTITY_ID_SEQ,
            Sequences.ACL_SID_ID_SEQ,
            Sequences.ACTIVITY_ID_SEQ,
            Sequences.ATTRIBUTE_ID_SEQ,
            Sequences.BUG_TRACKING_SYSTEM_ID_SEQ,
            Sequences.DASHBOARD_ID_SEQ,
            Sequences.DEFECT_FIELD_ALLOWED_VALUE_ID_SEQ,
            Sequences.DEFECT_FORM_FIELD_ID_SEQ,
            Sequences.FILTER_CONDITION_ID_SEQ,
            Sequences.FILTER_ID_SEQ,
            Sequences.FILTER_SORT_ID_SEQ,
            Sequences.INTEGRATION_ID_SEQ,
            Sequences.INTEGRATION_TYPE_ID_SEQ,
            Sequences.ISSUE_GROUP_ISSUE_GROUP_ID_SEQ,
            Sequences.ISSUE_TYPE_ID_SEQ, Sequences.ITEM_ATTRIBUTE_ID_SEQ,
            Sequences.LAUNCH_ID_SEQ,
            Sequences.LDAP_SYNCHRONIZATION_ATTRIBUTES_ID_SEQ,
            Sequences.LOG_ID_SEQ,
            Sequences.OAUTH_REGISTRATION_RESTRICTION_ID_SEQ,
            Sequences.OAUTH_REGISTRATION_SCOPE_ID_SEQ,
            Sequences.PROJECT_ATTRIBUTE_ATTRIBUTE_ID_SEQ,
            Sequences.PROJECT_ATTRIBUTE_PROJECT_ID_SEQ,
            Sequences.PROJECT_ID_SEQ,
            Sequences.SERVER_SETTINGS_ID_SEQ,
            Sequences.STATISTICS_FIELD_SF_ID_SEQ,
            Sequences.STATISTICS_S_ID_SEQ,
            Sequences.TEST_ITEM_ITEM_ID_SEQ,
            Sequences.TICKET_ID_SEQ,
            Sequences.USER_PREFERENCE_ID_SEQ,
            Sequences.USERS_ID_SEQ,
            Sequences.WIDGET_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            JAclClass.ACL_CLASS,
            JAclEntry.ACL_ENTRY,
            JAclObjectIdentity.ACL_OBJECT_IDENTITY,
            JAclSid.ACL_SID,
            JActiveDirectoryConfig.ACTIVE_DIRECTORY_CONFIG,
            JActivity.ACTIVITY,
            JAttribute.ATTRIBUTE,
            JAuthConfig.AUTH_CONFIG,
            JBugTrackingSystem.BUG_TRACKING_SYSTEM,
            JConnectby.CONNECTBY,
            JContentField.CONTENT_FIELD,
            JCrosstab.CROSSTAB,
            JCrosstab2.CROSSTAB2,
            JCrosstab3.CROSSTAB3,
            JCrosstab4.CROSSTAB4,
            JDashboard.DASHBOARD,
            JDashboardWidget.DASHBOARD_WIDGET,
            JDefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE,
            JDefectFormField.DEFECT_FORM_FIELD,
            JDefectFormFieldValue.DEFECT_FORM_FIELD_VALUE,
            JFilter.FILTER,
            JFilterCondition.FILTER_CONDITION,
            JFilterSort.FILTER_SORT,
            JIntegration.INTEGRATION,
            JIntegrationType.INTEGRATION_TYPE,
            JIssue.ISSUE,
            JIssueGroup.ISSUE_GROUP,
            JIssueTicket.ISSUE_TICKET,
            JIssueType.ISSUE_TYPE,
            JIssueTypeProject.ISSUE_TYPE_PROJECT, JItemAttribute.ITEM_ATTRIBUTE,
            JLaunch.LAUNCH,
            JLdapConfig.LDAP_CONFIG,
            JLdapSynchronizationAttributes.LDAP_SYNCHRONIZATION_ATTRIBUTES,
            JLog.LOG,
            JNormalRand.NORMAL_RAND,
            JOauthAccessToken.OAUTH_ACCESS_TOKEN,
            JOauthRegistration.OAUTH_REGISTRATION,
            JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION,
            JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE,
            JParameter.PARAMETER,
            JProject.PROJECT,
            JProjectAttribute.PROJECT_ATTRIBUTE,
            JProjectUser.PROJECT_USER,
            JRestorePasswordBid.RESTORE_PASSWORD_BID,
            JServerSettings.SERVER_SETTINGS,
            JStatistics.STATISTICS,
            JStatisticsField.STATISTICS_FIELD,
            JTestItem.TEST_ITEM,
            JTestItemResults.TEST_ITEM_RESULTS,
            JTicket.TICKET,
            JUserCreationBid.USER_CREATION_BID,
            JUserFilter.USER_FILTER,
            JUserPreference.USER_PREFERENCE,
            JUsers.USERS,
            JWidget.WIDGET,
            JWidgetFilter.WIDGET_FILTER);
    }

    @Override
    public final List<UDT<?>> getUDTs() {
        List result = new ArrayList();
        result.addAll(getUDTs0());
        return result;
    }

    private final List<UDT<?>> getUDTs0() {
        return Arrays.<UDT<?>>asList(
            JTablefuncCrosstab_2.TABLEFUNC_CROSSTAB_2,
            JTablefuncCrosstab_3.TABLEFUNC_CROSSTAB_3,
            JTablefuncCrosstab_4.TABLEFUNC_CROSSTAB_4);
    }
}

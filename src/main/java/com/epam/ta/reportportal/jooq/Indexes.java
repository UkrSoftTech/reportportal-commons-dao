/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq;

import com.epam.ta.reportportal.jooq.tables.*;
import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;

import javax.annotation.Generated;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ACTIVE_DIRECTORY_CONFIG_PK = Indexes0.ACTIVE_DIRECTORY_CONFIG_PK;
    public static final Index ACTIVITY_PK = Indexes0.ACTIVITY_PK;
    public static final Index ATTRIBUTE_PK = Indexes0.ATTRIBUTE_PK;
    public static final Index AUTH_CONFIG_PK = Indexes0.AUTH_CONFIG_PK;
    public static final Index BUG_TRACKING_SYSTEM_PK = Indexes0.BUG_TRACKING_SYSTEM_PK;
    public static final Index UNIQUE_BTS = Indexes0.UNIQUE_BTS;
    public static final Index DASHBOARD_PK = Indexes0.DASHBOARD_PK;
    public static final Index UNQ_NAME_PROJECT = Indexes0.UNQ_NAME_PROJECT;
    public static final Index DASHBOARD_WIDGET_PK = Indexes0.DASHBOARD_WIDGET_PK;
    public static final Index WIDGET_ON_DASHBOARD_UNQ = Indexes0.WIDGET_ON_DASHBOARD_UNQ;
    public static final Index DEFECT_FIELD_ALLOWED_VALUE_PK = Indexes0.DEFECT_FIELD_ALLOWED_VALUE_PK;
    public static final Index DEFECT_FORM_FIELD_PK = Indexes0.DEFECT_FORM_FIELD_PK;
    public static final Index DEMO_DATA_POSTFIX_PK = Indexes0.DEMO_DATA_POSTFIX_PK;
    public static final Index EMAIL_SENDER_CASE_PK = Indexes0.EMAIL_SENDER_CASE_PK;
    public static final Index FILTER_PK = Indexes0.FILTER_PK;
    public static final Index FILTER_CONDITION_PK = Indexes0.FILTER_CONDITION_PK;
    public static final Index FILTER_SORT_PK = Indexes0.FILTER_SORT_PK;
    public static final Index INTEGRATION_PK = Indexes0.INTEGRATION_PK;
    public static final Index INTEGRATION_TYPE_PK = Indexes0.INTEGRATION_TYPE_PK;
    public static final Index ISSUE_PK = Indexes0.ISSUE_PK;
    public static final Index ISSUE_GROUP_PK = Indexes0.ISSUE_GROUP_PK;
    public static final Index ISSUE_TICKET_PK = Indexes0.ISSUE_TICKET_PK;
    public static final Index ISSUE_TYPE_LOCATOR_KEY = Indexes0.ISSUE_TYPE_LOCATOR_KEY;
    public static final Index ISSUE_TYPE_PK = Indexes0.ISSUE_TYPE_PK;
    public static final Index ISSUE_TYPE_PROJECT_PK = Indexes0.ISSUE_TYPE_PROJECT_PK;
    public static final Index ITEM_TAG_PK = Indexes0.ITEM_TAG_PK;
    public static final Index LAUNCH_PK = Indexes0.LAUNCH_PK;
    public static final Index UNQ_NAME_NUMBER = Indexes0.UNQ_NAME_NUMBER;
    public static final Index LAUNCH_TAG_PK = Indexes0.LAUNCH_TAG_PK;
    public static final Index LDAP_CONFIG_PK = Indexes0.LDAP_CONFIG_PK;
    public static final Index LDAP_SYNCHRONIZATION_ATTRIBUTES_EMAIL_KEY = Indexes0.LDAP_SYNCHRONIZATION_ATTRIBUTES_EMAIL_KEY;
    public static final Index LDAP_SYNCHRONIZATION_ATTRIBUTES_PK = Indexes0.LDAP_SYNCHRONIZATION_ATTRIBUTES_PK;
    public static final Index LOG_PK = Indexes0.LOG_PK;
    public static final Index ACCESS_TOKENS_PK = Indexes0.ACCESS_TOKENS_PK;
    public static final Index OAUTH_REGISTRATION_CLIENT_ID_KEY = Indexes0.OAUTH_REGISTRATION_CLIENT_ID_KEY;
    public static final Index OAUTH_REGISTRATION_PKEY = Indexes0.OAUTH_REGISTRATION_PKEY;
    public static final Index OAUTH_REGISTRATION_RESTRICTION_PK = Indexes0.OAUTH_REGISTRATION_RESTRICTION_PK;
    public static final Index OAUTH_REGISTRATION_RESTRICTION_UNIQUE = Indexes0.OAUTH_REGISTRATION_RESTRICTION_UNIQUE;
    public static final Index OAUTH_REGISTRATION_SCOPE_PK = Indexes0.OAUTH_REGISTRATION_SCOPE_PK;
    public static final Index OAUTH_REGISTRATION_SCOPE_UNIQUE = Indexes0.OAUTH_REGISTRATION_SCOPE_UNIQUE;
    public static final Index PROJECT_NAME_KEY = Indexes0.PROJECT_NAME_KEY;
    public static final Index PROJECT_PK = Indexes0.PROJECT_PK;
    public static final Index UNIQUE_ATTRIBUTE_PER_PROJECT = Indexes0.UNIQUE_ATTRIBUTE_PER_PROJECT;
    public static final Index USERS_PROJECT_PK = Indexes0.USERS_PROJECT_PK;
    public static final Index SERVER_SETTINGS_ID = Indexes0.SERVER_SETTINGS_ID;
    public static final Index SERVER_SETTINGS_KEY_KEY = Indexes0.SERVER_SETTINGS_KEY_KEY;
    public static final Index PK_STATISTICS = Indexes0.PK_STATISTICS;
    public static final Index UNIQUE_STATUS_ITEM = Indexes0.UNIQUE_STATUS_ITEM;
    public static final Index UNIQUE_STATUS_LAUNCH = Indexes0.UNIQUE_STATUS_LAUNCH;
    public static final Index PATH_GIST_IDX = Indexes0.PATH_GIST_IDX;
    public static final Index PATH_IDX = Indexes0.PATH_IDX;
    public static final Index TEST_ITEM_PK = Indexes0.TEST_ITEM_PK;
    public static final Index TEST_ITEM_RESULTS_PK = Indexes0.TEST_ITEM_RESULTS_PK;
    public static final Index TICKET_PK = Indexes0.TICKET_PK;
    public static final Index TICKET_TICKET_ID_KEY = Indexes0.TICKET_TICKET_ID_KEY;
    public static final Index USER_FILTER_PK = Indexes0.USER_FILTER_PK;
    public static final Index USERS_LOGIN_KEY = Indexes0.USERS_LOGIN_KEY;
    public static final Index USERS_PK = Indexes0.USERS_PK;
    public static final Index WIDGET_ID = Indexes0.WIDGET_ID;
    public static final Index WIDGET_FILTER_PK = Indexes0.WIDGET_FILTER_PK;
    public static final Index WIDGET_OPTION_PK = Indexes0.WIDGET_OPTION_PK;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index ACTIVE_DIRECTORY_CONFIG_PK = Internal.createIndex("active_directory_config_pk", JActiveDirectoryConfig.ACTIVE_DIRECTORY_CONFIG, new OrderField[] { JActiveDirectoryConfig.ACTIVE_DIRECTORY_CONFIG.ID }, true);
        public static Index ACTIVITY_PK = Internal.createIndex("activity_pk", JActivity.ACTIVITY, new OrderField[] { JActivity.ACTIVITY.ID }, true);
        public static Index ATTRIBUTE_PK = Internal.createIndex("attribute_pk", JAttribute.ATTRIBUTE, new OrderField[] { JAttribute.ATTRIBUTE.ID }, true);
        public static Index AUTH_CONFIG_PK = Internal.createIndex("auth_config_pk", JAuthConfig.AUTH_CONFIG, new OrderField[] { JAuthConfig.AUTH_CONFIG.ID }, true);
        public static Index BUG_TRACKING_SYSTEM_PK = Internal.createIndex("bug_tracking_system_pk", JBugTrackingSystem.BUG_TRACKING_SYSTEM, new OrderField[] { JBugTrackingSystem.BUG_TRACKING_SYSTEM.ID }, true);
        public static Index UNIQUE_BTS = Internal.createIndex("unique_bts", JBugTrackingSystem.BUG_TRACKING_SYSTEM, new OrderField[] { JBugTrackingSystem.BUG_TRACKING_SYSTEM.URL, JBugTrackingSystem.BUG_TRACKING_SYSTEM.TYPE, JBugTrackingSystem.BUG_TRACKING_SYSTEM.BTS_PROJECT, JBugTrackingSystem.BUG_TRACKING_SYSTEM.PROJECT_ID }, true);
        public static Index DASHBOARD_PK = Internal.createIndex("dashboard_pk", JDashboard.DASHBOARD, new OrderField[] { JDashboard.DASHBOARD.ID }, true);
        public static Index UNQ_NAME_PROJECT = Internal.createIndex("unq_name_project", JDashboard.DASHBOARD, new OrderField[] { JDashboard.DASHBOARD.NAME, JDashboard.DASHBOARD.PROJECT_ID }, true);
        public static Index DASHBOARD_WIDGET_PK = Internal.createIndex("dashboard_widget_pk", JDashboardWidget.DASHBOARD_WIDGET, new OrderField[] { JDashboardWidget.DASHBOARD_WIDGET.DASHBOARD_ID, JDashboardWidget.DASHBOARD_WIDGET.WIDGET_ID }, true);
        public static Index WIDGET_ON_DASHBOARD_UNQ = Internal.createIndex("widget_on_dashboard_unq", JDashboardWidget.DASHBOARD_WIDGET, new OrderField[] { JDashboardWidget.DASHBOARD_WIDGET.DASHBOARD_ID, JDashboardWidget.DASHBOARD_WIDGET.WIDGET_NAME }, true);
        public static Index DEFECT_FIELD_ALLOWED_VALUE_PK = Internal.createIndex("defect_field_allowed_value_pk", JDefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE, new OrderField[] { JDefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE.ID }, true);
        public static Index DEFECT_FORM_FIELD_PK = Internal.createIndex("defect_form_field_pk", JDefectFormField.DEFECT_FORM_FIELD, new OrderField[] { JDefectFormField.DEFECT_FORM_FIELD.ID }, true);
        public static Index DEMO_DATA_POSTFIX_PK = Internal.createIndex("demo_data_postfix_pk", JDemoDataPostfix.DEMO_DATA_POSTFIX, new OrderField[] { JDemoDataPostfix.DEMO_DATA_POSTFIX.ID }, true);
        public static Index EMAIL_SENDER_CASE_PK = Internal.createIndex("email_sender_case_pk", JEmailSenderCase.EMAIL_SENDER_CASE, new OrderField[] { JEmailSenderCase.EMAIL_SENDER_CASE.ID }, true);
        public static Index FILTER_PK = Internal.createIndex("filter_pk", JFilter.FILTER, new OrderField[] { JFilter.FILTER.ID }, true);
        public static Index FILTER_CONDITION_PK = Internal.createIndex("filter_condition_pk", JFilterCondition.FILTER_CONDITION, new OrderField[] { JFilterCondition.FILTER_CONDITION.ID }, true);
        public static Index FILTER_SORT_PK = Internal.createIndex("filter_sort_pk", JFilterSort.FILTER_SORT, new OrderField[] { JFilterSort.FILTER_SORT.ID }, true);
        public static Index INTEGRATION_PK = Internal.createIndex("integration_pk", JIntegration.INTEGRATION, new OrderField[] { JIntegration.INTEGRATION.ID }, true);
        public static Index INTEGRATION_TYPE_PK = Internal.createIndex("integration_type_pk", JIntegrationType.INTEGRATION_TYPE, new OrderField[] { JIntegrationType.INTEGRATION_TYPE.ID }, true);
        public static Index ISSUE_PK = Internal.createIndex("issue_pk", JIssue.ISSUE, new OrderField[] { JIssue.ISSUE.ISSUE_ID }, true);
        public static Index ISSUE_GROUP_PK = Internal.createIndex("issue_group_pk", JIssueGroup.ISSUE_GROUP, new OrderField[] { JIssueGroup.ISSUE_GROUP.ISSUE_GROUP_ID }, true);
        public static Index ISSUE_TICKET_PK = Internal.createIndex("issue_ticket_pk", JIssueTicket.ISSUE_TICKET, new OrderField[] { JIssueTicket.ISSUE_TICKET.ISSUE_ID, JIssueTicket.ISSUE_TICKET.TICKET_ID }, true);
        public static Index ISSUE_TYPE_LOCATOR_KEY = Internal.createIndex("issue_type_locator_key", JIssueType.ISSUE_TYPE, new OrderField[] { JIssueType.ISSUE_TYPE.LOCATOR }, true);
        public static Index ISSUE_TYPE_PK = Internal.createIndex("issue_type_pk", JIssueType.ISSUE_TYPE, new OrderField[] { JIssueType.ISSUE_TYPE.ID }, true);
        public static Index ISSUE_TYPE_PROJECT_PK = Internal.createIndex("issue_type_project_pk", JIssueTypeProject.ISSUE_TYPE_PROJECT, new OrderField[] { JIssueTypeProject.ISSUE_TYPE_PROJECT.PROJECT_ID, JIssueTypeProject.ISSUE_TYPE_PROJECT.ISSUE_TYPE_ID }, true);
        public static Index ITEM_TAG_PK = Internal.createIndex("item_tag_pk", JItemTag.ITEM_TAG, new OrderField[] { JItemTag.ITEM_TAG.ID }, true);
        public static Index LAUNCH_PK = Internal.createIndex("launch_pk", JLaunch.LAUNCH, new OrderField[] { JLaunch.LAUNCH.ID }, true);
        public static Index UNQ_NAME_NUMBER = Internal.createIndex("unq_name_number", JLaunch.LAUNCH, new OrderField[] { JLaunch.LAUNCH.NAME, JLaunch.LAUNCH.NUMBER, JLaunch.LAUNCH.PROJECT_ID, JLaunch.LAUNCH.UUID }, true);
        public static Index LAUNCH_TAG_PK = Internal.createIndex("launch_tag_pk", JLaunchTag.LAUNCH_TAG, new OrderField[] { JLaunchTag.LAUNCH_TAG.ID }, true);
        public static Index LDAP_CONFIG_PK = Internal.createIndex("ldap_config_pk", JLdapConfig.LDAP_CONFIG, new OrderField[] { JLdapConfig.LDAP_CONFIG.ID }, true);
        public static Index LDAP_SYNCHRONIZATION_ATTRIBUTES_EMAIL_KEY = Internal.createIndex("ldap_synchronization_attributes_email_key", JLdapSynchronizationAttributes.LDAP_SYNCHRONIZATION_ATTRIBUTES, new OrderField[] { JLdapSynchronizationAttributes.LDAP_SYNCHRONIZATION_ATTRIBUTES.EMAIL }, true);
        public static Index LDAP_SYNCHRONIZATION_ATTRIBUTES_PK = Internal.createIndex("ldap_synchronization_attributes_pk", JLdapSynchronizationAttributes.LDAP_SYNCHRONIZATION_ATTRIBUTES, new OrderField[] { JLdapSynchronizationAttributes.LDAP_SYNCHRONIZATION_ATTRIBUTES.ID }, true);
        public static Index LOG_PK = Internal.createIndex("log_pk", JLog.LOG, new OrderField[] { JLog.LOG.ID }, true);
        public static Index ACCESS_TOKENS_PK = Internal.createIndex("access_tokens_pk", JOauthAccessToken.OAUTH_ACCESS_TOKEN, new OrderField[] { JOauthAccessToken.OAUTH_ACCESS_TOKEN.USER_ID, JOauthAccessToken.OAUTH_ACCESS_TOKEN.TOKEN_TYPE }, true);
        public static Index OAUTH_REGISTRATION_CLIENT_ID_KEY = Internal.createIndex("oauth_registration_client_id_key", JOauthRegistration.OAUTH_REGISTRATION, new OrderField[] { JOauthRegistration.OAUTH_REGISTRATION.CLIENT_ID }, true);
        public static Index OAUTH_REGISTRATION_PKEY = Internal.createIndex("oauth_registration_pkey", JOauthRegistration.OAUTH_REGISTRATION, new OrderField[] { JOauthRegistration.OAUTH_REGISTRATION.ID }, true);
        public static Index OAUTH_REGISTRATION_RESTRICTION_PK = Internal.createIndex("oauth_registration_restriction_pk", JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION, new OrderField[] { JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION.ID }, true);
        public static Index OAUTH_REGISTRATION_RESTRICTION_UNIQUE = Internal.createIndex("oauth_registration_restriction_unique", JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION, new OrderField[] { JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION.TYPE, JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION.VALUE, JOauthRegistrationRestriction.OAUTH_REGISTRATION_RESTRICTION.OAUTH_REGISTRATION_FK }, true);
        public static Index OAUTH_REGISTRATION_SCOPE_PK = Internal.createIndex("oauth_registration_scope_pk", JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE, new OrderField[] { JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE.ID }, true);
        public static Index OAUTH_REGISTRATION_SCOPE_UNIQUE = Internal.createIndex("oauth_registration_scope_unique", JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE, new OrderField[] { JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE.SCOPE, JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE.OAUTH_REGISTRATION_FK }, true);
        public static Index PROJECT_NAME_KEY = Internal.createIndex("project_name_key", JProject.PROJECT, new OrderField[] { JProject.PROJECT.NAME }, true);
        public static Index PROJECT_PK = Internal.createIndex("project_pk", JProject.PROJECT, new OrderField[] { JProject.PROJECT.ID }, true);
        public static Index UNIQUE_ATTRIBUTE_PER_PROJECT = Internal.createIndex("unique_attribute_per_project", JProjectAttribute.PROJECT_ATTRIBUTE, new OrderField[] { JProjectAttribute.PROJECT_ATTRIBUTE.ATTRIBUTE_ID, JProjectAttribute.PROJECT_ATTRIBUTE.PROJECT_ID }, true);
        public static Index USERS_PROJECT_PK = Internal.createIndex("users_project_pk", JProjectUser.PROJECT_USER, new OrderField[] { JProjectUser.PROJECT_USER.USER_ID, JProjectUser.PROJECT_USER.PROJECT_ID }, true);
        public static Index SERVER_SETTINGS_ID = Internal.createIndex("server_settings_id", JServerSettings.SERVER_SETTINGS, new OrderField[] { JServerSettings.SERVER_SETTINGS.ID }, true);
        public static Index SERVER_SETTINGS_KEY_KEY = Internal.createIndex("server_settings_key_key", JServerSettings.SERVER_SETTINGS, new OrderField[] { JServerSettings.SERVER_SETTINGS.KEY }, true);
        public static Index PK_STATISTICS = Internal.createIndex("pk_statistics", JStatistics.STATISTICS, new OrderField[] { JStatistics.STATISTICS.S_ID }, true);
        public static Index UNIQUE_STATUS_ITEM = Internal.createIndex("unique_status_item", JStatistics.STATISTICS, new OrderField[] { JStatistics.STATISTICS.S_FIELD, JStatistics.STATISTICS.ITEM_ID }, true);
        public static Index UNIQUE_STATUS_LAUNCH = Internal.createIndex("unique_status_launch", JStatistics.STATISTICS, new OrderField[] { JStatistics.STATISTICS.S_FIELD, JStatistics.STATISTICS.LAUNCH_ID }, true);
        public static Index PATH_GIST_IDX = Internal.createIndex("path_gist_idx", JTestItem.TEST_ITEM, new OrderField[] { JTestItem.TEST_ITEM.PATH }, false);
        public static Index PATH_IDX = Internal.createIndex("path_idx", JTestItem.TEST_ITEM, new OrderField[] { JTestItem.TEST_ITEM.PATH }, false);
        public static Index TEST_ITEM_PK = Internal.createIndex("test_item_pk", JTestItem.TEST_ITEM, new OrderField[] { JTestItem.TEST_ITEM.ITEM_ID }, true);
        public static Index TEST_ITEM_RESULTS_PK = Internal.createIndex("test_item_results_pk", JTestItemResults.TEST_ITEM_RESULTS, new OrderField[] { JTestItemResults.TEST_ITEM_RESULTS.RESULT_ID }, true);
        public static Index TICKET_PK = Internal.createIndex("ticket_pk", JTicket.TICKET, new OrderField[] { JTicket.TICKET.ID }, true);
        public static Index TICKET_TICKET_ID_KEY = Internal.createIndex("ticket_ticket_id_key", JTicket.TICKET, new OrderField[] { JTicket.TICKET.TICKET_ID }, true);
        public static Index USER_FILTER_PK = Internal.createIndex("user_filter_pk", JUserFilter.USER_FILTER, new OrderField[] { JUserFilter.USER_FILTER.ID }, true);
        public static Index USERS_LOGIN_KEY = Internal.createIndex("users_login_key", JUsers.USERS, new OrderField[] { JUsers.USERS.LOGIN }, true);
        public static Index USERS_PK = Internal.createIndex("users_pk", JUsers.USERS, new OrderField[] { JUsers.USERS.ID }, true);
        public static Index WIDGET_ID = Internal.createIndex("widget_id", JWidget.WIDGET, new OrderField[] { JWidget.WIDGET.ID }, true);
        public static Index WIDGET_FILTER_PK = Internal.createIndex("widget_filter_pk", JWidgetFilter.WIDGET_FILTER, new OrderField[] { JWidgetFilter.WIDGET_FILTER.WIDGET_ID, JWidgetFilter.WIDGET_FILTER.FILTER_ID }, true);
        public static Index WIDGET_OPTION_PK = Internal.createIndex("widget_option_pk", JWidgetOption.WIDGET_OPTION, new OrderField[] { JWidgetOption.WIDGET_OPTION.ID }, true);
    }
}

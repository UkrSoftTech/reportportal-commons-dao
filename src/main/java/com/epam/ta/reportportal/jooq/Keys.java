/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq;

import com.epam.ta.reportportal.jooq.tables.*;
import com.epam.ta.reportportal.jooq.tables.records.*;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;

import javax.annotation.Generated;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<BugTrackingSystemRecord, Integer> IDENTITY_BUG_TRACKING_SYSTEM = Identities0.IDENTITY_BUG_TRACKING_SYSTEM;
    public static final Identity<DashboardRecord, Integer> IDENTITY_DASHBOARD = Identities0.IDENTITY_DASHBOARD;
    public static final Identity<DefectFieldAllowedValueRecord, Integer> IDENTITY_DEFECT_FIELD_ALLOWED_VALUE = Identities0.IDENTITY_DEFECT_FIELD_ALLOWED_VALUE;
    public static final Identity<DefectFormFieldRecord, Integer> IDENTITY_DEFECT_FORM_FIELD = Identities0.IDENTITY_DEFECT_FORM_FIELD;
    public static final Identity<IssueRecord, Long> IDENTITY_ISSUE = Identities0.IDENTITY_ISSUE;
    public static final Identity<IssueTypeRecord, Integer> IDENTITY_ISSUE_TYPE = Identities0.IDENTITY_ISSUE_TYPE;
    public static final Identity<ItemTagRecord, Integer> IDENTITY_ITEM_TAG = Identities0.IDENTITY_ITEM_TAG;
    public static final Identity<LaunchRecord, Long> IDENTITY_LAUNCH = Identities0.IDENTITY_LAUNCH;
    public static final Identity<LaunchTagRecord, Long> IDENTITY_LAUNCH_TAG = Identities0.IDENTITY_LAUNCH_TAG;
    public static final Identity<LogRecord, Long> IDENTITY_LOG = Identities0.IDENTITY_LOG;
    public static final Identity<OauthRegistrationScopeRecord, Integer> IDENTITY_OAUTH_REGISTRATION_SCOPE = Identities0.IDENTITY_OAUTH_REGISTRATION_SCOPE;
    public static final Identity<ProjectRecord, Integer> IDENTITY_PROJECT = Identities0.IDENTITY_PROJECT;
    public static final Identity<ProjectConfigurationRecord, Integer> IDENTITY_PROJECT_CONFIGURATION = Identities0.IDENTITY_PROJECT_CONFIGURATION;
    public static final Identity<ProjectEmailConfigurationRecord, Integer> IDENTITY_PROJECT_EMAIL_CONFIGURATION = Identities0.IDENTITY_PROJECT_EMAIL_CONFIGURATION;
    public static final Identity<ServerSettingsRecord, Short> IDENTITY_SERVER_SETTINGS = Identities0.IDENTITY_SERVER_SETTINGS;
    public static final Identity<TestItemRecord, Long> IDENTITY_TEST_ITEM = Identities0.IDENTITY_TEST_ITEM;
    public static final Identity<TestItemResultsRecord, Long> IDENTITY_TEST_ITEM_RESULTS = Identities0.IDENTITY_TEST_ITEM_RESULTS;
    public static final Identity<TestItemStructureRecord, Long> IDENTITY_TEST_ITEM_STRUCTURE = Identities0.IDENTITY_TEST_ITEM_STRUCTURE;
    public static final Identity<TicketRecord, Long> IDENTITY_TICKET = Identities0.IDENTITY_TICKET;
    public static final Identity<UsersRecord, Integer> IDENTITY_USERS = Identities0.IDENTITY_USERS;
    public static final Identity<WidgetRecord, Integer> IDENTITY_WIDGET = Identities0.IDENTITY_WIDGET;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<BugTrackingSystemRecord> BUG_TRACKING_SYSTEM_PK = UniqueKeys0.BUG_TRACKING_SYSTEM_PK;
    public static final UniqueKey<DashboardRecord> DASHBOARD_PK = UniqueKeys0.DASHBOARD_PK;
    public static final UniqueKey<DashboardRecord> UNQ_NAME_PROJECT = UniqueKeys0.UNQ_NAME_PROJECT;
    public static final UniqueKey<DashboardWidgetRecord> DASHBOARD_WIDGET_PK = UniqueKeys0.DASHBOARD_WIDGET_PK;
    public static final UniqueKey<DashboardWidgetRecord> WIDGET_ON_DASHBOARD_UNQ = UniqueKeys0.WIDGET_ON_DASHBOARD_UNQ;
    public static final UniqueKey<DefectFieldAllowedValueRecord> DEFECT_FIELD_ALLOWED_VALUE_PK = UniqueKeys0.DEFECT_FIELD_ALLOWED_VALUE_PK;
    public static final UniqueKey<DefectFormFieldRecord> DEFECT_FORM_FIELD_PK = UniqueKeys0.DEFECT_FORM_FIELD_PK;
    public static final UniqueKey<IssueRecord> ISSUE_PK = UniqueKeys0.ISSUE_PK;
    public static final UniqueKey<IssueRecord> ISSUE_TEST_ITEM_RESULTS_ID_KEY = UniqueKeys0.ISSUE_TEST_ITEM_RESULTS_ID_KEY;
    public static final UniqueKey<IssueTicketRecord> ISSUE_TICKET_PK = UniqueKeys0.ISSUE_TICKET_PK;
    public static final UniqueKey<IssueTypeRecord> ISSUE_TYPE_PK = UniqueKeys0.ISSUE_TYPE_PK;
    public static final UniqueKey<IssueTypeProjectConfigurationRecord> ISSUE_TYPE_PROJECT_CONFIGURATION_PK = UniqueKeys0.ISSUE_TYPE_PROJECT_CONFIGURATION_PK;
    public static final UniqueKey<ItemTagRecord> ITEM_TAG_PK = UniqueKeys0.ITEM_TAG_PK;
    public static final UniqueKey<LaunchRecord> LAUNCH_PK = UniqueKeys0.LAUNCH_PK;
    public static final UniqueKey<LaunchRecord> UNQ_NAME_NUMBER = UniqueKeys0.UNQ_NAME_NUMBER;
    public static final UniqueKey<LaunchTagRecord> LAUNCH_TAG_PK = UniqueKeys0.LAUNCH_TAG_PK;
    public static final UniqueKey<LogRecord> LOG_PK = UniqueKeys0.LOG_PK;
    public static final UniqueKey<OauthAccessTokenRecord> ACCESS_TOKENS_PK = UniqueKeys0.ACCESS_TOKENS_PK;
    public static final UniqueKey<OauthRegistrationRecord> OAUTH_REGISTRATION_PKEY = UniqueKeys0.OAUTH_REGISTRATION_PKEY;
    public static final UniqueKey<OauthRegistrationRecord> OAUTH_REGISTRATION_CLIENT_ID_KEY = UniqueKeys0.OAUTH_REGISTRATION_CLIENT_ID_KEY;
    public static final UniqueKey<OauthRegistrationScopeRecord> OAUTH_REGISTRATION_SCOPE_PK = UniqueKeys0.OAUTH_REGISTRATION_SCOPE_PK;
    public static final UniqueKey<ProjectRecord> PROJECT_PK = UniqueKeys0.PROJECT_PK;
    public static final UniqueKey<ProjectRecord> PROJECT_PROJECT_CONFIGURATION_ID_KEY = UniqueKeys0.PROJECT_PROJECT_CONFIGURATION_ID_KEY;
    public static final UniqueKey<ProjectConfigurationRecord> PROJECT_CONFIGURATION_PK = UniqueKeys0.PROJECT_CONFIGURATION_PK;
    public static final UniqueKey<ProjectConfigurationRecord> PROJECT_CONFIGURATION_EMAIL_CONFIGURATION_ID_KEY = UniqueKeys0.PROJECT_CONFIGURATION_EMAIL_CONFIGURATION_ID_KEY;
    public static final UniqueKey<ProjectEmailConfigurationRecord> PROJECT_EMAIL_CONFIGURATION_PK = UniqueKeys0.PROJECT_EMAIL_CONFIGURATION_PK;
    public static final UniqueKey<ProjectUserRecord> USERS_PROJECT_PK = UniqueKeys0.USERS_PROJECT_PK;
    public static final UniqueKey<ServerSettingsRecord> SERVER_SETTINGS_ID = UniqueKeys0.SERVER_SETTINGS_ID;
    public static final UniqueKey<TestItemRecord> TEST_ITEM_PK = UniqueKeys0.TEST_ITEM_PK;
    public static final UniqueKey<TestItemResultsRecord> TEST_ITEM_RESULTS_PK = UniqueKeys0.TEST_ITEM_RESULTS_PK;
    public static final UniqueKey<TestItemResultsRecord> TEST_ITEM_RESULTS_ITEM_ID_KEY = UniqueKeys0.TEST_ITEM_RESULTS_ITEM_ID_KEY;
    public static final UniqueKey<TestItemStructureRecord> TEST_ITEM_STRUCTURE_PK = UniqueKeys0.TEST_ITEM_STRUCTURE_PK;
    public static final UniqueKey<TestItemStructureRecord> TEST_ITEM_STRUCTURE_ITEM_ID_KEY = UniqueKeys0.TEST_ITEM_STRUCTURE_ITEM_ID_KEY;
    public static final UniqueKey<TicketRecord> TICKET_PK = UniqueKeys0.TICKET_PK;
    public static final UniqueKey<TicketRecord> TICKET_TICKET_ID_KEY = UniqueKeys0.TICKET_TICKET_ID_KEY;
    public static final UniqueKey<UsersRecord> USERS_PK = UniqueKeys0.USERS_PK;
    public static final UniqueKey<UsersRecord> USERS_LOGIN_KEY = UniqueKeys0.USERS_LOGIN_KEY;
    public static final UniqueKey<WidgetRecord> WIDGET_ID = UniqueKeys0.WIDGET_ID;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<DashboardRecord, ProjectRecord> DASHBOARD__DASHBOARD_PROJECT_ID_FKEY = ForeignKeys0.DASHBOARD__DASHBOARD_PROJECT_ID_FKEY;
    public static final ForeignKey<DashboardWidgetRecord, DashboardRecord> DASHBOARD_WIDGET__DASHBOARD_WIDGET_DASHBOARD_ID_FKEY = ForeignKeys0.DASHBOARD_WIDGET__DASHBOARD_WIDGET_DASHBOARD_ID_FKEY;
    public static final ForeignKey<DashboardWidgetRecord, WidgetRecord> DASHBOARD_WIDGET__DASHBOARD_WIDGET_WIDGET_ID_FKEY = ForeignKeys0.DASHBOARD_WIDGET__DASHBOARD_WIDGET_WIDGET_ID_FKEY;
    public static final ForeignKey<DefectFieldAllowedValueRecord, DefectFormFieldRecord> DEFECT_FIELD_ALLOWED_VALUE__DEFECT_FIELD_ALLOWED_VALUE_DEFECT_FORM_FIELD_FKEY = ForeignKeys0.DEFECT_FIELD_ALLOWED_VALUE__DEFECT_FIELD_ALLOWED_VALUE_DEFECT_FORM_FIELD_FKEY;
    public static final ForeignKey<DefectFormFieldRecord, BugTrackingSystemRecord> DEFECT_FORM_FIELD__DEFECT_FORM_FIELD_BUGTRACKING_SYSTEM_FKEY = ForeignKeys0.DEFECT_FORM_FIELD__DEFECT_FORM_FIELD_BUGTRACKING_SYSTEM_FKEY;
    public static final ForeignKey<IssueRecord, IssueTypeRecord> ISSUE__ISSUE_ISSUE_TYPE_FKEY = ForeignKeys0.ISSUE__ISSUE_ISSUE_TYPE_FKEY;
    public static final ForeignKey<IssueRecord, TestItemResultsRecord> ISSUE__ISSUE_TEST_ITEM_RESULTS_ID_FKEY = ForeignKeys0.ISSUE__ISSUE_TEST_ITEM_RESULTS_ID_FKEY;
    public static final ForeignKey<IssueTicketRecord, IssueRecord> ISSUE_TICKET__ISSUE_TICKET_ISSUE_ID_FKEY = ForeignKeys0.ISSUE_TICKET__ISSUE_TICKET_ISSUE_ID_FKEY;
    public static final ForeignKey<IssueTicketRecord, TicketRecord> ISSUE_TICKET__ISSUE_TICKET_TICKET_ID_FKEY = ForeignKeys0.ISSUE_TICKET__ISSUE_TICKET_TICKET_ID_FKEY;
    public static final ForeignKey<IssueTypeProjectConfigurationRecord, ProjectConfigurationRecord> ISSUE_TYPE_PROJECT_CONFIGURATION__ISSUE_TYPE_PROJECT_CONFIGURATION_CONFIGURATION_ID_FKEY = ForeignKeys0.ISSUE_TYPE_PROJECT_CONFIGURATION__ISSUE_TYPE_PROJECT_CONFIGURATION_CONFIGURATION_ID_FKEY;
    public static final ForeignKey<IssueTypeProjectConfigurationRecord, IssueTypeRecord> ISSUE_TYPE_PROJECT_CONFIGURATION__ISSUE_TYPE_PROJECT_CONFIGURATION_ISSUE_TYPE_ID_FKEY = ForeignKeys0.ISSUE_TYPE_PROJECT_CONFIGURATION__ISSUE_TYPE_PROJECT_CONFIGURATION_ISSUE_TYPE_ID_FKEY;
    public static final ForeignKey<ItemTagRecord, TestItemRecord> ITEM_TAG__ITEM_TAG_ITEM_ID_FKEY = ForeignKeys0.ITEM_TAG__ITEM_TAG_ITEM_ID_FKEY;
    public static final ForeignKey<LaunchRecord, ProjectRecord> LAUNCH__LAUNCH_PROJECT_ID_FKEY = ForeignKeys0.LAUNCH__LAUNCH_PROJECT_ID_FKEY;
    public static final ForeignKey<LaunchRecord, UsersRecord> LAUNCH__LAUNCH_USER_ID_FKEY = ForeignKeys0.LAUNCH__LAUNCH_USER_ID_FKEY;
    public static final ForeignKey<LaunchTagRecord, LaunchRecord> LAUNCH_TAG__LAUNCH_TAG_LAUNCH_ID_FKEY = ForeignKeys0.LAUNCH_TAG__LAUNCH_TAG_LAUNCH_ID_FKEY;
    public static final ForeignKey<LogRecord, TestItemRecord> LOG__LOG_ITEM_ID_FKEY = ForeignKeys0.LOG__LOG_ITEM_ID_FKEY;
    public static final ForeignKey<OauthAccessTokenRecord, UsersRecord> OAUTH_ACCESS_TOKEN__OAUTH_ACCESS_TOKEN_USER_ID_FKEY = ForeignKeys0.OAUTH_ACCESS_TOKEN__OAUTH_ACCESS_TOKEN_USER_ID_FKEY;
    public static final ForeignKey<OauthRegistrationScopeRecord, OauthRegistrationRecord> OAUTH_REGISTRATION_SCOPE__OAUTH_REGISTRATION_SCOPE_OAUTH_REGISTRATION_FK_FKEY = ForeignKeys0.OAUTH_REGISTRATION_SCOPE__OAUTH_REGISTRATION_SCOPE_OAUTH_REGISTRATION_FK_FKEY;
    public static final ForeignKey<ProjectRecord, ProjectConfigurationRecord> PROJECT__PROJECT_PROJECT_CONFIGURATION_ID_FKEY = ForeignKeys0.PROJECT__PROJECT_PROJECT_CONFIGURATION_ID_FKEY;
    public static final ForeignKey<ProjectConfigurationRecord, ProjectEmailConfigurationRecord> PROJECT_CONFIGURATION__PROJECT_CONFIGURATION_EMAIL_CONFIGURATION_ID_FKEY = ForeignKeys0.PROJECT_CONFIGURATION__PROJECT_CONFIGURATION_EMAIL_CONFIGURATION_ID_FKEY;
    public static final ForeignKey<ProjectUserRecord, UsersRecord> PROJECT_USER__PROJECT_USER_USER_ID_FKEY = ForeignKeys0.PROJECT_USER__PROJECT_USER_USER_ID_FKEY;
    public static final ForeignKey<ProjectUserRecord, ProjectRecord> PROJECT_USER__PROJECT_USER_PROJECT_ID_FKEY = ForeignKeys0.PROJECT_USER__PROJECT_USER_PROJECT_ID_FKEY;
    public static final ForeignKey<TestItemResultsRecord, TestItemRecord> TEST_ITEM_RESULTS__TEST_ITEM_RESULTS_ITEM_ID_FKEY = ForeignKeys0.TEST_ITEM_RESULTS__TEST_ITEM_RESULTS_ITEM_ID_FKEY;
    public static final ForeignKey<TestItemStructureRecord, TestItemRecord> TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_ITEM_ID_FKEY = ForeignKeys0.TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_ITEM_ID_FKEY;
    public static final ForeignKey<TestItemStructureRecord, LaunchRecord> TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_LAUNCH_ID_FKEY = ForeignKeys0.TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_LAUNCH_ID_FKEY;
    public static final ForeignKey<TestItemStructureRecord, TestItemStructureRecord> TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_PARENT_ID_FKEY = ForeignKeys0.TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_PARENT_ID_FKEY;
    public static final ForeignKey<TestItemStructureRecord, TestItemStructureRecord> TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_RETRY_OF_FKEY = ForeignKeys0.TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_RETRY_OF_FKEY;
    public static final ForeignKey<TicketRecord, UsersRecord> TICKET__TICKET_SUBMITTER_ID_FKEY = ForeignKeys0.TICKET__TICKET_SUBMITTER_ID_FKEY;
    public static final ForeignKey<TicketRecord, BugTrackingSystemRecord> TICKET__TICKET_BTS_ID_FKEY = ForeignKeys0.TICKET__TICKET_BTS_ID_FKEY;
    public static final ForeignKey<UsersRecord, ProjectRecord> USERS__USERS_DEFAULT_PROJECT_ID_FKEY = ForeignKeys0.USERS__USERS_DEFAULT_PROJECT_ID_FKEY;
    public static final ForeignKey<WidgetRecord, ProjectRecord> WIDGET__WIDGET_PROJECT_ID_FKEY = ForeignKeys0.WIDGET__WIDGET_PROJECT_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<BugTrackingSystemRecord, Integer> IDENTITY_BUG_TRACKING_SYSTEM = createIdentity(BugTrackingSystem.BUG_TRACKING_SYSTEM, BugTrackingSystem.BUG_TRACKING_SYSTEM.ID);
        public static Identity<DashboardRecord, Integer> IDENTITY_DASHBOARD = createIdentity(Dashboard.DASHBOARD, Dashboard.DASHBOARD.ID);
        public static Identity<DefectFieldAllowedValueRecord, Integer> IDENTITY_DEFECT_FIELD_ALLOWED_VALUE = createIdentity(DefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE, DefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE.ID);
        public static Identity<DefectFormFieldRecord, Integer> IDENTITY_DEFECT_FORM_FIELD = createIdentity(DefectFormField.DEFECT_FORM_FIELD, DefectFormField.DEFECT_FORM_FIELD.ID);
        public static Identity<IssueRecord, Long> IDENTITY_ISSUE = createIdentity(Issue.ISSUE, Issue.ISSUE.ID);
        public static Identity<IssueTypeRecord, Integer> IDENTITY_ISSUE_TYPE = createIdentity(IssueType.ISSUE_TYPE, IssueType.ISSUE_TYPE.ID);
        public static Identity<ItemTagRecord, Integer> IDENTITY_ITEM_TAG = createIdentity(ItemTag.ITEM_TAG, ItemTag.ITEM_TAG.ID);
        public static Identity<LaunchRecord, Long> IDENTITY_LAUNCH = createIdentity(Launch.LAUNCH, Launch.LAUNCH.ID);
        public static Identity<LaunchTagRecord, Long> IDENTITY_LAUNCH_TAG = createIdentity(LaunchTag.LAUNCH_TAG, LaunchTag.LAUNCH_TAG.ID);
        public static Identity<LogRecord, Long> IDENTITY_LOG = createIdentity(Log.LOG, Log.LOG.ID);
        public static Identity<OauthRegistrationScopeRecord, Integer> IDENTITY_OAUTH_REGISTRATION_SCOPE = createIdentity(OauthRegistrationScope.OAUTH_REGISTRATION_SCOPE, OauthRegistrationScope.OAUTH_REGISTRATION_SCOPE.ID);
        public static Identity<ProjectRecord, Integer> IDENTITY_PROJECT = createIdentity(Project.PROJECT, Project.PROJECT.ID);
        public static Identity<ProjectConfigurationRecord, Integer> IDENTITY_PROJECT_CONFIGURATION = createIdentity(ProjectConfiguration.PROJECT_CONFIGURATION, ProjectConfiguration.PROJECT_CONFIGURATION.ID);
        public static Identity<ProjectEmailConfigurationRecord, Integer> IDENTITY_PROJECT_EMAIL_CONFIGURATION = createIdentity(ProjectEmailConfiguration.PROJECT_EMAIL_CONFIGURATION, ProjectEmailConfiguration.PROJECT_EMAIL_CONFIGURATION.ID);
        public static Identity<ServerSettingsRecord, Short> IDENTITY_SERVER_SETTINGS = createIdentity(ServerSettings.SERVER_SETTINGS, ServerSettings.SERVER_SETTINGS.ID);
        public static Identity<TestItemRecord, Long> IDENTITY_TEST_ITEM = createIdentity(TestItem.TEST_ITEM, TestItem.TEST_ITEM.ID);
        public static Identity<TestItemResultsRecord, Long> IDENTITY_TEST_ITEM_RESULTS = createIdentity(TestItemResults.TEST_ITEM_RESULTS, TestItemResults.TEST_ITEM_RESULTS.ID);
        public static Identity<TestItemStructureRecord, Long> IDENTITY_TEST_ITEM_STRUCTURE = createIdentity(TestItemStructure.TEST_ITEM_STRUCTURE, TestItemStructure.TEST_ITEM_STRUCTURE.ID);
        public static Identity<TicketRecord, Long> IDENTITY_TICKET = createIdentity(Ticket.TICKET, Ticket.TICKET.ID);
        public static Identity<UsersRecord, Integer> IDENTITY_USERS = createIdentity(Users.USERS, Users.USERS.ID);
        public static Identity<WidgetRecord, Integer> IDENTITY_WIDGET = createIdentity(Widget.WIDGET, Widget.WIDGET.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<BugTrackingSystemRecord> BUG_TRACKING_SYSTEM_PK = createUniqueKey(BugTrackingSystem.BUG_TRACKING_SYSTEM, "bug_tracking_system_pk", BugTrackingSystem.BUG_TRACKING_SYSTEM.ID);
        public static final UniqueKey<DashboardRecord> DASHBOARD_PK = createUniqueKey(Dashboard.DASHBOARD, "dashboard_pk", Dashboard.DASHBOARD.ID);
        public static final UniqueKey<DashboardRecord> UNQ_NAME_PROJECT = createUniqueKey(Dashboard.DASHBOARD, "unq_name_project", Dashboard.DASHBOARD.NAME, Dashboard.DASHBOARD.PROJECT_ID);
        public static final UniqueKey<DashboardWidgetRecord> DASHBOARD_WIDGET_PK = createUniqueKey(DashboardWidget.DASHBOARD_WIDGET, "dashboard_widget_pk", DashboardWidget.DASHBOARD_WIDGET.DASHBOARD_ID, DashboardWidget.DASHBOARD_WIDGET.WIDGET_ID);
        public static final UniqueKey<DashboardWidgetRecord> WIDGET_ON_DASHBOARD_UNQ = createUniqueKey(DashboardWidget.DASHBOARD_WIDGET, "widget_on_dashboard_unq", DashboardWidget.DASHBOARD_WIDGET.DASHBOARD_ID, DashboardWidget.DASHBOARD_WIDGET.WIDGET_NAME);
        public static final UniqueKey<DefectFieldAllowedValueRecord> DEFECT_FIELD_ALLOWED_VALUE_PK = createUniqueKey(DefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE, "defect_field_allowed_value_pk", DefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE.ID);
        public static final UniqueKey<DefectFormFieldRecord> DEFECT_FORM_FIELD_PK = createUniqueKey(DefectFormField.DEFECT_FORM_FIELD, "defect_form_field_pk", DefectFormField.DEFECT_FORM_FIELD.ID);
        public static final UniqueKey<IssueRecord> ISSUE_PK = createUniqueKey(Issue.ISSUE, "issue_pk", Issue.ISSUE.ID);
        public static final UniqueKey<IssueRecord> ISSUE_TEST_ITEM_RESULTS_ID_KEY = createUniqueKey(Issue.ISSUE, "issue_test_item_results_id_key", Issue.ISSUE.TEST_ITEM_RESULTS_ID);
        public static final UniqueKey<IssueTicketRecord> ISSUE_TICKET_PK = createUniqueKey(IssueTicket.ISSUE_TICKET, "issue_ticket_pk", IssueTicket.ISSUE_TICKET.ISSUE_ID, IssueTicket.ISSUE_TICKET.TICKET_ID);
        public static final UniqueKey<IssueTypeRecord> ISSUE_TYPE_PK = createUniqueKey(IssueType.ISSUE_TYPE, "issue_type_pk", IssueType.ISSUE_TYPE.ID);
        public static final UniqueKey<IssueTypeProjectConfigurationRecord> ISSUE_TYPE_PROJECT_CONFIGURATION_PK = createUniqueKey(IssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION, "issue_type_project_configuration_pk", IssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION.CONFIGURATION_ID, IssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION.ISSUE_TYPE_ID);
        public static final UniqueKey<ItemTagRecord> ITEM_TAG_PK = createUniqueKey(ItemTag.ITEM_TAG, "item_tag_pk", ItemTag.ITEM_TAG.ID);
        public static final UniqueKey<LaunchRecord> LAUNCH_PK = createUniqueKey(Launch.LAUNCH, "launch_pk", Launch.LAUNCH.ID);
        public static final UniqueKey<LaunchRecord> UNQ_NAME_NUMBER = createUniqueKey(Launch.LAUNCH, "unq_name_number", Launch.LAUNCH.NAME, Launch.LAUNCH.NUMBER, Launch.LAUNCH.PROJECT_ID);
        public static final UniqueKey<LaunchTagRecord> LAUNCH_TAG_PK = createUniqueKey(LaunchTag.LAUNCH_TAG, "launch_tag_pk", LaunchTag.LAUNCH_TAG.ID);
        public static final UniqueKey<LogRecord> LOG_PK = createUniqueKey(Log.LOG, "log_pk", Log.LOG.ID);
        public static final UniqueKey<OauthAccessTokenRecord> ACCESS_TOKENS_PK = createUniqueKey(OauthAccessToken.OAUTH_ACCESS_TOKEN, "access_tokens_pk", OauthAccessToken.OAUTH_ACCESS_TOKEN.USER_ID, OauthAccessToken.OAUTH_ACCESS_TOKEN.TOKEN_TYPE);
        public static final UniqueKey<OauthRegistrationRecord> OAUTH_REGISTRATION_PKEY = createUniqueKey(OauthRegistration.OAUTH_REGISTRATION, "oauth_registration_pkey", OauthRegistration.OAUTH_REGISTRATION.ID);
        public static final UniqueKey<OauthRegistrationRecord> OAUTH_REGISTRATION_CLIENT_ID_KEY = createUniqueKey(OauthRegistration.OAUTH_REGISTRATION, "oauth_registration_client_id_key", OauthRegistration.OAUTH_REGISTRATION.CLIENT_ID);
        public static final UniqueKey<OauthRegistrationScopeRecord> OAUTH_REGISTRATION_SCOPE_PK = createUniqueKey(OauthRegistrationScope.OAUTH_REGISTRATION_SCOPE, "oauth_registration_scope_pk", OauthRegistrationScope.OAUTH_REGISTRATION_SCOPE.ID);
        public static final UniqueKey<ProjectRecord> PROJECT_PK = createUniqueKey(Project.PROJECT, "project_pk", Project.PROJECT.ID);
        public static final UniqueKey<ProjectRecord> PROJECT_PROJECT_CONFIGURATION_ID_KEY = createUniqueKey(Project.PROJECT, "project_project_configuration_id_key", Project.PROJECT.PROJECT_CONFIGURATION_ID);
        public static final UniqueKey<ProjectConfigurationRecord> PROJECT_CONFIGURATION_PK = createUniqueKey(ProjectConfiguration.PROJECT_CONFIGURATION, "project_configuration_pk", ProjectConfiguration.PROJECT_CONFIGURATION.ID);
        public static final UniqueKey<ProjectConfigurationRecord> PROJECT_CONFIGURATION_EMAIL_CONFIGURATION_ID_KEY = createUniqueKey(ProjectConfiguration.PROJECT_CONFIGURATION, "project_configuration_email_configuration_id_key", ProjectConfiguration.PROJECT_CONFIGURATION.EMAIL_CONFIGURATION_ID);
        public static final UniqueKey<ProjectEmailConfigurationRecord> PROJECT_EMAIL_CONFIGURATION_PK = createUniqueKey(ProjectEmailConfiguration.PROJECT_EMAIL_CONFIGURATION, "project_email_configuration_pk", ProjectEmailConfiguration.PROJECT_EMAIL_CONFIGURATION.ID);
        public static final UniqueKey<ProjectUserRecord> USERS_PROJECT_PK = createUniqueKey(ProjectUser.PROJECT_USER, "users_project_pk", ProjectUser.PROJECT_USER.USER_ID, ProjectUser.PROJECT_USER.PROJECT_ID);
        public static final UniqueKey<ServerSettingsRecord> SERVER_SETTINGS_ID = createUniqueKey(ServerSettings.SERVER_SETTINGS, "server_settings_id", ServerSettings.SERVER_SETTINGS.ID);
        public static final UniqueKey<TestItemRecord> TEST_ITEM_PK = createUniqueKey(TestItem.TEST_ITEM, "test_item_pk", TestItem.TEST_ITEM.ID);
        public static final UniqueKey<TestItemResultsRecord> TEST_ITEM_RESULTS_PK = createUniqueKey(TestItemResults.TEST_ITEM_RESULTS, "test_item_results_pk", TestItemResults.TEST_ITEM_RESULTS.ID);
        public static final UniqueKey<TestItemResultsRecord> TEST_ITEM_RESULTS_ITEM_ID_KEY = createUniqueKey(TestItemResults.TEST_ITEM_RESULTS, "test_item_results_item_id_key", TestItemResults.TEST_ITEM_RESULTS.ITEM_ID);
        public static final UniqueKey<TestItemStructureRecord> TEST_ITEM_STRUCTURE_PK = createUniqueKey(TestItemStructure.TEST_ITEM_STRUCTURE, "test_item_structure_pk", TestItemStructure.TEST_ITEM_STRUCTURE.ID);
        public static final UniqueKey<TestItemStructureRecord> TEST_ITEM_STRUCTURE_ITEM_ID_KEY = createUniqueKey(TestItemStructure.TEST_ITEM_STRUCTURE, "test_item_structure_item_id_key", TestItemStructure.TEST_ITEM_STRUCTURE.ITEM_ID);
        public static final UniqueKey<TicketRecord> TICKET_PK = createUniqueKey(Ticket.TICKET, "ticket_pk", Ticket.TICKET.ID);
        public static final UniqueKey<TicketRecord> TICKET_TICKET_ID_KEY = createUniqueKey(Ticket.TICKET, "ticket_ticket_id_key", Ticket.TICKET.TICKET_ID);
        public static final UniqueKey<UsersRecord> USERS_PK = createUniqueKey(Users.USERS, "users_pk", Users.USERS.ID);
        public static final UniqueKey<UsersRecord> USERS_LOGIN_KEY = createUniqueKey(Users.USERS, "users_login_key", Users.USERS.LOGIN);
        public static final UniqueKey<WidgetRecord> WIDGET_ID = createUniqueKey(Widget.WIDGET, "widget_id", Widget.WIDGET.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<DashboardRecord, ProjectRecord> DASHBOARD__DASHBOARD_PROJECT_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.PROJECT_PK, Dashboard.DASHBOARD, "dashboard__dashboard_project_id_fkey", Dashboard.DASHBOARD.PROJECT_ID);
        public static final ForeignKey<DashboardWidgetRecord, DashboardRecord> DASHBOARD_WIDGET__DASHBOARD_WIDGET_DASHBOARD_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.DASHBOARD_PK, DashboardWidget.DASHBOARD_WIDGET, "dashboard_widget__dashboard_widget_dashboard_id_fkey", DashboardWidget.DASHBOARD_WIDGET.DASHBOARD_ID);
        public static final ForeignKey<DashboardWidgetRecord, WidgetRecord> DASHBOARD_WIDGET__DASHBOARD_WIDGET_WIDGET_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.WIDGET_ID, DashboardWidget.DASHBOARD_WIDGET, "dashboard_widget__dashboard_widget_widget_id_fkey", DashboardWidget.DASHBOARD_WIDGET.WIDGET_ID);
        public static final ForeignKey<DefectFieldAllowedValueRecord, DefectFormFieldRecord> DEFECT_FIELD_ALLOWED_VALUE__DEFECT_FIELD_ALLOWED_VALUE_DEFECT_FORM_FIELD_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.DEFECT_FORM_FIELD_PK, DefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE, "defect_field_allowed_value__defect_field_allowed_value_defect_form_field_fkey", DefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE.DEFECT_FORM_FIELD);
        public static final ForeignKey<DefectFormFieldRecord, BugTrackingSystemRecord> DEFECT_FORM_FIELD__DEFECT_FORM_FIELD_BUGTRACKING_SYSTEM_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.BUG_TRACKING_SYSTEM_PK, DefectFormField.DEFECT_FORM_FIELD, "defect_form_field__defect_form_field_bugtracking_system_fkey", DefectFormField.DEFECT_FORM_FIELD.BUGTRACKING_SYSTEM);
        public static final ForeignKey<IssueRecord, IssueTypeRecord> ISSUE__ISSUE_ISSUE_TYPE_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.ISSUE_TYPE_PK, Issue.ISSUE, "issue__issue_issue_type_fkey", Issue.ISSUE.ISSUE_TYPE);
        public static final ForeignKey<IssueRecord, TestItemResultsRecord> ISSUE__ISSUE_TEST_ITEM_RESULTS_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.TEST_ITEM_RESULTS_PK, Issue.ISSUE, "issue__issue_test_item_results_id_fkey", Issue.ISSUE.TEST_ITEM_RESULTS_ID);
        public static final ForeignKey<IssueTicketRecord, IssueRecord> ISSUE_TICKET__ISSUE_TICKET_ISSUE_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.ISSUE_PK, IssueTicket.ISSUE_TICKET, "issue_ticket__issue_ticket_issue_id_fkey", IssueTicket.ISSUE_TICKET.ISSUE_ID);
        public static final ForeignKey<IssueTicketRecord, TicketRecord> ISSUE_TICKET__ISSUE_TICKET_TICKET_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.TICKET_PK, IssueTicket.ISSUE_TICKET, "issue_ticket__issue_ticket_ticket_id_fkey", IssueTicket.ISSUE_TICKET.TICKET_ID);
        public static final ForeignKey<IssueTypeProjectConfigurationRecord, ProjectConfigurationRecord> ISSUE_TYPE_PROJECT_CONFIGURATION__ISSUE_TYPE_PROJECT_CONFIGURATION_CONFIGURATION_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.PROJECT_CONFIGURATION_PK, IssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION, "issue_type_project_configuration__issue_type_project_configuration_configuration_id_fkey", IssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION.CONFIGURATION_ID);
        public static final ForeignKey<IssueTypeProjectConfigurationRecord, IssueTypeRecord> ISSUE_TYPE_PROJECT_CONFIGURATION__ISSUE_TYPE_PROJECT_CONFIGURATION_ISSUE_TYPE_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.ISSUE_TYPE_PK, IssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION, "issue_type_project_configuration__issue_type_project_configuration_issue_type_id_fkey", IssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION.ISSUE_TYPE_ID);
        public static final ForeignKey<ItemTagRecord, TestItemRecord> ITEM_TAG__ITEM_TAG_ITEM_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.TEST_ITEM_PK, ItemTag.ITEM_TAG, "item_tag__item_tag_item_id_fkey", ItemTag.ITEM_TAG.ITEM_ID);
        public static final ForeignKey<LaunchRecord, ProjectRecord> LAUNCH__LAUNCH_PROJECT_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.PROJECT_PK, Launch.LAUNCH, "launch__launch_project_id_fkey", Launch.LAUNCH.PROJECT_ID);
        public static final ForeignKey<LaunchRecord, UsersRecord> LAUNCH__LAUNCH_USER_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.USERS_PK, Launch.LAUNCH, "launch__launch_user_id_fkey", Launch.LAUNCH.USER_ID);
        public static final ForeignKey<LaunchTagRecord, LaunchRecord> LAUNCH_TAG__LAUNCH_TAG_LAUNCH_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.LAUNCH_PK, LaunchTag.LAUNCH_TAG, "launch_tag__launch_tag_launch_id_fkey", LaunchTag.LAUNCH_TAG.LAUNCH_ID);
        public static final ForeignKey<LogRecord, TestItemRecord> LOG__LOG_ITEM_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.TEST_ITEM_PK, Log.LOG, "log__log_item_id_fkey", Log.LOG.ITEM_ID);
        public static final ForeignKey<OauthAccessTokenRecord, UsersRecord> OAUTH_ACCESS_TOKEN__OAUTH_ACCESS_TOKEN_USER_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.USERS_PK, OauthAccessToken.OAUTH_ACCESS_TOKEN, "oauth_access_token__oauth_access_token_user_id_fkey", OauthAccessToken.OAUTH_ACCESS_TOKEN.USER_ID);
        public static final ForeignKey<OauthRegistrationScopeRecord, OauthRegistrationRecord> OAUTH_REGISTRATION_SCOPE__OAUTH_REGISTRATION_SCOPE_OAUTH_REGISTRATION_FK_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.OAUTH_REGISTRATION_PKEY, OauthRegistrationScope.OAUTH_REGISTRATION_SCOPE, "oauth_registration_scope__oauth_registration_scope_oauth_registration_fk_fkey", OauthRegistrationScope.OAUTH_REGISTRATION_SCOPE.OAUTH_REGISTRATION_FK);
        public static final ForeignKey<ProjectRecord, ProjectConfigurationRecord> PROJECT__PROJECT_PROJECT_CONFIGURATION_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.PROJECT_CONFIGURATION_PK, Project.PROJECT, "project__project_project_configuration_id_fkey", Project.PROJECT.PROJECT_CONFIGURATION_ID);
        public static final ForeignKey<ProjectConfigurationRecord, ProjectEmailConfigurationRecord> PROJECT_CONFIGURATION__PROJECT_CONFIGURATION_EMAIL_CONFIGURATION_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.PROJECT_EMAIL_CONFIGURATION_PK, ProjectConfiguration.PROJECT_CONFIGURATION, "project_configuration__project_configuration_email_configuration_id_fkey", ProjectConfiguration.PROJECT_CONFIGURATION.EMAIL_CONFIGURATION_ID);
        public static final ForeignKey<ProjectUserRecord, UsersRecord> PROJECT_USER__PROJECT_USER_USER_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.USERS_PK, ProjectUser.PROJECT_USER, "project_user__project_user_user_id_fkey", ProjectUser.PROJECT_USER.USER_ID);
        public static final ForeignKey<ProjectUserRecord, ProjectRecord> PROJECT_USER__PROJECT_USER_PROJECT_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.PROJECT_PK, ProjectUser.PROJECT_USER, "project_user__project_user_project_id_fkey", ProjectUser.PROJECT_USER.PROJECT_ID);
        public static final ForeignKey<TestItemResultsRecord, TestItemRecord> TEST_ITEM_RESULTS__TEST_ITEM_RESULTS_ITEM_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.TEST_ITEM_PK, TestItemResults.TEST_ITEM_RESULTS, "test_item_results__test_item_results_item_id_fkey", TestItemResults.TEST_ITEM_RESULTS.ITEM_ID);
        public static final ForeignKey<TestItemStructureRecord, TestItemRecord> TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_ITEM_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.TEST_ITEM_PK, TestItemStructure.TEST_ITEM_STRUCTURE, "test_item_structure__test_item_structure_item_id_fkey", TestItemStructure.TEST_ITEM_STRUCTURE.ITEM_ID);
        public static final ForeignKey<TestItemStructureRecord, LaunchRecord> TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_LAUNCH_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.LAUNCH_PK, TestItemStructure.TEST_ITEM_STRUCTURE, "test_item_structure__test_item_structure_launch_id_fkey", TestItemStructure.TEST_ITEM_STRUCTURE.LAUNCH_ID);
        public static final ForeignKey<TestItemStructureRecord, TestItemStructureRecord> TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_PARENT_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.TEST_ITEM_STRUCTURE_PK, TestItemStructure.TEST_ITEM_STRUCTURE, "test_item_structure__test_item_structure_parent_id_fkey", TestItemStructure.TEST_ITEM_STRUCTURE.PARENT_ID);
        public static final ForeignKey<TestItemStructureRecord, TestItemStructureRecord> TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_RETRY_OF_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.TEST_ITEM_STRUCTURE_PK, TestItemStructure.TEST_ITEM_STRUCTURE, "test_item_structure__test_item_structure_retry_of_fkey", TestItemStructure.TEST_ITEM_STRUCTURE.RETRY_OF);
        public static final ForeignKey<TicketRecord, UsersRecord> TICKET__TICKET_SUBMITTER_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.USERS_PK, Ticket.TICKET, "ticket__ticket_submitter_id_fkey", Ticket.TICKET.SUBMITTER_ID);
        public static final ForeignKey<TicketRecord, BugTrackingSystemRecord> TICKET__TICKET_BTS_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.BUG_TRACKING_SYSTEM_PK, Ticket.TICKET, "ticket__ticket_bts_id_fkey", Ticket.TICKET.BTS_ID);
        public static final ForeignKey<UsersRecord, ProjectRecord> USERS__USERS_DEFAULT_PROJECT_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.PROJECT_PK, Users.USERS, "users__users_default_project_id_fkey", Users.USERS.DEFAULT_PROJECT_ID);
        public static final ForeignKey<WidgetRecord, ProjectRecord> WIDGET__WIDGET_PROJECT_ID_FKEY = createForeignKey(com.epam.ta.reportportal.jooq.Keys.PROJECT_PK, Widget.WIDGET, "widget__widget_project_id_fkey", Widget.WIDGET.PROJECT_ID);
    }
}
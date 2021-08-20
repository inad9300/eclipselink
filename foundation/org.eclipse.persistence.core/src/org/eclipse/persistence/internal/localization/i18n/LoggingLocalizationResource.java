/*******************************************************************************
 * Copyright (c) 1998, 2021 Oracle, IBM Corporation and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the 
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0 
 * which accompanies this distribution. 
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at 
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation from Oracle TopLink
 *     07/16/2009-2.0 Guy Pelletier 
 *       - 277039: JPA 2.0 Cache Usage Settings
 *     06/30/2010-2.1.1 Michael O'Brien 
 *       - 316513: Enable JMX MBean functionality for JBoss, Glassfish and WebSphere in addition to WebLogic
 *       Move JMX MBean generic registration code up from specific platforms
 *       see <link>http://wiki.eclipse.org/EclipseLink/DesignDocs/316513</link>
 *     10/15/2010-2.2 Guy Pelletier 
 *       - 322008: Improve usability of additional criteria applied to queries at the session/EM
 *     10/28/2010-2.2 Guy Pelletier 
 *       - 3223850: Primary key metadata issues
 *     03/24/2011-2.3 Guy Pelletier 
 *       - 337323: Multi-tenant with shared schema support (part 1)
 *     04/05/2011-2.3 Guy Pelletier 
 *       - 337323: Multi-tenant with shared schema support (part 3)
 *     03/24/2011-2.3 Guy Pelletier 
 *       - 337323: Multi-tenant with shared schema support (part 8)
 *     07/11/2011-2.4 Guy Pelletier
 *       - 343632: Can't map a compound constraint because of exception: 
 *                 The reference column name [y] mapped on the element [field x] 
 *                 does not correspond to a valid field on the mapping reference
 *     14/05/2012-2.4 Guy Pelletier  
 *       - 376603: Provide for table per tenant support for multitenant applications
 *     11/28/2012-2.5 Guy Pelletier 
 *       - 374688: JPA 2.1 Converter support
 *     01/24/2013-2.5 Guy Pelletier 
 *       - 389090: JPA 2.1 DDL Generation Support
 *     02/04/2013-2.5 Guy Pelletier 
 *       - 389090: JPA 2.1 DDL Generation Support
 *     02/13/2013-2.5 Guy Pelletier 
 *       - 397772: JPA 2.1 Entity Graph Support (XML support)
 *     09/24/2014-2.6 Rick Curtis 
 *       - 443762 : Misc message cleanup.
 *     12/18/2014-2.6 Rick Curtis
 *       - 454189 : Misc message cleanup.#2
 *     01/05/2015 Rick Curtis
 *       - 455683: Automatically detect target server
 ******************************************************************************/  
package org.eclipse.persistence.internal.localization.i18n;

import java.util.ListResourceBundle;

/**
 * English ResourceBundle for LoggingLocalization messages.
 *
 * @author Shannon Chen
 * @since TOPLink/Java 5.0
 *
 * Internal change on 2006/04/24: 
 *
 * Message id is added for iAS 11 logging compliance.
 * Every message added into this file needs the message id entry as well.
 * Logs by AbstractSessionLog.getLog().log() when the level is below CONFIG=4 (FINE, FINER, FINEST, ALL) 
 * should be moved to TraceLocalizationResource. 
 * 
 */
public class LoggingLocalizationResource extends ListResourceBundle {
    
    // MSGID and TOP-NNNNN pairs were removed in
    //     TODO: Replace this line with change set reference after commit/push.
    /**
     * Key and message pairs.
     */
    static final String[][] contents = {
        // CONFIG, INFO, WARNING and SEVERE level messages.
        { "topLink_version", "EclipseLink, version: {0}" },
        { "application_server_name_and_version", "Server: {0}" },
        { "login_successful", "{0} login successful" },
        { "logout_successful", "{0} logout successful" },     

        { "connected_user_database_driver", "Connected: {0}{6}User: {1}{6}Database: {2}  Version: {3}{6}Driver: {4}  Version: {5}" },
        { "connected_user_database", "Connected: {3}{4}User: {0}{3}{4}Database: {1}  Version: {2}" },
        { "JDBC_driver_does_not_support_meta_data", "Connected: unknown (JDBC Driver does not support meta data.)" },
        { "connecting", "connecting({0})" },
        { "disconnect", "disconnect" },
        { "reconnecting", "reconnecting({0})" },
        { "connected_sdk", "Connected: SDK" },
        
        { "no_session_found", "Could not find the session with the name [{0}] in the session.xml file [{1}]" },

        { "identitymap_for", "{0}{1} for: {2}" },
        { "includes", "(includes: " },
        { "key_object_null", "{0}Key: {1}{2}Object: null" },
        { "key_identity_hash_code_object", "{0}Key: {1}{2}Identity Hash Code: {3}{2}Object: {4}" },
        { "key_version_identity_hash_code_object", "{0}Key: {1}{2}Version: {5}{2}Identity Hash Code: {3}{2}Object: {4}" },
        { "elements", "{0}{1} elements" },
        { "unitofwork_identity_hashcode", "{0}UnitOfWork identity hashcode: {1}" },
        { "deleted_objects", "Deleted Objects:" },
        { "deleting_object", "The remove operation has been performed on: {0}"},
        { "register_new_for_persist", "PERSIST operation called on: {0}." },
        { "all_registered_clones", "All Registered Clones:" },
        { "new_objects", "New Objects:" },
        { "cache_thread_info", "Cached entity ({0}) with Id ({1}) was prepared and stored into cache by another thread (id: {2} name: {3}), than current thread (id: {4} name: {5})" },
        { "unit_of_work_thread_info", "Current unit of work in session ({0}) was created by another thread (id: {1} name: {2}), than current thread (id: {3} name: {4})" },
        { "unit_of_work_thread_info_thread_dump", "Creation thread (id: {0} name: {1}) stack trace:\n{2}\n\n" +
                "Current thread (id: {3} name: {4}) stack trace:\n{5}" },
        { "failed_to_propogate_to", "CacheSynchronization : Failed to propagate to {0}.  {1}" },
        { "exception_thrown_when_attempting_to_shutdown_cache_synch", "Exception thrown when attempting to shutdown cache synch: {0}" },
        { "corrupted_session_announcement", "SessionID: {0}  Discovery manager received corrupted session announcement - ignoring." },
        { "exception_thrown_when_attempting_to_close_listening_topic_connection", "Exception thrown when attempting to close listening topic connection: {0}" },
        { "retreived_unknown_message_type", "Retreived unknown message type: {0} from topic: {1}; ignoring" },
        { "retreived_null_message", "Retreived null message from topic: {0}; ignoring" },
        { "received_unexpected_message_type", "Received unexpected message type: {0} from topic: {1}; ignoring" },
        { "problem_adding_remote_connection", "Problem adding remote connection: {0}" },        

        { "error_in_codegen", "Error during generation of concrete bean class." },
        { "error_during_PersistenceManager_setup_for_bean", "Error during PersistenceManager setup for bean: {0}" },
        { "error_in_create", "Error in create." },
        { "error_executing_ejbHome", "Error executing ejbHome: {0}" },
        { "error_in_remove", "Error in remove." },
        { "table_existed_during_creation", "Table creation failed. If it already exists, it must be dropped first. This can be done manually or by setting the db-table-gen attribute in orion-ejb-jar.xml." },
        { "an_error_occured_trying_to_undeploy_bean", "An error occurred trying to undeploy bean (after deployment failure): {0}" },
        { "an_error_occured_executing_findByPrimaryKey", "An error occurred executing findByPrimaryKey: {0}" },
        { "an_error_occured_preparing_bean", "An error occurred preparing bean for invocation: {0}" },
        { "an_error_executing_finder", "An error occurred executing finder: {0}" },
        { "an_error_executing_ejbSelect", "An error occurred executing ejbSelect: {0}" },
        { "ejbSelect2", "EjbSelect: {0}" },
        { "error_getting_transaction_status", "Error getting transaction status.  {0}" },
        { "removeEJB_return", "removeEJB return: {0}" },
        { "multiple_ds_not_supported", "EclipseLink CMP does not support multiple datasources, and will only use one of them named ({0}), which is specified in the orion-ejb-jar.xml, and being associated with an entity bean defined last in the corresponding ejb-jar.xml." },
        { "failed_to_find_mbean_server", "Failed to find MBean Server: {0}" },
        { "problem_while_registering", "Problem while registering: {0}" },
        { "objectchangepolicy_turned_off", "Change tracking turned off for: {0}" },
        { "External_transaction_controller_not_defined_by_server_platform", "The DatabaseSession has an external transaction controller defined " + "by something other than the ServerPlatform. EclipseLink will permit the " + "override of the external transaction controller, but we recommend " + "you consider the alternative of subclassing " + "org.eclipse.persistence.platform.server.ServerPlatformBase " + "and override getExternalTransactionControllerClass()." },        

        { "extra_cmp_field", "There is an abstract getter and/or setter defined on the [{0}] " + "abstract bean class but the corresponding cmp field [{1}] " + "is not declared in the ejb-jar.xml." },
        { "extra_ejb_select", "There is an abstract ejbSelect defined on the [{0}] " + "abstract bean class but the corresponding ejbSelect [{1}{2}] " + "entry is not declared in the ejb-jar.xml." },
        { "extra_finder", "There is a finder defined on the [{0}] " + "home interface(s) but the corresponding finder [{1}{2}] " + "entry is not declared in the ejb-jar.xml." },
        { "cmp_and_cmr_field", "The ejb-jar.xml entry for [{0}] contains both a <cmp-field> and <cmr-field> entry for the attribute [{1}].  The <cmp-field> entry will be ignored." },        

        { "toplink_cmp_bean_name_xml_deprecated", "Support for toplink-cmp-bean_name.xml is deprecated." + "Please refer to the documentation for the use of toplink-ejb-jar.xml" },        

        { "drop_connection_on_error", "Warning: Dropping remote command connection to {0} on error {1}" },
        { "received_corrupt_announcement", "Warning: Discovery manager could not process service announcement due to {0} - ignoring announcement" },
        { "missing_converter", "Warning: Cannot convert command {0} due to missing CommandConverter - ignoring command" },
        { "failed_command_propagation", "Error: Failed trying to propagate command to {0} due to {1}" },
        { "exception_thrown_when_attempting_to_close_connection", "Warning: exception thrown when attempting to close connection" },
        { "error_executing_remote_command", "{0} command failed due to: {1}" },
        { "problem_adding_connection", "Could not add remote connection from {0} due to error: {1}" },
        { "problem_reconnect_to_jms", "Could not reconnect to JMS Topic name {0} due to error: {1}" },        

        { "toplink_severe", "[EL Severe]: " },
        { "toplink_warning", "[EL Warning]: " },
        { "toplink_info", "[EL Info]: " },
        { "toplink_config", "[EL Config]: " },
        { "toplink_fine", "[EL Fine]: " },
        { "toplink_finer", "[EL Finer]: " },
        { "toplink_finest", "[EL Finest]: " },
        { "toplink", "[EL]: " },
        { "an_error_occured_initializing_dms_listener", "Exception thrown when initializing DMS embedded listener and the SPY Servlet" },       

        { "input_minimum_arguments", "The command line input arguments must at least include -s, -a or -x, and -o." },
        { "src_pm_name_first_argument", "You must specify the source PM name at the first input argument as either: -sOc4j-native or -sWeblogic." },
        { "oc4j_native_migration_start", "OC4J-Native CMP -> OC4J EclipseLink CMP Migration STARTS......" },
        { "validate_ejb_jar", "Validating ejb-jar.xml starts, it may take some times..."},
        { "weblogic_native_migration_start", "WebLogic-Native CMP -> OC4J EclipseLink CMP Migration STARTS......" },
        { "must_define_migration_output_dir", "You must define an output directory for the migration tool" },
        { "migration_output_dir_not_valid", "The output directory ({0}) you defined is not valid" },
        { "migration_input_dir_not_valid", "The input directory ({0}) you defined is not valid" },
        { "input_and_output_dir_be_different", "You must define an output directory different from the input directory." },
        { "input_archive_format_not_supported", "Migration utility supports .ear and .jar and input archive format. The input file format as ({0}) is not supported." },
        { "archive_not_found_in_input", "The archive file ({0}) is not existed under input directory ({1})." },
        { "input_not_both_archive_and_xml", "You use either -e to specify the archive file name, or -x to signal that descriptor files under the input directory will be migrated, but not both." },
        { "input_at_least_either_archive_or_xml", "You use either -e to specify the migrated archive file name, or -x to signal that descriptor xml files under the input directory will be migrated, and you must specify and only specify one of them." },
        { "ejb_jar_xml_not_found_in_input", "The ejb-jar.xml is not present under input directory ({0})." },
        { "orion_ejb_jar_xml_not_found_in_input", "orion-ejb-jar.xml is not existed under input directory ({0}) you specified." },
        { "weblogic_ejb_jar_xml_not_found_in_input", "weblogic-ejb-jar.xml is not existed under input directory ({0}) you specified." },
        { "toplink_ejb_jar_xml_found_in_input", "The toplink-ejb-jar.xml is under input directory ({0}). You have to remove the toplink descriptor away from the input directory to process the migration." },
        { "migration_successful", "Migration Successful!" },
        { "migration_failed", "Migration Failed." },
        { "mw_project_generated_and_under", "The migrated EclipseLink Workbench project files are under ({0})." },
        { "log_file_under_output_dir", "There is a log file called ({0}) under output directory ({1})." },
        { "parse_ejb_jar_with_validation_fails", "Parsing ejb-jar.xml with validation fails with error ({0}). The migration tool will parse the xml file without validation."},
        { "jar_entry_not_migratable", "The jar entry ({0}) in the input EAR file ({1}) is not migratable." },
        { "jar_entry_has_been_migrated", "The native cmp descriptor file in the jar entry ({0}) from the input EAR file ({1}) has been migrated." },
        { "no_jar_entry_migratable_in_ear", "None of the jar entry in the input EAR file ({0}) is migratable." },
        { "invalid_command_line_argument", "The command line argument ({0}) is invalid" },
        { "persistence_unit_ignores_statments_cache_setting", "The statement cache cannot be enabled because no connection pool is configured." },
        { "column_size_not_migrated", "DB column size ({0}) is not migrated. See migration doc for details." },
        { "associate_using_third_table_not_migrated", "Oc4j native CMP feature -DassociateUsingThirdTable=true to map 1:m using a relation table is not migrated. You must re-map cmr field ({1}) of the entity ({0}) as one-to-many mapping through Mapping Workbench after the migration process." },
        { "delay_updates_until_commit_not_supported", "Oc4j native CMP feature \"delay-updates-until-commit\" on entity({0}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "do_select_before_insert_not_supported", "Oc4j native CMP feature \"do-select-before-insert\" on entity({0}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "no_exclusive_write_access_not_supported", "Oc4j native CMP feature \"no-exclusive-write-access\" on entity({0}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "force_update_not_supported", "Oc4j native CMP feature \"force-update\" on entity({0}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "isolation_level_not_supported", "Oc4j native CMP setting \"isolation-level\" on entity({0}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "max_instance_not_supported", "Oc4j native CMP setting \"max-instance\" on entity({0}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "max_tx_retries_not_supported", "Oc4j native CMP setting \"max-tx-retries\" on entity({0}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "min_instance_not_supported", "Oc4j native CMP setting \"min-instance\" on entity({0}) is not directly supported in EclipseLink CMP. See migration doc for details."},
        { "update_all_fields_not_supported", "Oc4j native CMP feature \"update-all-fields\" on entity({0}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "validity_timeout_not_supported", "Oc4j native CMP setting \"validity-timeout\" on entity({0}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "call_timeout_not_migrated", "The call-timeout value={1} is defined in entity {0} in orion-ejb-jar.xml" + " but no persistent mappings defined in the descriptor file, therefore no migration will occur. " + " If you use EclipseLink default mapping later to generate the EclipseLink mapping descriptor, be aware that the call-timeout " + " setting will be lost as EclipseLink default mapping has no access to native descriptor file. " + " You then need to reset the call timeout mamually or through EclipseLink Mapping Workbench after default mapping generation." },
        { "optimistic_locking_not_supported", "Oc4j native CMP setting locking-mode=\"optimistic\" on entity({0}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "old_pessimistic_locking_not_supported", "Oc4j native CMP setting \"old-pessimistic-locking\" on entity({0}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "locking_mode_not_valid", "Locking mode({1}) on entity({0} in orion-ejb-jar.xml is not well defined and therefore not migrated." },
        { "verifiy_columns_read_locking_not_supported", "Optimistic setting \"Read\" on \"verify-columns\" in entity ({0}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "verifiy_rows_read_locking_not_supported", "Optimistic setting \"Read\" on \"verify-rows\" in entity ({0}) is not directly supported in EclipseLink CMP. See migration doc for details.." },
        { "one_to_one_join_outer_migrated", "The one-to-one outer join defined for cmr field ({0}) of entity bean ({1}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "bacth_update_not_supported", "The Batch update setting batch-size with value ({0}) defined on entity bean ({1}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "data_sync_on_ejb_create_not_supported", "The data syncronization setting data-synchronization-option=\"ejbCreate\" defined on entity bean ({0}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "weblogic_ql_not_supported", "WebLogic-QL({0}) of the method({1} of the entity({2}) is not migrated as EclipseLink does not support WebLogic QL language." },
        { "input_orione_ejb_jar_augmented", "Input orion-ejb-jar.xml file has been augmented to specify EclipseLink as OC4J''s Persistent Manager" },
        { "template_orion_ejb_jar_created", "A templated orion-ejb-jar.xml file has been created" },
        { "create_default_dbms_tables_not_supported", "WLS native CMP setting \"create-default-dbms-tables\" is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "default_dbms_tables_ddl_not_supported", "WLS native CMP setting \"default-dbms-tables-ddl\" is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "enable_batch_operations_as_true_not_supported", "WLS native CMP setting \"enable-batch-operations-as-true\" is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "validate_db_schema_with_not_supported", "WLS native CMP setting \"validate-db-schema-with\" is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "automatic_key_generation_not_supported", "WLS native CMP setting \"automatic-key-generation\" on entity({0}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "check_exist_on_method_as_true_not_supported", "WLS native CMP setting \"check-exists-on-method-as-true\" on entity({0}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "delay_database_insert_until_ejb_create_not_supported", "WLS native CMP setting \"delay-database-insert-until-ejbCreate\" on entity({0}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "delay_database_insert_until_ejb_post_create_not_supported", "WLS native CMP setting \"delay-database-insert-until-ejbPostCreate\" on entity({0}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "field_group_not_supported", "WLS native CMP setting \"field-group\" on entity({0}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "relationship_cacheing_not_supported", "WLS native CMP setting \"relationship-caching\" on entity({0}) is not directly supported in EclipseLink CMP. See migration doc for details." },
        { "weblogic_query_not_supported", "WLS native CMP setting \"weblogic-query\" on entity({0}) is not directly supported in EclipseLink CMP. See migration doc for details." }, // unused
        { "sequence_cachekey_improper_format", "WLS native CMP setting \"key-cache-size\" on entity ({0}) is ill-formatted with value ({1})" },
        { "dir_cleaned_for_mw_files", "Files and sub-directories under directory {0} have been deleted in order to create a clean directory for the new generated EclipseLink Mapping Workbench project files" },
        { "mapping_not_supported_by_mw", "The EclipseLink mapping {0} is not supported by the mapping workbench" },
        { "toplink_ejb_jar_in_jar", "toplink-ejb-jar.xml is included in jar({0}) file, no migration therefore will be performed for this jar." },
        { "jta_cannot_be_disabled_in_cmp", "When using Container Managed Persistence (CMP), JTA cannot be disabled. EclipseLink will act as if JTA is enabled." },
        { "descriptor_named_query_cannot_be_added", "Cannot add a descriptor named query whose name conflict with an existing query. Query To Be Added: [{0}] is named: [{1}] with arguments [{2}]." },
        { "metadata_access_type", "The access type for the persistent class [{1}] is set to [{0}]." },        
        { "metadata_default_alias", "The alias name for the entity class [{0}] is being defaulted to: {1}." },
        { "metadata_default_map_key_attribute_name", "The map key attribute name for the mapping element [{0}] is being defaulted to: {1}." },
        { "metadata_default_table_name", "The table name for entity [{0}] is being defaulted to: {1}." },
        { "metadata_default_table_schema", "The table schema for entity [{0}] is being defaulted to: {1}." },
        { "metadata_default_table_catalog", "The table catalog for entity [{0}] is being defaulted to: {1}." },
        { "metadata_default_table_generator_name", "The table generator name defined within [{0}] is being defaulted to: {1}." },
        { "metadata_default_table_generator_schema", "The table generator schema defined within [{0}] is being defaulted to: {1}." },
        { "metadata_default_table_generator_catalog", "The table generator catalog defined within [{0}] is being defaulted to: {1}." },
        { "metadata_default_table_generator_pk_column_value", "The pk column value for the table generator named [{0}] defined on [{1}] from [{2}] is being defaulted to: {0}." },
        { "metadata_default_sequence_generator_sequence_name", "The sequence name for the sequence generator named [{0}] defined on [{1}] from [{2}] is being defaulted to: {0}." },
        { "metadata_default_sequence_generator_schema", "The sequence generator schema defined within [{0}] is being defaulted to: {1}." },
        { "metadata_default_sequence_generator_catalog", "The sequence generator catalog defined within [{0}] is being defaulted to: {1}." },
        { "metadata_default_join_table_name", "The join table name for the many to many mapping [{0}] is being defaulted to: {1}." },
        { "metadata_default_join_schema", "The join table schema for the many to many mapping [{0}] is being defaulted to: {1}." },
        { "metadata_default_join_catalog", "The join table catalog for the many to many mapping [{0}] is being defaulted to: {1}." },
        { "metadata_default_secondary_table_name", "The secondary table name for the entity [{0}] is being defaulted to: {1}." },
        { "metadata_default_secondary_schema", "The secondary table name for the entity [{0}] is being defaulted to: {1}." },
        { "metadata_default_secondary_catalog", "The secondary table name for the entity [{0}] is being defaulted to: {1}." },
        { "metadata_default_collection_table_name", "The collection table name for the basic collection/map mapping [{0}] is being defaulted to: {1}." },
        { "metadata_default_collection_schema", "The collection table name for the basic collection/map mapping [{0}] is being defaulted to: {1}." },
        { "metadata_default_collection_catalog", "The collection table name for the basic collection/map mapping [{0}] is being defaulted to: {1}." },
        { "metadata_default_converter_data_type", "The data type for the converter named [{2}] used with the element [{1}] in the entity [{0}] is being defaulted to [{3}]." },
        { "metadata_default_converter_object_type", "The object type for the converter named [{2}] used with the element [{1}] in the entity [{0}] is being defaulted to [{3}]." },
        { "metadata_default_entity_graph_name", "The name for the named EntityGroup specification on class [{1}] is being defaulted to: {0}" },
        { "metadata_default_column", "The column name for element [{0}] is being defaulted to: {1}." },
        { "metadata_default_order_column", "The order column name for element [{0}] is being defaulted to: {1}." },
        { "metadata_default_key_column", "The key column name for the basic map mapping element [{0}] is being defaulted to: {1}." },
        { "metadata_default_value_column", "The value column name for the basic collection/map mapping element mapping element [{0}] is being defaulted to: {1}." },
        { "metadata_default_pk_column", "The primary key column name for the mapping element [{0}] is being defaulted to: {1}." },
        { "metadata_default_fk_column", "The foreign key column name for the mapping element [{0}] is being defaulted to: {1}." },
        { "metadata_default_qk_column", "The query key name for the variable one to one mapping [{0}] is being defaulted to: {1}." },
        { "metadata_default_source_pk_column", "The source primary key column name for the many to many mapping [{0}] is being defaulted to: {1}." },
        { "metadata_default_source_fk_column", "The source foreign key column name for the many to many mapping [{0}] is being defaulted to: {1}." },
        { "metadata_default_target_pk_column", "The target primary key column name for the many to many mapping [{0}] is being defaulted to: {1}." },
        { "metadata_default_target_fk_column", "The target foreign key column name for the many to many mapping [{0}] is being defaulted to: {1}." },
        { "metadata_default_variable_one_to_one_discriminator_column", "The discriminator column name for the variable one to one mapping [{0}] is being defaulted to: {1}." },
        { "metadata_default_inheritance_discriminator_column", "The discriminator column name for the root inheritance class [{0}] is being defaulted to: {1}." },
        { "metadata_default_inheritance_pk_column", "The primary key column name for the inheritance class [{0}] is being defaulted to: {1}." },
        { "metadata_default_inheritance_fk_column", "The foreign key column name for the inheritance class [{0}] is being defaulted to: {1}." },
        { "metadata_default_secondary_table_pk_column", "The secondary table primary key column name for element [{0}] is being defaulted to: {1}." },
        { "metadata_default_secondary_table_fk_column", "The secondary table foreign key column name for element [{0}] is being defaulted to: {1}." },
        { "metadata_default_tenant_discriminator_column", "The tenant discriminator column name for element [{0}] is being defaulted to: {1}." },
        { "metadata_default_tenant_discriminator_context_property", "The tenant discriminator context property for the tenant discriminator column [{1}] on the element [{0}] is being defaulted to: {2}." },
        { "metadata_default_tenant_table_discriminator_type", "The tenant table discriminator type for the entity [{0}] is being defaulted to: {1}." },
        { "metadata_default_tenant_table_discriminator_context_property", "The tenant table discriminator context property for the entity [{0}] is being defaulted to: {1}." },
        { "metadata_default_one_to_one_mapping", "The element [{0}] is being defaulted to a one to one mapping." },
        { "metadata_default_one_to_many_mapping", "The element [{0}] is being defaulted to a one to many mapping." },
        { "metadata_default_variable_one_to_one_mapping", "The element [{0}] is being defaulted to a variable one to one mapping." },
        { "metadata_default_one_to_one_reference_class", "The target entity (reference) class for the one to one mapping element [{0}] is being defaulted to: {1}." },
        { "metadata_default_one_to_many_reference_class", "The target entity (reference) class for the one to many mapping element [{0}] is being defaulted to: {1}." },
        { "metadata_default_many_to_one_reference_class", "The target entity (reference) class for the many to one mapping element [{0}] is being defaulted to: {1}." },
        { "metadata_default_many_to_many_reference_class", "The target entity (reference) class for the many to many mapping element [{0}] is being defaulted to: {1}." },
        { "metadata_default_variable_one_to_one_reference_class", "The target interface (reference) class for the variable one to one mapping element [{0}] is being defaulted to: {1}." },
        { "metadata_default_element_collection_reference_class", "The target class (reference) class for the element collection mapping element [{0}] is being defaulted to: {1}." },

        { "metadata_warning_override_annotation_with_xml", "Ignoring the annotation [{0}] from [{1}] since an XML element was defined in the mapping file [{2}]." },
        { "metadata_warning_override_named_annotation_with_xml", "Ignoring the annotation [{0}] from [{2}] since an XML element with the same name [{1}] was defined in the mapping file [{3}]" },        
        { "metadata_warning_override_xml_with_eclipselink_xml", "Ignoring the element [{0}] from [{1}] defined in the mapping file [{2}] since this element was defined in the eclipselink-orm mapping file [{3}]" },
        { "metadata_warning_override_named_xml_with_eclipselink_xml", "Ignoring the element [{0}] named [{1}] defined in the mapping file [{2}] since an element with the same name was defined in the eclipselink-orm mapping file [{3}]" },

        { "metadata_warning_ignore_lob", "Ignoring lob specification on element [{1}] within entity class [{0}] since EclipseLink convert metadata is specified." },
        { "metadata_warning_ignore_temporal", "Ignoring temporal specification on element [{1}] within entity class [{0}] since EclipseLink convert metadata is specified." },
        { "metadata_warning_ignore_serialized", "Ignoring default serialization on element [{1}] within entity class [{0}] since EclipseLink convert metadata is specified." },
        { "metadata_warning_ignore_enumerated", "Ignoring enumerated specification on element [{1}] within entity class [{0}] since EclipseLink convert metadata is specified." },
        { "metadata_warning_ignore_converts", "Ignoring JPA convert specification on element [{1}] within entity class [{0}] since EclipseLink convert metadata is specified." },
        { "metadata_warning_ignore_auto_apply_converter", "Ignoring the auto-apply converter for element [{1}] within entity class [{0}] since EclipseLink convert metadata is specified." },
        { "metadata_warning_ignore_version_locking", "Optimistic locking metadata is already defined on the descriptor for the entity [{0}]. Ignoring version specification on element [{1}]." },

        { "metadata_warning_ignore_cacheable_false", "Ignoring the explicit cacheable=false set for the entity class [{0}] since a caching type of ALL has been specified in the persistence.xml file." },
        { "metadata_warning_ignore_cacheable_true", "Ignoring the explicit cacheable=true set for the entity class [{0}] since a caching type of NONE has been specified in the persistence.xml file." },
        
        { "metadata_warning_ignore_mapped_superclass_additional_criteria", "Ignoring the additional criteria metadata on the mapped superclass [{1}] for the entity class [{0}] since additional criteria metadata was previously discovered for that entity (either on the entity itself or another mapped-superclass)." }, 
        { "metadata_warning_ignore_attribute_override", "Ignoring the attribute override named [{0}] on the element [{1}] of the mapped superclass [{2}] since an attribute override with the same name has been specified on the entity class [{3}]." },
        { "metadata_warning_ignore_association_override", "Ignoring the association override named [{0}] on the element [{1}] of the mapped superclass [{2}] since an association override with the same name has been specified on the entity class [{3}]." },
        
        { "metadata_warning_ignore_inheritance_subclass_cache", "Ignoring the cache metadata on the inheritance subclass [{0}]. Cache metadata should only be specified on the root of the inheritance hierarchy and can not be overidden in an inheritance subclass." },
        { "metadata_warning_ignore_inheritance_subclass_cache_interceptor", "Ignoring the cache interceptor metadata on the inheritance subclass [{0}]. Cache interceptor metadata should only be specified on the root of the inheritance hierarchy and can not be overidden in an inheritance subclass." },
        { "metadata_warning_ignore_inheritance_subclass_default_redirectors", "Ignoring the default redirector metadata on the inheritance subclass [{0}]. Default redirector metadata should only be specified on the root of the inheritance hierarchy and can not be overidden in an inheritance subclass." },
        { "metadata_warning_ignore_inheritance_subclass_read_only", "Ignoring the read only setting on the inheritance subclass [{0}]. A read only setting should only be specified on the root of the inheritance hierarchy and can not be overridden in an inheritance subclass." },
        { "metadata_warning_ignore_inheritance_tenant_discriminator_column", "Ignoring the tenant discriminator column setting on the inheritance subclass [{0}]. Tenant discriminator column(s) should only be specified on the root of the inheritance hierarchy and can not be overridden and/or specified in an inheritance subclass." },
        { "metadata_warning_ignore_inheritance_tenant_table_discriminator", "Ignoring the tenant table discriminator setting on the inheritance subclass [{0}]. The tenant table discriminator should only be specified on the root of the inheritance hierarchy and can not be overridden and/or specified in an inheritance subclass." },
       
        { "metadata_warning_ignore_mapped_superclass_association_override", "Ignoring the association override named [{0}] defined on the mapped superclass [{1}] for the entity [{2}] since an association override with the same name was previously discovered for that entity (either on the entity itself or another mapped-superclass)." },
        { "metadata_warning_ignore_mapped_superclass_attribute_override", "Ignoring the attribute override named [{0}] defined on the mapped superclass [{1}] for the entity [{2}] since an attribute override override with the same name was previously discovered for that entity (either on the entity itself or another mapped-superclass)." },
        { "metadata_warning_ignore_mapped_superclass_copy_policy", "Ignoring the copy policy metadata on the mapped superclass [{1}] for the entity class [{0}] since copy policy metadata was previously discovered for that entity (either on the entity itself or another mapped-superclass)." },
        { "metadata_warning_ignore_mapped_superclass_optimistic_locking", "Ignoring the optimistic locking metadata on the mapped superclass [{1}] for the entity class [{0}] since optimistic locking metadata was previously discovered for that entity (either on the entity itself or another mapped-superclass)." },
        { "metadata_warning_ignore_mapped_superclass_cache", "Ignoring the cache metadata on the mapped superclass [{1}] for the entity class [{0}] since cache metadata was previously discovered for that entity (either on the entity itself or another mapped-superclass)." },
        { "metadata_warning_ignore_mapped_superclass_cacheable", "Ignoring the cacheable metadata on the mapped superclass [{1}] for the entity class [{0}] since cacheable metadata was previously discovered for that entity (either on the entity itself or another mapped-superclass)." },
        { "metadata_warning_ignore_mapped_superclass_cache_interceptor", "Ignoring the cache interceptor metadata on the mapped superclass [{1}] for the entity class [{0}] since cache interceptor metadata was previously discovered for that entity (either on the entity itself or another mapped-superclass)." },
        { "metadata_warning_ignore_mapped_superclass_default_redirectors", "Ignoring the default redirector metadata on the mapped superclass [{1}] for the entity class [{0}] since default redirector metadata was previously discovered for that entity (either on the entity itself or another mapped-superclass)." },
        { "metadata_warning_ignore_mapped_superclass_change_tracking", "Ignoring the change tracking metadata on the mapped superclass [{1}] for the entity class [{0}] since change tracking metadata was previously discovered for that entity (either on the entity itself or another mapped-superclass)." },
        { "metadata_warning_ignore_mapped_superclass_customizer", "Ignoring the customizer on the mapped superclass [{1}] for the entity class [{0}] since customizer metadata was previously discovered for that entity (either on the entity itself or another mapped-superclass)." },
        { "metadata_warning_ignore_mapped_superclass_id_class", "Ignoring the id class on the mapped superclass [{1}] for the entity class [{0}] since an id class was previously discovered for that entity (either on the entity itself or another mapped-superclass)." },
        { "metadata_warning_ignore_mapped_superclass_read_only", "Ignoring the read only setting on the mapped superclass [{1}] for the entity class [{0}] since read only metadata was previously discovered for that entity (either on the entity itself or another mapped-superclass)." },
        { "metadata_warning_ignore_mapped_superclass_fetch_group", "Ignoring the fetch group named [{2}] on the mapped superclass [{1}] for the entity class [{0}] since a fetch group with the same name was previously discovered for that entity (either on the entity itself or another mapped-superclass)." }, 
        { "metadata_warning_ignore_mapped_superclass_existence_checking", "Ignoring the existence checking setting on the mapped superclass [{1}] for the entity class [{0}] since existence checking metadata was previously discovered for that entity (either on the entity itself or another mapped-superclass)." },
        { "metadata_warning_ignore_mapped_superclass_primary_key", "Ignoring the primary key setting on the mapped superclass [{1}] for the entity class [{0}] since primary key metadata was previously discovered for that entity (either on the entity itself or another mapped-superclass)." },
        { "metadata_warning_ignore_mapped_superclass_multitenant", "Ignoring the multitenant setting on the mapped superclass [{1}] for the entity class [{0}] since multitenant metadata was previously discovered for that entity (either on the entity itself or another mapped-superclass)." },
        { "metadata_warning_ignore_mapped_superclass_annotation", "Ignoring the metadata [{0}] setting on the mapped superclass [{1}] for the entity class [{2}] since the metadata was previously discovered for that entity (either on the entity itself or another mapped-superclass)." },                               
        { "metadata_warning_ignore_lazy", "Reverting the lazy setting on the OneToOne or ManyToOne attribute [{0}] for the entity class [{1}] since weaving was not enabled or did not occur." },                               

        { "metadata_warning_ignore_fetch_group", "Ignoring the fetch groups specified on class [{0}] for the entity [{1}] since weaving is not enabled and the entity class does not implement the FetchGroupTracker interface." },
        { "metadata_warning_ignore_mapping_metadata", "Ignoring the javax.persistence metadata applied to the attribute [{0}] from class [{1}]. javax.persistence metadata is ignored on fields or properties that are transient, static or abstract." },
        
        { "metadata_warning_multiple_id_fields_without_id_class", "You have specified multiple ids for the entity class [{0}] without specifying an @IdClass. By doing this you may lose the ability to find by identity, distributed cache support etc. Note: You may however use EntityManager find operations by passing a list of primary key fields. Else, you will have to use JPQL queries to read your entities. For other id options see @PrimaryKey." },
        { "metadata_warning_inverse_access_type_mapping_override", "Overriding the {2} mapping attribute [{1}] with the {4} mapping attribute [{3}] from class [{0}]. To avoid this warning you should mark the attribute [{1}] as transient."},
        { "metadata_warning_partitioned_not_set", "@Partitioning found on the element {1} of class {0}, but no @Partitioned.  The @Partitioned annotation must be used to set the partitioning policy, @Partitioning just defines the policy, but does not set it."},
        { "metadata_warning_reference_column_not_found", "The reference column name [{0}] mapped on the element [{1}] does not correspond to a valid id or basic field/column on the mapping reference. Will use referenced column name as provided."},
        { "metadata_warning_ignore_is_null_allowed", "isNullAllowed is reset to false in {0} because the aggregate has a (possibly nested) target foreign key mapping"},
        { "non_jpa_allowed_type_used_for_collection_using_lazy_access", "Element [{1}] within entity class [{0}] uses a collection type [{2}] when the JPA specification only supports java.util.Collection, " +
            "java.util.Set, java.util.List, or java.util.Map.  This type is supported with eager loading; using lazy loading with this collection type requires additional configuration and an IndirectContainer implementation " +
            "that extends [{2}] or setting the mapping to use basic indirection and the type to be ValueholderInterface." },
        { "metadata_warning_integer_discriminator_could_not_be_built", "Class [{0}] specifies discriminatorType=INTEGER and uses [{1}] as the discriminatorValue.  That value cannot be converted to an integer.  We will attempt to use this value in String format." },
                
        { "annotation_warning_ignore_annotation", "Ignoring the annotation [{0}] on the element [{1}] because of an XML metadata-complete setting of true for this class." },        
        { "annotation_warning_ignore_private_owned", "Ignoring @PrivateOwned on element [{1}] within entity class [{0}]. A @PrivateOwned can only be used with a @OneToOne, @OneToMany and @VariableOneToOne. Also note, private ownership is implied with a @BasicCollection and @BasicMap." },
        { "annotation_warning_ignore_return_insert", "Ignoring the @ReturnInsert on the element [{0}]. A @ReturnInsert is only supported with a basic mapping." },
        { "annotation_warning_ignore_return_update", "Ignoring the @ReturnUpdate on the element [{0}]. A @ReturnUpdate is only supported with a basic mapping." },
        
        { "weaver_null_project", "Weaver session''s project cannot be null"},
        { "weaver_disable_by_system_property", "Weaving disabled by system property {0}"},        
        { "weaver_not_overwriting", "Weaver is not overwriting class {0} because it has not been set to overwrite."},
        { "weaver_could_not_write", "Weaver encountered an exception while trying to write class {0} to the file system.  The exception was: {1}"},
        { "exception_while_weaving", "Weaver encountered an exception while trying to weave class {0}. The exception was: {1}"},
        
        { "weaver_class_not_in_project", "Weaver found a class that is not part of the project: {0}."},
        { "cannot_weave_changetracking", "Class {0} could not be weaved for change tracking as it is not supported by its mappings."},
        { "cannot_weave_virtual_one_to_one", "Class {0} has attribute {1} that uses a OneToOne or ManyToOne mapping on a virtual attribute.  Weaving of these types of mappings is not supported.  Weaving will be disabled for {0}."},

        { "overriding_cache_isolation", "Parent Entity {0} has an isolation level of: {1} which is more protective then the subclass {2} with isolation: {3} so the subclass has been set to the isolation level {1}."},
        { "locking_required_for_database_change_notification", "Entity {0} is not using version locking, but has multiple tables or relationships, and is using Oracle database change notification, changes to relationships or secondary tables may not invalidate the cache."},

        { "field_type_set_to_java_lang_string", "The default table generator could not locate or convert a java type ({1}) into a database type for database field ({0}). The generator uses \"java.lang.String\" as default java type for the field." },
        { "relational_descriptor_support_only", "The default table generator currently only supports generating default table schema from a relational project."},
        { "default_tables_already_existed", "The table ({0}) is already in the database, and will not be created."},

        { "config_factory", "Config factory: ({0}) = ({1})"},
        { "class_list_created_by", "Class list created by ({0}).({1})() method."},
        { "jar_file_url_exception", "Exception while parsing persistence.xml.  Jar file location could not be found: {0}"},
        { "cannot_unwrap_connection", "Cannot unwrap the oracle connection wrapped by the application server because of the following exception.  {0}"},
        { "error_loading_xml_file", "Exception while loading ORM xml file: {0}: {1}"},
        // B5112171: XML AnyObject and AnyCollection throw NPE on null document root element
        { "exception_loading_entity_class", "An exception while trying to initialize persistence.  {1} occurred while trying to load entity class: {0}."},
        { "marshal_warning_null_document_root_element", "{0}: The undefined document root element of a referenced object [{1}] is ignored during marshalling with an any collection|object mapping." },
    
        { "update_all_query_cannot_use_binding_on_this_platform", "UpdateAllQuery cannot use binding on this database platform. Changed query setting to execute without binding." },

        { "broadcast_exception_thrown_when_attempting_to_close_connection", "Warning: {0}: attempt to close connection caused exception {1}" },
        { "broadcast_connection_already_closed", "Warning: {0}: attempt to close connection which has been already closed. Ignoring." },
        { "broadcast_connection_already_closing", "Warning: {0}: attempt to close connection which is currently closing. Ignoring." },
        { "broadcast_remote_command_is_null", "Warning: {0}: received message {1} containing null instead of RemoteCommand." },
        { "broadcast_remote_command_wrong_type", "Warning: {0}: received message {1} containing an object of type {2} instead of expected type RemoteCommand." },
        { "broadcast_ignored_command_while_closing_connection", "Warning: {0}: ignoring request to publish command while connection is closing." },
        { "broadcast_listening_sleep_on_error", "Warning: {0}: Exception {1} was thrown. The thread will sleep for {2} milliseconds before resuming listening." },
        { "dbPlatformHelper_defaultingPlatform", "Not able to detect platform for vendor name [{0}]. Defaulting to [{1}]. The database dialect used may not match with the database you are using. Please explicitly provide a platform using property \"eclipselink.target-database\"."},
        { "dbPlatformHelper_noMappingFound", "Can not load resource [{0}] that loads mapping from vendor name to database platform. Autodetection of database platform will not work."},
        
        { "sessions_xml_path_where_session_load_from", "The session info is loaded from [{0}]."},
        { "resource_local_persistence_init_info_ignores_jta_data_source", "PersistenceUnitInfo {0} has transactionType RESOURCE_LOCAL and therefore jtaDataSource will be ignored"},
        { "deprecated_property", "property {1} is deprecated, property {0} should be used instead."},
        { "persistence_unit_processor_error_loading_class", "{0}: {1} was thrown on attempt of PersistenceLoadProcessor to load class {2}. The class is ignored."},
        
        { "attempted_to_open_url_as_jar", "{1} was thrown on attempt to open {0} as a jar."},
        { "attempted_to_open_url_as_directory", "{1} was thrown on attempt to open {0} as a directory."},
        { "attempted_to_open_entry_in_url_as_jar", "{2} was thrown on attempt to open {0} as a jar and access entry: {1}."},
        { "attempted_to_open_file_url_as_directory", "{2} was thrown on attempt to open {0} as a directory and access entry: {1}."},
        { "invalid_datasource_property_value", "{1} is not a valid object to be passed in for property {0}.  Valid values are String or instances of javax.sql.DataSource."},
        { "invalid_property_value", "{1} is not a valid object to be passed in for property {0}."},
        // class name is preceeded by "class" - we need to hardcode the full package name
        { "sdo_type_generation_modified_function_naming_format_to", "{0}: Generated Type [{1}] java get/set method name changed to [{2}] to follow class naming conventions."},                                            
        { "sdo_type_generation_modified_class_naming_format_to", "{0}: Generated Type [{1}] java class name changed to [{2}] to follow class naming conventions."},                                            
        { "sdo_type_generation_warning_class_name_violates_java_spec", "{0}: Generated Type [{1}] conflicts with Java specification naming rules for [{2}] and should be renamed."},                                           
        { "sdo_type_generation_warning_class_name_violates_sdo_spec", "{0}: Generated Type [{1}] conflicts with SDO specification naming rules for [{2}] and should be renamed."},                                            
        
        { "sdo_classgenerator_exception", "{2} A [{0}] Exception occurred - message is [{1}]"},
        { "query_has_both_join_attributes_and_partial_attributes", "{0} named {1} has both join attributes and partial attributes. These two technologies were not designed to work together, result may be unpredictible."},
        { "sdo_missing_schemaLocation", "Referenced schema with uri {0} could not be processed because no schemaLocation attribute was specified."},
        { "sdo_invalid_schemaLocation", "Could not create schemaLocation [{0}] for import with uri [{1}]."},
        { "sdo_error_processing_referenced_schema", "An {0} occurred processing referenced schema with uri {1} with schemaLocation {2}."},
        { "sdo_error_deserialization", "Unauthorized deserialization attempt with class {0}."},
        { "ox_turn_global_logging_off", " {0} Turning global session logging off."},
        { "ox_lowering_global_logging_from_default_info_to_warning", " {0} Lowering global logging from default INFO to WARNING level."},        
        { "ox_turn_session_logging_off", " {0} Turning session logging off."},
        { "ox_lowering_session_logging_from_default_info_to_warning", " {0} Lowering session logging from default INFO to WARNING level."},
        
        { "cannot_get_server_name_and_version", "Cannot get server name and version because of the following exception.  {0}"},
        { "communication_failure_attempting_query_retry", "Communication failure detected when attempting to perform read query outside of a transaction. Attempting to retry query. Error was: {0}."},
        { "communication_failure_attempting_begintransaction_retry", "Communication failure detected when attempting to create transaction on database.  Attempting to retry begin transaction. Error was: {0}."},
        { "persistence_unit_processor_error_loading_class_weaving_disabled", "The classLoader [{0}]: for PersistenceLoadProcessor [{1}] failed to load class [{2}]. Weaving has been disabled for this session. EclipseLink may be unable to get a spec mandated temporary class loader from the server, you may be able to use static weaving as an optional workaround. "},
        { "persistence_unit_processor_null_temp_classloader", "The classLoader for PersistenceLoadProcessor [{0}] is null. Weaving has been disabled for this session. EclipseLink may be unable to get a spec mandated temporary class loader from the server, you may be able to use static weaving as an optional workaround. "},        
        { "persistence_unit_processor_npe_temp_classloader", "The classLoader [{0}] for PersistenceLoadProcessor [{1}] is causing a NPE on loadClass. Switching classLoader to [{2}].  Weaving has been disabled for this session. EclipseLink may be unable to get a spec mandated temporary class loader from the server, you may be able to use static weaving as an optional workaround. "},
        { "persistence_unit_processor_jboss_temp_classloader_bypassed", "The temporary classLoader for PersistenceLoadProcessor [{0}] is not available.  Switching classLoader to [{1}].  Weaving has been disabled for this session. EclipseLink may be unable to get a spec mandated temporary class loader from the server, you may be able to use static weaving as an optional workaround. "},        
        { "persistence_unit_processor_sap_temp_classloader_bypassed", "The temporary classLoader for PersistenceLoadProcessor [{0}] is not available.  Switching classLoader to [{1}].  Weaving has been disabled for this session. EclipseLink may be unable to get a spec mandated temporary class loader from the server, you may be able to use static weaving as an optional workaround. "},        
        { "persistence_unit_processor_error_in_class_forname_weaving_disabled", "The classLoader [{0}]: failed to load class [{1}]. Weaving has been disabled for this session. EclipseLink may be unable to get a spec mandated temporary class loader from the server, you may be able to use static weaving as an optional workaround. "},        
        { "entity_manager_sets_property_while_context_is_active", "Property {0} is set into EntityManager when active persistence context already exists, it will be processed and take effect only when a new active persistence context is created. To create a new active persistence context the existing one should be removed - that could be done by calling clear method on the EntityManager."},
        { "osgi_initializer_failed", "Construction of environment specific OSGi initializer, [{0}] failed with message: [{1}]."},
        { "osgi_initializer", "Using OSGi initializer: [{0}]."},
        { "entity_manager_ignores_nonjta_data_source", "Persistence unit uses JTA, therefore the EntityManager ignores non jta data source. "},        
        { "entity_manager_ignores_jta_data_source", "Persistence unit does not use JTA, therefore the EntityManager ignores jta data source. "},
        { "problem_registering_mbean", "Problem while registering MBean: {0}" },
        { "problem_unregistering_mbean", "Problem while unregistering MBean: {0}" },
        { "session_key_for_mbean_name_is_null", "Session name used for the MBean registration cannot be null." },
        // Implemented by RuntimeServices implementing subclasses
        { "jmx_mbean_runtime_services_pool_name", "Pool Name = {0}" },
        { "jmx_mbean_runtime_services_identity_map_non_existent", "Identity Map [{0}] does not exist." },
        { "jmx_mbean_runtime_services_identity_map_empty", "Identity Map [{0}] is empty." },
        { "jmx_mbean_runtime_services_identity_map_class", "Identity Map [{0}] class = {1}" },
        { "jmx_mbean_runtime_services_no_identity_maps_in_session", "There are no Identity Maps in this session." },
        { "jmx_mbean_runtime_services_identity_map_initialized", "Identity Map [{0}] is initialized." },
        { "jmx_mbean_runtime_services_identity_map_invalidated", "Identity Map [{0}] is invalidated." },
        { "jmx_mbean_runtime_services_print_cache_key_value", "Key [{0}] => Value [{1}]" },
        { "jmx_mbean_runtime_services_no_classes_in_session", "No Classes in session." },
        { "jmx_mbean_runtime_services_statement_cache_cleared", "Statement cache cleared." },
        { "jmx_mbean_runtime_services_no_connection_pools_available", "No Connection Pools Available." },        
        { "jmx_mbean_runtime_services_failed_toget_initial_context", "Failed to get InitialContext for MBean registration: {0}" },        
        { "jmx_mbean_runtime_services_mbeanserver_lookup_failed", "Failed to get InitialContext for MBean registration: {0}" },
        { "jmx_mbean_runtime_services_threadpool_initialize_failed", "Failed to initialize MBean threadPoolRuntime: {0}" },
        { "jmx_mbean_runtime_services_get_executethreadruntime_object_failed", "Version of WebLogic does not support executeThreadRuntime - using ClassLoader: {0}" },
        { "nested_entity_manager_flush_not_executed_pre_query_changes_may_be_pending", "The class {0} is already flushing. The query will be executed without further changes being written to the database.  If the query is conditional upon changed data the changes may not be reflected in the results.  Users should issue a flush() call upon completion of the dependent changes and prior to this flush() to ensure correct results." },
        { "query_has_joined_attribute_outside_fetch_group", "{0}: joined attribute [{1}] is not included into the fetch group. The joined attribute data (though read from the database) will be ignored. A new sql will be executed to read again the object referenced by the joined attribute; and yet another sql to read the whole main object (because of setting the value to the attribute outside the fetch group). Either include the fetched attribute into the fetch group or remove it."},
        // JAXB Metadata Logging Messages
        { "jaxb_metadata_warning_ignoring_java_attribute", "Ignoring attribute [{0}] on class [{1}] as no Property was generated for it."},
        { "jaxb_metadata_warning_invalid_bound_type", "The bound type [{0}] for adapter class [{1}] is invalid, and will be ignored."},
        { "jaxb_metadata_warning_no_classes_to_process", "There are no classes to process for package [{0}]."},
        { "jaxb_metadata_warning_ignoring_type_on_map", "Ignoring the type attribute set on xml-element since xml-map is specified on property [{0}]."},
        { "jaxb_metadata_warning_invalid_java_attribute", "An unsupported JavaAttribute [{0}] was encountered and will be ignored."},
        { "jaxb_metadata_warning_invalid_package_level_xml_java_type_adapter", "An invalid XmlJavaTypeAdapter [{0}] was specified for package [{1}], and will be ignored."},
        { "jaxb_metadata_warning_invalid_type_level_xml_java_type_adapter", "An invalid XmlJavaTypeAdapter [{0}] was specified for class [{1}], and will be ignored."},
        { "jaxb_metadata_warning_invalid_property_level_xml_java_type_adapter", "An invalid XmlJavaTypeAdapter [{0}] was specified for field/property [{1}] on class [{2}], and will be ignored."},
        // 316513: JMX implementation for JBoss, WebSphere and Glassfish as well as WebLogic
        { "jmx_mbean_runtime_services_registration_encountered_multiple_mbeanserver_instances", "Multiple JMX MBeanServer instances [{0}] exist, we will use the server at index [{1}] : [{2}]." },
        { "jmx_mbean_runtime_services_registration_mbeanserver_print", "JMX MBeanServer instance found: [{0}], # of beans: [{1}], domain: [{2}] at index: [{3}]." },
        { "jmx_mbean_runtime_services_switching_to_alternate_mbeanserver", "JMX MBeanServer in use: [{0}] from index [{1}] " },
        { "metamodel_print_type_header", "Printed list of Metamodel [{0}] Types to follow:"},        
        { "metamodel_print_type_value", "Metamodel Type: [{0}]}"},
        { "named_argument_not_found_in_query_parameters", "Missing Query parameter for named argument: {0} \"null\" will be substituted." },
        { "jmx_unregistered_mbean", "Unregistered MBean [{0}] from MBeanServer [{1}]." },        
        { "jmx_unable_to_unregister_mbean", "Unable to unregister MBean [{0}] because the MBeanServer is null. Verify that your ServerPlatform is JMX enabled." },        
        // 338837:
        { "metamodel_type_collection_empty", "The collection of metamodel types is empty. Model classes may not have been found during entity search for Java SE and some Java EE container managed persistence units.  Please verify that your entity classes are referenced in persistence.xml using either <class> elements or a global <exclude-unlisted-classes>false</exclude-unlisted-classes> element" },      
        { "metamodel_type_collection_empty_during_lookup", "The collection of metamodel [{1}] types is empty. Model classes may not have been found during entity search for Java SE and some Java EE container managed persistence units.  Please verify that your entity classes are referenced in persistence.xml using either <class> elements or a global <exclude-unlisted-classes>false</exclude-unlisted-classes> element.  The lookup on [{0}] will return null." },
        { "jpars_could_not_find_session_bean", "A call is being made to a session bean with JNDI Name: [{0}].  That bean can not be found."},
        { "jpars_could_not_find_persistence_context", "A JPA-RS call is requesting persistence context: [{0}].  That persistence context is not found."},
        { "jpars_could_not_find_class_in_persistence_unit", "Type: [{0}] cannot be found in persistence unit: [{1}]."},
        { "jpars_could_bootstrap_persistence_context", "Persistence Context: [{0}] could not be bootstrapped."},
        { "entity_not_available_during_merge", "Max tries exceeded.  Unable to find value of locked cacheKey.  Class [{0}] ID:[{1}] This Thread: [{2}] Owning Thread:[{3}]"},        
        { "ddl_generation_unknown_property_value", "Unknown {0} value provided [{1}] for the persistence unit [{2}]. Valid options are: [{3}]" },
        // SOP:
        { "sop_object_deserialze_failed", "Failed to deserialize sopObject from [{0}] in [{1}]"},
        { "sop_object_not_found", "Serialized sopObject is not found in [{0}] in [{1}]"},
        { "sop_object_wrong_version", "Removing serialized sopObject from the row because it has a wrong version [{0}] in [{1}] in [{2}]"},
        { "sop_object_wrong_pk", "Removing serialized sopObject from the row because it has a wrong primary key [{0}] in [{1}] in [{2}]"},
        // 282751
        { "removing_unique_constraint", "Removing UNIQUE constraint definition from [{0}] because it is also a primary key."},
        { "session_manager_no_partition", "No partition instance associated with current SessionManager instance."},
        // DBWS
        { "dbws_xml_schema_read_error", "Could not read XML schema: [{0}]"},
        { "dbws_orm_metadata_read_error", "Could not read ORM metadata: [{0}]"},
        { "dbws_oxm_metadata_read_error", "Could not read OXM metadata: [{0}]"},
        { "dbws_no_wsdl_inline_schema", "Could not read WSDL inline schema: [{0}]"},
        { "javase_version_ex_method_call", "Exception when calling method {0}: {1}" },

        // FINEST, FINER and FINE level messages.
        { "acquire_unit_of_work_with_argument", "acquire unit of work: {0}" },
        { "external_transaction_has_begun_internally", "external transaction has begun internally" },
        { "external_transaction_has_committed_internally", "external transaction has committed internally" },
        { "initialize_all_identitymaps", "initialize all identitymaps" },
        { "initialize_identitymap", "initialize identitymap: {0}" },
        { "initialize_identitymaps", "initialize identitymaps" },
        { "external_transaction_has_rolled_back_internally", "external transaction has rolled back internally" },
        { "validate_cache", "validate cache." },
        { "cache_item_creation", "Entity ({0}) with Id ({1}) was stored in the cache by thread (Id: {2} Name: {3})" },
        { "cache_item_refresh", "Entity ({0}) with Id ({1}) was refreshed in the cache by thread (Id: {2} Name: {3})" },
        { "cache_item_removal", "Entity ({0}) with Id ({1}) was removed from the cache by thread (Id: {2} Name: {3})" },
        { "cache_item_invalidation", "Entity ({0}) with Id ({1}) was invalidated from the cache by thread (Id: {2} Name: {3})" },
        { "cache_class_invalidation", "Entities based on class ({0}) was invalidated from the cache by thread (Id: {1} Name: {2})" },
        { "cache_hit", "Cache hit for entity ({0}) with Id ({1})" },
        { "cache_miss", "Cache miss for entity ({0}) with Id ({1})" },
        { "stack_of_visited_objects_that_refer_to_the_corrupt_object", "stack of visited objects that refer to the corrupt object: {0}" },
        { "corrupt_object_referenced_through_mapping", "corrupt object referenced through mapping: {0}" },
        { "corrupt_object", "corrupt object: {0}" },
        { "begin_unit_of_work_flush", "begin unit of work flush" },
        { "end_unit_of_work_flush", "end unit of work flush" },
        { "begin_unit_of_work_commit", "begin unit of work commit" },
        { "end_unit_of_work_commit", "end unit of work commit" },
        { "resume_unit_of_work", "resume unit of work" },
        { "resuming_unit_of_work_from_failure", "resuming unit of work from failure" },
        { "release_unit_of_work", "release unit of work" },
        { "revert_unit_of_work", "revert unit of work" },
        { "validate_object_space", "validate object space." },
        { "execute_query", "Execute query {0}" },
        { "merge_clone", "Merge clone {0} " },
        { "merge_clone_with_references", "Merge clone with references {0}" },
        { "new_instance", "New instance {0}" },
        { "register_existing", "Register the existing object {0}" },
        { "register_new", "Register the new object {0}" },
        { "register_new_bean", "Register the new bean {0}" },
        { "register", "Register the object {0}" },
        { "revert", "Revert the object''s attributes {0}" },
        { "unregister", "Unregister the object {0}" },
        { "begin_batch_statements", "Begin batch statements" },
        { "end_batch_statements", "End Batch Statements" },
        { "query_column_meta_data_with_column", "query column meta data ({0}.{1}.{2}.{3})" },
        { "query_column_meta_data", "query table meta data ({0}.{1}.{2})" },
        { "reconnecting_to_external_connection_pool", "reconnecting to external connection pool" },
        { "begin_transaction", "begin transaction" },
        { "commit_transaction", "commit transaction" },
        { "rollback_transaction", "rollback transaction" },
        { "adapter_result", "Adapter result: {0}" },
        { "data_access_result", "Data access result: {0}" },
        { "acquire_unit_of_work", "acquire unit of work" },
        { "JTS_register", "JTS register" },
        { "JTS_after_completion", "After JTS Completion" },
        { "JTS_before_completion", "Before JTS Completion" },
        { "JTS_begin", "Begin JTS transaction" },
        { "JTS_commit_with_argument", "JTS#commit({0})" },
        { "JTS_rollback", "Rollback JTS transaction." },
        { "JTS_commit", "Commit JTS transaction." },
        { "JTS_after_completion_with_argument", "After JTS Completion ({0})" },
        { "TX_beforeCompletion", "TX beforeCompletion callback, status={0}" },
        { "TX_afterCompletion", "TX afterCompletion callback, status={0}" },
        { "TX_bind", "TX binding to tx mgr, status={0}" },
        { "TX_begin", "TX beginTransaction, status={0}" },
        { "TX_beginningTxn", "TX Internally starting" },
        { "TX_commit", "TX commitTransaction, status={0}" },
        { "TX_committingTxn", "TX Internally committing" },
        { "TX_rollback", "TX rollbackTransaction, status={0}" },
        { "TX_rollingBackTxn", "TX Internally rolling back" },
        { "lock_writer_header", "Current object locks:" },
        { "lock_writer_footer", "End of locked objects." },
        { "active_thread", "Thread : {0}" },
        { "locked_object", "Locked Object : {0}" },
        { "depth", "Depth : {0}" },
        { "cachekey_released", "This thread is no longer holding the lock.  It must not be a blocking thread."},
        { "deferred_locks", "Deferred lock on : {0}" },
        { "deferred_locks_released", "All deferred locks for thread \"{0}\" have been released." },
        { "acquiring_deferred_lock", "Thread \"{1}\" has acquired a deferred lock on object : {0} in order to avoid deadlock." },
        { "dead_lock_encountered_on_write", "Thread \"{1}\" encountered deadlock when attempting to lock : {0}.  Entering deadlock avoidance algorithm." },
        { "dead_lock_encountered_on_write_no_cache_key", "Thread \"{2}\" encountered deadlock when attempting to lock object of class: {0} with PK {1}.  Entering deadlock avoidance algorithm." },
        { "concurrency_manager_release_locks_acquired_by_thread_1", "releaseAllLocksAcquiredByThread: Thread \"{0}\"  .The Lock manager is null. This might be an acquire operation. So not possible to lockManager.releaseActiveLocksOnThread(). Cache Key:  \"{1}\"" },
        { "concurrency_manager_release_locks_acquired_by_thread_2", "releaseAllLocksAcquiredByThread: Release active locks on Thread \"{0}\"" },
        { "concurrency_manager_build_object_thread_complete_1", "isBuildObjectComplete ExpandedThread NR  {0}: {1} \n" },
        { "concurrency_manager_build_object_thread_complete_2", "\nAll threads in this stack are doing object building and needed to defer on one or more cache keys.\n"
                + "The last thread has deferred lock on ac cache key that is acquired by thread that is not yet finished with its work. \n\n"},
        { "concurrency_manager_build_object_thread_complete_3", "finalDeferredLockCausingTrouble:  {0} \n"
                + " This cache key had to be deferred by the last thread on the recursive stack. The thread was ACQUIRED. \n"},
        { "concurrency_manager_build_object_thread_complete_4", "activeThreadOnTheCacheKey: {0}  \n"
                + " hasDeferredLockManager: {1} \n "
                + " This is the thread that has acquired the cache key and has been considered to not yet be finished with its business. \n"
                + " When hasDeferredLockManager is true it typically means this thread is doing object building. \n"
                + " When hasDeferredLockManager is false it might an object building thread or it could be a thread doing a commit and acquiring final locks to merge its objects with changesets look at the stack trace to understand. \n"},
        { "concurrency_manager_allow_concurrency_exception_fired_up", "allowConcurrencyExceptionToBeFiredUp: is set to FALSE."
                + " No any exception be fired to avoid the risk of aborting the current thread not being sufficient to resolve any dead lock."
                + " and leaving the system in a worth shape where aver 3 retries the business transaction is not re-attempted and the recovery of the system becomes complicated. "
                + " We are going with the option of letting the system freeze. " },
        { "concurrency_util_stuck_thread_tiny_log_cache_key", "Stuck thread problem: unique tiny message number ({0}) \n"
                + " The Thread [{1}]  appears to be stuck (possible dead lock ongoing). \n"
                + " The thread is working in the context of (CacheKey) = ({2}) . \n"
                + " The thread has been stuck for: ({3} ms) \n "
                + " Bellow we will describe the ActiveLocks, DeferredLocks and ReadLocks for this thread. " },
        { "concurrency_util_owned_cache_key_null", "ObjectNull. Most likely not yet in server session cache and in the process of being created."},
        { "concurrency_util_owned_cache_key_is_cache_key", "--- CacheKey  ({0}):  (primaryKey: {1}) (object hash code: {2}) (cacheKeyClass: {3}) (cacheKey hash code: {4}) (current cache key owner/activeThread: {5}) (getNumberOfReaders: {6}) "
                + " (concurrencyManagerId: {7}) (concurrencyManagerCreationDate: {8})"
                + " (totalNumberOfTimeCacheKeyAcquiredForReading:  {9}) "
                + " (totalNumberOfTimeCacheKeyReleasedForReading:  {10}) "
                + " (totalNumberOfTimeCacheKeyReleasedForReadingBlewUpExceptionDueToCacheKeyHavingReachedCounterZero:  {11}) "
                + " (depth: {12}) ---"},
        { "concurrency_util_owned_cache_key_is_not_cache_key", "--- ConcurrencyManager: (ConcurrencyManagerClass: {0} ) (ConcurrencyManagerToString: {1}) (current cache key owner/activeThread: {2}) (concurrencyManagerId: {3}) (concurrencyManagerCreationDate: {4}) "
                + "  (totalNumberOfTimeCacheKeyAcquiredForReading:  {5}) "
                + " (totalNumberOfTimeCacheKeyReleasedForReading:  {6}) "
                + " (totalNumberOfTimeCacheKeyReleasedForReadingBlewUpExceptionDueToCacheKeyHavingReachedCounterZero:  {7}) "
                + "(depth: {8}) ---"},
        { "concurrency_util_header_current_cache_key", "Summary current cache key of thread {0} "},
        { "concurrency_util_header_active_locks_owned_by_thread", "Summary of active locks owned by thread {0} "},
        { "concurrency_util_header_deferred_locks_owned_by_thread", "Summary of deferred locks (could not be acquired and cause thread to wait for object building to complete) of thread {0} "},
        { "concurrency_util_header_reader_locks_owned_by_thread", "Summary of read locks acquired by thread {0} "},
        { "concurrency_util_summary_active_locks_on_thread_1", "Listing of all ACTIVE Locks.\n"
                + "Thread Name: {0} \n"},
        { "concurrency_util_summary_active_locks_on_thread_2", "0 Active locks. The lockManager for this thread is null. \n\n"},
        { "concurrency_util_summary_active_locks_on_thread_3", "{0} Active locks.\n"},
        { "concurrency_util_summary_active_locks_on_thread_4", "Active lock nr: {0} , Active cache key: {1}\n\n"},
        { "concurrency_util_summary_deferred_locks_on_thread_1", "Listing of all DEFERRED Locks.\n"
                + "Thread Name: {0} \n"},
        { "concurrency_util_summary_deferred_locks_on_thread_2", "0 deferred locks. The lockManager for this thread is null. \n\n"},
        { "concurrency_util_summary_deferred_locks_on_thread_3", "{0} Deferred locks.\n"},
        { "concurrency_util_summary_deferred_locks_on_thread_4", "Deferred lock nr: {0} , Deferred cache key: {1}\n\n"},
        { "concurrency_util_summary_read_locks_on_thread_step001_1", "Listing of all READ Locks. Step 001 - sparse summary loop over all read locks acquired:\n"
                + "Thread Name: {0} \n"},
        { "concurrency_util_summary_read_locks_on_thread_step001_2", "0 read locks. The lockManager for this thread is null. \n\n"},
        { "concurrency_util_summary_read_locks_on_thread_step001_3", "{0} Read locks.\n"},
        { "concurrency_util_summary_read_locks_on_thread_step001_4", "Read lock nr: {0} , Read cache key: {1}\n\n"},
        { "concurrency_util_summary_read_locks_on_thread_step002_1", "\nListing of all READ Locks. Step 002 - fat-detailed information about all read locks acquired:"},
        { "concurrency_util_summary_read_locks_on_thread_step002_2", "Read locks acquired by thread: {0} with id: {1} never released.\n"
                + "number of never released read locks: {2}"},
        { "concurrency_util_summary_read_locks_on_thread_step002_3", "\nRead lock nr: {0} Read lock Cache Key: {1}"
                + "\nRead lock nr: {0} dateOfReadLockAcquisition: {2}"
                + "\nRead lock nr: {0} numberOfReadersOnCacheKeyBeforeIncrementingByOne: {3}"
                + "\nRead lock nr: {0} currentThreadStackTraceInformationCpuTimeCostMs: {4}"},
        { "concurrency_util_summary_read_locks_on_thread_step002_4", "\nRead lock nr: {0}  stackTraceInformation:  same as stack trace id: {1}"},
        { "concurrency_util_summary_read_locks_on_thread_step002_5", "\nRead lock nr: {0} Stack trace id: {1} Start"
                + "\nRead lock nr: {0} stackTraceInformation: {2}"
                + "\nRead lock nr: {0} Stack trace id: {1} End"},
        { "concurrency_util_summary_read_locks_on_thread_step002_6", "Read locks problems detected by thread: {0} during release read locks"
                + "\n{1} removeReadLockProblemsDetected."},
        { "concurrency_util_summary_read_locks_on_thread_step002_7", "\nRelease read lock problem nr: {0} \n   {1}"},
        { "concurrency_util_enrich_thread_dump", "enrichGenerateThreadDump: Failed to generate thread dump with error: {0} "},
        { "concurrency_util_enrich_thread_dump_thread_info_1", "\"{0}\" "
                + "\n   java.lang.Thread.State: {1}"},
        { "concurrency_util_enrich_thread_dump_thread_info_2", "\n        at {0}"},
        { "concurrency_util_create_information_thread_dump", "Concurrency manager - Page 01 start - thread dump about all threads at time of event\n {0}"
                + "\nConcurrency manager - Page 01 end - thread dump about all threads at time of event\n"},
        { "concurrency_util_create_information_all_threads_acquire_cache_keys_1", "Concurrency manager - Page 02 start - information about threads waiting to acquire (write/deferred) cache keys "
                + "\nTotal number of threads waiting to acquire lock: {0}\n\n"},
        { "concurrency_util_create_information_all_threads_acquire_cache_keys_2", "[currentThreadNumber: {0}] [ThreadName: {1}]: Waiting to acquire (write/deferred): {2}\n"},
        { "concurrency_util_create_information_all_threads_acquire_cache_keys_3", "It seems, that trace was produced by the THREADS_TO_FAIL_TO_ACQUIRE_CACHE_KEYS - - org.eclipse.persistence.internal.helper.WriteLockManager.acquireRequiredLocks(MergeManager, UnitOfWorkChangeSet)"},
        { "concurrency_util_create_information_all_threads_acquire_cache_keys_4", "[methodNameThatGotStuckWaitingToAcquire: {0}] \n"},
        { "concurrency_util_create_information_all_threads_acquire_cache_keys_5", "Concurrency manager - Page 02 end - information about threads waiting to acquire (write/deferred) cache keys\n"},
        { "concurrency_util_create_information_all_threads_acquire_read_cache_keys_1", "Concurrency manager - Page 03 start - information about threads waiting to acquire read cache keys "
                + "\nTotal number of threads waiting to acquire read locks: {0} \n\n"},
        { "concurrency_util_create_information_all_threads_acquire_read_cache_keys_2", "[currentThreadNumber: {0}] [ThreadName: {1} ]: Waiting to acquire (read lock): {2}\n"},
        { "concurrency_util_create_information_all_threads_acquire_read_cache_keys_3", "[methodNameThatGotStuckWaitingToAcquire: {0}]  \n"},
        { "concurrency_util_create_information_all_threads_acquire_read_cache_keys_4", "Concurrency manager - Page 03 end - information about threads waiting to acquire read cache keys\n"},
        { "concurrency_util_create_information_all_threads_release_deferred_locks_1", "Concurrency manager - Page 04 start - information about threads waiting on release deferred locks (waiting for other thread to finish building the objects deferred) "
                + "\nTotal number of threads waiting to acquire lock: {0} \n\n"},
        { "concurrency_util_create_information_all_threads_release_deferred_locks_2", "[currentThreadNumber: {0}] [ThreadName: {1} ]\n"},
        { "concurrency_util_create_information_all_threads_release_deferred_locks_3", "Concurrency manager - Page 04 end - information about threads waiting on release deferred locks (waiting for other thread to finish building the objects deferred)\n"},
        { "concurrency_util_create_information_all_resources_acquired_deferred_1", "Concurrency manager - Page 05 start (currentThreadNumber: {0} of totalNumberOfThreads: {1})  - detailed information about specific thread "
                + "\nThread: {2}"
                + "\nThreadWaitingToReleaseDeferredLocks: {3}\n"},
        { "concurrency_util_create_information_all_resources_acquired_deferred_2", " waitingOnAcquireWritingCacheKey: true  waiting to acquire writing: {0}\n"},
        { "concurrency_util_create_information_all_resources_acquired_deferred_3", " waitingOnAcquireWritingCacheKey: false\n"},
        { "concurrency_util_create_information_all_resources_acquired_deferred_4", " waitingOnAcquireReadCacheKey: true   waiting to acquire reading: {0}\n"},
        { "concurrency_util_create_information_all_resources_acquired_deferred_5", " waitingOnAcquireReadCacheKey: false\n"},
        { "concurrency_util_create_information_all_resources_acquired_deferred_6", " writeManagerThreadPrimaryKeysWithChangesToBeMerged: true"
                + "\n writeManagerThreadPrimaryKeysWithChangesToBeMerged list: {0}\n"},
        { "concurrency_util_create_information_all_resources_acquired_deferred_7", " writeManagerThreadPrimaryKeysWithChangesToBeMerged: false\n"},
        { "concurrency_util_create_information_all_resources_acquired_deferred_8", " waitingToReleaseDeferredLocksJustification: \n {0} \n"},
        { "concurrency_util_create_information_all_resources_acquired_deferred_9", " waitingToReleaseDeferredLocksJustification: information not available. \n"},
        { "concurrency_util_create_information_all_resources_acquired_deferred_10", "Concurrency manager - Page 05 end (currentThreadNumber: {0} of totalNumberOfThreads: {1})  - detailed information about specific thread\n"},
        { "concurrency_util_read_lock_manager_problem01", "Remove cache key from read lock manager problem 01:"
                + "\n The current thread: {0} is about to decrement the currentNumberOfReaders from: {1}  to decrementedNumberOfReaders {2} "
                + "\n  on the cache key: {3}"
                + "\n however the readLockManager for the current thread is null."
                + "\n This should never happen. If the readLockManager is null either the we have not incremented the number readers in the past. "
                + "\n Or we have removed all the cache keys of the readLockManager belonging to this thread making the map become empty and be removed. "
                + "\n It should never be the case that we are bout the decrement the count of readers and are not tracing the cache key are we about to decrement."
                + "\n Stack trace as we detect the problem: {4}"
                + "\n CurrentDate: {5}"},
        { "concurrency_util_read_lock_manager_problem02", "Remove cache key from read lock manager problem 02:"
                + "\n removeReadLock PROBLEM Detected - mapThreadToReadLockAcquisitionMetadata does not have have threadId  . "
                + "\n The following problem is taking place. The Thread: {0} is about to decrease the number of readers on the cacheKey: {1} "
                + "\n However this ReadLockManager currently has no entries on the mapThreadToReadLockAcquisitionMetadata associated to the ongoing threadId:  {2}"
                + "\n as result in terms of tracing we will simply ignore this call to removeReadLock for the current cache key. "
                + "\n Problem is taking place in Thread: {2} "
                + "\n Stack trace as we detect the problem: {3}"
                + "\n CurrentDate: {4}"},
        { "concurrency_util_read_lock_manager_problem03", "Remove cache key from read lock manager problem 03:"
                + "\n removeReadLock problem detected - mapThreadToReadLockAcquisitionMetadata.readLocksAcquiredDuringCurrentThread does not have have threadId  . "
                + "\n The following problem is taking place. The Thread: {0} is about to decrease the number of readers on the cacheKey: {1}"
                + "\n However this ReadLockManager currently has no entries on the mapThreadToReadLockAcquisitionMetadata.readLocksAcquiredDuringCurrentThread associated to the ongoing threadId:  {2}"
                + "\n as result in terms of tracing we will simply ignore this call to removeReadLock for the current cache key. "
                + "\n Problem is taking place in Thread: {2} "
                + "\n Stack trace as we detect the problem: {3}"
                + "\n CurrentDate: {4}"},
        { "concurrency_util_read_lock_acquisition_metadata", "No stack trace take. isAllowTakingStackTraceDuringReadLockAcquisition is false."},
        { "concurrency_util_dump_concurrency_manager_information_step02_01", "Start full concurrency manager state (massive) dump No: {0}\n"},
        { "concurrency_util_dump_concurrency_manager_information_step02_02", "End full concurrency manager state (massive) dump No: {0}\n"},
        { "concurrency_util_dump__dead_lock_explanation_01", "dumpDeadLockExplanationIfPossible code is buggy. The algorithm to try to explain dead locks should not break. Instead we have caught an exception"},
        { "concurrency_util_dump__dead_lock_explanation_02", "Concurrency manager - Page 07 start - dead lock explanation\n"},
        { "concurrency_util_dump__dead_lock_explanation_03", "We were not able to determine to determine a set of threads that went into dead lock."},
        { "concurrency_util_dump__dead_lock_explanation_04", "Dead  lock result is comprised by  {0} thread entries where one of them is repeated. \n"},
        { "concurrency_util_dump__dead_lock_explanation_05", "Dead lock participantNR: {0} "
                + "\n {1} \n\n"},
        { "concurrency_util_dump__dead_lock_explanation_06", "deadlock algorithm took {0} ms to try to find deadlock."
                + "\nConcurrency manager - Page 07 end - dead lock explanation\n"},
        { "concurrency_util_cache_keys_threads_making_use_cache_key_01", "Concurrency manager - Page 06 start - information about cache keys and threads needing them "
                + "\nTotal number of cacheKeys to describe: {0} \n\n"},
        { "concurrency_util_cache_keys_threads_making_use_cache_key_02", "-------------- [currentCacheKeyNumber: {0} of {1}]--------------\n"},
        { "concurrency_util_cache_keys_threads_making_use_cache_key_03", "[currentCacheKeyNumber: {0}] [CacheKey: {1} ]:"
                + "\n[currentCacheKeyNumber: {0}] threadsThatAcquiredActiveLock: {2}"
                + "\n[currentCacheKeyNumber: {0}] threadsThatAcquiredDeferredLock: {3}"
                + "\n[currentCacheKeyNumber: {0}] threadsThatAcquiredReadLock:  {4}"
                + "\n[currentCacheKeyNumber: {0}] threadsKnownToBeStuckTryingToAcquireLock:  {5}"
                + "\n[currentCacheKeyNumber: {0}] threadsKnownToBeStuckTryingToAcquireLockForReading:  {6}"
                + "\n[currentCacheKeyNumber: {0}] threads doing object building with root on this cache key (not yet supported)...\n\n"},
        { "concurrency_util_cache_keys_threads_making_use_cache_key_04", "Concurrency manager - Page 06 end - information about cache keys and threads needing them\n"},
        { "explain_dead_lock_util_current_thread_blocked_active_thread_warning", "recursiveExplainPossibleDeadLockStep03Scenario03CurrentWriterVsCacheKeyActiveThread: nextCandidateThreadPartOfTheDeadLock is Thread: {0}  "
                + " This thread appears to be blocking the thread: {1}  from progressing because it is set as the active thread on the cacheKey: {2} "},
        { "explain_dead_lock_util_thread_stuck_deferred_locks", "recursiveExplainPossibleDeadLockStep04ExpandBasedOnThreadStuckOnReleaseDeferredLocks: currentCandidateThreadPartOfTheDeadLock is Thread: {0}  "
                + " This thread appears to be stuck in the releaseDeferredLock logic. "
                + " But our hacked implementation of the  isBuildObjectOnThreadComplete was not able to explain what thread and cache key are recursively "
                + " stopping the candidate thread to make progress... We expect this code spot to never be invoked. "
                + " Either this thread made progress or if it continues to be stuck in the releaseDeferredLock "
                + " we most likely have an implementation bug somewhere. "},
        { "XML_call", "XML call" },
        { "XML_data_call", "XML data call" },
        { "XML_data_delete", "XML data delete" },
        { "XML_data_insert", "XML data insert" },
        { "XML_data_read", "XML data read" },
        { "XML_data_update", "XML data update" },
        { "XML_delete", "XML delete" },
        { "XML_existence_check", "XML existence check" },
        { "XML_insert", "XML insert" },
        { "XML_read_all", "XML read all" },
        { "XML_read", "XML read" },
        { "XML_update", "XML update" },
        { "write_BLOB", "Writing BLOB value(size = {0} bytes) through the locator to the table field: {1}" },
        { "write_CLOB", "Writing CLOB value(size = {0} bytes) through the locator to the table field: {1}" },
        { "assign_sequence", "assign sequence to the object ({0} -> {1})" },
        { "assign_return_row", "Assign return row {0}" },
        { "compare_failed", "Compare failed: {0}:{1}:{2}" },
        { "added_unmapped_field_to_returning_policy", "Added unmapped field {0} to ReturningPolicy of {1}" },
        { "field_for_unsupported_mapping_returned", "Returned field {0} specified in ReturningPolicy of {1} mapped with unsupported mapping" },
        { "received_updates_from_remote_server", "Received updates from Remote Server" },
        { "received_remote_connection_from", "Received remote connection from {0}" },
        { "applying_changeset_from_remote_server", "Applying changeset from remote server {0}" },
        { "change_from_remote_server_older_than_current_version", "Change from Remote Server is older than current Version for {0}: {1}" },
        { "current_version_much_older_than_change_from_remote_server", "Current Version is much older than change from remote server for {0}: {1}" },
        { "Merging_from_remote_server", "Merging {0}: {1} from remote server" },
        { "initializing_local_discovery_communication_socket", "Initializing local discovery communication socket" },
        { "place_local_remote_session_dispatcher_into_naming_service", "Place local remote session dispatcher into naming service" },
        { "connecting_to_other_sessions", "connecting to other sessions" },
        { "done", "Done" },
        { "getting_local_initial_context", "Getting local initial context" },
        { "received_connection_from", "Received connection from {0}" },
        { "sending_changeset_to_network", "Sending changeSet to network" },
        { "failed_to_reconnect_remote_connection", "Failed to reconnect the remote connection on error" },
        { "dropping_connection", "Dropping connection: {0}" },
        { "attempting_to_reconnect_to_JMS_service", "Attempting to reconnect to JMS service" },
        { "retreived_remote_message_from_JMS_topic", "Retreived remote message from JMS topic: {0}" },
        { "retreived_remote_message_from_jgroup_channel", "Retreived remote message from JGroups channel: {0}" },
        { "processing_topLink_remote_command", "Processing TopLink remote command" },
        { "JMS_exception_thrown", "JMSException thrown" },
        { "announcement_sent_from", "Announcement sent from {0}" },
        { "announcement_received_from", "Announcement received from {0}" },
        { "reconnect_to_jms", "Reconnect to the JMS topic name {0}" },
        { "sequencing_connected", "sequencing connected, state is {0}" },
        { "sequencing_connected_several_states", "sequencing connected, several states are used" },
        { "sequence_without_state", "sequence {0}: preallocation size {1}" },
        { "sequence_with_state", "sequence {0}: preallocation size {1}, state {2}" },
        { "sequencing_disconnected", "sequencing disconnected" },
        { "sequencing_localPreallocation", "local sequencing preallocation for {0}: objects: {1} , first: {2}, last: {3}" },
        { "sequencing_afterTransactionCommitted", "local sequencing preallocation is copied to preallocation after transaction commit" },
        { "sequencing_afterTransactionRolledBack", "local sequencing preallocation is discarded after transaction roll back" },
        { "sequencing_preallocation", "sequencing preallocation for {0}: objects: {1} , first: {2}, last: {3}" },
        { "starting_rcm", "Starting Remote Command Manager {0}" },
        { "stopping_rcm", "Stopping Remote Command Manager {0}" },
        { "initializing_discovery_resources", "Initializing discovery resources - group={0} port={1}" },
        { "sending_announcement", "Sending service announcement..." },
        { "register_local_connection_in_jndi", "Registering local connection in JNDI under name {0}" },
        { "register_local_connection_in_registry", "Registering local connection in RMIRegistry under name {0}" },
        { "context_props_for_remote_lookup", "Remote context properties: {0}" },
        { "looking_up_remote_conn_in_jndi", "Looking up remote connection in JNDI under name {0} at URL {1}" },
        { "looking_up_remote_conn_in_registry", "Looking up remote connection in RMIRegistry at {0}" },
        { "unable_to_look_up_remote_conn_in_jndi", "Unable to look up remote connection in JNDI under name {0} at URL {1}" },
        { "unable_to_look_up_remote_conn_in_registry", "Unable to look up remote connection in RMIRegistry under name {0}" },
        { "converting_to_toplink_command", "Converting {0} to TopLink Command format" },
        { "converting_to_user_command", "Converting {0} from TopLink Command format to user format" },
        { "executing_merge_changeset", "Executing MergeChangeSet command from {0}" },
        { "received_remote_command", "Received remote command {0} from {1}" },
        { "processing_internal_command", "Executing internal RCM command {0} from {1}" },
        { "processing_remote_command", "Executing command {0} from {1}" },
        { "sync_propagation", "Propagating command synchronously" },
        { "async_propagation", "Propagating command asynchronously" },
        { "propagate_command_to", "Propagating command {0} to {1}" },
        { "discovery_manager_active", "RCM Discovery Manager active" },
        { "discovery_manager_stopped", "RCM Discovery Manager stopped" },
        { "announcement_sent", "RCM service announcement sent out to cluster" },
        { "announcement_received", "RCM service announcement received from {0}" },
        { "creating_session_broker", "Creating session broker: {0}" },
        { "creating_database_session", "Creating database session: {0}" },
        { "creating_server_session", "Creating server session: {0}" },
        { "EJB_create", "Create EJB ({0}) " },
        { "EJB_find_all", "Find all EJB objects ({0})" },
        { "EJB_find_all_by_name", "Find all EJB objects by named query ({0})" },
        { "EJB_find_one", "Find one EJB object ({0})" },
        { "EJB_find_one_by_name", "Find one EJB object by named query ({0})" },
        { "EJB_load", "Load EJB" },
        { "EJB_remove", "Remove EJB ({0})" },
        { "EJB_store", "Store EJB ({0})" },
        { "error_in_preInvoke", "Error in preInvoke." },
        { "unable_to_load_generated_subclass", "Unable to load generated subclass: {0}" },
        { "WebLogic_10_Platform_serverSpecificRegisterMBeans_enter", "WebLogic_10_Platform.serverSpecificRegisterMBeans enter" },
        { "WebLogic_10_Platform_serverSpecificRegisterMBeans_return", "WebLogic_10_Platform.serverSpecificRegisterMBeans return" },
        { "executeFinder_query", "executeFinder query: {0}, {1}" },
        { "executeFinder_finder_execution_results", "executeFinder - finder execution results: {0}" },
        { "PM_initialize_enter", "PersistenceManager.initialize enter for {0}" },
        { "PM_initialize_return", "PersistenceManager.initialize return for {0}" },
        { "PM_preDeploy_enter", "PersistenceManager.preDeploy enter for {0}" },
        { "PM_preDeploy_return", "PersistenceManager.preDeploy return for {0}" },
        { "PM_postDeploy_enter", "PersistenceManager.postDeploy enter for {0}" },
        { "PM_postDeploy_return", "PersistenceManager.postDeploy return for {0}" },
        { "createEJB_call", "createEJB call: {0}" },
        { "createEJB_return", "createEJB return: {0}" },
        { "removeEJB_call", "removeEJB call: {0}" },
        { "invokeHomeMethod_call", "invokeHomeMethod call: {0}({1})" },
        { "invokeHomeMethod_return", "invokeHomeMethod return" },
        { "ProjectDeployment_undeploy_enter", "ProjectDeployment.undeploy enter" },
        { "ProjectDeployment_undeploy_return", "ProjectDeployment.undeploy return" },
        { "ProjectDeployment_configureDescriptor_enter", "ProjectDeployment.configureDescriptor enter: {0}" },
        { "ProjectDeployment_configureDescriptor_return", "ProjectDeployment.configureDescriptor return" },
        { "ProjectDeployment_configureDescriptors_enter", "ProjectDeployment.configureDescriptors enter" },
        { "ProjectDeployment_configureDescriptors_return", "ProjectDeployment.configureDescriptors return" },
        { "configuring_descriptor", "configuring descriptor: {0}, {1}" },
        { "concrete_class", "concrete class: {0}" },
        { "setting_ref_class_of_foreign_ref_mapping", "setting ref class of foreign ref mapping: {0}, {1}" },
        { "setting_ref_class_of_aggregate_mapping", "setting ref class of aggregate mapping: {0}, {1}" },
        { "desc_has_inheritance_policy", "Descriptor has inheritance policy: {0}" },
        { "one_time_initialization_of_ProjectDeployment", "one-time initialization of ProjectDeployment" },
        { "generateBeanSubclass_call", "generateBeanSubclass call: {0}" },
        { "remote_and_local_homes", "remote and local homes: {0}, {1}" },
        { "generateBeanSubclass_return", "generateBeanSubclass return: {0}" },
        { "error_in_startBusinessCall", "Error in startBusinessCall." },
        { "error_in_endLocalTx", "Error in endLocalTx." },
        { "EJB20_Project_Deployment_adjustDescriptorsForUOW_enter", "UOWChangeSetFlagCodeGenerator.adjustDescriptorForUOWFlag enter" },
        { "EJB20_Codegeneration_For_UOW_Change_Policy_enter", "UOWChangePolicyCodeGenerator.generateCodeForUOWChangePolicy enter" },
        { "OBJECTCHANGEPOLICY_TURNED_ON", "Change tracking turned on for: {0}" },
        { "PM_DescriptorContents", "********** PersistenceManager.getPMDescriptorContents()" },
        { "project_class_used", "The project class [{0}] is being used." },
        { "pessimistic_lock_bean", "prepare pessimistic locking for bean {0}" },
        { "changetracker_interface_not_implemented", "Class [{0}] for attribute [{1}] does not implement ChangeTracker interface. This class is being reverted to DeferredChangeDetectionPolicy." },
        { "changetracker_interface_not_implemented_non_cmp", "Class [{0}] is being reverted to DeferredChangeDetectionPolicy since the attribute [{1}] " + "is a non-cmp field but the owinging class does not implement ChangeTracker interface." },
        { "acquire_client_session_broker", "acquire client session broker" },
        { "releasing_client_session_broker", "releasing client session broker" },
        { "client_released", "client released" },
        { "client_acquired", "client acquired: {0}" },
        { "tracking_pl_object", "track pessimistic locked object {0} with UnitOfWork {1}" },
        { "instantiate_pl_relationship", "instantiate pessimistic locking relationship when relationship is accessed in a new transaction." },
        { "descriptor_xml_not_in_jar", "The descriptor file ({0}) is not found in jar({1}) file, no migration therefore will be performed for this jar." },
        { "pessimistic_locking_migrated", "The native CMP setting 'pessimistic-locking' on entity({0}) has been migrated and supported." },
        { "read_only_migrated", "The native CMP setting 'read-only' on entity({0}) has been migrated and supported." },
        { "call_timeout_migrated", "Oc4j native CMP setting 'time-out' on entity({0}) has been migrated and supported." },
        { "verifiy_columns_version_locking_migrated", "Optimistic setting 'Version' on 'verifiy-columns' in entity ({0}) has been migrated." },
        { "verifiy_columns_timestamp_locking_migrated", "Optimistic setting 'Timestamp' on 'verifiy-columns' in entity ({0}) has been migrated." },
        { "verifiy_columns_changedField_locking_migrated", "Optimistic setting 'Modify' on 'verifiy-columns' in entity ({0}) has been migrated." },
        { "order_database_operations_supported", "WLS native CMP setting 'order-database-operations' has been supported and migrated" },
        { "pattern_syntax_error", "Regular expression syntax error, exception is: {0}" },
        { "weaver_user_impl_change_tracking", "Weaving for change tracking not required for class [{0}] because it already implements the ChangeTracker interface."},
        { "weaver_found_field_lock", "Weaving for change tracking not enabled for class [{0}] because it uses field-based optimisitic locking."},
        { "weaver_processing_class", "Class [{0}] registered to be processed by weaver."},
        { "begin_weaving_class", "Begin weaver class transformer processing class [{0}]."},
        { "end_weaving_class", "End weaver class transformer processing class [{0}]."},
        { "transform_missing_class_details", "Missing class details for [{0}]."},
        { "transform_existing_class_bytes", "Using existing class bytes for [{0}]."},
        { "weaved_lazy", "Weaved lazy (ValueHolder indirection) [{0}]."},
        { "weaved_fetchgroups", "Weaved fetch groups (FetchGroupTracker) [{0}]."},
        { "weaved_changetracker", "Weaved change tracking (ChangeTracker) [{0}]."},
        { "weaved_persistenceentity", "Weaved persistence (PersistenceEntity) [{0}]."},
        { "weaved_rest", "Weaved REST [{0}]."},
        { "cmp_init_invoke_predeploy", "JavaSECMPInitializer - predeploying {0}."},
        { "cmp_init_register_transformer", "JavaSECMPInitializer - registering transformer for {0}."},
        { "cmp_init_tempLoader_created", "JavaSECMPInitializer - created temporary ClassLoader: {0}."},
        { "cmp_init_shouldOverrideLoadClassForCollectionMembers", "JavaSECMPInitializer - override load class for collection members: {0}."},
        { "cmp_loading_entities_using_loader", "JavaSECMPInitializer - loading entities using ClassLoader: {0}."},
        { "cmp_init_transformer_is_null", "JavaSECMPInitializer - transformer is null."},
        { "cmp_init_globalInstrumentation_is_null", "JavaSECMPInitializer - global instrumentation is null."},
        { "cmp_init_invoke_deploy", "JavaSECMPInitializer - deploying {0}."},
        { "cmp_init_completed_deploy", "JavaSECMPInitializer - completed deploy of {0}."},
        { "cmp_init_initialize", "JavaSECMPInitializer - initializing {0}."},
        { "cmp_init_initialize_from_main", "JavaSECMPInitializer - initializing from main."},
        { "cmp_init_initialize_from_agent", "JavaSECMPInitializer - initializing from agent."},
        { "validation_factory_not_initialized", "Bean Validation Factory was not initialized: [{0}]."},
        { "searching_for_default_mapping_file", "Searching for mapping file: [{0}] at root URL: [{1}]."},
        { "found_default_mapping_file", "Found mapping file: [{0}] at root URL: [{1}]."},
        
        { "detect_server_platform","Detected server platform: {0}."},
        { "configured_server_platform", "Configured server platform: {0}"},
        { "dbPlatformHelper_detectedVendorPlatform", "Detected database platform: {0}"},
        { "dbPlatformHelper_regExprDbPlatform", "Database platform: {1}, regular expression: {0}"},
        { "dbPlatformHelper_patternSyntaxException", "Exception while using regular expression: {0}" },
        { "unknown_query_hint", "query {0}: unknown query hint {1} will be ignored"},
        { "query_hint", "query {0}: query hint {1}; value {2}"},
        { "property_value_specified", "property={0}; value={1}"},
        { "property_value_default", "property={0}; default value={1}"},
        { "handler_property_value_specified", "property={0}; value={1}; translated value={2}"},
        { "handler_property_value_default", "property={0}; default value={1}; translated value={2}"},
        { "predeploy_begin", "Begin predeploying Persistence Unit {0}; session {1}; state {2}; factoryCount {3}"},
        { "predeploy_end", "End predeploying Persistence Unit {0}; session {1}; state {2}; factoryCount {3}"},
        { "session_name_change", "Session change name: Persistence Unit {0}; old session {1}; new session {2}"},
        { "deploy_begin", "Begin deploying Persistence Unit {0}; session {1}; state {2}; factoryCount {3}"},
        { "deploy_end", "End deploying Persistence Unit {0}; session {1}; state {2}; factoryCount {3}"},
        { "undeploy_begin", "Begin undeploying Persistence Unit {0}; session {1}; state {2}; factoryCount {3}"},
        { "undeploy_end", "End undeploying Persistence Unit {0}; session {1}; state {2}; factoryCount {3}"},
        { "composite_member_begin_call", "Begin {0} on composite member Persistence Unit {1}; state {2}"},
        { "composite_member_end_call", "End {0} on composite member Persistence Unit {1}; state {2}"},
        { "loading_session_xml", "Loading persistence unit from sessions-xml file: {0}, session-name: {1}"},
        
        { "default_tables_created", "The table ({0}) is created."},
        { "identity_map_does_not_exist",  "Identity Map [{0}] does not exist" },
        { "identity_map_is_empty",  "Identity Map [{0}] is empty" },
        { "key_value",  "Key [{0}] => Value [{1}]" },
        { "no_identity_maps_in_this_session",  "There are no Identity Maps in this session" },
        { "identity_map_class",  "Identity Map [{0}] class = {1}" },
        { "identity_map_initialized",  "Identity Map [{0}] is initialized" },
        { "identity_map_invalidated",  "Identity Map [{0}] is invalidated" },
        { "no_classes_in_session", "No Classes in session." },

        { "creating_broadcast_connection", "{0}: creating connection." },
        { "broadcast_connection_created", "{0}: connection created." },
        { "failed_to_create_broadcast_connection", "{0}: failed to create connection." },
        { "broadcast_sending_message", "{0}: sending message {1}" },
        { "broadcast_sent_message", "{0}: has sent message {1}" },
        { "broadcast_closing_connection", "{0}: connection is closing." },
        { "broadcast_connection_closed", "{0}: connection closed." },
        { "broadcast_retreived_message", "{0}: has received message {1}" },
        { "broadcast_processing_remote_command", "{0}: processing message {1} sent by service id {2}: processing remote command {3}." },
        { "broadcast_connection_start_listening", "{0}: Start listening." },
        { "broadcast_connection_stop_listening", "{0}: Stop listening." },
        { "sdo_type_generation_processing_type", "{0}: Generating Type  [{1}]."},
        { "sdo_type_generation_processing_type_as", "{0}: Generating Type  [{1}] as [{2}]."},
        { "registered_mbean", "Registered MBean: {0} on server {1}" },
        { "unregistering_mbean", "Unregistering MBean: {0} on server {1}" },
        { "mbean_get_application_name", "The applicationName for the MBean attached to session [{0}] is [{1}]" },
        { "mbean_get_module_name", "The moduleName for the MBean attached to session [{0}] is [{1}]" },
        { "active_thread_is_different_from_current_thread", "Forcing the activeThread \"{0}\" on the mergeManager \"{1}\" to be the currentThread \"{2}\" because they are different." },
        { "dead_lock_encountered_on_write_no_cachekey", "Potential deadlock encountered while thread: {2} attempted to lock object of class: {0} with id: {1}, entering deadlock avoidance algorithm.  This is a notice only."},
        { "metamodel_attribute_class_type_is_null", "Metamodel processing: The class type is null for the attribute: {0}." },
        { "metamodel_mapping_type_is_unsupported", "Metamodel processing: The mapping type [{0}] in the attribute [{1}] is currently unsupported." },
        { "metamodel_descriptor_type_eis_or_xml_is_unsupported", "Metamodel processing: EIS or XML ClassDescriptor instances [{0}] are currently not supported." },
        { "connect_drivermanager_fail", "DriverManager connect failed, trying direct connect."},
        { "metamodel_unable_to_determine_element_type_in_absence_of_generic_parameters", "Metamodel processing: Unable to get the element type for the mapping [{0}] in the absence of generic parameters on mapping declaration." },
        { "metamodel_init_failed", "Initialization of the metamodel failed during deployment.  Ignoring exception: [{0}] " },
        { "metamodel_canonical_model_class_not_found", "Canonical Metamodel class [{0}] not found during initialization."},
        { "metamodel_canonical_model_class_found", "Canonical Metamodel class [{0}] found and instantiated during initialization."},
        { "metamodel_relationaldescriptor_javaclass_null_on_managedType", "Metamodel processing: The javaClass field is null for the relationalDescriptor [{0}] for the managedType [{1}]." },
        { "metamodel_attribute_getmember_is_null", "The java Member is null for the Attribute [{0}] with managedType [{1}] and descriptor [{2}]." },
        { "metamodel_typeImpl_javaClass_should_not_be_null", "The metamodel TypeImpl.javaClass field should not be set to null for the Type [{0}] with name [{1}]." },
        { "jmx_mbean_classloader_in_use", "EclipseLink JMX Runtime Services is referencing the [{0}] ClassLoader at: [{1}]" },
        { "metamodel_itentifiableType_javaclass_null_cannot_set_supertype", "Metamodel processing: Unable to set the superclass Hierarchy because the javaClass field is null for the relationalDescriptor [{0}] for the identifiableType [{1}]." },
        { "metamodel_relationaldescriptor_not_fully_initialized_yet", "Metamodel processing: The relationalDescriptor [{0}] for the managedType [{1}] is not fully initialized yet - the Metamodel instance will be incomplete before at least one entityManger session login (after a full deploy)." },
        { "no_weaved_vh_method_found_verify_weaving_and_module_order", "An expected weaving method [{0}] was not found on the accessor [{2}] on the mapping [{1}] - verify that the processing order of your modules places the one containing a persistence unit ahead of modules that use it in your deployment descriptor, or disable weaving for the persistence context or the mapping using FetchType.EAGER." },
        { "proxy_connection_customizer_already_proxy_session", "{0}:{1}: proxy session with unknown properties is already opened. Closing it."},
        { "proxy_connection_customizer_opened_proxy_session",  "{0}:{1}: opened proxy session."},
        { "proxy_connection_customizer_closing_proxy_session", "{0}:{1}: closing proxy session."},
        { "releasing_invalid_lock", "A lock has been encountered where the thread: {0} is no longer active.  The lock on object class :{1} id: {2} has been forcibly released"},
        { "acquire_connection", "Connection acquired from connection pool [{0}]." },
        { "release_connection", "Connection released to connection pool [{0}]." },
        { "failover", "Connection pool [{0}] is dead, failing over to poll [{1}]." },
        { "max_time_exceeded_for_acquirerequiredlocks_wait", "MAX TIME {0} seconds EXCEEDED FOR WRITELOCKMANAGER WAIT.  Waiting on Entity type: {1}with pk: {2} currently locked by thread: {3} with the following trace:\n"},
        { "dcn_registering", "Registering for database change event notification." },
        { "dcn_change_event", "Receieved database change event [{0}]." },
        { "dcn_invalidate", "Invalidating cache key [{0}] from database change event for class [{1}]." },
        { "dcn_register_table", "Registering table [{0}] for database change event notification." },
        { "dcn_unregister", "Removing registering for database change event notification." },

        { "exception_caught_closing_statement", "Exception caught when trying to close the query statement [{0}]." },
        //MOXy fine/finer/finest
        { "schema_factory", "SchemaFactory instance: {0}" },
        { "saxparser_factory", "SAXParserFactory instance: {0}" },
        { "xpath_factory", "XPathFactory instance: {0}" },
        { "transformer_factory", "TransformerFactory instance: {0}" },
        { "documentbuilder_factory", "DocumentBuilderFactory instance: {0}" },
        { "jaxp_sec_disabled", "Xml Security disabled, no JAXP {0} external access configuration necessary." },
        { "jaxp_sec_explicit", "Detected explicitly JAXP configuration, no JAXP {0} external access configuration necessary." },
        { "jaxp_sec_prop_supported", "Property {0} is supported and has been successfully set by used JAXP implementation." },
        { "jaxp_sec_prop_not_supported", "Property {0} is not supported by used JAXP implementation." },
        { "javase_version_ex_method_not_found", "Method {0} was not found in {1}" }
    };

    /**
     * Return the lookup table.
     */
    @Override
    protected Object[][] getContents() {
        return contents;
    }
}

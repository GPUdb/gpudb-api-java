/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of parameters for {@link
 * com.gpudb.GPUdb#adminAlterJobs(AdminAlterJobsRequest)}.
 * <p>
 * Perform the requested action on a list of one or more job(s). Based on the
 * type of job and the current state of execution, the action may not be
 * successfully executed. The final result of the attempted actions for each
 * specified job is returned in the status array of the response. See <a
 * href="../../../../../../admin/job_manager/" target="_top">Job Manager</a>
 * for more information.
 */
public class AdminAlterJobsRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AdminAlterJobsRequest")
            .namespace("com.gpudb")
            .fields()
                .name("jobIds").type().array().items().longType().noDefault()
                .name("action").type().stringType().noDefault()
                .name("options").type().map().values().stringType().noDefault()
            .endRecord();


    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     * 
     * @return  the schema for the class.
     * 
     */
    public static Schema getClassSchema() {
        return schema$;
    }


    /**
     * Action to be performed on the jobs specified by job_ids.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.AdminAlterJobsRequest.Action#CANCEL CANCEL}
     * </ul>
     * A set of string constants for the parameter {@code action}.
     */
    public static final class Action {
        public static final String CANCEL = "cancel";

        private Action() {  }
    }


    /**
     * Optional parameters.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.AdminAlterJobsRequest.Options#JOB_TAG JOB_TAG}: Job
     * tag returned in call to create the job
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * Job tag returned in call to create the job
         */
        public static final String JOB_TAG = "job_tag";

        private Options() {  }
    }

    private List<Long> jobIds;
    private String action;
    private Map<String, String> options;


    /**
     * Constructs an AdminAlterJobsRequest object with default parameters.
     */
    public AdminAlterJobsRequest() {
        jobIds = new ArrayList<>();
        action = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs an AdminAlterJobsRequest object with the specified
     * parameters.
     * 
     * @param jobIds  Jobs to be modified.
     * @param action  Action to be performed on the jobs specified by job_ids.
     *                Supported values:
     *                <ul>
     *                        <li> {@link
     *                com.gpudb.protocol.AdminAlterJobsRequest.Action#CANCEL
     *                CANCEL}
     *                </ul>
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminAlterJobsRequest.Options#JOB_TAG
     *                 JOB_TAG}: Job tag returned in call to create the job
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public AdminAlterJobsRequest(List<Long> jobIds, String action, Map<String, String> options) {
        this.jobIds = (jobIds == null) ? new ArrayList<Long>() : jobIds;
        this.action = (action == null) ? "" : action;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Jobs to be modified.
     * 
     */
    public List<Long> getJobIds() {
        return jobIds;
    }

    /**
     * 
     * @param jobIds  Jobs to be modified.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminAlterJobsRequest setJobIds(List<Long> jobIds) {
        this.jobIds = (jobIds == null) ? new ArrayList<Long>() : jobIds;
        return this;
    }

    /**
     * 
     * @return Action to be performed on the jobs specified by job_ids.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AdminAlterJobsRequest.Action#CANCEL CANCEL}
     *         </ul>
     * 
     */
    public String getAction() {
        return action;
    }

    /**
     * 
     * @param action  Action to be performed on the jobs specified by job_ids.
     *                Supported values:
     *                <ul>
     *                        <li> {@link
     *                com.gpudb.protocol.AdminAlterJobsRequest.Action#CANCEL
     *                CANCEL}
     *                </ul>
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminAlterJobsRequest setAction(String action) {
        this.action = (action == null) ? "" : action;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AdminAlterJobsRequest.Options#JOB_TAG
     *         JOB_TAG}: Job tag returned in call to create the job
     *         </ul>
     *         The default value is an empty {@link Map}.
     * 
     */
    public Map<String, String> getOptions() {
        return options;
    }

    /**
     * 
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminAlterJobsRequest.Options#JOB_TAG
     *                 JOB_TAG}: Job tag returned in call to create the job
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminAlterJobsRequest setOptions(Map<String, String> options) {
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
        return this;
    }

    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     * 
     * @return the schema object describing this class.
     * 
     */
    @Override
    public Schema getSchema() {
        return schema$;
    }

    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     * 
     * @param index  the position of the field to get
     * 
     * @return value of the field with the given index.
     * 
     * @throws IndexOutOfBoundsException
     * 
     */
    @Override
    public Object get(int index) {
        switch (index) {
            case 0:
                return this.jobIds;

            case 1:
                return this.action;

            case 2:
                return this.options;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    /**
     * This method supports the Avro framework and is not intended to be called
     * directly by the user.
     * 
     * @param index  the position of the field to set
     * @param value  the value to set
     * 
     * @throws IndexOutOfBoundsException
     * 
     */
    @Override
    @SuppressWarnings("unchecked")
    public void put(int index, Object value) {
        switch (index) {
            case 0:
                this.jobIds = (List<Long>)value;
                break;

            case 1:
                this.action = (String)value;
                break;

            case 2:
                this.options = (Map<String, String>)value;
                break;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if( obj == this ) {
            return true;
        }

        if( (obj == null) || (obj.getClass() != this.getClass()) ) {
            return false;
        }

        AdminAlterJobsRequest that = (AdminAlterJobsRequest)obj;

        return ( this.jobIds.equals( that.jobIds )
                 && this.action.equals( that.action )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "jobIds" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.jobIds ) );
        builder.append( ", " );
        builder.append( gd.toString( "action" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.action ) );
        builder.append( ", " );
        builder.append( gd.toString( "options" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.options ) );
        builder.append( "}" );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.jobIds.hashCode();
        hashCode = (31 * hashCode) + this.action.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

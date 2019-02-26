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
 * com.gpudb.GPUdb#adminAddRanks(AdminAddRanksRequest)}.
 * <p>
 * Add one or more new ranks to the Kinetica cluster. The new ranks will not
 * contain any data initially, other than replicated tables, and not be
 * assigned any shards. To rebalance data across the cluster, which includes
 * shifting some shard key assignments to newly added ranks, see {@link
 * com.gpudb.GPUdb#adminRebalance(AdminRebalanceRequest)}.
 * <p>
 * For example, if attempting to add three new ranks (two ranks on host
 * 172.123.45.67 and one rank on host 172.123.45.68) to a Kinetica cluster with
 * additional configuration parameters:
 * <p>
 * * {@code hosts} would be an array including 172.123.45.67 in the first two
 * indices (signifying two ranks being added to host 172.123.45.67) and
 * 172.123.45.68 in the last index (signifying one rank being added to host
 * 172.123.45.67)
 * <p>
 * * {@code configParams} would be an array of maps, with each map
 * corresponding to the ranks being added in {@code hosts}. The key of each map
 * would be the configuration parameter name and the value would be the
 * parameter's value, e.g. 'rank.gpu':'1'
 * <p>
 * This endpoint's processing includes copying all replicated table data to the
 * new rank(s) and therefore could take a long time. The API call may time out
 * if run directly.  It is recommended to run this endpoint asynchronously via
 * {@link com.gpudb.GPUdb#createJob(CreateJobRequest)}.
 */
public class AdminAddRanksRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AdminAddRanksRequest")
            .namespace("com.gpudb")
            .fields()
                .name("hosts").type().array().items().stringType().noDefault()
                .name("configParams").type().array().items().map().values().stringType().noDefault()
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
     * Optional parameters.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.AdminAddRanksRequest.Options#DRY_RUN DRY_RUN}: If
     * {@code true}, only validation checks will be performed. No ranks are
     * added.
     * Supported values:
     * <ul>
     *         <li> {@link com.gpudb.protocol.AdminAddRanksRequest.Options#TRUE
     * TRUE}
     *         <li> {@link
     * com.gpudb.protocol.AdminAddRanksRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.AdminAddRanksRequest.Options#FALSE FALSE}.
     * </ul>
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * If {@code true}, only validation checks will be performed. No ranks
         * are added.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.AdminAddRanksRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.AdminAddRanksRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.AdminAddRanksRequest.Options#FALSE FALSE}.
         */
        public static final String DRY_RUN = "dry_run";
        public static final String TRUE = "true";
        public static final String FALSE = "false";

        private Options() {  }
    }

    private List<String> hosts;
    private List<Map<String, String>> configParams;
    private Map<String, String> options;


    /**
     * Constructs an AdminAddRanksRequest object with default parameters.
     */
    public AdminAddRanksRequest() {
        hosts = new ArrayList<>();
        configParams = new ArrayList<>();
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs an AdminAddRanksRequest object with the specified parameters.
     * 
     * @param hosts  The IP address of each rank being added to the cluster.
     *               Insert one entry per rank, even if they are on the same
     *               host. The order of the hosts in the array only matters as
     *               it relates to the {@code configParams}.
     * @param configParams  Configuration parameters to apply to the new ranks,
     *                      e.g., which GPU to use. Configuration parameters
     *                      that start with 'rankN.', where N is the rank
     *                      number, should omit the N, as the new rank
     *                      number(s) are not allocated until the ranks are
     *                      created. Each entry in this array corresponds to
     *                      the entry at the same array index in the {@code
     *                      hosts}. This array must either be completely empty
     *                      or have the same number of elements as the hosts
     *                      array.  An empty array will result in the new ranks
     *                      being set only with default parameters.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminAddRanksRequest.Options#DRY_RUN
     *                 DRY_RUN}: If {@code true}, only validation checks will
     *                 be performed. No ranks are added.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminAddRanksRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminAddRanksRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.AdminAddRanksRequest.Options#FALSE
     *                 FALSE}.
     *                 </ul>
     * 
     */
    public AdminAddRanksRequest(List<String> hosts, List<Map<String, String>> configParams, Map<String, String> options) {
        this.hosts = (hosts == null) ? new ArrayList<String>() : hosts;
        this.configParams = (configParams == null) ? new ArrayList<Map<String, String>>() : configParams;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return The IP address of each rank being added to the cluster. Insert
     *         one entry per rank, even if they are on the same host. The order
     *         of the hosts in the array only matters as it relates to the
     *         {@code configParams}.
     * 
     */
    public List<String> getHosts() {
        return hosts;
    }

    /**
     * 
     * @param hosts  The IP address of each rank being added to the cluster.
     *               Insert one entry per rank, even if they are on the same
     *               host. The order of the hosts in the array only matters as
     *               it relates to the {@code configParams}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminAddRanksRequest setHosts(List<String> hosts) {
        this.hosts = (hosts == null) ? new ArrayList<String>() : hosts;
        return this;
    }

    /**
     * 
     * @return Configuration parameters to apply to the new ranks, e.g., which
     *         GPU to use. Configuration parameters that start with 'rankN.',
     *         where N is the rank number, should omit the N, as the new rank
     *         number(s) are not allocated until the ranks are created. Each
     *         entry in this array corresponds to the entry at the same array
     *         index in the {@code hosts}. This array must either be completely
     *         empty or have the same number of elements as the hosts array.
     *         An empty array will result in the new ranks being set only with
     *         default parameters.
     * 
     */
    public List<Map<String, String>> getConfigParams() {
        return configParams;
    }

    /**
     * 
     * @param configParams  Configuration parameters to apply to the new ranks,
     *                      e.g., which GPU to use. Configuration parameters
     *                      that start with 'rankN.', where N is the rank
     *                      number, should omit the N, as the new rank
     *                      number(s) are not allocated until the ranks are
     *                      created. Each entry in this array corresponds to
     *                      the entry at the same array index in the {@code
     *                      hosts}. This array must either be completely empty
     *                      or have the same number of elements as the hosts
     *                      array.  An empty array will result in the new ranks
     *                      being set only with default parameters.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminAddRanksRequest setConfigParams(List<Map<String, String>> configParams) {
        this.configParams = (configParams == null) ? new ArrayList<Map<String, String>>() : configParams;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AdminAddRanksRequest.Options#DRY_RUN
     *         DRY_RUN}: If {@code true}, only validation checks will be
     *         performed. No ranks are added.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AdminAddRanksRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.AdminAddRanksRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.AdminAddRanksRequest.Options#FALSE FALSE}.
     *         </ul>
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
     *                 com.gpudb.protocol.AdminAddRanksRequest.Options#DRY_RUN
     *                 DRY_RUN}: If {@code true}, only validation checks will
     *                 be performed. No ranks are added.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminAddRanksRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.AdminAddRanksRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.AdminAddRanksRequest.Options#FALSE
     *                 FALSE}.
     *                 </ul>
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminAddRanksRequest setOptions(Map<String, String> options) {
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
                return this.hosts;

            case 1:
                return this.configParams;

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
                this.hosts = (List<String>)value;
                break;

            case 1:
                this.configParams = (List<Map<String, String>>)value;
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

        AdminAddRanksRequest that = (AdminAddRanksRequest)obj;

        return ( this.hosts.equals( that.hosts )
                 && this.configParams.equals( that.configParams )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "hosts" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.hosts ) );
        builder.append( ", " );
        builder.append( gd.toString( "configParams" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.configParams ) );
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
        hashCode = (31 * hashCode) + this.hosts.hashCode();
        hashCode = (31 * hashCode) + this.configParams.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}
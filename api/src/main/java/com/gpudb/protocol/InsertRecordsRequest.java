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
import org.apache.avro.generic.GenericData;


/**
 * A set of parameters for {@link
 * com.gpudb.GPUdb#insertRecords(InsertRecordsRequest)}.
 * <p>
 * Adds multiple records to the specified table. The operation is synchronous
 * meaning that GPUdb will not return a response until all the records are
 * fully inserted and available. The response payload provides unique
 * identifier for each added record along with counts of the number of records
 * actually inserted and/or updated.
 * <p>
 * {@code options} can be used to customize this function's behavior. The only
 * parameter available is {@code update_on_existing_pk}. The value can be
 * either 'true' or 'false'. If the table has a {@link
 * com.gpudb.GPUdb#createType(CreateTypeRequest) primary key} and if {@code
 * update_on_existing_pk} is 'true' then if any of the records being added have
 * the same primary key as existing records, the existing records are replaced
 * (i.e. *updated*) with the given records. If {@code update_on_existing_pk} is
 * false and if the records being added have the same primary key as existing
 * records, the given records with existing primary keys are ignored (the
 * existing records are left unchanged). It is quite possible that in this case
 * some of the given records will be inserted and some (those having existing
 * primary keys) will be ignored (or updated). If the specified table does not
 * have a primary key column then the {@code update_on_existing_pk} option is
 * ignored.
 * 
 * @param <T>  The type of object being processed.
 * 
 */
public class InsertRecordsRequest<T> {

    /**
     * Optional parameters.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * If the table has a {@link
         * com.gpudb.GPUdb#createType(CreateTypeRequest) primary key}, then if
         * the value is 'true' then if any of the records being added have the
         * same primary key as existing records, the existing records are
         * replaced (i.e. *updated*) with the given records. If 'false' and if
         * the records being added have the same primary key as existing
         * records, the given records with existing primary keys are ignored
         * (the existing records are left unchanged).  It is quite possible
         * that in this case some of the given records will be inserted and
         * some (those having existing primary keys) will be ignored (or
         * updated). If the specified table does not have a primary key column
         * then this optional parameter is ignored.
         */
        public static final String UPDATE_ON_EXISTING_PK = "update_on_existing_pk";
        public static final String TRUE = "true";
        public static final String FALSE = "false";

        /**
         * If 'true' then return GPUdb's internal record id along for each
         * inserted record. Default is 'false'.
         */
        public static final String RETURN_RECORD_IDS = "return_record_ids";

        /**
         * Route to a specific rank/tom. Option not suitable for tables using
         * primary/shard keys
         */
        public static final String ROUTE_TO_ADDRESS = "route_to_address";

        private Options() {  }
    }

    private String tableName;
    private List<T> data;
    private Map<String, String> options;


    /**
     * Constructs an InsertRecordsRequest object with default parameters.
     */
    public InsertRecordsRequest() {
        tableName = "";
        data = new ArrayList<>();
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs an InsertRecordsRequest object with the specified parameters.
     * 
     * @param tableName  Table to which the records are to be added. Must be an
     *                   existing table.
     * @param data  An array of binary-encoded data for the records to be
     *              added. All records must be of the same type as that of the
     *              table. Empty array if {@code listEncoding} is {@code json}.
     * @param options  Optional parameters.
     * <ul>
     *     <li>update_on_existing_pk: If the table has a {primary key}@{endpoint /create/type}, then if the value is 'true' then if any of the records being added have the same primary key as existing records, the existing records are replaced (i.e. *updated*) with the given records. If 'false' and if the records being added have the same primary key as existing records, the given records with existing primary keys are ignored (the existing records are left unchanged).  It is quite possible that in this case some of the given records will be inserted and some (those having existing primary keys) will be ignored (or updated). If the specified table does not have a primary key column then this optional parameter is ignored.  values:TRUE, FALSE
     *     <li>return_record_ids: If 'true' then return GPUdb's internal record id along for each inserted record. Default is 'false'.  values:TRUE, FALSE
     *     <li>route_to_address: Route to a specific rank/tom. Option not suitable for tables using primary/shard keys  
     * </ul>
     * 
     */
    public InsertRecordsRequest(String tableName, List<T> data, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.data = (data == null) ? new ArrayList<T>() : data;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Table to which the records are to be added. Must be an existing
     *         table.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Table to which the records are to be added. Must be an
     *                   existing table.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public InsertRecordsRequest<T> setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * 
     * @return An array of binary-encoded data for the records to be added. All
     *         records must be of the same type as that of the table. Empty
     *         array if {@code listEncoding} is {@code json}.
     * 
     */
    public List<T> getData() {
        return data;
    }

    /**
     * 
     * @param data  An array of binary-encoded data for the records to be
     *              added. All records must be of the same type as that of the
     *              table. Empty array if {@code listEncoding} is {@code json}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public InsertRecordsRequest<T> setData(List<T> data) {
        this.data = (data == null) ? new ArrayList<T>() : data;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     * 
     */
    public Map<String, String> getOptions() {
        return options;
    }

    /**
     * 
     * @param options  Optional parameters.
     * <ul>
     *     <li>update_on_existing_pk: If the table has a {primary key}@{endpoint /create/type}, then if the value is 'true' then if any of the records being added have the same primary key as existing records, the existing records are replaced (i.e. *updated*) with the given records. If 'false' and if the records being added have the same primary key as existing records, the given records with existing primary keys are ignored (the existing records are left unchanged).  It is quite possible that in this case some of the given records will be inserted and some (those having existing primary keys) will be ignored (or updated). If the specified table does not have a primary key column then this optional parameter is ignored.  values:TRUE, FALSE
     *     <li>return_record_ids: If 'true' then return GPUdb's internal record id along for each inserted record. Default is 'false'.  values:TRUE, FALSE
     *     <li>route_to_address: Route to a specific rank/tom. Option not suitable for tables using primary/shard keys  
     * </ul>
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public InsertRecordsRequest<T> setOptions(Map<String, String> options) {
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
        return this;
    }
    @Override
    public boolean equals(Object obj) {
        if( obj == this ) {
            return true;
        }

        if( (obj == null) || (obj.getClass() != this.getClass()) ) {
            return false;
        }

        InsertRecordsRequest that = (InsertRecordsRequest)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.data.equals( that.data )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "tableName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.tableName ) );
        builder.append( ", " );
        builder.append( gd.toString( "data" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.data ) );
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
        hashCode = (31 * hashCode) + this.tableName.hashCode();
        hashCode = (31 * hashCode) + this.data.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

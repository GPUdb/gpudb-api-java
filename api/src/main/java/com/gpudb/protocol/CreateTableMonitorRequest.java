/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;

import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of parameters for {@link
 * com.gpudb.GPUdb#createTableMonitor(CreateTableMonitorRequest)}.
 * <p>
 * Creates a monitor that watches for a single table modification event
 * type (insert, update, or delete) on a particular table (identified by
 * {@code tableName}) and forwards event notifications to subscribers via ZMQ.
 * After this call completes, subscribe to the returned {@code topicId} on the
 * ZMQ table monitor port (default 9002). Each time an operation of the given
 * type
 * on the table completes, a multipart message is published for that topic; the
 * first part contains only the topic ID, and each subsequent part contains one
 * binary-encoded Avro object that corresponds to the event and can be decoded
 * using {@code typeSchema}. The monitor will continue to run (regardless of
 * whether or not there are any subscribers) until deactivated with
 * {@link com.gpudb.GPUdb#clearTableMonitor(ClearTableMonitorRequest)}.
 * <p>
 * For more information on table monitors, see
 * <a href="../../../../../../concepts/table_monitors/" target="_top">Table
 * Monitors</a>.
 */
public class CreateTableMonitorRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("CreateTableMonitorRequest")
            .namespace("com.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
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
     * com.gpudb.protocol.CreateTableMonitorRequest.Options#EVENT EVENT}: Type
     * of modification event on the target table to be monitored by this table
     * monitor.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.CreateTableMonitorRequest.Options#INSERT INSERT}: Get
     * notifications of new record insertions. The new row images are forwarded
     * to the subscribers.
     *         <li> {@link
     * com.gpudb.protocol.CreateTableMonitorRequest.Options#UPDATE UPDATE}: Get
     * notifications of update operations. The modified row count information
     * is forwarded to the subscribers.
     *         <li> {@link
     * com.gpudb.protocol.CreateTableMonitorRequest.Options#DELETE DELETE}: Get
     * notifications of delete operations. The deleted row count information is
     * forwarded to the subscribers.
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.CreateTableMonitorRequest.Options#INSERT INSERT}.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * Type of modification event on the target table to be monitored by
         * this table monitor.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.CreateTableMonitorRequest.Options#INSERT INSERT}:
         * Get notifications of new record insertions. The new row images are
         * forwarded to the subscribers.
         *         <li> {@link
         * com.gpudb.protocol.CreateTableMonitorRequest.Options#UPDATE UPDATE}:
         * Get notifications of update operations. The modified row count
         * information is forwarded to the subscribers.
         *         <li> {@link
         * com.gpudb.protocol.CreateTableMonitorRequest.Options#DELETE DELETE}:
         * Get notifications of delete operations. The deleted row count
         * information is forwarded to the subscribers.
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.CreateTableMonitorRequest.Options#INSERT INSERT}.
         */
        public static final String EVENT = "event";

        /**
         * Get notifications of new record insertions. The new row images are
         * forwarded to the subscribers.
         */
        public static final String INSERT = "insert";

        /**
         * Get notifications of update operations. The modified row count
         * information is forwarded to the subscribers.
         */
        public static final String UPDATE = "update";

        /**
         * Get notifications of delete operations. The deleted row count
         * information is forwarded to the subscribers.
         */
        public static final String DELETE = "delete";

        private Options() {  }
    }

    private String tableName;
    private Map<String, String> options;


    /**
     * Constructs a CreateTableMonitorRequest object with default parameters.
     */
    public CreateTableMonitorRequest() {
        tableName = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a CreateTableMonitorRequest object with the specified
     * parameters.
     * 
     * @param tableName  Name of the table to monitor, in
     *                   [schema_name.]table_name format, using standard <a
     *                   href="../../../../../../concepts/tables/#table-name-resolution"
     *                   target="_top">name resolution rules</a>.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateTableMonitorRequest.Options#EVENT
     *                 EVENT}: Type of modification event on the target table
     *                 to be monitored by this table monitor.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateTableMonitorRequest.Options#INSERT
     *                 INSERT}: Get notifications of new record insertions. The
     *                 new row images are forwarded to the subscribers.
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateTableMonitorRequest.Options#UPDATE
     *                 UPDATE}: Get notifications of update operations. The
     *                 modified row count information is forwarded to the
     *                 subscribers.
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateTableMonitorRequest.Options#DELETE
     *                 DELETE}: Get notifications of delete operations. The
     *                 deleted row count information is forwarded to the
     *                 subscribers.
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.CreateTableMonitorRequest.Options#INSERT
     *                 INSERT}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public CreateTableMonitorRequest(String tableName, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the table to monitor, in [schema_name.]table_name
     *         format, using standard <a
     *         href="../../../../../../concepts/tables/#table-name-resolution"
     *         target="_top">name resolution rules</a>.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Name of the table to monitor, in
     *                   [schema_name.]table_name format, using standard <a
     *                   href="../../../../../../concepts/tables/#table-name-resolution"
     *                   target="_top">name resolution rules</a>.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateTableMonitorRequest setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.CreateTableMonitorRequest.Options#EVENT
     *         EVENT}: Type of modification event on the target table to be
     *         monitored by this table monitor.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.CreateTableMonitorRequest.Options#INSERT
     *         INSERT}: Get notifications of new record insertions. The new row
     *         images are forwarded to the subscribers.
     *                 <li> {@link
     *         com.gpudb.protocol.CreateTableMonitorRequest.Options#UPDATE
     *         UPDATE}: Get notifications of update operations. The modified
     *         row count information is forwarded to the subscribers.
     *                 <li> {@link
     *         com.gpudb.protocol.CreateTableMonitorRequest.Options#DELETE
     *         DELETE}: Get notifications of delete operations. The deleted row
     *         count information is forwarded to the subscribers.
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.CreateTableMonitorRequest.Options#INSERT
     *         INSERT}.
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
     *                 com.gpudb.protocol.CreateTableMonitorRequest.Options#EVENT
     *                 EVENT}: Type of modification event on the target table
     *                 to be monitored by this table monitor.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateTableMonitorRequest.Options#INSERT
     *                 INSERT}: Get notifications of new record insertions. The
     *                 new row images are forwarded to the subscribers.
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateTableMonitorRequest.Options#UPDATE
     *                 UPDATE}: Get notifications of update operations. The
     *                 modified row count information is forwarded to the
     *                 subscribers.
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateTableMonitorRequest.Options#DELETE
     *                 DELETE}: Get notifications of delete operations. The
     *                 deleted row count information is forwarded to the
     *                 subscribers.
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.CreateTableMonitorRequest.Options#INSERT
     *                 INSERT}.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateTableMonitorRequest setOptions(Map<String, String> options) {
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
                return this.tableName;

            case 1:
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
                this.tableName = (String)value;
                break;

            case 1:
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

        CreateTableMonitorRequest that = (CreateTableMonitorRequest)obj;

        return ( this.tableName.equals( that.tableName )
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
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

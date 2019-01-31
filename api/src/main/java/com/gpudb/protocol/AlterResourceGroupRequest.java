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
 * com.gpudb.GPUdb#alterResourceGroup(AlterResourceGroupRequest)}.
 * <p>
 * Alters properties of exisiting resource group to facilitate resource
 * management.
 */
public class AlterResourceGroupRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AlterResourceGroupRequest")
            .namespace("com.gpudb")
            .fields()
                .name("name").type().stringType().noDefault()
                .name("tierAttributes").type().map().values().map().values().stringType().noDefault()
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
     * Optional map containing tier names and their respective attribute group
     * limits.  The only valid attribute limit that can be set is max_memory
     * (in bytes) for the VRAM & RAM tiers.
     * <p>
     * For instance, to set max VRAM capacity to 1GB and max RAM capacity to
     * 10GB, use:  {'VRAM':{'max_memory':'1000000000'},
     * 'RAM':{'max_memory':'10000000000'}}
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.TierAttributes#MAX_MEMORY
     * MAX_MEMORY}: Maximum amount of memory usable in the given tier at one
     * time for this group.
     * </ul>
     * A set of string constants for the parameter {@code tierAttributes}.
     */
    public static final class TierAttributes {

        /**
         * Maximum amount of memory usable in the given tier at one time for
         * this group.
         */
        public static final String MAX_MEMORY = "max_memory";

        private TierAttributes() {  }
    }


    /**
     * Optional parameters.
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_CPU_CONCURRENCY
     * MAX_CPU_CONCURRENCY}: Maximum number of simultaneous threads that will
     * be used to execute a request for this group.
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_SCHEDULING_PRIORITY
     * MAX_SCHEDULING_PRIORITY}: Maximum priority of a scheduled task for this
     * group.
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_TIER_PRIORITY
     * MAX_TIER_PRIORITY}: Maximum priority of a tiered object for this group.
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Options#IS_DEFAULT_GROUP
     * IS_DEFAULT_GROUP}: If {@code true}, this request applies to the global
     * default resource group. It is an error for this field to be {@code true}
     * when the {@code name} field is also populated.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE FALSE}.
     * </ul>
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * Maximum number of simultaneous threads that will be used to execute
         * a request for this group.
         */
        public static final String MAX_CPU_CONCURRENCY = "max_cpu_concurrency";

        /**
         * Maximum priority of a scheduled task for this group.
         */
        public static final String MAX_SCHEDULING_PRIORITY = "max_scheduling_priority";

        /**
         * Maximum priority of a tiered object for this group.
         */
        public static final String MAX_TIER_PRIORITY = "max_tier_priority";

        /**
         * If {@code true}, this request applies to the global default resource
         * group. It is an error for this field to be {@code true} when the
         * {@code name} field is also populated.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.AlterResourceGroupRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE FALSE}.
         */
        public static final String IS_DEFAULT_GROUP = "is_default_group";
        public static final String TRUE = "true";
        public static final String FALSE = "false";

        private Options() {  }
    }

    private String name;
    private Map<String, Map<String, String>> tierAttributes;
    private Map<String, String> options;


    /**
     * Constructs an AlterResourceGroupRequest object with default parameters.
     */
    public AlterResourceGroupRequest() {
        name = "";
        tierAttributes = new LinkedHashMap<>();
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs an AlterResourceGroupRequest object with the specified
     * parameters.
     * 
     * @param name  Name of the group to be altered. Must be an existing
     *              resource group name.
     * @param tierAttributes  Optional map containing tier names and their
     *                        respective attribute group limits.  The only
     *                        valid attribute limit that can be set is
     *                        max_memory (in bytes) for the VRAM & RAM tiers.
     *                        For instance, to set max VRAM capacity to 1GB and
     *                        max RAM capacity to 10GB, use:
     *                        {'VRAM':{'max_memory':'1000000000'},
     *                        'RAM':{'max_memory':'10000000000'}}
     *                        <ul>
     *                                <li> {@link
     *                        com.gpudb.protocol.AlterResourceGroupRequest.TierAttributes#MAX_MEMORY
     *                        MAX_MEMORY}: Maximum amount of memory usable in
     *                        the given tier at one time for this group.
     *                        </ul>
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_CPU_CONCURRENCY
     *                 MAX_CPU_CONCURRENCY}: Maximum number of simultaneous
     *                 threads that will be used to execute a request for this
     *                 group.
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_SCHEDULING_PRIORITY
     *                 MAX_SCHEDULING_PRIORITY}: Maximum priority of a
     *                 scheduled task for this group.
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_TIER_PRIORITY
     *                 MAX_TIER_PRIORITY}: Maximum priority of a tiered object
     *                 for this group.
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#IS_DEFAULT_GROUP
     *                 IS_DEFAULT_GROUP}: If {@code true}, this request applies
     *                 to the global default resource group. It is an error for
     *                 this field to be {@code true} when the {@code name}
     *                 field is also populated.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE
     *                 FALSE}.
     *                 </ul>
     * 
     */
    public AlterResourceGroupRequest(String name, Map<String, Map<String, String>> tierAttributes, Map<String, String> options) {
        this.name = (name == null) ? "" : name;
        this.tierAttributes = (tierAttributes == null) ? new LinkedHashMap<String, Map<String, String>>() : tierAttributes;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the group to be altered. Must be an existing resource
     *         group name.
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name  Name of the group to be altered. Must be an existing
     *              resource group name.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AlterResourceGroupRequest setName(String name) {
        this.name = (name == null) ? "" : name;
        return this;
    }

    /**
     * 
     * @return Optional map containing tier names and their respective
     *         attribute group limits.  The only valid attribute limit that can
     *         be set is max_memory (in bytes) for the VRAM & RAM tiers.
     *         For instance, to set max VRAM capacity to 1GB and max RAM
     *         capacity to 10GB, use:  {'VRAM':{'max_memory':'1000000000'},
     *         'RAM':{'max_memory':'10000000000'}}
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.TierAttributes#MAX_MEMORY
     *         MAX_MEMORY}: Maximum amount of memory usable in the given tier
     *         at one time for this group.
     *         </ul>
     * 
     */
    public Map<String, Map<String, String>> getTierAttributes() {
        return tierAttributes;
    }

    /**
     * 
     * @param tierAttributes  Optional map containing tier names and their
     *                        respective attribute group limits.  The only
     *                        valid attribute limit that can be set is
     *                        max_memory (in bytes) for the VRAM & RAM tiers.
     *                        For instance, to set max VRAM capacity to 1GB and
     *                        max RAM capacity to 10GB, use:
     *                        {'VRAM':{'max_memory':'1000000000'},
     *                        'RAM':{'max_memory':'10000000000'}}
     *                        <ul>
     *                                <li> {@link
     *                        com.gpudb.protocol.AlterResourceGroupRequest.TierAttributes#MAX_MEMORY
     *                        MAX_MEMORY}: Maximum amount of memory usable in
     *                        the given tier at one time for this group.
     *                        </ul>
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AlterResourceGroupRequest setTierAttributes(Map<String, Map<String, String>> tierAttributes) {
        this.tierAttributes = (tierAttributes == null) ? new LinkedHashMap<String, Map<String, String>>() : tierAttributes;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_CPU_CONCURRENCY
     *         MAX_CPU_CONCURRENCY}: Maximum number of simultaneous threads
     *         that will be used to execute a request for this group.
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_SCHEDULING_PRIORITY
     *         MAX_SCHEDULING_PRIORITY}: Maximum priority of a scheduled task
     *         for this group.
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_TIER_PRIORITY
     *         MAX_TIER_PRIORITY}: Maximum priority of a tiered object for this
     *         group.
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Options#IS_DEFAULT_GROUP
     *         IS_DEFAULT_GROUP}: If {@code true}, this request applies to the
     *         global default resource group. It is an error for this field to
     *         be {@code true} when the {@code name} field is also populated.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE
     *         FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE
     *         FALSE}.
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
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_CPU_CONCURRENCY
     *                 MAX_CPU_CONCURRENCY}: Maximum number of simultaneous
     *                 threads that will be used to execute a request for this
     *                 group.
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_SCHEDULING_PRIORITY
     *                 MAX_SCHEDULING_PRIORITY}: Maximum priority of a
     *                 scheduled task for this group.
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#MAX_TIER_PRIORITY
     *                 MAX_TIER_PRIORITY}: Maximum priority of a tiered object
     *                 for this group.
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#IS_DEFAULT_GROUP
     *                 IS_DEFAULT_GROUP}: If {@code true}, this request applies
     *                 to the global default resource group. It is an error for
     *                 this field to be {@code true} when the {@code name}
     *                 field is also populated.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.AlterResourceGroupRequest.Options#FALSE
     *                 FALSE}.
     *                 </ul>
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AlterResourceGroupRequest setOptions(Map<String, String> options) {
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
                return this.name;

            case 1:
                return this.tierAttributes;

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
                this.name = (String)value;
                break;

            case 1:
                this.tierAttributes = (Map<String, Map<String, String>>)value;
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

        AlterResourceGroupRequest that = (AlterResourceGroupRequest)obj;

        return ( this.name.equals( that.name )
                 && this.tierAttributes.equals( that.tierAttributes )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "name" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.name ) );
        builder.append( ", " );
        builder.append( gd.toString( "tierAttributes" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.tierAttributes ) );
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
        hashCode = (31 * hashCode) + this.name.hashCode();
        hashCode = (31 * hashCode) + this.tierAttributes.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}
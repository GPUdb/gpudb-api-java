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
 * A set of parameters for {@link com.gpudb.GPUdb#adminShutdown(AdminShutdownRequest)}.
 * <br />
 * <br />Exits the database server application.
 */
public class AdminShutdownRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AdminShutdownRequest")
            .namespace("com.gpudb")
            .fields()
                .name("exitType").type().stringType().noDefault()
                .name("authorization").type().stringType().noDefault()
                .name("options").type().map().values().stringType().noDefault()
            .endRecord();


    /**
     * This method supports the Avro framework and is not intended to be called directly by the user.
     * 
     * @return  the schema for the class.
     * 
     */
    public static Schema getClassSchema() {
        return schema$;
    }

    private String exitType;
    private String authorization;
    private Map<String, String> options;


    /**
     * Constructs an AdminShutdownRequest object with default parameters.
     */
    public AdminShutdownRequest() {
        exitType = "";
        authorization = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs an AdminShutdownRequest object with the specified parameters.
     * 
     * @param exitType  Reserved for future use. User can pass an empty string.
     * @param authorization  No longer used. User can pass an empty string.
     * @param options  Optional parameters.
     * 
     */
    public AdminShutdownRequest(String exitType, String authorization, Map<String, String> options) {
        this.exitType = (exitType == null) ? "" : exitType;
        this.authorization = (authorization == null) ? "" : authorization;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Reserved for future use. User can pass an empty string.
     * 
     */
    public String getExitType() {
        return exitType;
    }

    /**
     * 
     * @param exitType  Reserved for future use. User can pass an empty string.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminShutdownRequest setExitType(String exitType) {
        this.exitType = (exitType == null) ? "" : exitType;
        return this;
    }

    /**
     * 
     * @return No longer used. User can pass an empty string.
     * 
     */
    public String getAuthorization() {
        return authorization;
    }

    /**
     * 
     * @param authorization  No longer used. User can pass an empty string.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminShutdownRequest setAuthorization(String authorization) {
        this.authorization = (authorization == null) ? "" : authorization;
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
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminShutdownRequest setOptions(Map<String, String> options) {
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
        return this;
    }

    /**
     * This method supports the Avro framework and is not intended to be called directly by the user.
     * 
     * @return the schema object describing this class.
     * 
     */
    @Override
    public Schema getSchema() {
        return schema$;
    }

    /**
     * This method supports the Avro framework and is not intended to be called directly by the user.
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
                return this.exitType;

            case 1:
                return this.authorization;

            case 2:
                return this.options;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    /**
     * This method supports the Avro framework and is not intended to be called directly by the user.
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
                this.exitType = (String)value;
                break;

            case 1:
                this.authorization = (String)value;
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

        AdminShutdownRequest that = (AdminShutdownRequest)obj;

        return ( this.exitType.equals( that.exitType )
                 && this.authorization.equals( that.authorization )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "exitType" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.exitType ) );
        builder.append( ", " );
        builder.append( gd.toString( "authorization" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.authorization ) );
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
        hashCode = (31 * hashCode) + this.exitType.hashCode();
        hashCode = (31 * hashCode) + this.authorization.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

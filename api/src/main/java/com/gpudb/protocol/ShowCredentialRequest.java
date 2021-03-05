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
 * com.gpudb.GPUdb#showCredential(ShowCredentialRequest)}.
 * <p>
 * Shows information about a specified <a
 * href="../../../../../../concepts/credentials/" target="_top">credential</a>
 * or all credentials.
 */
public class ShowCredentialRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("ShowCredentialRequest")
            .namespace("com.gpudb")
            .fields()
                .name("credentialName").type().stringType().noDefault()
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

    private String credentialName;
    private Map<String, String> options;


    /**
     * Constructs a ShowCredentialRequest object with default parameters.
     */
    public ShowCredentialRequest() {
        credentialName = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a ShowCredentialRequest object with the specified parameters.
     * 
     * @param credentialName  Name of the credential on which to retrieve
     *                        information. The name must refer to a currently
     *                        existing credential. If '*' is specified,
     *                        information about all credentials will be
     *                        returned.
     * @param options  Optional parameters.  The default value is an empty
     *                 {@link Map}.
     * 
     */
    public ShowCredentialRequest(String credentialName, Map<String, String> options) {
        this.credentialName = (credentialName == null) ? "" : credentialName;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the credential on which to retrieve information. The
     *         name must refer to a currently existing credential. If '*' is
     *         specified, information about all credentials will be returned.
     * 
     */
    public String getCredentialName() {
        return credentialName;
    }

    /**
     * 
     * @param credentialName  Name of the credential on which to retrieve
     *                        information. The name must refer to a currently
     *                        existing credential. If '*' is specified,
     *                        information about all credentials will be
     *                        returned.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowCredentialRequest setCredentialName(String credentialName) {
        this.credentialName = (credentialName == null) ? "" : credentialName;
        return this;
    }

    /**
     * 
     * @return Optional parameters.  The default value is an empty {@link Map}.
     * 
     */
    public Map<String, String> getOptions() {
        return options;
    }

    /**
     * 
     * @param options  Optional parameters.  The default value is an empty
     *                 {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowCredentialRequest setOptions(Map<String, String> options) {
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
                return this.credentialName;

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
                this.credentialName = (String)value;
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

        ShowCredentialRequest that = (ShowCredentialRequest)obj;

        return ( this.credentialName.equals( that.credentialName )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "credentialName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.credentialName ) );
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
        hashCode = (31 * hashCode) + this.credentialName.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

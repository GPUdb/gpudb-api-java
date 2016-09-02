
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


public class AdminDeleteNodeRequest implements IndexedRecord {

    private static final Schema schema$ = SchemaBuilder
            .record("AdminDeleteNodeRequest")
            .namespace("com.gpudb")
            .fields()
                .name("rank").type().intType().noDefault()
                .name("authorization").type().stringType().noDefault()
                .name("options").type().map().values().stringType().noDefault()
            .endRecord();


    public static Schema getClassSchema() {
        return schema$;
    }


    private int rank;
    private String authorization;
    private Map<String, String> options;


    public AdminDeleteNodeRequest() {
        authorization = "";
        options = new LinkedHashMap<>();
    }

    public AdminDeleteNodeRequest(int rank, String authorization, Map<String, String> options) {
        this.rank = rank;
        this.authorization = (authorization == null) ? "" : authorization;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    public int getRank() {
        return rank;
    }

    public AdminDeleteNodeRequest setRank(int rank) {
        this.rank = rank;
        return this;
    }

    public String getAuthorization() {
        return authorization;
    }

    public AdminDeleteNodeRequest setAuthorization(String authorization) {
        this.authorization = (authorization == null) ? "" : authorization;
        return this;
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public AdminDeleteNodeRequest setOptions(Map<String, String> options) {
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
        return this;
    }

    @Override
    public Schema getSchema() {
        return schema$;
    }

    @Override
    public Object get(int index) {
        switch (index) {
            case 0:
                return this.rank;

            case 1:
                return this.authorization;

            case 2:
                return this.options;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void put(int index, Object value) {
        switch (index) {
            case 0:
                this.rank = (Integer)value;
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

        AdminDeleteNodeRequest that = (AdminDeleteNodeRequest)obj;

        return ( ( this.rank == that.rank )
                 && this.authorization.equals( that.authorization )
                 && this.options.equals( that.options ) );
    }


    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "rank" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.rank ) );
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
        hashCode = (31 * hashCode) + this.rank;
        hashCode = (31 * hashCode) + this.authorization.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }


}
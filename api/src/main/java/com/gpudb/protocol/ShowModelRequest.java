
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


public class ShowModelRequest implements IndexedRecord {

    private static final Schema schema$ = SchemaBuilder
            .record("ShowModelRequest")
            .namespace("com.gpudb")
            .fields()
                .name("modelNames").type().array().items().stringType().noDefault()
                .name("options").type().map().values().stringType().noDefault()
            .endRecord();


    public static Schema getClassSchema() {
        return schema$;
    }


    private List<String> modelNames;
    private Map<String, String> options;


    public ShowModelRequest() {
        modelNames = new ArrayList<>();
        options = new LinkedHashMap<>();
    }

    public ShowModelRequest(List<String> modelNames, Map<String, String> options) {
        this.modelNames = (modelNames == null) ? new ArrayList<String>() : modelNames;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    public List<String> getModelNames() {
        return modelNames;
    }

    public ShowModelRequest setModelNames(List<String> modelNames) {
        this.modelNames = (modelNames == null) ? new ArrayList<String>() : modelNames;
        return this;
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public ShowModelRequest setOptions(Map<String, String> options) {
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
                return this.modelNames;

            case 1:
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
                this.modelNames = (List<String>)value;
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

        ShowModelRequest that = (ShowModelRequest)obj;

        return ( this.modelNames.equals( that.modelNames )
                 && this.options.equals( that.options ) );
    }


    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "modelNames" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.modelNames ) );
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
        hashCode = (31 * hashCode) + this.modelNames.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }


}
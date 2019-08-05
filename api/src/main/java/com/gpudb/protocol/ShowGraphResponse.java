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
 * A set of results returned by {@link
 * com.gpudb.GPUdb#showGraph(ShowGraphRequest)}.
 */
public class ShowGraphResponse implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("ShowGraphResponse")
            .namespace("com.gpudb")
            .fields()
                .name("result").type().booleanType().noDefault()
                .name("graphNames").type().array().items().stringType().noDefault()
                .name("directed").type().array().items().booleanType().noDefault()
                .name("numNodes").type().array().items().longType().noDefault()
                .name("numEdges").type().array().items().longType().noDefault()
                .name("isPersisted").type().array().items().booleanType().noDefault()
                .name("isSyncDb").type().array().items().booleanType().noDefault()
                .name("hasInsertTableMonitor").type().array().items().booleanType().noDefault()
                .name("originalRequest").type().array().items().stringType().noDefault()
                .name("info").type().map().values().stringType().noDefault()
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

    private boolean result;
    private List<String> graphNames;
    private List<Boolean> directed;
    private List<Long> numNodes;
    private List<Long> numEdges;
    private List<Boolean> isPersisted;
    private List<Boolean> isSyncDb;
    private List<Boolean> hasInsertTableMonitor;
    private List<String> originalRequest;
    private Map<String, String> info;


    /**
     * Constructs a ShowGraphResponse object with default parameters.
     */
    public ShowGraphResponse() {
    }

    /**
     * 
     * @return Indicates a successf. This call will fails of the graph
     *         specified in the request does not exist.
     * 
     */
    public boolean getResult() {
        return result;
    }

    /**
     * 
     * @param result  Indicates a successf. This call will fails of the graph
     *                specified in the request does not exist.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowGraphResponse setResult(boolean result) {
        this.result = result;
        return this;
    }

    /**
     * 
     * @return Name(s) of the graph(s).
     * 
     */
    public List<String> getGraphNames() {
        return graphNames;
    }

    /**
     * 
     * @param graphNames  Name(s) of the graph(s).
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowGraphResponse setGraphNames(List<String> graphNames) {
        this.graphNames = (graphNames == null) ? new ArrayList<String>() : graphNames;
        return this;
    }

    /**
     * 
     * @return Whether or not the edges of the graph have directions
     *         (bi-directional edges can still exist in directed graphs.
     * 
     */
    public List<Boolean> getDirected() {
        return directed;
    }

    /**
     * 
     * @param directed  Whether or not the edges of the graph have directions
     *                  (bi-directional edges can still exist in directed
     *                  graphs.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowGraphResponse setDirected(List<Boolean> directed) {
        this.directed = (directed == null) ? new ArrayList<Boolean>() : directed;
        return this;
    }

    /**
     * 
     * @return Total number of nodes in the graph.
     * 
     */
    public List<Long> getNumNodes() {
        return numNodes;
    }

    /**
     * 
     * @param numNodes  Total number of nodes in the graph.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowGraphResponse setNumNodes(List<Long> numNodes) {
        this.numNodes = (numNodes == null) ? new ArrayList<Long>() : numNodes;
        return this;
    }

    /**
     * 
     * @return Total number of edges in the graph.
     * 
     */
    public List<Long> getNumEdges() {
        return numEdges;
    }

    /**
     * 
     * @param numEdges  Total number of edges in the graph.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowGraphResponse setNumEdges(List<Long> numEdges) {
        this.numEdges = (numEdges == null) ? new ArrayList<Long>() : numEdges;
        return this;
    }

    /**
     * 
     * @return Shows whether or not the graph is persisted (saved and loaded on
     *         launch).
     * 
     */
    public List<Boolean> getIsPersisted() {
        return isPersisted;
    }

    /**
     * 
     * @param isPersisted  Shows whether or not the graph is persisted (saved
     *                     and loaded on launch).
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowGraphResponse setIsPersisted(List<Boolean> isPersisted) {
        this.isPersisted = (isPersisted == null) ? new ArrayList<Boolean>() : isPersisted;
        return this;
    }

    /**
     * 
     * @return Shows whether or not the graph is linked to the original tables
     *         that created it, and will potentially be re-created instead
     *         loaded from persist on launch.
     * 
     */
    public List<Boolean> getIsSyncDb() {
        return isSyncDb;
    }

    /**
     * 
     * @param isSyncDb  Shows whether or not the graph is linked to the
     *                  original tables that created it, and will potentially
     *                  be re-created instead loaded from persist on launch.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowGraphResponse setIsSyncDb(List<Boolean> isSyncDb) {
        this.isSyncDb = (isSyncDb == null) ? new ArrayList<Boolean>() : isSyncDb;
        return this;
    }

    /**
     * 
     * @return Shows whether or not the graph has an insert table monitor
     *         attached to it.
     * 
     */
    public List<Boolean> getHasInsertTableMonitor() {
        return hasInsertTableMonitor;
    }

    /**
     * 
     * @param hasInsertTableMonitor  Shows whether or not the graph has an
     *                               insert table monitor attached to it.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowGraphResponse setHasInsertTableMonitor(List<Boolean> hasInsertTableMonitor) {
        this.hasInsertTableMonitor = (hasInsertTableMonitor == null) ? new ArrayList<Boolean>() : hasInsertTableMonitor;
        return this;
    }

    /**
     * 
     * @return The orignal client request used to create the graph (before any
     *         expression evaluation or separator processing).
     * 
     */
    public List<String> getOriginalRequest() {
        return originalRequest;
    }

    /**
     * 
     * @param originalRequest  The orignal client request used to create the
     *                         graph (before any expression evaluation or
     *                         separator processing).
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowGraphResponse setOriginalRequest(List<String> originalRequest) {
        this.originalRequest = (originalRequest == null) ? new ArrayList<String>() : originalRequest;
        return this;
    }

    /**
     * 
     * @return Additional information.
     * 
     */
    public Map<String, String> getInfo() {
        return info;
    }

    /**
     * 
     * @param info  Additional information.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public ShowGraphResponse setInfo(Map<String, String> info) {
        this.info = (info == null) ? new LinkedHashMap<String, String>() : info;
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
                return this.result;

            case 1:
                return this.graphNames;

            case 2:
                return this.directed;

            case 3:
                return this.numNodes;

            case 4:
                return this.numEdges;

            case 5:
                return this.isPersisted;

            case 6:
                return this.isSyncDb;

            case 7:
                return this.hasInsertTableMonitor;

            case 8:
                return this.originalRequest;

            case 9:
                return this.info;

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
                this.result = (Boolean)value;
                break;

            case 1:
                this.graphNames = (List<String>)value;
                break;

            case 2:
                this.directed = (List<Boolean>)value;
                break;

            case 3:
                this.numNodes = (List<Long>)value;
                break;

            case 4:
                this.numEdges = (List<Long>)value;
                break;

            case 5:
                this.isPersisted = (List<Boolean>)value;
                break;

            case 6:
                this.isSyncDb = (List<Boolean>)value;
                break;

            case 7:
                this.hasInsertTableMonitor = (List<Boolean>)value;
                break;

            case 8:
                this.originalRequest = (List<String>)value;
                break;

            case 9:
                this.info = (Map<String, String>)value;
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

        ShowGraphResponse that = (ShowGraphResponse)obj;

        return ( ( this.result == that.result )
                 && this.graphNames.equals( that.graphNames )
                 && this.directed.equals( that.directed )
                 && this.numNodes.equals( that.numNodes )
                 && this.numEdges.equals( that.numEdges )
                 && this.isPersisted.equals( that.isPersisted )
                 && this.isSyncDb.equals( that.isSyncDb )
                 && this.hasInsertTableMonitor.equals( that.hasInsertTableMonitor )
                 && this.originalRequest.equals( that.originalRequest )
                 && this.info.equals( that.info ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "result" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.result ) );
        builder.append( ", " );
        builder.append( gd.toString( "graphNames" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.graphNames ) );
        builder.append( ", " );
        builder.append( gd.toString( "directed" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.directed ) );
        builder.append( ", " );
        builder.append( gd.toString( "numNodes" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.numNodes ) );
        builder.append( ", " );
        builder.append( gd.toString( "numEdges" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.numEdges ) );
        builder.append( ", " );
        builder.append( gd.toString( "isPersisted" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.isPersisted ) );
        builder.append( ", " );
        builder.append( gd.toString( "isSyncDb" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.isSyncDb ) );
        builder.append( ", " );
        builder.append( gd.toString( "hasInsertTableMonitor" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.hasInsertTableMonitor ) );
        builder.append( ", " );
        builder.append( gd.toString( "originalRequest" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.originalRequest ) );
        builder.append( ", " );
        builder.append( gd.toString( "info" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.info ) );
        builder.append( "}" );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + ((Boolean)this.result).hashCode();
        hashCode = (31 * hashCode) + this.graphNames.hashCode();
        hashCode = (31 * hashCode) + this.directed.hashCode();
        hashCode = (31 * hashCode) + this.numNodes.hashCode();
        hashCode = (31 * hashCode) + this.numEdges.hashCode();
        hashCode = (31 * hashCode) + this.isPersisted.hashCode();
        hashCode = (31 * hashCode) + this.isSyncDb.hashCode();
        hashCode = (31 * hashCode) + this.hasInsertTableMonitor.hashCode();
        hashCode = (31 * hashCode) + this.originalRequest.hashCode();
        hashCode = (31 * hashCode) + this.info.hashCode();
        return hashCode;
    }

}

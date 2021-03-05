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
 * com.gpudb.GPUdb#aggregateKMeans(AggregateKMeansRequest)}.
 * <p>
 * This endpoint runs the k-means algorithm - a heuristic algorithm
 * that attempts to do k-means clustering.  An ideal k-means clustering
 * algorithm
 * selects k points such that the sum of the mean squared distances of each
 * member
 * of the set to the nearest of the k points is minimized.  The k-means
 * algorithm
 * however does not necessarily produce such an ideal cluster.   It begins with
 * a
 * randomly selected set of k points and then refines the location of the
 * points
 * iteratively and settles to a local minimum.  Various parameters and options
 * are
 * provided to control the heuristic search.
 * <p>
 * NOTE:  The Kinetica instance being accessed must be running a CUDA
 * (GPU-based)
 * build to service this request.
 */
public class AggregateKMeansRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AggregateKMeansRequest")
            .namespace("com.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
                .name("columnNames").type().array().items().stringType().noDefault()
                .name("k").type().intType().noDefault()
                .name("tolerance").type().doubleType().noDefault()
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
     * com.gpudb.protocol.AggregateKMeansRequest.Options#WHITEN WHITEN}: When
     * set to 1 each of the columns is first normalized by its stdv - default
     * is not to whiten.
     *         <li> {@link
     * com.gpudb.protocol.AggregateKMeansRequest.Options#MAX_ITERS MAX_ITERS}:
     * Number of times to try to hit the tolerance limit before giving up -
     * default is 10.
     *         <li> {@link
     * com.gpudb.protocol.AggregateKMeansRequest.Options#NUM_TRIES NUM_TRIES}:
     * Number of times to run the k-means algorithm with a different randomly
     * selected starting points - helps avoid local minimum. Default is 1.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * When set to 1 each of the columns is first normalized by its stdv -
         * default is not to whiten.
         */
        public static final String WHITEN = "whiten";

        /**
         * Number of times to try to hit the tolerance limit before giving up -
         * default is 10.
         */
        public static final String MAX_ITERS = "max_iters";

        /**
         * Number of times to run the k-means algorithm with a different
         * randomly selected starting points - helps avoid local minimum.
         * Default is 1.
         */
        public static final String NUM_TRIES = "num_tries";

        private Options() {  }
    }

    private String tableName;
    private List<String> columnNames;
    private int k;
    private double tolerance;
    private Map<String, String> options;


    /**
     * Constructs an AggregateKMeansRequest object with default parameters.
     */
    public AggregateKMeansRequest() {
        tableName = "";
        columnNames = new ArrayList<>();
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs an AggregateKMeansRequest object with the specified
     * parameters.
     * 
     * @param tableName  Name of the table on which the operation will be
     *                   performed. Must be an existing table, in
     *                   [schema_name.]table_name format, using standard <a
     *                   href="../../../../../../concepts/tables/#table-name-resolution"
     *                   target="_top">name resolution rules</a>.
     * @param columnNames  List of column names on which the operation would be
     *                     performed. If n columns are provided then each of
     *                     the k result points will have n dimensions
     *                     corresponding to the n columns.
     * @param k  The number of mean points to be determined by the algorithm.
     * @param tolerance  Stop iterating when the distances between successive
     *                   points is less than the given tolerance.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateKMeansRequest.Options#WHITEN
     *                 WHITEN}: When set to 1 each of the columns is first
     *                 normalized by its stdv - default is not to whiten.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateKMeansRequest.Options#MAX_ITERS
     *                 MAX_ITERS}: Number of times to try to hit the tolerance
     *                 limit before giving up - default is 10.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateKMeansRequest.Options#NUM_TRIES
     *                 NUM_TRIES}: Number of times to run the k-means algorithm
     *                 with a different randomly selected starting points -
     *                 helps avoid local minimum. Default is 1.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public AggregateKMeansRequest(String tableName, List<String> columnNames, int k, double tolerance, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.columnNames = (columnNames == null) ? new ArrayList<String>() : columnNames;
        this.k = k;
        this.tolerance = tolerance;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the table on which the operation will be performed. Must
     *         be an existing table, in [schema_name.]table_name format, using
     *         standard <a
     *         href="../../../../../../concepts/tables/#table-name-resolution"
     *         target="_top">name resolution rules</a>.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Name of the table on which the operation will be
     *                   performed. Must be an existing table, in
     *                   [schema_name.]table_name format, using standard <a
     *                   href="../../../../../../concepts/tables/#table-name-resolution"
     *                   target="_top">name resolution rules</a>.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateKMeansRequest setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * 
     * @return List of column names on which the operation would be performed.
     *         If n columns are provided then each of the k result points will
     *         have n dimensions corresponding to the n columns.
     * 
     */
    public List<String> getColumnNames() {
        return columnNames;
    }

    /**
     * 
     * @param columnNames  List of column names on which the operation would be
     *                     performed. If n columns are provided then each of
     *                     the k result points will have n dimensions
     *                     corresponding to the n columns.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateKMeansRequest setColumnNames(List<String> columnNames) {
        this.columnNames = (columnNames == null) ? new ArrayList<String>() : columnNames;
        return this;
    }

    /**
     * 
     * @return The number of mean points to be determined by the algorithm.
     * 
     */
    public int getK() {
        return k;
    }

    /**
     * 
     * @param k  The number of mean points to be determined by the algorithm.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateKMeansRequest setK(int k) {
        this.k = k;
        return this;
    }

    /**
     * 
     * @return Stop iterating when the distances between successive points is
     *         less than the given tolerance.
     * 
     */
    public double getTolerance() {
        return tolerance;
    }

    /**
     * 
     * @param tolerance  Stop iterating when the distances between successive
     *                   points is less than the given tolerance.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateKMeansRequest setTolerance(double tolerance) {
        this.tolerance = tolerance;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.AggregateKMeansRequest.Options#WHITEN
     *         WHITEN}: When set to 1 each of the columns is first normalized
     *         by its stdv - default is not to whiten.
     *                 <li> {@link
     *         com.gpudb.protocol.AggregateKMeansRequest.Options#MAX_ITERS
     *         MAX_ITERS}: Number of times to try to hit the tolerance limit
     *         before giving up - default is 10.
     *                 <li> {@link
     *         com.gpudb.protocol.AggregateKMeansRequest.Options#NUM_TRIES
     *         NUM_TRIES}: Number of times to run the k-means algorithm with a
     *         different randomly selected starting points - helps avoid local
     *         minimum. Default is 1.
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
     *                 com.gpudb.protocol.AggregateKMeansRequest.Options#WHITEN
     *                 WHITEN}: When set to 1 each of the columns is first
     *                 normalized by its stdv - default is not to whiten.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateKMeansRequest.Options#MAX_ITERS
     *                 MAX_ITERS}: Number of times to try to hit the tolerance
     *                 limit before giving up - default is 10.
     *                         <li> {@link
     *                 com.gpudb.protocol.AggregateKMeansRequest.Options#NUM_TRIES
     *                 NUM_TRIES}: Number of times to run the k-means algorithm
     *                 with a different randomly selected starting points -
     *                 helps avoid local minimum. Default is 1.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateKMeansRequest setOptions(Map<String, String> options) {
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
                return this.columnNames;

            case 2:
                return this.k;

            case 3:
                return this.tolerance;

            case 4:
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
                this.columnNames = (List<String>)value;
                break;

            case 2:
                this.k = (Integer)value;
                break;

            case 3:
                this.tolerance = (Double)value;
                break;

            case 4:
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

        AggregateKMeansRequest that = (AggregateKMeansRequest)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.columnNames.equals( that.columnNames )
                 && ( this.k == that.k )
                 && ( (Double)this.tolerance ).equals( (Double)that.tolerance )
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
        builder.append( gd.toString( "columnNames" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.columnNames ) );
        builder.append( ", " );
        builder.append( gd.toString( "k" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.k ) );
        builder.append( ", " );
        builder.append( gd.toString( "tolerance" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.tolerance ) );
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
        hashCode = (31 * hashCode) + this.columnNames.hashCode();
        hashCode = (31 * hashCode) + this.k;
        hashCode = (31 * hashCode) + ((Double)this.tolerance).hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gisfederal.gpudb.protocol;

import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


/**
 * A set of parameters for {@link
 * com.gisfederal.gpudb.GPUdb#aggregateStatistics(AggregateStatisticsRequest)}.
 * <p>
 * Calculates the requested statistics of a given column in a given table. The
 * available statistics are count (number of total objects), mean, stdv
 * (standard deviation), variance, skew, kurtosis, sum, min, max,
 * weighted_average, cardinality (unique count) and estimated cardinality.
 * Estimated cardinality is calculated by using the hyperloglog approximation
 * technique. The weighted average statistic requires a weight_attribute to be
 * specified in {@code options}. The weighted average is then defined as the
 * sum of the products of {@code columnName} times the weight attribute divided
 * by the sum of the weight attribute. The response includes a list of the
 * statistics requested along with the count of the number of items in the
 * given set.
 */
public class AggregateStatisticsRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AggregateStatisticsRequest")
            .namespace("com.gisfederal.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
                .name("columnName").type().stringType().noDefault()
                .name("stats").type().stringType().noDefault()
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
     * Comma separated list of the statistics to calculate, e.g. "sum,mean".
     * A set of string constants for the parameter {@code stats}.
     */
    public static final class Stats {
        public static final String MEAN = "mean";
        public static final String STDV = "stdv";
        public static final String VARIANCE = "variance";
        public static final String SKEW = "skew";
        public static final String KURTOSIS = "kurtosis";
        public static final String SUM = "sum";
        public static final String CARDINALITY = "cardinality";
        public static final String ESTIMATED_CARDINALITY = "estimated_cardinality";

        private Stats() {  }
    }


    /**
     * Optional parameters.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * A list of comma separated column names over which statistics can be
         * accumulated along with the primary column.
         */
        public static final String ADDITIONAL_COLUMN_NAMES = "additional_column_names";

        /**
         * Name of column used as weighting attribute for the weighted average
         * statistic.
         */
        public static final String WEIGHT_COLUMN_NAME = "weight_column_name";

        private Options() {  }
    }

    private String tableName;
    private String columnName;
    private String stats;
    private Map<String, String> options;


    /**
     * Constructs an AggregateStatisticsRequest object with default parameters.
     */
    public AggregateStatisticsRequest() {
        tableName = "";
        columnName = "";
        stats = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs an AggregateStatisticsRequest object with the specified
     * parameters.
     * 
     * @param tableName  Name of the table on which the statistics operation
     *                   will be performed.
     * @param columnName  Name of the column for which the statistics are to be
     *                    calculated.
     * @param stats  Comma separated list of the statistics to calculate, e.g.
     *               "sum,mean".
     * @param options  Optional parameters.
     * 
     */
    public AggregateStatisticsRequest(String tableName, String columnName, String stats, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.columnName = (columnName == null) ? "" : columnName;
        this.stats = (stats == null) ? "" : stats;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the table on which the statistics operation will be
     *         performed.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Name of the table on which the statistics operation
     *                   will be performed.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateStatisticsRequest setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * 
     * @return Name of the column for which the statistics are to be
     *         calculated.
     * 
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * 
     * @param columnName  Name of the column for which the statistics are to be
     *                    calculated.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateStatisticsRequest setColumnName(String columnName) {
        this.columnName = (columnName == null) ? "" : columnName;
        return this;
    }

    /**
     * 
     * @return Comma separated list of the statistics to calculate, e.g.
     *         "sum,mean".
     * 
     */
    public String getStats() {
        return stats;
    }

    /**
     * 
     * @param stats  Comma separated list of the statistics to calculate, e.g.
     *               "sum,mean".
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AggregateStatisticsRequest setStats(String stats) {
        this.stats = (stats == null) ? "" : stats;
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
    public AggregateStatisticsRequest setOptions(Map<String, String> options) {
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
                return this.columnName;

            case 2:
                return this.stats;

            case 3:
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
                this.columnName = (String)value;
                break;

            case 2:
                this.stats = (String)value;
                break;

            case 3:
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

        AggregateStatisticsRequest that = (AggregateStatisticsRequest)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.columnName.equals( that.columnName )
                 && this.stats.equals( that.stats )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( gd.toString( "tableName" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.tableName ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "columnName" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.columnName ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "stats" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.stats ) );
        builder.append( gd.toString( "," ) );
        builder.append( gd.toString( "options" ) );
        builder.append( gd.toString( ":" ) );
        builder.append( gd.toString( this.options ) );

        return builder.toString();
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + this.tableName.hashCode();
        hashCode = (31 * hashCode) + this.columnName.hashCode();
        hashCode = (31 * hashCode) + this.stats.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}
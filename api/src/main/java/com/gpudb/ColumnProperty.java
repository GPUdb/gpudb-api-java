/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb;


/**
 * Column properties used for GPUdb types.
 */
public final class ColumnProperty {

    /**
     * Default property for all numeric and string type columns; makes the column available for GPU queries.
     */
    public static final String DATA = "data";

    /**
     * Valid only for 'string' columns. Enables full text search for string columns. Can be set independently of *data* and
     * *store_only*.
     */
    public static final String TEXT_SEARCH = "text_search";

    /**
     * Persist the column value but do not make it available to queries (e.g. {@link GPUdb#filterByBox(FilterByBoxRequest)})-i.e. it
     * is mutually exclusive to the 'data' property. Any 'bytes' type column must have a 'store_only' property. This property
     * reduces system memory usage.
     */
    public static final String STORE_ONLY = "store_only";

    /**
     * Works in conjunction with the 'data' property for string columns. This property reduces system disk usage by disabling
     * reverse string lookups. Queries like {@link GPUdb#filter(FilterRequest)}, {@link GPUdb#filterByList(FilterByListRequest)},
     * and {@link GPUdb#filterByValue(FilterByValueRequest)} work as usual but {@link
     * GPUdb#aggregateUniqueRaw(AggregateUniqueRequest)}, {@link GPUdb#aggregateGroupByRaw(AggregateGroupByRequest)} and {@link
     * GPUdb#getRecordsByColumnRaw(GetRecordsByColumnRequest)} are not allowed on columns with this property.
     */
    public static final String DISK_OPTIMIZED = "disk_optimized";

    /**
     * Valid only for 'long' columns. Indicates that this field represents a timestamp and will be provided in milliseconds since
     * the Unix epoch: 00:00:00 Jan 1 1970.  Dates represented by a timestamp must fall between the year 1000 and the year 2900.
     */
    public static final String TIMESTAMP = "timestamp";

    /**
     * Valid only for 'string' columns.  It represents a SQL type NUMERIC(19, 4) data type.  There can be up to 15 digits before the
     * decimal point and up to four digits in the fractional part.  The value can be positive or negative (indicated by a minus sign
     * at the beginning).  This property is mutually exclusive with the 'text_search' property.
     */
    public static final String DECIMAL = "decimal";

    /**
     * Valid only for 'string' columns.  Indicates that this field represents a date and will be provided in the format
     * 'YYYY-MM-DD'.  The allowable range is 1000-01-01 through 2900-01-01.
     */
    public static final String DATE = "date";

    /**
     * Valid only for 'string' columns.  Indicates that this field represents a time-of-day and will be provided in the format
     * 'HH:MM:SS.mmm'.  The allowable range is 00:00:00.000 through 23:59:59.999.
     */
    public static final String TIME = "time";

    /**
     * This property provides optimized memory, disk and query performance for string columns. Strings with this property must be no
     * longer than 1 character. This property cannot be combined with *text_search*
     */
    public static final String CHAR1 = "char1";

    /**
     * This property provides optimized memory, disk and query performance for string columns. Strings with this property must be no
     * longer than 2 characters. This property cannot be combined with *text_search*
     */
    public static final String CHAR2 = "char2";

    /**
     * This property provides optimized memory, disk and query performance for string columns. Strings with this property must be no
     * longer than 4 characters. This property cannot be combined with *text_search*
     */
    public static final String CHAR4 = "char4";

    /**
     * This property provides optimized memory, disk and query performance for string columns. Strings with this property must be no
     * longer than 8 characters. This property cannot be combined with *text_search*
     */
    public static final String CHAR8 = "char8";

    /**
     * This property provides optimized memory, disk and query performance for string columns. Strings with this property must be no
     * longer than 16 characters. This property cannot be combined with *text_search*
     */
    public static final String CHAR16 = "char16";

    /**
     * This property provides optimized memory, disk and query performance for string columns. Strings with this property must be no
     * longer than 32 characters. This property cannot be combined with *text_search*
     */
    public static final String CHAR32 = "char32";

    /**
     * This property provides optimized memory, disk and query performance for string columns. Strings with this property must be no
     * longer than 64 characters. This property cannot be combined with *text_search*
     */
    public static final String CHAR64 = "char64";

    /**
     * This property provides optimized memory, disk and query performance for string columns. Strings with this property must be no
     * longer than 128 characters. This property cannot be combined with *text_search*
     */
    public static final String CHAR128 = "char128";

    /**
     * This property provides optimized memory, disk and query performance for string columns. Strings with this property must be no
     * longer than 256 characters. This property cannot be combined with *text_search*
     */
    public static final String CHAR256 = "char256";

    /**
     * This property provides optimized memory and query performance for int columns. Ints with this property must be between -128
     * and +127 (inclusive)
     */
    public static final String INT8 = "int8";

    /**
     * This property provides optimized memory and query performance for int columns. Ints with this property must be between -32768
     * and +32767 (inclusive)
     */
    public static final String INT16 = "int16";

    /**
     * This property provides optimized memory, disk and query performance for string columns representing IPv4 addresses (i.e.
     * 192.168.1.1). Strings with this property must be of the form: A.B.C.D where A, B, C and D are in the range of 0-255.
     */
    public static final String IPV4 = "ipv4";

    /**
     * This property indicates that this column will be part of (or the entire) primary key.
     */
    public static final String PRIMARY_KEY = "primary_key";

    /**
     * This property indicates that this column will be part of (or the entire) shard key.
     */
    public static final String SHARD_KEY = "shard_key";

    /**
     * This property indicates that this column is nullable.
     */
    public static final String NULLABLE = "nullable";

    private ColumnProperty() {  }
}


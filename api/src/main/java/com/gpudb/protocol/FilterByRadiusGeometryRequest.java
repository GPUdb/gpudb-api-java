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
 * com.gpudb.GPUdb#filterByRadiusGeometry(FilterByRadiusGeometryRequest)}.
 * <p>
 * Calculates which geospatial geometry objects from a table intersect
 * a circle with the given radius and center point (i.e. circular NAI). The
 * operation is synchronous, meaning that a response will not be returned until
 * all
 * the objects are fully available. The response payload provides the count of
 * the
 * resulting set. A new resultant set (view) which satisfies the input circular
 * NAI
 * restriction specification is also created if a {@code viewName} is passed in
 * as part of the request.
 */
public class FilterByRadiusGeometryRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("FilterByRadiusGeometryRequest")
            .namespace("com.gpudb")
            .fields()
                .name("tableName").type().stringType().noDefault()
                .name("viewName").type().stringType().noDefault()
                .name("columnName").type().stringType().noDefault()
                .name("xCenter").type().doubleType().noDefault()
                .name("yCenter").type().doubleType().noDefault()
                .name("radius").type().doubleType().noDefault()
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
     * com.gpudb.protocol.FilterByRadiusGeometryRequest.Options#COLLECTION_NAME
     * COLLECTION_NAME}: [DEPRECATED--please specify the containing schema for
     * the view as part of {@code viewName} and use {@link
     * com.gpudb.GPUdb#createSchema(CreateSchemaRequest)} to create the schema
     * if non-existent]  Name of a schema for the newly created view. If the
     * schema provided is non-existent, it will be automatically created.
     * </ul>
     * The default value is an empty {@link Map}.
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * [DEPRECATED--please specify the containing schema for the view as
         * part of {@code viewName} and use {@link
         * com.gpudb.GPUdb#createSchema(CreateSchemaRequest)} to create the
         * schema if non-existent]  Name of a schema for the newly created
         * view. If the schema provided is non-existent, it will be
         * automatically created.
         */
        public static final String COLLECTION_NAME = "collection_name";

        private Options() {  }
    }

    private String tableName;
    private String viewName;
    private String columnName;
    private double xCenter;
    private double yCenter;
    private double radius;
    private Map<String, String> options;


    /**
     * Constructs a FilterByRadiusGeometryRequest object with default
     * parameters.
     */
    public FilterByRadiusGeometryRequest() {
        tableName = "";
        viewName = "";
        columnName = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a FilterByRadiusGeometryRequest object with the specified
     * parameters.
     * 
     * @param tableName  Name of the table on which the filter by radius
     *                   operation will be performed, in
     *                   [schema_name.]table_name format, using standard <a
     *                   href="../../../../../../concepts/tables/#table-name-resolution"
     *                   target="_top">name resolution rules</a>.  Must be an
     *                   existing table.
     * @param viewName  If provided, then this will be the name of the view
     *                  containing the results, in [schema_name.]view_name
     *                  format, using standard <a
     *                  href="../../../../../../concepts/tables/#table-name-resolution"
     *                  target="_top">name resolution rules</a> and meeting <a
     *                  href="../../../../../../concepts/tables/#table-naming-criteria"
     *                  target="_top">table naming criteria</a>.  Must not be
     *                  an already existing table or view.  The default value
     *                  is ''.
     * @param columnName  Name of the geospatial geometry column to be
     *                    filtered.
     * @param xCenter  Value of the longitude of the center. Must be within
     *                 [-180.0, 180.0].  The minimum allowed value is -180. The
     *                 maximum allowed value is 180.
     * @param yCenter  Value of the latitude of the center. Must be within
     *                 [-90.0, 90.0].  The minimum allowed value is -90. The
     *                 maximum allowed value is 90.
     * @param radius  The radius of the circle within which the search will be
     *                performed. Must be a non-zero positive value. It is in
     *                meters; so, for example, a value of '42000' means 42 km.
     *                The minimum allowed value is 0. The maximum allowed value
     *                is MAX_INT.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.FilterByRadiusGeometryRequest.Options#COLLECTION_NAME
     *                 COLLECTION_NAME}: [DEPRECATED--please specify the
     *                 containing schema for the view as part of {@code
     *                 viewName} and use {@link
     *                 com.gpudb.GPUdb#createSchema(CreateSchemaRequest)} to
     *                 create the schema if non-existent]  Name of a schema for
     *                 the newly created view. If the schema provided is
     *                 non-existent, it will be automatically created.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     */
    public FilterByRadiusGeometryRequest(String tableName, String viewName, String columnName, double xCenter, double yCenter, double radius, Map<String, String> options) {
        this.tableName = (tableName == null) ? "" : tableName;
        this.viewName = (viewName == null) ? "" : viewName;
        this.columnName = (columnName == null) ? "" : columnName;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.radius = radius;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the table on which the filter by radius operation will
     *         be performed, in [schema_name.]table_name format, using standard
     *         <a
     *         href="../../../../../../concepts/tables/#table-name-resolution"
     *         target="_top">name resolution rules</a>.  Must be an existing
     *         table.
     * 
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName  Name of the table on which the filter by radius
     *                   operation will be performed, in
     *                   [schema_name.]table_name format, using standard <a
     *                   href="../../../../../../concepts/tables/#table-name-resolution"
     *                   target="_top">name resolution rules</a>.  Must be an
     *                   existing table.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByRadiusGeometryRequest setTableName(String tableName) {
        this.tableName = (tableName == null) ? "" : tableName;
        return this;
    }

    /**
     * 
     * @return If provided, then this will be the name of the view containing
     *         the results, in [schema_name.]view_name format, using standard
     *         <a
     *         href="../../../../../../concepts/tables/#table-name-resolution"
     *         target="_top">name resolution rules</a> and meeting <a
     *         href="../../../../../../concepts/tables/#table-naming-criteria"
     *         target="_top">table naming criteria</a>.  Must not be an already
     *         existing table or view.  The default value is ''.
     * 
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * 
     * @param viewName  If provided, then this will be the name of the view
     *                  containing the results, in [schema_name.]view_name
     *                  format, using standard <a
     *                  href="../../../../../../concepts/tables/#table-name-resolution"
     *                  target="_top">name resolution rules</a> and meeting <a
     *                  href="../../../../../../concepts/tables/#table-naming-criteria"
     *                  target="_top">table naming criteria</a>.  Must not be
     *                  an already existing table or view.  The default value
     *                  is ''.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByRadiusGeometryRequest setViewName(String viewName) {
        this.viewName = (viewName == null) ? "" : viewName;
        return this;
    }

    /**
     * 
     * @return Name of the geospatial geometry column to be filtered.
     * 
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * 
     * @param columnName  Name of the geospatial geometry column to be
     *                    filtered.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByRadiusGeometryRequest setColumnName(String columnName) {
        this.columnName = (columnName == null) ? "" : columnName;
        return this;
    }

    /**
     * 
     * @return Value of the longitude of the center. Must be within [-180.0,
     *         180.0].  The minimum allowed value is -180. The maximum allowed
     *         value is 180.
     * 
     */
    public double getXCenter() {
        return xCenter;
    }

    /**
     * 
     * @param xCenter  Value of the longitude of the center. Must be within
     *                 [-180.0, 180.0].  The minimum allowed value is -180. The
     *                 maximum allowed value is 180.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByRadiusGeometryRequest setXCenter(double xCenter) {
        this.xCenter = xCenter;
        return this;
    }

    /**
     * 
     * @return Value of the latitude of the center. Must be within [-90.0,
     *         90.0].  The minimum allowed value is -90. The maximum allowed
     *         value is 90.
     * 
     */
    public double getYCenter() {
        return yCenter;
    }

    /**
     * 
     * @param yCenter  Value of the latitude of the center. Must be within
     *                 [-90.0, 90.0].  The minimum allowed value is -90. The
     *                 maximum allowed value is 90.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByRadiusGeometryRequest setYCenter(double yCenter) {
        this.yCenter = yCenter;
        return this;
    }

    /**
     * 
     * @return The radius of the circle within which the search will be
     *         performed. Must be a non-zero positive value. It is in meters;
     *         so, for example, a value of '42000' means 42 km.  The minimum
     *         allowed value is 0. The maximum allowed value is MAX_INT.
     * 
     */
    public double getRadius() {
        return radius;
    }

    /**
     * 
     * @param radius  The radius of the circle within which the search will be
     *                performed. Must be a non-zero positive value. It is in
     *                meters; so, for example, a value of '42000' means 42 km.
     *                The minimum allowed value is 0. The maximum allowed value
     *                is MAX_INT.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByRadiusGeometryRequest setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.FilterByRadiusGeometryRequest.Options#COLLECTION_NAME
     *         COLLECTION_NAME}: [DEPRECATED--please specify the containing
     *         schema for the view as part of {@code viewName} and use {@link
     *         com.gpudb.GPUdb#createSchema(CreateSchemaRequest)} to create the
     *         schema if non-existent]  Name of a schema for the newly created
     *         view. If the schema provided is non-existent, it will be
     *         automatically created.
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
     *                 com.gpudb.protocol.FilterByRadiusGeometryRequest.Options#COLLECTION_NAME
     *                 COLLECTION_NAME}: [DEPRECATED--please specify the
     *                 containing schema for the view as part of {@code
     *                 viewName} and use {@link
     *                 com.gpudb.GPUdb#createSchema(CreateSchemaRequest)} to
     *                 create the schema if non-existent]  Name of a schema for
     *                 the newly created view. If the schema provided is
     *                 non-existent, it will be automatically created.
     *                 </ul>
     *                 The default value is an empty {@link Map}.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public FilterByRadiusGeometryRequest setOptions(Map<String, String> options) {
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
                return this.viewName;

            case 2:
                return this.columnName;

            case 3:
                return this.xCenter;

            case 4:
                return this.yCenter;

            case 5:
                return this.radius;

            case 6:
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
                this.viewName = (String)value;
                break;

            case 2:
                this.columnName = (String)value;
                break;

            case 3:
                this.xCenter = (Double)value;
                break;

            case 4:
                this.yCenter = (Double)value;
                break;

            case 5:
                this.radius = (Double)value;
                break;

            case 6:
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

        FilterByRadiusGeometryRequest that = (FilterByRadiusGeometryRequest)obj;

        return ( this.tableName.equals( that.tableName )
                 && this.viewName.equals( that.viewName )
                 && this.columnName.equals( that.columnName )
                 && ( (Double)this.xCenter ).equals( (Double)that.xCenter )
                 && ( (Double)this.yCenter ).equals( (Double)that.yCenter )
                 && ( (Double)this.radius ).equals( (Double)that.radius )
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
        builder.append( gd.toString( "viewName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.viewName ) );
        builder.append( ", " );
        builder.append( gd.toString( "columnName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.columnName ) );
        builder.append( ", " );
        builder.append( gd.toString( "xCenter" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.xCenter ) );
        builder.append( ", " );
        builder.append( gd.toString( "yCenter" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.yCenter ) );
        builder.append( ", " );
        builder.append( gd.toString( "radius" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.radius ) );
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
        hashCode = (31 * hashCode) + this.viewName.hashCode();
        hashCode = (31 * hashCode) + this.columnName.hashCode();
        hashCode = (31 * hashCode) + ((Double)this.xCenter).hashCode();
        hashCode = (31 * hashCode) + ((Double)this.yCenter).hashCode();
        hashCode = (31 * hashCode) + ((Double)this.radius).hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

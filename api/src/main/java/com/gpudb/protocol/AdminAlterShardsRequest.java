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
 * com.gpudb.GPUdb#adminAlterShards(AdminAlterShardsRequest)}.
 * <p>
 * Specify the mapping of the shards to the various ranks in the cluster. In
 * most cases, it should be sufficient to let the system automatically
 * distribute the shards evenly across the available ranks. However, this
 * endpoint can be used to move shards for various administrative reasons, say
 * in case of heterogeneous node clusters.  It should be noted that the system
 * may reassign the shards the when the number of nodes in the cluster changes
 * or the cluster is rebalanced.
 */
public class AdminAlterShardsRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("AdminAlterShardsRequest")
            .namespace("com.gpudb")
            .fields()
                .name("version").type().longType().noDefault()
                .name("useIndex").type().booleanType().noDefault()
                .name("rank").type().array().items().intType().noDefault()
                .name("tom").type().array().items().intType().noDefault()
                .name("index").type().array().items().intType().noDefault()
                .name("backupMapList").type().array().items().intType().noDefault()
                .name("backupMapValues").type().array().items().array().items().intType().noDefault()
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

    private long version;
    private boolean useIndex;
    private List<Integer> rank;
    private List<Integer> tom;
    private List<Integer> index;
    private List<Integer> backupMapList;
    private List<List<Integer>> backupMapValues;
    private Map<String, String> options;


    /**
     * Constructs an AdminAlterShardsRequest object with default parameters.
     */
    public AdminAlterShardsRequest() {
        rank = new ArrayList<>();
        tom = new ArrayList<>();
        index = new ArrayList<>();
        backupMapList = new ArrayList<>();
        backupMapValues = new ArrayList<>();
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs an AdminAlterShardsRequest object with the specified
     * parameters.
     * 
     * @param version
     * @param useIndex  Set to true when only the shards being moved are
     *                  specified in the request.  The index must indicate the
     *                  shards being moved.
     * @param rank  node to which the shard will be moved.
     * @param tom  Toms to which the shard will be moved.
     * @param index  The shard being moved.  When use_index is set to true,
     *               size of this array must equal the size of rank/tom array.
     * @param backupMapList  List of rank_tom integers for which backup toms
     *                       are defined
     * @param backupMapValues  List of the backup rank_tom(s) for each rank_tom
     *                         in backup_map_list
     * @param options  Optional parameters.
     * 
     */
    public AdminAlterShardsRequest(long version, boolean useIndex, List<Integer> rank, List<Integer> tom, List<Integer> index, List<Integer> backupMapList, List<List<Integer>> backupMapValues, Map<String, String> options) {
        this.version = version;
        this.useIndex = useIndex;
        this.rank = (rank == null) ? new ArrayList<Integer>() : rank;
        this.tom = (tom == null) ? new ArrayList<Integer>() : tom;
        this.index = (index == null) ? new ArrayList<Integer>() : index;
        this.backupMapList = (backupMapList == null) ? new ArrayList<Integer>() : backupMapList;
        this.backupMapValues = (backupMapValues == null) ? new ArrayList<List<Integer>>() : backupMapValues;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }
    public long getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminAlterShardsRequest setVersion(long version) {
        this.version = version;
        return this;
    }

    /**
     * 
     * @return Set to true when only the shards being moved are specified in
     *         the request.  The index must indicate the shards being moved.
     * 
     */
    public boolean getUseIndex() {
        return useIndex;
    }

    /**
     * 
     * @param useIndex  Set to true when only the shards being moved are
     *                  specified in the request.  The index must indicate the
     *                  shards being moved.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminAlterShardsRequest setUseIndex(boolean useIndex) {
        this.useIndex = useIndex;
        return this;
    }

    /**
     * 
     * @return node to which the shard will be moved.
     * 
     */
    public List<Integer> getRank() {
        return rank;
    }

    /**
     * 
     * @param rank  node to which the shard will be moved.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminAlterShardsRequest setRank(List<Integer> rank) {
        this.rank = (rank == null) ? new ArrayList<Integer>() : rank;
        return this;
    }

    /**
     * 
     * @return Toms to which the shard will be moved.
     * 
     */
    public List<Integer> getTom() {
        return tom;
    }

    /**
     * 
     * @param tom  Toms to which the shard will be moved.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminAlterShardsRequest setTom(List<Integer> tom) {
        this.tom = (tom == null) ? new ArrayList<Integer>() : tom;
        return this;
    }

    /**
     * 
     * @return The shard being moved.  When use_index is set to true, size of
     *         this array must equal the size of rank/tom array.
     * 
     */
    public List<Integer> getIndex() {
        return index;
    }

    /**
     * 
     * @param index  The shard being moved.  When use_index is set to true,
     *               size of this array must equal the size of rank/tom array.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminAlterShardsRequest setIndex(List<Integer> index) {
        this.index = (index == null) ? new ArrayList<Integer>() : index;
        return this;
    }

    /**
     * 
     * @return List of rank_tom integers for which backup toms are defined
     * 
     */
    public List<Integer> getBackupMapList() {
        return backupMapList;
    }

    /**
     * 
     * @param backupMapList  List of rank_tom integers for which backup toms
     *                       are defined
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminAlterShardsRequest setBackupMapList(List<Integer> backupMapList) {
        this.backupMapList = (backupMapList == null) ? new ArrayList<Integer>() : backupMapList;
        return this;
    }

    /**
     * 
     * @return List of the backup rank_tom(s) for each rank_tom in
     *         backup_map_list
     * 
     */
    public List<List<Integer>> getBackupMapValues() {
        return backupMapValues;
    }

    /**
     * 
     * @param backupMapValues  List of the backup rank_tom(s) for each rank_tom
     *                         in backup_map_list
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public AdminAlterShardsRequest setBackupMapValues(List<List<Integer>> backupMapValues) {
        this.backupMapValues = (backupMapValues == null) ? new ArrayList<List<Integer>>() : backupMapValues;
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
    public AdminAlterShardsRequest setOptions(Map<String, String> options) {
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
                return this.version;

            case 1:
                return this.useIndex;

            case 2:
                return this.rank;

            case 3:
                return this.tom;

            case 4:
                return this.index;

            case 5:
                return this.backupMapList;

            case 6:
                return this.backupMapValues;

            case 7:
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
                this.version = (Long)value;
                break;

            case 1:
                this.useIndex = (Boolean)value;
                break;

            case 2:
                this.rank = (List<Integer>)value;
                break;

            case 3:
                this.tom = (List<Integer>)value;
                break;

            case 4:
                this.index = (List<Integer>)value;
                break;

            case 5:
                this.backupMapList = (List<Integer>)value;
                break;

            case 6:
                this.backupMapValues = (List<List<Integer>>)value;
                break;

            case 7:
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

        AdminAlterShardsRequest that = (AdminAlterShardsRequest)obj;

        return ( ( this.version == that.version )
                 && ( this.useIndex == that.useIndex )
                 && this.rank.equals( that.rank )
                 && this.tom.equals( that.tom )
                 && this.index.equals( that.index )
                 && this.backupMapList.equals( that.backupMapList )
                 && this.backupMapValues.equals( that.backupMapValues )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "version" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.version ) );
        builder.append( ", " );
        builder.append( gd.toString( "useIndex" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.useIndex ) );
        builder.append( ", " );
        builder.append( gd.toString( "rank" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.rank ) );
        builder.append( ", " );
        builder.append( gd.toString( "tom" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.tom ) );
        builder.append( ", " );
        builder.append( gd.toString( "index" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.index ) );
        builder.append( ", " );
        builder.append( gd.toString( "backupMapList" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.backupMapList ) );
        builder.append( ", " );
        builder.append( gd.toString( "backupMapValues" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.backupMapValues ) );
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
        hashCode = (31 * hashCode) + ((Long)this.version).hashCode();
        hashCode = (31 * hashCode) + ((Boolean)this.useIndex).hashCode();
        hashCode = (31 * hashCode) + this.rank.hashCode();
        hashCode = (31 * hashCode) + this.tom.hashCode();
        hashCode = (31 * hashCode) + this.index.hashCode();
        hashCode = (31 * hashCode) + this.backupMapList.hashCode();
        hashCode = (31 * hashCode) + this.backupMapValues.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

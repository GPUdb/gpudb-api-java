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
 * com.gpudb.GPUdb#createJoinTable(CreateJoinTableRequest)}.
 * <p>
 * Creates a table that is the result of a SQL JOIN.
 * <p>
 * For join details and examples see: <a
 * href="../../../../../concepts/joins.html" target="_top">Joins</a>.  For
 * limitations, see <a
 * href="../../../../../concepts/joins.html#limitations-cautions"
 * target="_top">Join Limitations and Cautions</a>.
 */
public class CreateJoinTableRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("CreateJoinTableRequest")
            .namespace("com.gpudb")
            .fields()
                .name("joinTableName").type().stringType().noDefault()
                .name("tableNames").type().array().items().stringType().noDefault()
                .name("columnNames").type().array().items().stringType().noDefault()
                .name("expressions").type().array().items().stringType().noDefault()
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
     * com.gpudb.protocol.CreateJoinTableRequest.Options#COLLECTION_NAME
     * COLLECTION_NAME}: Name of a collection which is to contain the join. If
     * the collection provided is non-existent, the collection will be
     * automatically created. If empty, then the join will be at the top level.
     *         <li> {@link
     * com.gpudb.protocol.CreateJoinTableRequest.Options#MAX_QUERY_DIMENSIONS
     * MAX_QUERY_DIMENSIONS}: The maximum number of tables in a join that can
     * be accessed by a query and are not equated by a foreign-key to
     * primary-key equality predicate
     *         <li> {@link
     * com.gpudb.protocol.CreateJoinTableRequest.Options#OPTIMIZE_LOOKUPS
     * OPTIMIZE_LOOKUPS}: Use more memory to speed up the joining of tables.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.CreateJoinTableRequest.Options#TRUE TRUE}
     *         <li> {@link
     * com.gpudb.protocol.CreateJoinTableRequest.Options#FALSE FALSE}
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.CreateJoinTableRequest.Options#FALSE FALSE}.
     *         <li> {@link
     * com.gpudb.protocol.CreateJoinTableRequest.Options#REFRESH_METHOD
     * REFRESH_METHOD}: Method by which the join can be refreshed when the data
     * in underlying member tables have changed.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.CreateJoinTableRequest.Options#MANUAL MANUAL}:
     * refresh only occurs when manually requested by calling this endpoint
     * with refresh option set to {@code refresh} or {@code full_refresh}
     *         <li> {@link
     * com.gpudb.protocol.CreateJoinTableRequest.Options#ON_QUERY ON_QUERY}:
     * incrementally refresh (refresh just those records added) whenever a new
     * query is issued and new data is inserted into the base table.  A full
     * refresh of all the records occurs when a new query is issued and there
     * have been inserts to any non-base-tables since the last query
     *         <li> {@link
     * com.gpudb.protocol.CreateJoinTableRequest.Options#ON_INSERT ON_INSERT}:
     * incrementally refresh (refresh just those records added) whenever new
     * data is inserted into a base table.  A full refresh of all the records
     * occurs when a new query is issued and there have been inserts to any
     * non-base-tables since the last query
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.CreateJoinTableRequest.Options#MANUAL MANUAL}.
     *         <li> {@link
     * com.gpudb.protocol.CreateJoinTableRequest.Options#REFRESH REFRESH}: Do a
     * manual refresh of the join if it exists - throws an error otherwise
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.CreateJoinTableRequest.Options#NO_REFRESH
     * NO_REFRESH}: don't refresh
     *         <li> {@link
     * com.gpudb.protocol.CreateJoinTableRequest.Options#REFRESH REFRESH}:
     * incrementally refresh (refresh just those records added) if new data has
     * been inserted into the base table.  A full refresh of all the records
     * occurs if there have been inserts to any non-base-tables since the last
     * refresh
     *         <li> {@link
     * com.gpudb.protocol.CreateJoinTableRequest.Options#FULL_REFRESH
     * FULL_REFRESH}: always refresh even if no new records have been added.
     * Only refresh method guaranteed to do a full refresh (refresh all the
     * records) if a delete or update has occurred since the last refresh.
     * </ul>
     * The default value is {@link
     * com.gpudb.protocol.CreateJoinTableRequest.Options#NO_REFRESH
     * NO_REFRESH}.
     *         <li> {@link
     * com.gpudb.protocol.CreateJoinTableRequest.Options#TTL TTL}: Sets the <a
     * href="../../../../../concepts/ttl.html" target="_top">TTL</a> of the
     * join table specified in {@code joinTableName}.
     *         <li> {@link
     * com.gpudb.protocol.CreateJoinTableRequest.Options#VIEW_ID VIEW_ID}: view
     * this projection is part of
     * </ul>
     * A set of string constants for the parameter {@code options}.
     */
    public static final class Options {

        /**
         * Name of a collection which is to contain the join. If the collection
         * provided is non-existent, the collection will be automatically
         * created. If empty, then the join will be at the top level.
         */
        public static final String COLLECTION_NAME = "collection_name";

        /**
         * The maximum number of tables in a join that can be accessed by a
         * query and are not equated by a foreign-key to primary-key equality
         * predicate
         */
        public static final String MAX_QUERY_DIMENSIONS = "max_query_dimensions";

        /**
         * Use more memory to speed up the joining of tables.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.CreateJoinTableRequest.Options#TRUE TRUE}
         *         <li> {@link
         * com.gpudb.protocol.CreateJoinTableRequest.Options#FALSE FALSE}
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.CreateJoinTableRequest.Options#FALSE FALSE}.
         */
        public static final String OPTIMIZE_LOOKUPS = "optimize_lookups";
        public static final String TRUE = "true";
        public static final String FALSE = "false";

        /**
         * Method by which the join can be refreshed when the data in
         * underlying member tables have changed.
         * Supported values:
         * <ul>
         *         <li> {@link
         * com.gpudb.protocol.CreateJoinTableRequest.Options#MANUAL MANUAL}:
         * refresh only occurs when manually requested by calling this endpoint
         * with refresh option set to {@code refresh} or {@code full_refresh}
         *         <li> {@link
         * com.gpudb.protocol.CreateJoinTableRequest.Options#ON_QUERY
         * ON_QUERY}: incrementally refresh (refresh just those records added)
         * whenever a new query is issued and new data is inserted into the
         * base table.  A full refresh of all the records occurs when a new
         * query is issued and there have been inserts to any non-base-tables
         * since the last query
         *         <li> {@link
         * com.gpudb.protocol.CreateJoinTableRequest.Options#ON_INSERT
         * ON_INSERT}: incrementally refresh (refresh just those records added)
         * whenever new data is inserted into a base table.  A full refresh of
         * all the records occurs when a new query is issued and there have
         * been inserts to any non-base-tables since the last query
         * </ul>
         * The default value is {@link
         * com.gpudb.protocol.CreateJoinTableRequest.Options#MANUAL MANUAL}.
         */
        public static final String REFRESH_METHOD = "refresh_method";

        /**
         * refresh only occurs when manually requested by calling this endpoint
         * with refresh option set to {@code refresh} or {@code full_refresh}
         */
        public static final String MANUAL = "manual";

        /**
         * incrementally refresh (refresh just those records added) whenever a
         * new query is issued and new data is inserted into the base table.  A
         * full refresh of all the records occurs when a new query is issued
         * and there have been inserts to any non-base-tables since the last
         * query
         */
        public static final String ON_QUERY = "on_query";

        /**
         * incrementally refresh (refresh just those records added) whenever
         * new data is inserted into a base table.  A full refresh of all the
         * records occurs when a new query is issued and there have been
         * inserts to any non-base-tables since the last query
         */
        public static final String ON_INSERT = "on_insert";

        /**
         * incrementally refresh (refresh just those records added) if new data
         * has been inserted into the base table.  A full refresh of all the
         * records occurs if there have been inserts to any non-base-tables
         * since the last refresh
         */
        public static final String REFRESH = "refresh";

        /**
         * don't refresh
         */
        public static final String NO_REFRESH = "no_refresh";

        /**
         * always refresh even if no new records have been added.  Only refresh
         * method guaranteed to do a full refresh (refresh all the records) if
         * a delete or update has occurred since the last refresh.
         */
        public static final String FULL_REFRESH = "full_refresh";

        /**
         * Sets the <a href="../../../../../concepts/ttl.html"
         * target="_top">TTL</a> of the join table specified in {@code
         * joinTableName}.
         */
        public static final String TTL = "ttl";

        /**
         * view this projection is part of
         */
        public static final String VIEW_ID = "view_id";

        private Options() {  }
    }

    private String joinTableName;
    private List<String> tableNames;
    private List<String> columnNames;
    private List<String> expressions;
    private Map<String, String> options;


    /**
     * Constructs a CreateJoinTableRequest object with default parameters.
     */
    public CreateJoinTableRequest() {
        joinTableName = "";
        tableNames = new ArrayList<>();
        columnNames = new ArrayList<>();
        expressions = new ArrayList<>();
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a CreateJoinTableRequest object with the specified
     * parameters.
     * 
     * @param joinTableName  Name of the join table to be created.  Has the
     *                       same naming restrictions as <a
     *                       href="../../../../../concepts/tables.html"
     *                       target="_top">tables</a>.
     * @param tableNames  The list of table names composing the join.
     *                    Corresponds to a SQL statement FROM clause.
     * @param columnNames  List of member table columns or column expressions
     *                     to be included in the join. Columns can be prefixed
     *                     with 'table_id.column_name', where 'table_id' is the
     *                     table name or alias.  Columns can be aliased via the
     *                     syntax 'column_name as alias'. Wild cards '*' can be
     *                     used to include all columns across member tables or
     *                     'table_id.*' for all of a single table's columns.
     *                     Columns and column expressions comprising the join
     *                     must be uniquely named or aliased--therefore, the
     *                     '*' wild card cannot be used if column names aren't
     *                     unique across all tables.
     * @param expressions  An optional list of expressions to combine and
     *                     filter the joined tables.  Corresponds to a SQL
     *                     statement WHERE clause. For details see: <a
     *                     href="../../../../../concepts/expressions.html"
     *                     target="_top">expressions</a>.
     * @param options  Optional parameters.
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#COLLECTION_NAME
     *                 COLLECTION_NAME}: Name of a collection which is to
     *                 contain the join. If the collection provided is
     *                 non-existent, the collection will be automatically
     *                 created. If empty, then the join will be at the top
     *                 level.
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#MAX_QUERY_DIMENSIONS
     *                 MAX_QUERY_DIMENSIONS}: The maximum number of tables in a
     *                 join that can be accessed by a query and are not equated
     *                 by a foreign-key to primary-key equality predicate
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#OPTIMIZE_LOOKUPS
     *                 OPTIMIZE_LOOKUPS}: Use more memory to speed up the
     *                 joining of tables.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#REFRESH_METHOD
     *                 REFRESH_METHOD}: Method by which the join can be
     *                 refreshed when the data in underlying member tables have
     *                 changed.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#MANUAL
     *                 MANUAL}: refresh only occurs when manually requested by
     *                 calling this endpoint with refresh option set to {@code
     *                 refresh} or {@code full_refresh}
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#ON_QUERY
     *                 ON_QUERY}: incrementally refresh (refresh just those
     *                 records added) whenever a new query is issued and new
     *                 data is inserted into the base table.  A full refresh of
     *                 all the records occurs when a new query is issued and
     *                 there have been inserts to any non-base-tables since the
     *                 last query
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#ON_INSERT
     *                 ON_INSERT}: incrementally refresh (refresh just those
     *                 records added) whenever new data is inserted into a base
     *                 table.  A full refresh of all the records occurs when a
     *                 new query is issued and there have been inserts to any
     *                 non-base-tables since the last query
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#MANUAL
     *                 MANUAL}.
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#REFRESH
     *                 REFRESH}: Do a manual refresh of the join if it exists -
     *                 throws an error otherwise
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#NO_REFRESH
     *                 NO_REFRESH}: don't refresh
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#REFRESH
     *                 REFRESH}: incrementally refresh (refresh just those
     *                 records added) if new data has been inserted into the
     *                 base table.  A full refresh of all the records occurs if
     *                 there have been inserts to any non-base-tables since the
     *                 last refresh
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#FULL_REFRESH
     *                 FULL_REFRESH}: always refresh even if no new records
     *                 have been added.  Only refresh method guaranteed to do a
     *                 full refresh (refresh all the records) if a delete or
     *                 update has occurred since the last refresh.
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#NO_REFRESH
     *                 NO_REFRESH}.
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#TTL
     *                 TTL}: Sets the <a
     *                 href="../../../../../concepts/ttl.html"
     *                 target="_top">TTL</a> of the join table specified in
     *                 {@code joinTableName}.
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#VIEW_ID
     *                 VIEW_ID}: view this projection is part of
     *                 </ul>
     * 
     */
    public CreateJoinTableRequest(String joinTableName, List<String> tableNames, List<String> columnNames, List<String> expressions, Map<String, String> options) {
        this.joinTableName = (joinTableName == null) ? "" : joinTableName;
        this.tableNames = (tableNames == null) ? new ArrayList<String>() : tableNames;
        this.columnNames = (columnNames == null) ? new ArrayList<String>() : columnNames;
        this.expressions = (expressions == null) ? new ArrayList<String>() : expressions;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the join table to be created.  Has the same naming
     *         restrictions as <a href="../../../../../concepts/tables.html"
     *         target="_top">tables</a>.
     * 
     */
    public String getJoinTableName() {
        return joinTableName;
    }

    /**
     * 
     * @param joinTableName  Name of the join table to be created.  Has the
     *                       same naming restrictions as <a
     *                       href="../../../../../concepts/tables.html"
     *                       target="_top">tables</a>.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateJoinTableRequest setJoinTableName(String joinTableName) {
        this.joinTableName = (joinTableName == null) ? "" : joinTableName;
        return this;
    }

    /**
     * 
     * @return The list of table names composing the join.  Corresponds to a
     *         SQL statement FROM clause.
     * 
     */
    public List<String> getTableNames() {
        return tableNames;
    }

    /**
     * 
     * @param tableNames  The list of table names composing the join.
     *                    Corresponds to a SQL statement FROM clause.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateJoinTableRequest setTableNames(List<String> tableNames) {
        this.tableNames = (tableNames == null) ? new ArrayList<String>() : tableNames;
        return this;
    }

    /**
     * 
     * @return List of member table columns or column expressions to be
     *         included in the join. Columns can be prefixed with
     *         'table_id.column_name', where 'table_id' is the table name or
     *         alias.  Columns can be aliased via the syntax 'column_name as
     *         alias'. Wild cards '*' can be used to include all columns across
     *         member tables or 'table_id.*' for all of a single table's
     *         columns.  Columns and column expressions comprising the join
     *         must be uniquely named or aliased--therefore, the '*' wild card
     *         cannot be used if column names aren't unique across all tables.
     * 
     */
    public List<String> getColumnNames() {
        return columnNames;
    }

    /**
     * 
     * @param columnNames  List of member table columns or column expressions
     *                     to be included in the join. Columns can be prefixed
     *                     with 'table_id.column_name', where 'table_id' is the
     *                     table name or alias.  Columns can be aliased via the
     *                     syntax 'column_name as alias'. Wild cards '*' can be
     *                     used to include all columns across member tables or
     *                     'table_id.*' for all of a single table's columns.
     *                     Columns and column expressions comprising the join
     *                     must be uniquely named or aliased--therefore, the
     *                     '*' wild card cannot be used if column names aren't
     *                     unique across all tables.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateJoinTableRequest setColumnNames(List<String> columnNames) {
        this.columnNames = (columnNames == null) ? new ArrayList<String>() : columnNames;
        return this;
    }

    /**
     * 
     * @return An optional list of expressions to combine and filter the joined
     *         tables.  Corresponds to a SQL statement WHERE clause. For
     *         details see: <a href="../../../../../concepts/expressions.html"
     *         target="_top">expressions</a>.
     * 
     */
    public List<String> getExpressions() {
        return expressions;
    }

    /**
     * 
     * @param expressions  An optional list of expressions to combine and
     *                     filter the joined tables.  Corresponds to a SQL
     *                     statement WHERE clause. For details see: <a
     *                     href="../../../../../concepts/expressions.html"
     *                     target="_top">expressions</a>.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateJoinTableRequest setExpressions(List<String> expressions) {
        this.expressions = (expressions == null) ? new ArrayList<String>() : expressions;
        return this;
    }

    /**
     * 
     * @return Optional parameters.
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.CreateJoinTableRequest.Options#COLLECTION_NAME
     *         COLLECTION_NAME}: Name of a collection which is to contain the
     *         join. If the collection provided is non-existent, the collection
     *         will be automatically created. If empty, then the join will be
     *         at the top level.
     *                 <li> {@link
     *         com.gpudb.protocol.CreateJoinTableRequest.Options#MAX_QUERY_DIMENSIONS
     *         MAX_QUERY_DIMENSIONS}: The maximum number of tables in a join
     *         that can be accessed by a query and are not equated by a
     *         foreign-key to primary-key equality predicate
     *                 <li> {@link
     *         com.gpudb.protocol.CreateJoinTableRequest.Options#OPTIMIZE_LOOKUPS
     *         OPTIMIZE_LOOKUPS}: Use more memory to speed up the joining of
     *         tables.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.CreateJoinTableRequest.Options#TRUE TRUE}
     *                 <li> {@link
     *         com.gpudb.protocol.CreateJoinTableRequest.Options#FALSE FALSE}
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.CreateJoinTableRequest.Options#FALSE FALSE}.
     *                 <li> {@link
     *         com.gpudb.protocol.CreateJoinTableRequest.Options#REFRESH_METHOD
     *         REFRESH_METHOD}: Method by which the join can be refreshed when
     *         the data in underlying member tables have changed.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.CreateJoinTableRequest.Options#MANUAL
     *         MANUAL}: refresh only occurs when manually requested by calling
     *         this endpoint with refresh option set to {@code refresh} or
     *         {@code full_refresh}
     *                 <li> {@link
     *         com.gpudb.protocol.CreateJoinTableRequest.Options#ON_QUERY
     *         ON_QUERY}: incrementally refresh (refresh just those records
     *         added) whenever a new query is issued and new data is inserted
     *         into the base table.  A full refresh of all the records occurs
     *         when a new query is issued and there have been inserts to any
     *         non-base-tables since the last query
     *                 <li> {@link
     *         com.gpudb.protocol.CreateJoinTableRequest.Options#ON_INSERT
     *         ON_INSERT}: incrementally refresh (refresh just those records
     *         added) whenever new data is inserted into a base table.  A full
     *         refresh of all the records occurs when a new query is issued and
     *         there have been inserts to any non-base-tables since the last
     *         query
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.CreateJoinTableRequest.Options#MANUAL
     *         MANUAL}.
     *                 <li> {@link
     *         com.gpudb.protocol.CreateJoinTableRequest.Options#REFRESH
     *         REFRESH}: Do a manual refresh of the join if it exists - throws
     *         an error otherwise
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.CreateJoinTableRequest.Options#NO_REFRESH
     *         NO_REFRESH}: don't refresh
     *                 <li> {@link
     *         com.gpudb.protocol.CreateJoinTableRequest.Options#REFRESH
     *         REFRESH}: incrementally refresh (refresh just those records
     *         added) if new data has been inserted into the base table.  A
     *         full refresh of all the records occurs if there have been
     *         inserts to any non-base-tables since the last refresh
     *                 <li> {@link
     *         com.gpudb.protocol.CreateJoinTableRequest.Options#FULL_REFRESH
     *         FULL_REFRESH}: always refresh even if no new records have been
     *         added.  Only refresh method guaranteed to do a full refresh
     *         (refresh all the records) if a delete or update has occurred
     *         since the last refresh.
     *         </ul>
     *         The default value is {@link
     *         com.gpudb.protocol.CreateJoinTableRequest.Options#NO_REFRESH
     *         NO_REFRESH}.
     *                 <li> {@link
     *         com.gpudb.protocol.CreateJoinTableRequest.Options#TTL TTL}: Sets
     *         the <a href="../../../../../concepts/ttl.html"
     *         target="_top">TTL</a> of the join table specified in {@code
     *         joinTableName}.
     *                 <li> {@link
     *         com.gpudb.protocol.CreateJoinTableRequest.Options#VIEW_ID
     *         VIEW_ID}: view this projection is part of
     *         </ul>
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
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#COLLECTION_NAME
     *                 COLLECTION_NAME}: Name of a collection which is to
     *                 contain the join. If the collection provided is
     *                 non-existent, the collection will be automatically
     *                 created. If empty, then the join will be at the top
     *                 level.
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#MAX_QUERY_DIMENSIONS
     *                 MAX_QUERY_DIMENSIONS}: The maximum number of tables in a
     *                 join that can be accessed by a query and are not equated
     *                 by a foreign-key to primary-key equality predicate
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#OPTIMIZE_LOOKUPS
     *                 OPTIMIZE_LOOKUPS}: Use more memory to speed up the
     *                 joining of tables.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#TRUE
     *                 TRUE}
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#FALSE
     *                 FALSE}
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#FALSE
     *                 FALSE}.
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#REFRESH_METHOD
     *                 REFRESH_METHOD}: Method by which the join can be
     *                 refreshed when the data in underlying member tables have
     *                 changed.
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#MANUAL
     *                 MANUAL}: refresh only occurs when manually requested by
     *                 calling this endpoint with refresh option set to {@code
     *                 refresh} or {@code full_refresh}
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#ON_QUERY
     *                 ON_QUERY}: incrementally refresh (refresh just those
     *                 records added) whenever a new query is issued and new
     *                 data is inserted into the base table.  A full refresh of
     *                 all the records occurs when a new query is issued and
     *                 there have been inserts to any non-base-tables since the
     *                 last query
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#ON_INSERT
     *                 ON_INSERT}: incrementally refresh (refresh just those
     *                 records added) whenever new data is inserted into a base
     *                 table.  A full refresh of all the records occurs when a
     *                 new query is issued and there have been inserts to any
     *                 non-base-tables since the last query
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#MANUAL
     *                 MANUAL}.
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#REFRESH
     *                 REFRESH}: Do a manual refresh of the join if it exists -
     *                 throws an error otherwise
     *                 Supported values:
     *                 <ul>
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#NO_REFRESH
     *                 NO_REFRESH}: don't refresh
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#REFRESH
     *                 REFRESH}: incrementally refresh (refresh just those
     *                 records added) if new data has been inserted into the
     *                 base table.  A full refresh of all the records occurs if
     *                 there have been inserts to any non-base-tables since the
     *                 last refresh
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#FULL_REFRESH
     *                 FULL_REFRESH}: always refresh even if no new records
     *                 have been added.  Only refresh method guaranteed to do a
     *                 full refresh (refresh all the records) if a delete or
     *                 update has occurred since the last refresh.
     *                 </ul>
     *                 The default value is {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#NO_REFRESH
     *                 NO_REFRESH}.
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#TTL
     *                 TTL}: Sets the <a
     *                 href="../../../../../concepts/ttl.html"
     *                 target="_top">TTL</a> of the join table specified in
     *                 {@code joinTableName}.
     *                         <li> {@link
     *                 com.gpudb.protocol.CreateJoinTableRequest.Options#VIEW_ID
     *                 VIEW_ID}: view this projection is part of
     *                 </ul>
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateJoinTableRequest setOptions(Map<String, String> options) {
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
                return this.joinTableName;

            case 1:
                return this.tableNames;

            case 2:
                return this.columnNames;

            case 3:
                return this.expressions;

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
                this.joinTableName = (String)value;
                break;

            case 1:
                this.tableNames = (List<String>)value;
                break;

            case 2:
                this.columnNames = (List<String>)value;
                break;

            case 3:
                this.expressions = (List<String>)value;
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

        CreateJoinTableRequest that = (CreateJoinTableRequest)obj;

        return ( this.joinTableName.equals( that.joinTableName )
                 && this.tableNames.equals( that.tableNames )
                 && this.columnNames.equals( that.columnNames )
                 && this.expressions.equals( that.expressions )
                 && this.options.equals( that.options ) );
    }

    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "joinTableName" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.joinTableName ) );
        builder.append( ", " );
        builder.append( gd.toString( "tableNames" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.tableNames ) );
        builder.append( ", " );
        builder.append( gd.toString( "columnNames" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.columnNames ) );
        builder.append( ", " );
        builder.append( gd.toString( "expressions" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.expressions ) );
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
        hashCode = (31 * hashCode) + this.joinTableName.hashCode();
        hashCode = (31 * hashCode) + this.tableNames.hashCode();
        hashCode = (31 * hashCode) + this.columnNames.hashCode();
        hashCode = (31 * hashCode) + this.expressions.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

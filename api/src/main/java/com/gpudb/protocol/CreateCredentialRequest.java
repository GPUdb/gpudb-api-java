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
 * com.gpudb.GPUdb#createCredential(CreateCredentialRequest)}.
 * <p>
 * Create a new <a href="../../../../../../concepts/credentials/"
 * target="_top">credential</a>.
 */
public class CreateCredentialRequest implements IndexedRecord {
    private static final Schema schema$ = SchemaBuilder
            .record("CreateCredentialRequest")
            .namespace("com.gpudb")
            .fields()
                .name("credentialName").type().stringType().noDefault()
                .name("type").type().stringType().noDefault()
                .name("identity").type().stringType().noDefault()
                .name("secret").type().stringType().noDefault()
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
     * Type of the credential to be created.
     * Supported values:
     * <ul>
     *         <li> {@link
     * com.gpudb.protocol.CreateCredentialRequest.Type#AWS_ACCESS_KEY
     * AWS_ACCESS_KEY}
     *         <li> {@link
     * com.gpudb.protocol.CreateCredentialRequest.Type#AWS_IAM_ROLE
     * AWS_IAM_ROLE}
     *         <li> {@link
     * com.gpudb.protocol.CreateCredentialRequest.Type#AZURE_AD AZURE_AD}
     *         <li> {@link
     * com.gpudb.protocol.CreateCredentialRequest.Type#AZURE_OAUTH AZURE_OAUTH}
     *         <li> {@link
     * com.gpudb.protocol.CreateCredentialRequest.Type#AZURE_SAS AZURE_SAS}
     *         <li> {@link
     * com.gpudb.protocol.CreateCredentialRequest.Type#AZURE_STORAGE_KEY
     * AZURE_STORAGE_KEY}
     *         <li> {@link
     * com.gpudb.protocol.CreateCredentialRequest.Type#DOCKER DOCKER}
     *         <li> {@link com.gpudb.protocol.CreateCredentialRequest.Type#HDFS
     * HDFS}
     *         <li> {@link
     * com.gpudb.protocol.CreateCredentialRequest.Type#KAFKA KAFKA}
     * </ul>
     * A set of string constants for the parameter {@code type}.
     */
    public static final class Type {
        public static final String AWS_ACCESS_KEY = "aws_access_key";
        public static final String AWS_IAM_ROLE = "aws_iam_role";
        public static final String AZURE_AD = "azure_ad";
        public static final String AZURE_OAUTH = "azure_oauth";
        public static final String AZURE_SAS = "azure_sas";
        public static final String AZURE_STORAGE_KEY = "azure_storage_key";
        public static final String DOCKER = "docker";
        public static final String HDFS = "hdfs";
        public static final String KAFKA = "kafka";

        private Type() {  }
    }

    private String credentialName;
    private String type;
    private String identity;
    private String secret;
    private Map<String, String> options;


    /**
     * Constructs a CreateCredentialRequest object with default parameters.
     */
    public CreateCredentialRequest() {
        credentialName = "";
        type = "";
        identity = "";
        secret = "";
        options = new LinkedHashMap<>();
    }

    /**
     * Constructs a CreateCredentialRequest object with the specified
     * parameters.
     * 
     * @param credentialName  Name of the credential to be created. Must
     *                        contain only letters, digits, and underscores,
     *                        and cannot begin with a digit. Must not match an
     *                        existing credential name.
     * @param type  Type of the credential to be created.
     *              Supported values:
     *              <ul>
     *                      <li> {@link
     *              com.gpudb.protocol.CreateCredentialRequest.Type#AWS_ACCESS_KEY
     *              AWS_ACCESS_KEY}
     *                      <li> {@link
     *              com.gpudb.protocol.CreateCredentialRequest.Type#AWS_IAM_ROLE
     *              AWS_IAM_ROLE}
     *                      <li> {@link
     *              com.gpudb.protocol.CreateCredentialRequest.Type#AZURE_AD
     *              AZURE_AD}
     *                      <li> {@link
     *              com.gpudb.protocol.CreateCredentialRequest.Type#AZURE_OAUTH
     *              AZURE_OAUTH}
     *                      <li> {@link
     *              com.gpudb.protocol.CreateCredentialRequest.Type#AZURE_SAS
     *              AZURE_SAS}
     *                      <li> {@link
     *              com.gpudb.protocol.CreateCredentialRequest.Type#AZURE_STORAGE_KEY
     *              AZURE_STORAGE_KEY}
     *                      <li> {@link
     *              com.gpudb.protocol.CreateCredentialRequest.Type#DOCKER
     *              DOCKER}
     *                      <li> {@link
     *              com.gpudb.protocol.CreateCredentialRequest.Type#HDFS HDFS}
     *                      <li> {@link
     *              com.gpudb.protocol.CreateCredentialRequest.Type#KAFKA
     *              KAFKA}
     *              </ul>
     * @param identity  User of the credential to be created.
     * @param secret  Password of the credential to be created.
     * @param options  Optional parameters.  The default value is an empty
     *                 {@link Map}.
     * 
     */
    public CreateCredentialRequest(String credentialName, String type, String identity, String secret, Map<String, String> options) {
        this.credentialName = (credentialName == null) ? "" : credentialName;
        this.type = (type == null) ? "" : type;
        this.identity = (identity == null) ? "" : identity;
        this.secret = (secret == null) ? "" : secret;
        this.options = (options == null) ? new LinkedHashMap<String, String>() : options;
    }

    /**
     * 
     * @return Name of the credential to be created. Must contain only letters,
     *         digits, and underscores, and cannot begin with a digit. Must not
     *         match an existing credential name.
     * 
     */
    public String getCredentialName() {
        return credentialName;
    }

    /**
     * 
     * @param credentialName  Name of the credential to be created. Must
     *                        contain only letters, digits, and underscores,
     *                        and cannot begin with a digit. Must not match an
     *                        existing credential name.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateCredentialRequest setCredentialName(String credentialName) {
        this.credentialName = (credentialName == null) ? "" : credentialName;
        return this;
    }

    /**
     * 
     * @return Type of the credential to be created.
     *         Supported values:
     *         <ul>
     *                 <li> {@link
     *         com.gpudb.protocol.CreateCredentialRequest.Type#AWS_ACCESS_KEY
     *         AWS_ACCESS_KEY}
     *                 <li> {@link
     *         com.gpudb.protocol.CreateCredentialRequest.Type#AWS_IAM_ROLE
     *         AWS_IAM_ROLE}
     *                 <li> {@link
     *         com.gpudb.protocol.CreateCredentialRequest.Type#AZURE_AD
     *         AZURE_AD}
     *                 <li> {@link
     *         com.gpudb.protocol.CreateCredentialRequest.Type#AZURE_OAUTH
     *         AZURE_OAUTH}
     *                 <li> {@link
     *         com.gpudb.protocol.CreateCredentialRequest.Type#AZURE_SAS
     *         AZURE_SAS}
     *                 <li> {@link
     *         com.gpudb.protocol.CreateCredentialRequest.Type#AZURE_STORAGE_KEY
     *         AZURE_STORAGE_KEY}
     *                 <li> {@link
     *         com.gpudb.protocol.CreateCredentialRequest.Type#DOCKER DOCKER}
     *                 <li> {@link
     *         com.gpudb.protocol.CreateCredentialRequest.Type#HDFS HDFS}
     *                 <li> {@link
     *         com.gpudb.protocol.CreateCredentialRequest.Type#KAFKA KAFKA}
     *         </ul>
     * 
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type  Type of the credential to be created.
     *              Supported values:
     *              <ul>
     *                      <li> {@link
     *              com.gpudb.protocol.CreateCredentialRequest.Type#AWS_ACCESS_KEY
     *              AWS_ACCESS_KEY}
     *                      <li> {@link
     *              com.gpudb.protocol.CreateCredentialRequest.Type#AWS_IAM_ROLE
     *              AWS_IAM_ROLE}
     *                      <li> {@link
     *              com.gpudb.protocol.CreateCredentialRequest.Type#AZURE_AD
     *              AZURE_AD}
     *                      <li> {@link
     *              com.gpudb.protocol.CreateCredentialRequest.Type#AZURE_OAUTH
     *              AZURE_OAUTH}
     *                      <li> {@link
     *              com.gpudb.protocol.CreateCredentialRequest.Type#AZURE_SAS
     *              AZURE_SAS}
     *                      <li> {@link
     *              com.gpudb.protocol.CreateCredentialRequest.Type#AZURE_STORAGE_KEY
     *              AZURE_STORAGE_KEY}
     *                      <li> {@link
     *              com.gpudb.protocol.CreateCredentialRequest.Type#DOCKER
     *              DOCKER}
     *                      <li> {@link
     *              com.gpudb.protocol.CreateCredentialRequest.Type#HDFS HDFS}
     *                      <li> {@link
     *              com.gpudb.protocol.CreateCredentialRequest.Type#KAFKA
     *              KAFKA}
     *              </ul>
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateCredentialRequest setType(String type) {
        this.type = (type == null) ? "" : type;
        return this;
    }

    /**
     * 
     * @return User of the credential to be created.
     * 
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * 
     * @param identity  User of the credential to be created.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateCredentialRequest setIdentity(String identity) {
        this.identity = (identity == null) ? "" : identity;
        return this;
    }

    /**
     * 
     * @return Password of the credential to be created.
     * 
     */
    public String getSecret() {
        return secret;
    }

    /**
     * 
     * @param secret  Password of the credential to be created.
     * 
     * @return {@code this} to mimic the builder pattern.
     * 
     */
    public CreateCredentialRequest setSecret(String secret) {
        this.secret = (secret == null) ? "" : secret;
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
    public CreateCredentialRequest setOptions(Map<String, String> options) {
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
                return this.type;

            case 2:
                return this.identity;

            case 3:
                return this.secret;

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
                this.credentialName = (String)value;
                break;

            case 1:
                this.type = (String)value;
                break;

            case 2:
                this.identity = (String)value;
                break;

            case 3:
                this.secret = (String)value;
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

        CreateCredentialRequest that = (CreateCredentialRequest)obj;

        return ( this.credentialName.equals( that.credentialName )
                 && this.type.equals( that.type )
                 && this.identity.equals( that.identity )
                 && this.secret.equals( that.secret )
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
        builder.append( gd.toString( "type" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.type ) );
        builder.append( ", " );
        builder.append( gd.toString( "identity" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.identity ) );
        builder.append( ", " );
        builder.append( gd.toString( "secret" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.secret ) );
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
        hashCode = (31 * hashCode) + this.type.hashCode();
        hashCode = (31 * hashCode) + this.identity.hashCode();
        hashCode = (31 * hashCode) + this.secret.hashCode();
        hashCode = (31 * hashCode) + this.options.hashCode();
        return hashCode;
    }

}

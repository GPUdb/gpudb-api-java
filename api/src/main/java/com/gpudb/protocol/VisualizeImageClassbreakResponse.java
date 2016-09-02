
/*
 *  This file was autogenerated by the GPUdb schema processor.
 *
 *  DO NOT EDIT DIRECTLY.
 */
package com.gpudb.protocol;


import java.nio.ByteBuffer;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.IndexedRecord;


public class VisualizeImageClassbreakResponse implements IndexedRecord {

    private static final Schema schema$ = SchemaBuilder
            .record("VisualizeImageClassbreakResponse")
            .namespace("com.gpudb")
            .fields()
                .name("width").type().doubleType().noDefault()
                .name("height").type().doubleType().noDefault()
                .name("bgColor").type().longType().noDefault()
                .name("imageData").type().bytesType().noDefault()
            .endRecord();


    public static Schema getClassSchema() {
        return schema$;
    }


    private double width;
    private double height;
    private long bgColor;
    private ByteBuffer imageData;


    public VisualizeImageClassbreakResponse() {
    }

    public double getWidth() {
        return width;
    }

    public VisualizeImageClassbreakResponse setWidth(double width) {
        this.width = width;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public VisualizeImageClassbreakResponse setHeight(double height) {
        this.height = height;
        return this;
    }

    public long getBgColor() {
        return bgColor;
    }

    public VisualizeImageClassbreakResponse setBgColor(long bgColor) {
        this.bgColor = bgColor;
        return this;
    }

    public ByteBuffer getImageData() {
        return imageData;
    }

    public VisualizeImageClassbreakResponse setImageData(ByteBuffer imageData) {
        this.imageData = (imageData == null) ? ByteBuffer.wrap( new byte[0] ) : imageData;
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
                return this.width;

            case 1:
                return this.height;

            case 2:
                return this.bgColor;

            case 3:
                return this.imageData;

            default:
                throw new IndexOutOfBoundsException("Invalid index specified.");
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void put(int index, Object value) {
        switch (index) {
            case 0:
                this.width = (Double)value;
                break;

            case 1:
                this.height = (Double)value;
                break;

            case 2:
                this.bgColor = (Long)value;
                break;

            case 3:
                this.imageData = (ByteBuffer)value;
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

        VisualizeImageClassbreakResponse that = (VisualizeImageClassbreakResponse)obj;

        return ( ( (Double)this.width ).equals( (Double)that.width )
                 && ( (Double)this.height ).equals( (Double)that.height )
                 && ( this.bgColor == that.bgColor )
                 && this.imageData.equals( that.imageData ) );
    }


    @Override
    public String toString() {
        GenericData gd = GenericData.get();
        StringBuilder builder = new StringBuilder();
        builder.append( "{" );
        builder.append( gd.toString( "width" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.width ) );
        builder.append( ", " );
        builder.append( gd.toString( "height" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.height ) );
        builder.append( ", " );
        builder.append( gd.toString( "bgColor" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.bgColor ) );
        builder.append( ", " );
        builder.append( gd.toString( "imageData" ) );
        builder.append( ": " );
        builder.append( gd.toString( this.imageData ) );
        builder.append( "}" );

        return builder.toString();
    }


    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = (31 * hashCode) + ((Double)this.width).hashCode();
        hashCode = (31 * hashCode) + ((Double)this.height).hashCode();
        hashCode = (31 * hashCode) + ((Long)this.bgColor).hashCode();
        hashCode = (31 * hashCode) + this.imageData.hashCode();
        return hashCode;
    }


}

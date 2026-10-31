package bin.mt.json;

import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;
import l.C17680;
import l.C2158;

/* JADX INFO: loaded from: classes.dex */
public abstract class JSONValue implements Serializable {
    public boolean isArray() {
        return false;
    }

    public boolean isBoolean() {
        return false;
    }

    public boolean isFalse() {
        return false;
    }

    public boolean isNull() {
        return false;
    }

    public boolean isNumber() {
        return false;
    }

    public boolean isObject() {
        return false;
    }

    public boolean isString() {
        return false;
    }

    public boolean isTrue() {
        return false;
    }

    public abstract void write(C2158 c2158);

    public JSONObject asObject() {
        throw new UnsupportedOperationException("Not an object: " + this);
    }

    public JSONArray asArray() {
        throw new UnsupportedOperationException("Not an array: " + this);
    }

    public int asInt() {
        throw new UnsupportedOperationException("Not a number: " + this);
    }

    public long asLong() {
        throw new UnsupportedOperationException("Not a number: " + this);
    }

    public float asFloat() {
        throw new UnsupportedOperationException("Not a number: " + this);
    }

    public double asDouble() {
        throw new UnsupportedOperationException("Not a number: " + this);
    }

    public String asString() {
        throw new UnsupportedOperationException("Not a string: " + this);
    }

    public boolean asBoolean() {
        throw new UnsupportedOperationException("Not a boolean: " + this);
    }

    public void writeTo(Writer writer) throws IOException {
        writeTo(writer, WriterConfig.MINIMAL);
    }

    public void writeTo(Writer writer, WriterConfig writerConfig) throws IOException {
        if (writer == null) {
            throw new NullPointerException("writer is null");
        }
        if (writerConfig == null) {
            throw new NullPointerException("config is null");
        }
        C17680 c17680 = new C17680(writer, 128);
        write(writerConfig.createWriter(c17680));
        c17680.flush();
    }

    public String toString() {
        return toString(WriterConfig.MINIMAL);
    }

    public String toString(WriterConfig writerConfig) {
        StringWriter stringWriter = new StringWriter();
        try {
            writeTo(stringWriter, writerConfig);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }
}

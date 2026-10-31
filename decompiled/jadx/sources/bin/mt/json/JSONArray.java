package bin.mt.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.C10353;
import l.C12469;
import l.C20195;
import l.C2158;

/* JADX INFO: loaded from: classes.dex */
public class JSONArray extends JSONValue implements Iterable {
    public final List values;

    @Override // bin.mt.json.JSONValue
    public JSONArray asArray() {
        return this;
    }

    @Override // bin.mt.json.JSONValue
    public boolean isArray() {
        return true;
    }

    public JSONArray() {
        this.values = new ArrayList();
    }

    public JSONArray(int i) {
        this.values = new ArrayList(i);
    }

    public JSONArray(String str) {
        this();
        if (str == null) {
            throw new NullPointerException("source is null");
        }
        new JSONParser(new C12469()).parseArray(this, str);
    }

    public JSONArray(JSONArray jSONArray) {
        this(jSONArray, false);
    }

    public JSONArray(JSONArray jSONArray, boolean z) {
        if (jSONArray == null) {
            throw new NullPointerException("array is null");
        }
        if (z) {
            this.values = C20195.unmodifiableList(jSONArray.values);
        } else {
            this.values = new ArrayList(jSONArray.values);
        }
    }

    public static JSONArray unmodifiableArray(JSONArray jSONArray) {
        return new JSONArray(jSONArray, true);
    }

    public JSONArray add(int i) {
        this.values.add(JSON.value(i));
        return this;
    }

    public JSONArray add(long j) {
        this.values.add(JSON.value(j));
        return this;
    }

    public JSONArray add(float f) {
        this.values.add(JSON.value(f));
        return this;
    }

    public JSONArray add(double d) {
        this.values.add(JSON.value(d));
        return this;
    }

    public JSONArray add(boolean z) {
        this.values.add(JSON.value(z));
        return this;
    }

    public JSONArray add(String str) {
        this.values.add(JSON.value(str));
        return this;
    }

    public JSONArray add(JSONValue jSONValue) {
        if (jSONValue == null) {
            throw new NullPointerException("value is null");
        }
        this.values.add(jSONValue);
        return this;
    }

    public JSONArray set(int i, int i2) {
        this.values.set(i, JSON.value(i2));
        return this;
    }

    public JSONArray set(int i, long j) {
        this.values.set(i, JSON.value(j));
        return this;
    }

    public JSONArray set(int i, float f) {
        this.values.set(i, JSON.value(f));
        return this;
    }

    public JSONArray set(int i, double d) {
        this.values.set(i, JSON.value(d));
        return this;
    }

    public JSONArray set(int i, boolean z) {
        this.values.set(i, JSON.value(z));
        return this;
    }

    public JSONArray set(int i, String str) {
        this.values.set(i, JSON.value(str));
        return this;
    }

    public JSONArray set(int i, JSONValue jSONValue) {
        if (jSONValue == null) {
            throw new NullPointerException("value is null");
        }
        this.values.set(i, jSONValue);
        return this;
    }

    public JSONArray remove(int i) {
        this.values.remove(i);
        return this;
    }

    public int size() {
        return this.values.size();
    }

    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    public JSONValue get(int i) {
        return (JSONValue) this.values.get(i);
    }

    public JSONObject getJSONObject(int i) {
        return get(i).asObject();
    }

    public JSONArray getJSONArray(int i) {
        return get(i).asArray();
    }

    public int getInt(int i) {
        return get(i).asInt();
    }

    public Integer getIntegerObject(int i) {
        JSONValue jSONValue = get(i);
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        return Integer.valueOf(jSONValue.asInt());
    }

    public long getLong(int i) {
        return get(i).asLong();
    }

    public Long getLongObject(int i) {
        JSONValue jSONValue = get(i);
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        return Long.valueOf(jSONValue.asLong());
    }

    public float getFloat(int i) {
        return get(i).asFloat();
    }

    public Float getFloatObject(int i) {
        JSONValue jSONValue = get(i);
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        return Float.valueOf(jSONValue.asFloat());
    }

    public double getDouble(int i) {
        return get(i).asDouble();
    }

    public Double getDoubleValue(int i) {
        JSONValue jSONValue = get(i);
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        return Double.valueOf(jSONValue.asDouble());
    }

    public boolean getBoolean(int i) {
        return get(i).asBoolean();
    }

    public Boolean getBooleanObject(int i) {
        JSONValue jSONValue = get(i);
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        return Boolean.valueOf(jSONValue.asBoolean());
    }

    public String getString(int i) {
        JSONValue jSONValue = get(i);
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        return jSONValue.asString();
    }

    public List values() {
        return C20195.unmodifiableList(this.values);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C10353(this, this.values.iterator());
    }

    @Override // bin.mt.json.JSONValue
    public void write(C2158 c2158) throws IOException {
        c2158.mo7119();
        Iterator it = iterator();
        if (it.hasNext()) {
            ((JSONValue) it.next()).write(c2158);
            while (it.hasNext()) {
                c2158.mo7122();
                ((JSONValue) it.next()).write(c2158);
            }
        }
        c2158.mo7117();
    }

    @Override // bin.mt.json.JSONValue
    public int hashCode() {
        return this.values.hashCode();
    }

    @Override // bin.mt.json.JSONValue
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.values.equals(((JSONArray) obj).values);
        }
        return false;
    }
}

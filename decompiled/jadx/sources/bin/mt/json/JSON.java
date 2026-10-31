package bin.mt.json;

import java.io.Reader;
import l.C11764;
import l.C12469;
import l.C15472;
import l.C6119;
import l.C7530;

/* JADX INFO: loaded from: classes.dex */
public final class JSON {
    public static final JSONValue NULL = new C6119("null");
    public static final JSONValue TRUE = new C6119("true");
    public static final JSONValue FALSE = new C6119("false");

    public static JSONValue value(int i) {
        return new C11764(Integer.toString(i, 10));
    }

    public static JSONValue value(long j) {
        return new C11764(Long.toString(j, 10));
    }

    public static JSONValue value(float f) {
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw new IllegalArgumentException("Infinite and NaN values not permitted in JSON");
        }
        return new C11764(cutOffPointZero(Float.toString(f)));
    }

    public static JSONValue value(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Infinite and NaN values not permitted in JSON");
        }
        return new C11764(cutOffPointZero(Double.toString(d)));
    }

    public static JSONValue value(String str) {
        return str == null ? NULL : new C7530(str);
    }

    public static JSONValue value(boolean z) {
        return z ? TRUE : FALSE;
    }

    public static JSONArray array() {
        return new JSONArray();
    }

    public static JSONArray array(int... iArr) {
        if (iArr == null) {
            throw new NullPointerException("values is null");
        }
        JSONArray jSONArray = new JSONArray();
        for (int i : iArr) {
            jSONArray.add(i);
        }
        return jSONArray;
    }

    public static JSONArray array(long... jArr) {
        if (jArr == null) {
            throw new NullPointerException("values is null");
        }
        JSONArray jSONArray = new JSONArray();
        for (long j : jArr) {
            jSONArray.add(j);
        }
        return jSONArray;
    }

    public static JSONArray array(float... fArr) {
        if (fArr == null) {
            throw new NullPointerException("values is null");
        }
        JSONArray jSONArray = new JSONArray();
        for (float f : fArr) {
            jSONArray.add(f);
        }
        return jSONArray;
    }

    public static JSONArray array(double... dArr) {
        if (dArr == null) {
            throw new NullPointerException("values is null");
        }
        JSONArray jSONArray = new JSONArray();
        for (double d : dArr) {
            jSONArray.add(d);
        }
        return jSONArray;
    }

    public static JSONArray array(boolean... zArr) {
        if (zArr == null) {
            throw new NullPointerException("values is null");
        }
        JSONArray jSONArray = new JSONArray();
        for (boolean z : zArr) {
            jSONArray.add(z);
        }
        return jSONArray;
    }

    public static JSONArray array(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("values is null");
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.add(str);
        }
        return jSONArray;
    }

    public static JSONObject object() {
        return new JSONObject();
    }

    public static JSONValue parse(String str) {
        if (str == null) {
            throw new NullPointerException("string is null");
        }
        C12469 c12469 = new C12469();
        new JSONParser(c12469).parse(str);
        return c12469.m30629();
    }

    public static JSONValue parse(Reader reader) {
        if (reader == null) {
            throw new NullPointerException("reader is null");
        }
        C12469 c12469 = new C12469();
        new JSONParser(c12469).parse(reader);
        return c12469.m30629();
    }

    public static String cutOffPointZero(String str) {
        return str.endsWith(".0") ? C15472.m36561(2, 0, str) : str;
    }
}

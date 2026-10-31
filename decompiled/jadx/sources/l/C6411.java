package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜ֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7B0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6411 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m17736(C15996 c15996) {
        return m17734(C17140.m40239(c15996));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m17734(String str) {
        try {
            return new JSONObject(str);
        } catch (RuntimeException e) {
            throw m17739(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m17735(Map map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    jSONObject.add((String) entry.getKey(), m17737(entry.getValue()));
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONValue m17737(Object obj) {
        if (obj == null) {
            return JSON.NULL;
        }
        if (obj instanceof JSONValue) {
            return (JSONValue) obj;
        }
        if (obj instanceof String) {
            return JSON.value((String) obj);
        }
        if (obj instanceof Boolean) {
            return JSON.value(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Integer) {
            return JSON.value(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return JSON.value(((Long) obj).longValue());
        }
        if (obj instanceof Short) {
            return JSON.value(((Short) obj).intValue());
        }
        if (obj instanceof Byte) {
            return JSON.value(((Byte) obj).intValue());
        }
        if (obj instanceof Float) {
            return JSON.value(((Float) obj).floatValue());
        }
        if (obj instanceof Double) {
            return JSON.value(((Double) obj).doubleValue());
        }
        if (obj instanceof BigInteger) {
            BigInteger bigInteger = (BigInteger) obj;
            if (bigInteger.bitLength() <= 63) {
                return JSON.value(bigInteger.longValue());
            }
            throw new ArithmeticException("BigInteger out of long range");
        }
        if (obj instanceof BigDecimal) {
            return JSON.value(((BigDecimal) obj).doubleValue());
        }
        if (obj instanceof Map) {
            return m17735((Map) obj);
        }
        if (!(obj instanceof Iterable)) {
            if (!(obj instanceof C14730)) {
                throw new IllegalArgumentException(C3200.m9832(obj, "Unsupported JSON value type: "));
            }
            C14730 c14730 = (C14730) obj;
            return new JSONObject().add("mode", c14730.f44982).add("cacheKey", c14730.f44981);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            jSONArray.add(m17737(it.next()));
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m17742(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getString(str);
        } catch (RuntimeException e) {
            throw m17739(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m17738(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("paths");
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                try {
                    arrayList.add(jSONArray.getString(i));
                } catch (RuntimeException e) {
                    throw m17739(e);
                }
            }
            return arrayList;
        } catch (RuntimeException e2) {
            throw m17739(e2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17740(JSONObject jSONObject, String str) {
        try {
            Boolean booleanObject = jSONObject.getBooleanObject(str);
            if (booleanObject == null) {
                return false;
            }
            return booleanObject.booleanValue();
        } catch (RuntimeException e) {
            throw m17739(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m17741(JSONObject jSONObject, String str) {
        try {
            Long longObject = jSONObject.getLongObject(str);
            if (longObject == null) {
                return 0L;
            }
            return longObject.longValue();
        } catch (RuntimeException e) {
            throw m17739(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23344 m17739(RuntimeException runtimeException) {
        return runtimeException instanceof C23344 ? (C23344) runtimeException : new C23344(runtimeException);
    }
}

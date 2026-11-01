package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜ֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7B0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8461 {
    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m19683(C17571 c17571) {
        return m19681(C18658.m42484(c17571));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m19681(String str) {
        try {
            return new JSONObject(str);
        } catch (RuntimeException e) {
            throw m19686(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m19682(Map map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    jSONObject.add((String) entry.getKey(), m19684(entry.getValue()));
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONValue m19684(Object obj) {
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
            return m19682((Map) obj);
        }
        if (!(obj instanceof Iterable)) {
            if (!(obj instanceof C16368)) {
                throw new IllegalArgumentException(C5410.m11877(obj, "Unsupported JSON value type: "));
            }
            C16368 c16368 = (C16368) obj;
            return new JSONObject().add("mode", c16368.f48095).add("cacheKey", c16368.f48094);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            jSONArray.add(m19684(it.next()));
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m19689(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getString(str);
        } catch (RuntimeException e) {
            throw m19686(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m19685(JSONObject jSONObject) {
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
                    throw m19686(e);
                }
            }
            return arrayList;
        } catch (RuntimeException e2) {
            throw m19686(e2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m19687(JSONObject jSONObject, String str) {
        try {
            Boolean booleanObject = jSONObject.getBooleanObject(str);
            if (booleanObject == null) {
                return false;
            }
            return booleanObject.booleanValue();
        } catch (RuntimeException e) {
            throw m19686(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m19688(JSONObject jSONObject, String str) {
        try {
            Long longObject = jSONObject.getLongObject(str);
            if (longObject == null) {
                return 0L;
            }
            return longObject.longValue();
        } catch (RuntimeException e) {
            throw m19686(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24554 m19686(RuntimeException runtimeException) {
        return runtimeException instanceof C24554 ? (C24554) runtimeException : new C24554(runtimeException);
    }
}

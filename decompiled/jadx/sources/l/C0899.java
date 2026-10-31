package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.y.c;
import java.math.BigDecimal;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۙ᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0899 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m3249(Context context) {
        if (!C3993.f12656) {
            throw new RuntimeException("SDK Need Init First!");
        }
        C0464 c0464 = C19516.f63076;
        Context applicationContext = context.getApplicationContext();
        synchronized (c0464) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot run on MainThread");
            }
            if (c0464.f2028 != null) {
                try {
                    return c0464.m2056(applicationContext);
                } catch (RemoteException unused) {
                    return "";
                }
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
            intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
            if (applicationContext.bindService(intent, c0464.f2031, 1)) {
                synchronized (c0464.f2032) {
                    try {
                        c0464.f2032.wait(c.a);
                    } catch (InterruptedException unused2) {
                    }
                }
            }
            if (c0464.f2028 == null) {
                return "";
            }
            try {
                return c0464.m2056(applicationContext);
            } catch (RemoteException unused3) {
                return "";
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m3247(Iterable iterable) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            jSONArrayArray.add((String) it.next());
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m3246(JSONArray jSONArray) {
        return jSONArray == null ? JSON.array() : new JSONArray(jSONArray);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static JSONValue m3255(JSONValue jSONValue) {
        return (jSONValue == null || jSONValue.isNull()) ? JSON.NULL : jSONValue;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m3253(JSONValue jSONValue) {
        return new BigDecimal(jSONValue.toString()).intValueExact();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONValue m3248(JSONObject jSONObject) {
        if (jSONObject == null) {
            return JSON.NULL;
        }
        return JSON.object().add("hasMore", jSONObject.getBoolean("hasMore", false)).add("nextCursor", jSONObject.getString("nextCursor", null)).add("returnedCount", jSONObject.getInt("returnedCount", 0)).add("limitMax", jSONObject.getInt("limitMax", 0)).add("totalAvailableCount", m3255(jSONObject.get("totalAvailableCount")));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m3250(JSONValue jSONValue) {
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        return jSONValue.isString() ? jSONValue.asString() : jSONValue.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final boolean m3251(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static JSONValue m3254(JSONValue jSONValue) {
        if (jSONValue == null || jSONValue.isNull()) {
            return JSON.NULL;
        }
        if (jSONValue.isString()) {
            return JSON.value(jSONValue.asString());
        }
        if (jSONValue.isObject()) {
            JSONObject jSONObjectAsObject = jSONValue.asObject();
            String string = jSONObjectAsObject.getString("kind", null);
            String string2 = jSONObjectAsObject.getString("target", null);
            if (string == null || string2 == null) {
                return JSON.NULL;
            }
            return JSON.value(string + ':' + string2);
        }
        return JSON.NULL;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final boolean m3252(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}

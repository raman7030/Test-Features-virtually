package p067l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.alipay.sdk.p010m.p058y.C0240c;
import java.math.BigDecimal;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۙ᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3223 {
    /* JADX INFO: renamed from: ֫ */
    public static String m5568(Context context) {
        if (!C6163.f15472) {
            throw new RuntimeException("SDK Need Init First!");
        }
        C2809 c2809 = C20916.f65696;
        Context applicationContext = context.getApplicationContext();
        synchronized (c2809) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot run on MainThread");
            }
            if (c2809.f4803 != null) {
                try {
                    return c2809.m4436(applicationContext);
                } catch (RemoteException unused) {
                    return "";
                }
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
            intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
            if (applicationContext.bindService(intent, c2809.f4806, 1)) {
                synchronized (c2809.f4807) {
                    try {
                        c2809.f4807.wait(C0240c.f1145a);
                    } catch (InterruptedException unused2) {
                    }
                }
            }
            if (c2809.f4803 == null) {
                return "";
            }
            try {
                return c2809.m4436(applicationContext);
            } catch (RemoteException unused3) {
                return "";
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONArray m5566(Iterable iterable) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            jSONArrayArray.add((String) it.next());
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONArray m5565(JSONArray jSONArray) {
        return jSONArray == null ? JSON.array() : new JSONArray(jSONArray);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static JSONValue m5574(JSONValue jSONValue) {
        return (jSONValue == null || jSONValue.isNull()) ? JSON.NULL : jSONValue;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m5572(JSONValue jSONValue) {
        return new BigDecimal(jSONValue.toString()).intValueExact();
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONValue m5567(JSONObject jSONObject) {
        if (jSONObject == null) {
            return JSON.NULL;
        }
        return JSON.object().add("hasMore", jSONObject.getBoolean("hasMore", false)).add("nextCursor", jSONObject.getString("nextCursor", null)).add("returnedCount", jSONObject.getInt("returnedCount", 0)).add("limitMax", jSONObject.getInt("limitMax", 0)).add("totalAvailableCount", m5574(jSONObject.get("totalAvailableCount")));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m5569(JSONValue jSONValue) {
        if (jSONValue == null || jSONValue.isNull()) {
            return null;
        }
        return jSONValue.isString() ? jSONValue.asString() : jSONValue.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static final boolean m5570(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* JADX INFO: renamed from: ܽ */
    public static JSONValue m5573(JSONValue jSONValue) {
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

    /* JADX INFO: renamed from: ֫ */
    public static final boolean m5571(char c, char c2, boolean z) {
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

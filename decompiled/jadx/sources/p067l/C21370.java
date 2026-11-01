package p067l;

import android.content.pm.Signature;
import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.C0708d;
import java.util.ArrayList;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩶ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V6WN */
/* JADX INFO: loaded from: classes4.dex */
public final class C21370 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m48415(int i) {
        if (65 <= i && i <= 90) {
            return true;
        }
        if (97 <= i && i <= 122) {
            return true;
        }
        if ((48 <= i && i <= 57) || i == 36 || i == 45 || i == 95) {
            return true;
        }
        if (161 <= i && i <= 8191) {
            return true;
        }
        if (8208 <= i && i <= 8231) {
            return true;
        }
        if (8240 <= i && i <= 55295) {
            return true;
        }
        if (57344 <= i && i < 65279) {
            return true;
        }
        if (65279 >= i || i > 65519) {
            return 65536 <= i && i <= 1114111;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m48416(int i) {
        switch (i) {
            case 1:
                return C0708d.f2599O;
            case 2:
                return ClassTransform.INTEGER;
            case 3:
                return ClassTransform.FLOAT;
            case 4:
                return "string";
            case 5:
                return "iso8601";
            case 6:
                return "true";
            case 7:
                return "false";
            case 8:
                return "null";
            case 9:
                return "new";
            case 10:
                return MotionUtils.EASING_TYPE_FORMAT_START;
            case 11:
                return MotionUtils.EASING_TYPE_FORMAT_END;
            case 12:
                return "{";
            case 13:
                return C0249l.f1198d;
            case 14:
                return "[";
            case 15:
                return "]";
            case 16:
                return ",";
            case 17:
                return ":";
            case 18:
                return "ident";
            case 19:
            default:
                return "Unknown";
            case 20:
                return "EOF";
            case 21:
                return "Set";
            case 22:
                return "TreeSet";
            case 23:
                return "undefined";
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m48408(int i, String str) {
        int length = str.length();
        if (i >= length) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        char cCharAt = "E".charAt(0);
        int i2 = length - 1;
        while (i <= i2) {
            if (!m48414(str.charAt(i), cCharAt)) {
                do {
                    i++;
                    if (i > i2) {
                        break;
                    }
                } while (!m48414(str.charAt(i), cCharAt));
            }
            if (i <= i2) {
                int i3 = i + 1;
                int i4 = i + 1;
                for (int i5 = 1; i3 < i4 && m48414(str.charAt(i3), "E".charAt(i5)); i5++) {
                    i3++;
                }
                if (i3 == i4) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Signature m48409(String str) {
        try {
            C19561 c19561 = new C19561(str);
            try {
                for (C5738 c5738 : c19561.m44469()) {
                    String name = c5738.getName();
                    if (name.startsWith("META-INF/") && (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC"))) {
                        Signature signature = new Signature(new C19588(c19561.m44452(c5738, (C20689) null)).m44505()[0].getEncoded());
                        c19561.close();
                        return signature;
                    }
                }
                c19561.close();
                return null;
            } catch (Throwable th) {
                try {
                    c19561.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m48411(C5276 c5276) {
        return m48412(c5276, JSON.NULL, c5276.f12407);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m48410(JSONObject jSONObject, JSONArray jSONArray) {
        return JSON.object().add("ok", true).add(AbstractC0213e.f989m, jSONObject).add(C0708d.f2599O, JSON.NULL).add("nextActions", C3223.m5565(jSONArray));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m48412(C5276 c5276, JSONValue jSONValue, JSONArray jSONArray) {
        String str;
        JSONObject jSONObjectAdd = JSON.object().add("code", c5276.f12413).add("message", c5276.getMessage()).add("severity", c5276.f12414).add("recoverable", c5276.f12410).add("retrySameArguments", c5276.f12409);
        JSONObject jSONObject = c5276.f12412;
        JSONObject jSONObjectM41996 = C18426.m41996(jSONObject, "badValue", C18426.m41996(jSONObject, "argument", jSONObjectAdd, "argument"), "badValue");
        JSONValue jSONValue2 = c5276.f12411;
        if (jSONValue2 == null) {
            str = null;
        } else if (jSONValue2.isNull()) {
            str = "null";
        } else if (jSONValue2.isString()) {
            str = "string";
        } else if (jSONValue2.isNumber()) {
            str = "number";
        } else if (jSONValue2.isBoolean()) {
            str = ClassTransform.BOOLEAN;
        } else if (jSONValue2.isArray()) {
            str = "array";
        } else {
            str = jSONValue2.isObject() ? "object" : "unknown";
        }
        JSONObject jSONObjectAdd2 = jSONObjectM41996.add("badValueType", str);
        JSONArray jSONArray2 = jSONObject.getJSONArray("allowedValues");
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray2 != null) {
            Iterator it = jSONArray2.iterator();
            while (it.hasNext()) {
                String strM5569 = C3223.m5569((JSONValue) it.next());
                if (strM5569 == null) {
                    strM5569 = "null";
                }
                jSONArrayArray.add(strM5569);
            }
        }
        JSONObject jSONObjectM41997 = C18426.m41996(jSONObject, "example", jSONObjectAdd2.add("allowedValues", jSONArrayArray), "example");
        if (jSONValue == null) {
            jSONValue = JSON.NULL;
        }
        return JSON.object().add("ok", false).add(AbstractC0213e.f989m, JSON.NULL).add(C0708d.f2599O, jSONObjectM41997.add("diagnostics", jSONValue)).add("nextActions", C3223.m5565(jSONArray));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m48413(C7965 c7965) {
        JSONArray jSONArrayArray = JSON.array();
        JSONArray jSONArrayArray2 = JSON.array();
        ArrayList<C11989> arrayList = c7965.f20938;
        String str = c7965.f20937;
        String str2 = c7965.f20939;
        for (C11989 c11989 : arrayList) {
            String strConcat = "resource:".concat(c11989.f33430);
            JSONArray jSONArrayArray3 = JSON.array();
            for (C13330 c13330 : c11989.f33431) {
                jSONArrayArray3.add(JSON.object().add("variant", c13330.f37435).add("targetVersion", c13330.f37434));
                jSONArrayArray2.add(JSON.object().add("locator", strConcat).add("variant", c13330.f37435));
            }
            jSONArrayArray.add(JSON.object().add("index", c11989.f33429).add("locator", strConcat).add("values", jSONArrayArray3));
        }
        return m48410(C9417.m21913("workspaceId", str2, "editSessionId", str).add("results", jSONArrayArray), JSON.array().add(C11982.m27418(C9417.m21913("workspaceId", str2, "editSessionId", str).add("reads", jSONArrayArray2).add("maxValueChars", 4096).add("maxValueXmlChars", 32768).add("maxItemsPerValue", 50).add("resolveDepth", 0), "mt_apk_resource_read", "inspect", "Read the newly added resource values")));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m48414(char c, char c2) {
        char upperCase;
        char upperCase2;
        if (c < 'a') {
            upperCase = c;
        } else {
            upperCase = c <= 'z' ? (char) (c - ' ') : Character.toUpperCase(c);
        }
        if (c2 < 'a') {
            upperCase2 = c2;
        } else {
            upperCase2 = c2 <= 'z' ? (char) (c2 - ' ') : Character.toUpperCase(c2);
        }
        return upperCase == upperCase2 || m48407(c) == m48407(c2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static char m48407(char c) {
        if (c < 'A') {
            return c;
        }
        if (c < 'a' || c > 'z') {
            return c <= 'Z' ? (char) (c + ' ') : Character.toLowerCase(c);
        }
        return c;
    }
}

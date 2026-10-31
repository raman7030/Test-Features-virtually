package l;

import android.content.pm.Signature;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩶ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V6WN */
/* JADX INFO: loaded from: classes4.dex */
public final class C19993 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46100(int i) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m46101(int i) {
        switch (i) {
            case 1:
                return d.O;
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
                return l.d;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m46093(int i, String str) {
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
            if (!m46099(str.charAt(i), cCharAt)) {
                do {
                    i++;
                    if (i > i2) {
                        break;
                    }
                } while (!m46099(str.charAt(i), cCharAt));
            }
            if (i <= i2) {
                int i3 = i + 1;
                int i4 = i + 1;
                for (int i5 = 1; i3 < i4 && m46099(str.charAt(i3), "E".charAt(i5)); i5++) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Signature m46094(String str) {
        try {
            C18090 c18090 = new C18090(str);
            try {
                for (C3545 c3545 : c18090.m42210()) {
                    String name = c3545.getName();
                    if (name.startsWith("META-INF/") && (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC"))) {
                        Signature signature = new Signature(new C18118(c18090.m42193(c3545, (C19277) null)).m42246()[0].getEncoded());
                        c18090.close();
                        return signature;
                    }
                }
                c18090.close();
                return null;
            } catch (Throwable th) {
                try {
                    c18090.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m46096(C3059 c3059) {
        return m46097(c3059, JSON.NULL, c3059.f9604);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m46095(JSONObject jSONObject, JSONArray jSONArray) {
        return JSON.object().add("ok", true).add(e.m, jSONObject).add(d.O, JSON.NULL).add("nextActions", C0899.m3246(jSONArray));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m46097(C3059 c3059, JSONValue jSONValue, JSONArray jSONArray) {
        String str;
        JSONObject jSONObjectAdd = JSON.object().add("code", c3059.f9610).add("message", c3059.getMessage()).add("severity", c3059.f9611).add("recoverable", c3059.f9607).add("retrySameArguments", c3059.f9606);
        JSONObject jSONObject = c3059.f9609;
        JSONObject jSONObjectM39755 = C16895.m39755(jSONObject, "badValue", C16895.m39755(jSONObject, "argument", jSONObjectAdd, "argument"), "badValue");
        JSONValue jSONValue2 = c3059.f9608;
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
        JSONObject jSONObjectAdd2 = jSONObjectM39755.add("badValueType", str);
        JSONArray jSONArray2 = jSONObject.getJSONArray("allowedValues");
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray2 != null) {
            Iterator it = jSONArray2.iterator();
            while (it.hasNext()) {
                String strM3250 = C0899.m3250((JSONValue) it.next());
                if (strM3250 == null) {
                    strM3250 = "null";
                }
                jSONArrayArray.add(strM3250);
            }
        }
        JSONObject jSONObjectM39756 = C16895.m39755(jSONObject, "example", jSONObjectAdd2.add("allowedValues", jSONArrayArray), "example");
        if (jSONValue == null) {
            jSONValue = JSON.NULL;
        }
        return JSON.object().add("ok", false).add(e.m, JSON.NULL).add(d.O, jSONObjectM39756.add("diagnostics", jSONValue)).add("nextActions", C0899.m3246(jSONArray));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m46098(C5889 c5889) {
        JSONArray jSONArrayArray = JSON.array();
        JSONArray jSONArrayArray2 = JSON.array();
        ArrayList<C10123> arrayList = c5889.f18083;
        String str = c5889.f18082;
        String str2 = c5889.f18084;
        for (C10123 c10123 : arrayList) {
            String strConcat = "resource:".concat(c10123.f30468);
            JSONArray jSONArrayArray3 = JSON.array();
            for (C11534 c11534 : c10123.f30469) {
                jSONArrayArray3.add(JSON.object().add("variant", c11534.f34438).add("targetVersion", c11534.f34437));
                jSONArrayArray2.add(JSON.object().add("locator", strConcat).add("variant", c11534.f34438));
            }
            jSONArrayArray.add(JSON.object().add("index", c10123.f30467).add("locator", strConcat).add("values", jSONArrayArray3));
        }
        return m46095(C7416.m19939("workspaceId", str2, "editSessionId", str).add("results", jSONArrayArray), JSON.array().add(C10115.m25398(C7416.m19939("workspaceId", str2, "editSessionId", str).add("reads", jSONArrayArray2).add("maxValueChars", 4096).add("maxValueXmlChars", 32768).add("maxItemsPerValue", 50).add("resolveDepth", 0), "mt_apk_resource_read", "inspect", "Read the newly added resource values")));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46099(char c, char c2) {
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
        return upperCase == upperCase2 || m46092(c) == m46092(c2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static char m46092(char c) {
        if (c < 'A') {
            return c;
        }
        if (c < 'a' || c > 'z') {
            return c <= 'Z' ? (char) (c + ' ') : Character.toLowerCase(c);
        }
        return c;
    }
}

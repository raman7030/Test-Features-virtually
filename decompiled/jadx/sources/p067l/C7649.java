package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۚ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6KS */
/* JADX INFO: loaded from: classes2.dex */
public final class C7649 {
    /* JADX INFO: renamed from: ֫ */
    public static void m17631(JSONObject jSONObject, String... strArr) throws C5276 {
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        HashSet hashSet2 = new HashSet();
        for (String str : jSONObject.names()) {
            if (!hashSet.contains(str) || !hashSet2.add(str)) {
                throw m17628(jSONObject.get(str), str, "Unexpected or repeated argument");
            }
        }
        for (String str2 : strArr) {
            if (!hashSet2.contains(str2)) {
                throw m17628((JSONValue) null, str2, "Missing argument");
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m17634(JSONObject jSONObject, String str) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m17628(jSONValue, str, "Expected a string");
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m17633(JSONObject jSONObject, String str) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isBoolean()) {
            throw m17628(jSONValue, str, "Expected a boolean");
        }
        return jSONValue.asBoolean();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m17624(JSONObject jSONObject, String str, int i, int i2) throws C5276 {
        int iM5572;
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue != null) {
            try {
                if (jSONValue.isNumber() && (iM5572 = C3223.m5572(jSONValue)) >= i && iM5572 <= i2) {
                    return iM5572;
                }
            } catch (ArithmeticException | NumberFormatException unused) {
            }
        }
        throw m17628(jSONValue, str, "Integer is outside the allowed range");
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONArray m17625(JSONObject jSONObject, String str) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isArray() || jSONValue.asArray().isEmpty()) {
            throw m17628(jSONValue, str, "Expected a non-empty array");
        }
        return jSONValue.asArray();
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m17626(String str, JSONValue jSONValue) throws C5276 {
        if (jSONValue == null || !jSONValue.isObject()) {
            throw m17628(jSONValue, str, "Expected an object");
        }
        return jSONValue.asObject();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17632(String str, String str2, boolean z) throws C5276 {
        if (str.isEmpty()) {
            if (!z) {
                throw m17628(JSON.value(str), str2, "The ZIP root cannot be modified");
            }
            return;
        }
        if (str.indexOf(92) < 0) {
            if (str.indexOf(0) < 0) {
                int i = str.charAt(0) == '/' ? 1 : 0;
                int i2 = i;
                while (i <= str.length()) {
                    if (i >= str.length() || str.charAt(i) == '/') {
                        if (i == str.length() && i2 == i) {
                            return;
                        }
                        if (str.substring(i2, i).isEmpty()) {
                            throw m17628(JSON.value(str), str2, "ZIP path contains an empty segment");
                        }
                        i2 = i + 1;
                    }
                    i++;
                }
                return;
            }
        }
        throw m17628(JSON.value(str), str2, "Expected a ZIP entry name using forward slashes without NUL");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14362 m17629(C19247 c19247, String str, boolean z) throws C5276 {
        C14362 c14362M43858 = c19247.m43858(str);
        EnumC5645 enumC5645M32962 = c14362M43858.m32962();
        if (enumC5645M32962 == EnumC5645.MISSING) {
            throw m17627(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "FILE_NOT_FOUND", "The source path does not exist");
        }
        if (enumC5645M32962 == EnumC5645.LINK || enumC5645M32962 == EnumC5645.OTHER) {
            throw C5276.m11411("FILE_UNSUPPORTED_TYPE", "Links and special nodes cannot be used as ZIP content sources", "fatal", null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str));
        }
        if (enumC5645M32962 == (z ? EnumC5645.DIRECTORY : EnumC5645.REGULAR)) {
            return c14362M43858;
        }
        throw m17627(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "ZIP_PATH_TYPE_MISMATCH", "The path suffix does not match the source type");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m17628(JSONValue jSONValue, String str, String str2) {
        return C5276.m11406(str2, str, jSONValue, JSON.array(), (JSONObject) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m17627(JSONObject jSONObject, String str, String str2) {
        return C5276.m11407(str, str2, "warning", (JSONArray) null, jSONObject);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17630() throws C5276 {
        if (Thread.currentThread().isInterrupted()) {
            throw m17627(JSON.object(), "ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled");
        }
    }
}

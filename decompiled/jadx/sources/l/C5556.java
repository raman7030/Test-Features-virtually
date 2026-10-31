package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۚ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6KS */
/* JADX INFO: loaded from: classes2.dex */
public final class C5556 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15717(JSONObject jSONObject, String... strArr) throws C3059 {
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        HashSet hashSet2 = new HashSet();
        for (String str : jSONObject.names()) {
            if (!hashSet.contains(str) || !hashSet2.add(str)) {
                throw m15714(jSONObject.get(str), str, "Unexpected or repeated argument");
            }
        }
        for (String str2 : strArr) {
            if (!hashSet2.contains(str2)) {
                throw m15714((JSONValue) null, str2, "Missing argument");
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m15720(JSONObject jSONObject, String str) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw m15714(jSONValue, str, "Expected a string");
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m15719(JSONObject jSONObject, String str) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isBoolean()) {
            throw m15714(jSONValue, str, "Expected a boolean");
        }
        return jSONValue.asBoolean();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m15710(JSONObject jSONObject, String str, int i, int i2) throws C3059 {
        int iM3253;
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue != null) {
            try {
                if (jSONValue.isNumber() && (iM3253 = C0899.m3253(jSONValue)) >= i && iM3253 <= i2) {
                    return iM3253;
                }
            } catch (ArithmeticException | NumberFormatException unused) {
            }
        }
        throw m15714(jSONValue, str, "Integer is outside the allowed range");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m15711(JSONObject jSONObject, String str) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isArray() || jSONValue.asArray().isEmpty()) {
            throw m15714(jSONValue, str, "Expected a non-empty array");
        }
        return jSONValue.asArray();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m15712(String str, JSONValue jSONValue) throws C3059 {
        if (jSONValue == null || !jSONValue.isObject()) {
            throw m15714(jSONValue, str, "Expected an object");
        }
        return jSONValue.asObject();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15718(String str, String str2, boolean z) throws C3059 {
        if (str.isEmpty()) {
            if (!z) {
                throw m15714(JSON.value(str), str2, "The ZIP root cannot be modified");
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
                            throw m15714(JSON.value(str), str2, "ZIP path contains an empty segment");
                        }
                        i2 = i + 1;
                    }
                    i++;
                }
                return;
            }
        }
        throw m15714(JSON.value(str), str2, "Expected a ZIP entry name using forward slashes without NUL");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12619 m15715(C17760 c17760, String str, boolean z) throws C3059 {
        C12619 c12619M41613 = c17760.m41613(str);
        EnumC3447 enumC3447M30885 = c12619M41613.m30885();
        if (enumC3447M30885 == EnumC3447.MISSING) {
            throw m15713(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "FILE_NOT_FOUND", "The source path does not exist");
        }
        if (enumC3447M30885 == EnumC3447.LINK || enumC3447M30885 == EnumC3447.OTHER) {
            throw C3059.m9369("FILE_UNSUPPORTED_TYPE", "Links and special nodes cannot be used as ZIP content sources", "fatal", null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str));
        }
        if (enumC3447M30885 == (z ? EnumC3447.DIRECTORY : EnumC3447.REGULAR)) {
            return c12619M41613;
        }
        throw m15713(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "ZIP_PATH_TYPE_MISMATCH", "The path suffix does not match the source type");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m15714(JSONValue jSONValue, String str, String str2) {
        return C3059.m9364(str2, str, jSONValue, JSON.array(), (JSONObject) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m15713(JSONObject jSONObject, String str, String str2) {
        return C3059.m9365(str, str2, "warning", (JSONArray) null, jSONObject);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15716() throws C3059 {
        if (Thread.currentThread().isInterrupted()) {
            throw m15713(JSON.object(), "ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled");
        }
    }
}

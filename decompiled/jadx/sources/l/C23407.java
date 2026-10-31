package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.᩻ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I764 */
/* JADX INFO: loaded from: classes.dex */
public final class C23407 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m51854(String str) {
        try {
            return JSON.parse(str).asObject();
        } catch (RuntimeException e) {
            throw new C23092("Unable to parse radare2 native response", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m51853(JSONObject jSONObject, String str, long j) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null) {
            return j;
        }
        if (!jSONValue.isNumber()) {
            return jSONValue.asLong();
        }
        String string = jSONValue.toString();
        try {
            return Long.parseLong(string, 10);
        } catch (NumberFormatException e) {
            try {
                return C23202.m51497(string);
            } catch (NumberFormatException unused) {
                throw e;
            }
        }
    }
}

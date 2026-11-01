package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;

/* JADX INFO: renamed from: l.᩻ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I764 */
/* JADX INFO: loaded from: classes.dex */
public final class C24614 {
    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m54252(String str) {
        try {
            return JSON.parse(str).asObject();
        } catch (RuntimeException e) {
            throw new C24315("Unable to parse radare2 native response", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m54251(JSONObject jSONObject, String str, long j) {
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
                return C24420.m53893(string);
            } catch (NumberFormatException unused) {
                throw e;
            }
        }
    }
}

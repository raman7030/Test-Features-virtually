package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6M7 */
/* JADX INFO: loaded from: classes.dex */
public final class C23682 {
    /* JADX INFO: renamed from: ֫ */
    public static int m52688(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11071. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫ */
    public static p067l.C17154 m52691(bin.p000mt.json.JSONObject r37) {
        /*
            Method dump skipped, instruction units count: 1107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C23682.m52691(bin.mt.json.JSONObject):l.ܶ᩻ۜ");
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONArray m52689(JSONObject jSONObject, String str, String str2) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isArray() || jSONValue.asArray().size() == 0) {
            throw m52690(jSONValue, "Expected a non-empty array", str2);
        }
        return jSONValue.asArray();
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m52693(JSONObject jSONObject, String str, String str2) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString() || jSONValue.asString().trim().isEmpty()) {
            throw m52690(jSONValue, "Expected a non-empty string", str2);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52692(JSONObject jSONObject, String str, String... strArr) throws C5276 {
        List listAsList = Arrays.asList(strArr);
        for (String str2 : jSONObject.names()) {
            if (!listAsList.contains(str2)) {
                throw m52690(jSONObject.get(str2), "Invalid mt_apk_resource_add argument", str.isEmpty() ? str2 : C24104.m53357(str, ".", str2));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m52690(JSONValue jSONValue, String str, String str2) {
        return C5276.m11406(str, str2, jSONValue, JSON.array(), (JSONObject) null);
    }
}

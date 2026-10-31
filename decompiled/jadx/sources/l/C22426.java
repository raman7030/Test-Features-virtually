package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6M7 */
/* JADX INFO: loaded from: classes.dex */
public final class C22426 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m50347(char c) {
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static l.C15557 m50350(bin.mt.json.JSONObject r37) {
        /*
            Method dump skipped, instruction units count: 1107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22426.m50350(bin.mt.json.JSONObject):l.ܶ᩻ۜ");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m50348(JSONObject jSONObject, String str, String str2) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isArray() || jSONValue.asArray().size() == 0) {
            throw m50349(jSONValue, "Expected a non-empty array", str2);
        }
        return jSONValue.asArray();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m50352(JSONObject jSONObject, String str, String str2) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString() || jSONValue.asString().trim().isEmpty()) {
            throw m50349(jSONValue, "Expected a non-empty string", str2);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50351(JSONObject jSONObject, String str, String... strArr) throws C3059 {
        List listAsList = Arrays.asList(strArr);
        for (String str2 : jSONObject.names()) {
            if (!listAsList.contains(str2)) {
                throw m50349(jSONObject.get(str2), "Invalid mt_apk_resource_add argument", str.isEmpty() ? str2 : C22870.m50967(str, ".", str2));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m50349(JSONValue jSONValue, String str, String str2) {
        return C3059.m9364(str, str2, jSONValue, JSON.array(), (JSONObject) null);
    }
}

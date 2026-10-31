package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۤۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E79W */
/* JADX INFO: loaded from: classes3.dex */
public final class C10115 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m25400(C12936 c12936) {
        return m25399(c12936.f38804, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m25397(JSONObject jSONObject) {
        return m25399(jSONObject, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m25398(JSONObject jSONObject, String str, String str2, String str3) {
        return C7416.m19939("tool", str, "purpose", str2).add("description", str3).add("arguments", jSONObject);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m25399(JSONObject jSONObject, boolean z) {
        return JSON.object().add("content", JSON.array().add(JSON.object().add("type", TextBundle.TEXT_ENTRY).add(TextBundle.TEXT_ENTRY, jSONObject.toString()))).add("structuredContent", jSONObject).add("isError", z);
    }
}

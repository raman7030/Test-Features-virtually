package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۤۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E79W */
/* JADX INFO: loaded from: classes3.dex */
public final class C11982 {
    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m27420(C14663 c14663) {
        return m27419(c14663.f41848, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m27417(JSONObject jSONObject) {
        return m27419(jSONObject, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m27418(JSONObject jSONObject, String str, String str2, String str3) {
        return C9417.m21913("tool", str, "purpose", str2).add("description", str3).add("arguments", jSONObject);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m27419(JSONObject jSONObject, boolean z) {
        return JSON.object().add("content", JSON.array().add(JSON.object().add("type", TextBundle.TEXT_ENTRY).add(TextBundle.TEXT_ENTRY, jSONObject.toString()))).add("structuredContent", jSONObject).add("isError", z);
    }
}

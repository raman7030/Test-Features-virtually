package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;

/* JADX INFO: renamed from: l.ۗۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z79J */
/* JADX INFO: loaded from: classes2.dex */
public final class C5276 extends Exception {

    /* JADX INFO: renamed from: ۗ */
    public final JSONArray f12407;

    /* JADX INFO: renamed from: ۙ */
    public final boolean f12408;

    /* JADX INFO: renamed from: ۤ */
    public final boolean f12409;

    /* JADX INFO: renamed from: ۫ */
    public final boolean f12410;

    /* JADX INFO: renamed from: ۬ */
    public final JSONValue f12411;

    /* JADX INFO: renamed from: ᩶ */
    public final JSONObject f12412;

    /* JADX INFO: renamed from: ᩸ */
    public final String f12413;

    /* JADX INFO: renamed from: ᩹ */
    public final String f12414;

    public C5276(String str, boolean z, String str2, boolean z2, boolean z3, String str3, JSONArray jSONArray, JSONObject jSONObject, JSONValue jSONValue) {
        super(str);
        this.f12408 = z;
        this.f12413 = str2;
        this.f12410 = z2;
        this.f12409 = z3;
        this.f12414 = str3;
        this.f12407 = jSONArray == null ? JSON.array() : jSONArray;
        this.f12412 = jSONObject == null ? JSON.object() : jSONObject;
        this.f12411 = jSONValue;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m11406(String str, String str2, JSONValue jSONValue, JSONArray jSONArray, JSONObject jSONObject) {
        JSONObject jSONObjectAdd = JSON.object().add("argument", str2).add("badValue", jSONValue == null ? JSON.NULL : jSONValue);
        if (jSONArray == null) {
            jSONArray = JSON.array();
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("allowedValues", jSONArray);
        if (jSONObject == null) {
            jSONObject = JSON.object();
        }
        return new C5276(str, true, "INVALID_ARGUMENT", true, false, "warning", null, jSONObjectAdd2.add("example", jSONObject), jSONValue);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5276 m11412(JSONArray jSONArray) {
        return new C5276(getMessage(), this.f12408, this.f12413, this.f12410, this.f12409, this.f12414, jSONArray, this.f12412, this.f12411);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m11410(String str, String str2) {
        return m11408(str, str2, false, false, m11402(str), null, null);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m11409(JSONArray jSONArray, String str, String str2, String str3) {
        return m11408(str, str2, false, false, str3, jSONArray, null);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m11411(String str, String str2, String str3, JSONArray jSONArray, JSONObject jSONObject) {
        return m11408(str, str2, false, false, str3, jSONArray, jSONObject);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m11405(String str, String str2) {
        return m11408(str, str2, true, false, m11402(str), null, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m11403(JSONArray jSONArray, String str, String str2, String str3) {
        return m11408(str, str2, true, false, str3, jSONArray, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m11407(String str, String str2, String str3, JSONArray jSONArray, JSONObject jSONObject) {
        return m11408(str, str2, true, false, str3, jSONArray, jSONObject);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m11404(JSONObject jSONObject) {
        return m11408("FILE_SEARCH_CANCELED", "Text search canceled. Retry the same arguments after cancellation has cleared.", true, true, "warning", null, jSONObject);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m11408(String str, String str2, boolean z, boolean z2, String str3, JSONArray jSONArray, JSONObject jSONObject) {
        return new C5276(str2, false, str, z, z2, str3, jSONArray, jSONObject, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m11402(String str) {
        return ("PATH_NOT_FOUND".equals(str) || "APK_CHANGED".equals(str) || "ENTRY_READ_FAILED".equals(str) || "AXML_DECODE_FAILED".equals(str) || "DEX_READ_FAILED".equals(str) || "SMALI_READ_FAILED".equals(str) || "RESOURCE_TABLE_PARSE_FAILED".equals(str)) ? "warning" : "fatal";
    }
}

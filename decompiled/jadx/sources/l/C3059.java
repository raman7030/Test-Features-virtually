package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.ۗۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z79J */
/* JADX INFO: loaded from: classes2.dex */
public final class C3059 extends Exception {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final JSONArray f9604;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f9605;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f9606;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f9607;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final JSONValue f9608;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final JSONObject f9609;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f9610;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f9611;

    public C3059(String str, boolean z, String str2, boolean z2, boolean z3, String str3, JSONArray jSONArray, JSONObject jSONObject, JSONValue jSONValue) {
        super(str);
        this.f9605 = z;
        this.f9610 = str2;
        this.f9607 = z2;
        this.f9606 = z3;
        this.f9611 = str3;
        this.f9604 = jSONArray == null ? JSON.array() : jSONArray;
        this.f9609 = jSONObject == null ? JSON.object() : jSONObject;
        this.f9608 = jSONValue;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m9364(String str, String str2, JSONValue jSONValue, JSONArray jSONArray, JSONObject jSONObject) {
        JSONObject jSONObjectAdd = JSON.object().add("argument", str2).add("badValue", jSONValue == null ? JSON.NULL : jSONValue);
        if (jSONArray == null) {
            jSONArray = JSON.array();
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("allowedValues", jSONArray);
        if (jSONObject == null) {
            jSONObject = JSON.object();
        }
        return new C3059(str, true, "INVALID_ARGUMENT", true, false, "warning", null, jSONObjectAdd2.add("example", jSONObject), jSONValue);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3059 m9370(JSONArray jSONArray) {
        return new C3059(getMessage(), this.f9605, this.f9610, this.f9607, this.f9606, this.f9611, jSONArray, this.f9609, this.f9608);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m9368(String str, String str2) {
        return m9366(str, str2, false, false, m9360(str), null, null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m9367(JSONArray jSONArray, String str, String str2, String str3) {
        return m9366(str, str2, false, false, str3, jSONArray, null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m9369(String str, String str2, String str3, JSONArray jSONArray, JSONObject jSONObject) {
        return m9366(str, str2, false, false, str3, jSONArray, jSONObject);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m9363(String str, String str2) {
        return m9366(str, str2, true, false, m9360(str), null, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m9361(JSONArray jSONArray, String str, String str2, String str3) {
        return m9366(str, str2, true, false, str3, jSONArray, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m9365(String str, String str2, String str3, JSONArray jSONArray, JSONObject jSONObject) {
        return m9366(str, str2, true, false, str3, jSONArray, jSONObject);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m9362(JSONObject jSONObject) {
        return m9366("FILE_SEARCH_CANCELED", "Text search canceled. Retry the same arguments after cancellation has cleared.", true, true, "warning", null, jSONObject);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m9366(String str, String str2, boolean z, boolean z2, String str3, JSONArray jSONArray, JSONObject jSONObject) {
        return new C3059(str2, false, str, z, z2, str3, jSONArray, jSONObject, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m9360(String str) {
        return ("PATH_NOT_FOUND".equals(str) || "APK_CHANGED".equals(str) || "ENTRY_READ_FAILED".equals(str) || "AXML_DECODE_FAILED".equals(str) || "DEX_READ_FAILED".equals(str) || "SMALI_READ_FAILED".equals(str) || "RESOURCE_TABLE_PARSE_FAILED".equals(str)) ? "warning" : "fatal";
    }
}

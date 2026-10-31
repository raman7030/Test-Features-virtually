package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ᩳۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes4.dex */
public final class C17763 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f54333;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f54334;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f54335;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f54336;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f54337;

    public C17763(JSONObject jSONObject) {
        this.f54337 = C23407.m51853(jSONObject, "sourceVirtualAddress", -1L);
        this.f54333 = jSONObject.getString("flowKind", "");
        boolean zContains = jSONObject.contains("targetVirtualAddress");
        this.f54334 = zContains;
        this.f54336 = zContains ? C23407.m51853(jSONObject, "targetVirtualAddress", -1L) : -1L;
        this.f54335 = jSONObject.getString("reason", "");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17763 m41614(JSONObject jSONObject) {
        return new C17763(jSONObject);
    }
}

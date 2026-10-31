package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܰܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes3.dex */
public final class C13919 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f41488;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f41489;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f41490;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f41491;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f41492;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f41493;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f41494;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f41495;

    public C13919(JSONObject jSONObject) {
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f41494 = jSONObject.getBoolean("controlFlowComplete", false);
        this.f41492 = jSONObject.getString("completionReason", "");
        this.f41490 = jSONObject.getInt("bytesAnalyzed", 0);
        this.f41495 = jSONObject.getInt("instructionsAnalyzed", 0);
        this.f41488 = jSONObject.getInt("blockCount", 0);
        this.f41493 = jSONObject.getInt("edgeCount", 0);
        this.f41491 = jSONObject.getInt("externalFlowCount", 0);
        this.f41489 = jSONObject.getInt("unresolvedFlowCount", 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13919 m33331(JSONObject jSONObject) {
        return new C13919(jSONObject);
    }
}

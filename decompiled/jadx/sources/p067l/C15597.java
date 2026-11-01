package p067l;

import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܰܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes3.dex */
public final class C15597 {

    /* JADX INFO: renamed from: ֫ */
    public final int f44569;

    /* JADX INFO: renamed from: ۜ */
    public final int f44570;

    /* JADX INFO: renamed from: ۧ */
    public final int f44571;

    /* JADX INFO: renamed from: ܳ */
    public final int f44572;

    /* JADX INFO: renamed from: ܽ */
    public final String f44573;

    /* JADX INFO: renamed from: ܿ */
    public final int f44574;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f44575;

    /* JADX INFO: renamed from: ᩻ */
    public final int f44576;

    public C15597(JSONObject jSONObject) {
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f44575 = jSONObject.getBoolean("controlFlowComplete", false);
        this.f44573 = jSONObject.getString("completionReason", "");
        this.f44571 = jSONObject.getInt("bytesAnalyzed", 0);
        this.f44576 = jSONObject.getInt("instructionsAnalyzed", 0);
        this.f44569 = jSONObject.getInt("blockCount", 0);
        this.f44574 = jSONObject.getInt("edgeCount", 0);
        this.f44572 = jSONObject.getInt("externalFlowCount", 0);
        this.f44570 = jSONObject.getInt("unresolvedFlowCount", 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15597 m35450(JSONObject jSONObject) {
        return new C15597(jSONObject);
    }
}

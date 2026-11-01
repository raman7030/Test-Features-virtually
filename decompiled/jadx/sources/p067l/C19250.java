package p067l;

import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ᩳۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes4.dex */
public final class C19250 {

    /* JADX INFO: renamed from: ֫ */
    public final String f57527;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f57528;

    /* JADX INFO: renamed from: ܽ */
    public final String f57529;

    /* JADX INFO: renamed from: ܿ */
    public final long f57530;

    /* JADX INFO: renamed from: ᩳ */
    public final long f57531;

    public C19250(JSONObject jSONObject) {
        this.f57531 = C24614.m54251(jSONObject, "sourceVirtualAddress", -1L);
        this.f57527 = jSONObject.getString("flowKind", "");
        boolean zContains = jSONObject.contains("targetVirtualAddress");
        this.f57528 = zContains;
        this.f57530 = zContains ? C24614.m54251(jSONObject, "targetVirtualAddress", -1L) : -1L;
        this.f57529 = jSONObject.getString("reason", "");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19250 m43860(JSONObject jSONObject) {
        return new C19250(jSONObject);
    }
}

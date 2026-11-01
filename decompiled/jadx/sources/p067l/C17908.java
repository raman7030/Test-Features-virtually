package p067l;

import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܽۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes4.dex */
public final class C17908 {

    /* JADX INFO: renamed from: ֫ */
    public final long f53494;

    /* JADX INFO: renamed from: ۜ */
    public final long f53495;

    /* JADX INFO: renamed from: ۧ */
    public final String f53496;

    /* JADX INFO: renamed from: ܳ */
    public final String f53497;

    /* JADX INFO: renamed from: ܽ */
    public final String f53498;

    /* JADX INFO: renamed from: ܿ */
    public final long f53499;

    /* JADX INFO: renamed from: ᩳ */
    public final String f53500;

    /* JADX INFO: renamed from: ᩻ */
    public final long f53501;

    public C17908(JSONObject jSONObject) {
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f53501 = C24614.m54251(jSONObject, "startVirtualAddress", -1L);
        this.f53499 = C24614.m54251(jSONObject, "startPhysicalAddress", -1L);
        this.f53500 = jSONObject.getString("name", "");
        this.f53498 = jSONObject.getString("demangledName", "");
        this.f53495 = C24614.m54251(jSONObject, "symbolSize", 0L);
        this.f53497 = jSONObject.getString("startSource", "");
        this.f53496 = jSONObject.getString("boundarySource", "");
        this.f53494 = C24614.m54251(jSONObject, "boundaryEndVirtualAddress", -1L);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17908 m40713(JSONObject jSONObject) {
        return new C17908(jSONObject);
    }
}

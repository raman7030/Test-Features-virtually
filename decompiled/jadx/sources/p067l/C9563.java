package p067l;

import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.۟ܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes3.dex */
public final class C9563 {

    /* JADX INFO: renamed from: ֫ */
    public final String f26289;

    /* JADX INFO: renamed from: ۧ */
    public final int f26290;

    /* JADX INFO: renamed from: ܳ */
    public final String f26291;

    /* JADX INFO: renamed from: ܽ */
    public final long f26292;

    /* JADX INFO: renamed from: ܿ */
    public final long f26293;

    /* JADX INFO: renamed from: ᩳ */
    public final long f26294;

    public C9563(JSONObject jSONObject) {
        this.f26293 = C24614.m54251(jSONObject, "startVirtualAddress", -1L);
        this.f26294 = C24614.m54251(jSONObject, "startPhysicalAddress", -1L);
        this.f26292 = C24614.m54251(jSONObject, "size", 0L);
        this.f26290 = jSONObject.getInt("instructionCount", 0);
        this.f26291 = jSONObject.getString("terminator", "");
        this.f26289 = jSONObject.getString("assemblyText", "");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9563 m22271(JSONObject jSONObject) {
        return new C9563(jSONObject);
    }
}

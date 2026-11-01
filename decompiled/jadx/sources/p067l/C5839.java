package p067l;

import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۘۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N75J */
/* JADX INFO: loaded from: classes2.dex */
public final class C5839 {

    /* JADX INFO: renamed from: ֫ */
    public final String f14318;

    /* JADX INFO: renamed from: ۧ */
    public final String f14319;

    /* JADX INFO: renamed from: ܳ */
    public final long f14320;

    /* JADX INFO: renamed from: ܽ */
    public final long f14321;

    /* JADX INFO: renamed from: ܿ */
    public final long f14322;

    /* JADX INFO: renamed from: ᩳ */
    public final long f14323;

    public C5839(JSONObject jSONObject) {
        this.f14319 = jSONObject.getString("name", "");
        this.f14318 = jSONObject.getString("demangledName", "");
        this.f14320 = C24614.m54251(jSONObject, "startVirtualAddress", -1L);
        this.f14322 = C24614.m54251(jSONObject, "startPhysicalAddress", -1L);
        this.f14321 = C24614.m54251(jSONObject, "offset", -1L);
        this.f14323 = C24614.m54251(jSONObject, "size", 0L);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5839 m13119(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C5839(jSONObject);
    }
}

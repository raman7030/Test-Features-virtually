package p067l;

import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.֫ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes2.dex */
public final class C3827 {

    /* JADX INFO: renamed from: ֫ */
    public final long f8199;

    /* JADX INFO: renamed from: ۧ */
    public final String f8200;

    /* JADX INFO: renamed from: ܽ */
    public final long f8201;

    public C3827(JSONObject jSONObject) {
        this.f8199 = C24614.m54251(jSONObject, "fromVirtualAddress", -1L);
        this.f8201 = C24614.m54251(jSONObject, "toVirtualAddress", -1L);
        this.f8200 = jSONObject.getString("kind", "");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3827 m7476(JSONObject jSONObject) {
        return new C3827(jSONObject);
    }
}

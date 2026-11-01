package p067l;

import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۧۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes3.dex */
public final class C12545 {

    /* JADX INFO: renamed from: ֫ */
    public final String f35259;

    /* JADX INFO: renamed from: ۧ */
    public final String f35260;

    /* JADX INFO: renamed from: ܽ */
    public final long f35261;

    /* JADX INFO: renamed from: ᩳ */
    public final long f35262;

    public C12545(JSONObject jSONObject) {
        this.f35261 = C24614.m54251(jSONObject, "sourceVirtualAddress", -1L);
        this.f35259 = jSONObject.getString("flowKind", "");
        this.f35262 = C24614.m54251(jSONObject, "targetVirtualAddress", -1L);
        this.f35260 = jSONObject.getString("reason", "");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12545 m28928(JSONObject jSONObject) {
        return new C12545(jSONObject);
    }
}

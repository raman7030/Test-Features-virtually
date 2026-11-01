package p067l;

import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۨܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: D75Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C13587 implements InterfaceC10234 {

    /* JADX INFO: renamed from: ֫ */
    public final String f38208;

    /* JADX INFO: renamed from: ۜ */
    public final long f38209;

    /* JADX INFO: renamed from: ۡ */
    public final long f38210;

    /* JADX INFO: renamed from: ۢ */
    public final String f38211;

    /* JADX INFO: renamed from: ۧ */
    public final int f38212;

    /* JADX INFO: renamed from: ܳ */
    public final String f38213;

    /* JADX INFO: renamed from: ܽ */
    public final String f38214;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f38215;

    /* JADX INFO: renamed from: ᩳ */
    public final String f38216;

    /* JADX INFO: renamed from: ᩷ */
    public final long f38217;

    /* JADX INFO: renamed from: ᩻ */
    public final String f38218;

    public C13587(JSONObject jSONObject) {
        this.f38218 = jSONObject.getString("name", "");
        this.f38216 = jSONObject.getString("demangledName", "");
        this.f38214 = jSONObject.getString("className", "");
        this.f38213 = jSONObject.getString("library", "");
        this.f38208 = jSONObject.getString("bind", "");
        this.f38211 = jSONObject.getString("type", "");
        this.f38215 = jSONObject.getBoolean("imported", false);
        this.f38210 = C24614.m54251(jSONObject, "vaddr", 0L);
        this.f38209 = C24614.m54251(jSONObject, "paddr", 0L);
        this.f38217 = C24614.m54251(jSONObject, "size", 0L);
        this.f38212 = jSONObject.getInt("bits", 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13587 m30904(JSONObject jSONObject) {
        return new C13587(jSONObject);
    }
}

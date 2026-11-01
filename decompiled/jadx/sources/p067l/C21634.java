package p067l;

import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩶ܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V75H */
/* JADX INFO: loaded from: classes5.dex */
public final class C21634 implements InterfaceC10234 {

    /* JADX INFO: renamed from: ֫ */
    public final long f68180;

    /* JADX INFO: renamed from: ۜ */
    public final long f68181;

    /* JADX INFO: renamed from: ۢ */
    public final long f68182;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f68183;

    /* JADX INFO: renamed from: ܳ */
    public final String f68184;

    /* JADX INFO: renamed from: ܽ */
    public final String f68185;

    /* JADX INFO: renamed from: ܿ */
    public final String f68186;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f68187;

    /* JADX INFO: renamed from: ᩷ */
    public final long f68188;

    /* JADX INFO: renamed from: ᩻ */
    public final long f68189;

    public C21634(JSONObject jSONObject) {
        this.f68184 = jSONObject.getString("name", "");
        this.f68185 = jSONObject.getString("demangledName", "");
        this.f68186 = jSONObject.getString("library", "");
        this.f68188 = C24614.m54251(jSONObject, "type", 0L);
        this.f68189 = C24614.m54251(jSONObject, "numericType", 0L);
        this.f68182 = C24614.m54251(jSONObject, "vaddr", 0L);
        this.f68181 = C24614.m54251(jSONObject, "paddr", 0L);
        this.f68180 = C24614.m54251(jSONObject, "addend", 0L);
        this.f68183 = jSONObject.getBoolean("additive", false);
        this.f68187 = jSONObject.getBoolean("ifunc", false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21634 m48850(JSONObject jSONObject) {
        return new C21634(jSONObject);
    }
}

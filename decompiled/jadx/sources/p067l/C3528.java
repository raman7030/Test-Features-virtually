package p067l;

import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.֨ܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: W74O */
/* JADX INFO: loaded from: classes2.dex */
public final class C3528 implements InterfaceC10234 {

    /* JADX INFO: renamed from: ֫ */
    public final int f7146;

    /* JADX INFO: renamed from: ۜ */
    public final long f7147;

    /* JADX INFO: renamed from: ۧ */
    public final String f7148;

    /* JADX INFO: renamed from: ܳ */
    public final String f7149;

    /* JADX INFO: renamed from: ܽ */
    public final int f7150;

    /* JADX INFO: renamed from: ܿ */
    public final long f7151;

    /* JADX INFO: renamed from: ᩳ */
    public final long f7152;

    /* JADX INFO: renamed from: ᩻ */
    public final long f7153;

    public C3528(JSONObject jSONObject) {
        this.f7148 = jSONObject.getString("arrayName", "");
        this.f7146 = jSONObject.getInt("arrayIndex", 0);
        this.f7151 = C24614.m54251(jSONObject, "slotVirtualAddress", 0L);
        this.f7152 = C24614.m54251(jSONObject, "slotPhysicalAddress", 0L);
        this.f7147 = C24614.m54251(jSONObject, "targetVirtualAddress", 0L);
        this.f7153 = C24614.m54251(jSONObject, "targetPhysicalAddress", 0L);
        this.f7149 = jSONObject.getString("targetInstructionMode", "");
        this.f7150 = jSONObject.getInt("pointerSize", 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3528 m6302(JSONObject jSONObject) {
        return new C3528(jSONObject);
    }
}

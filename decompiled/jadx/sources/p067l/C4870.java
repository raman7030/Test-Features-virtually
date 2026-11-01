package p067l;

import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۖܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C755 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4870 {

    /* JADX INFO: renamed from: ֫ */
    public final String f11096;

    /* JADX INFO: renamed from: ۜ */
    public final long f11097;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f11098;

    /* JADX INFO: renamed from: ܳ */
    public final long f11099;

    /* JADX INFO: renamed from: ܽ */
    public final String f11100;

    /* JADX INFO: renamed from: ܿ */
    public final long f11101;

    /* JADX INFO: renamed from: ᩳ */
    public final String f11102;

    /* JADX INFO: renamed from: ᩻ */
    public final long f11103;

    public C4870(JSONObject jSONObject) {
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f11098 = jSONObject.getBoolean("found", false);
        this.f11102 = jSONObject.getString("name", "");
        this.f11096 = jSONObject.getString("demangledName", "");
        this.f11100 = jSONObject.getString("instructionMode", "");
        this.f11097 = C24614.m54251(jSONObject, "startVirtualAddress", 0L);
        this.f11103 = C24614.m54251(jSONObject, "startPhysicalAddress", 0L);
        this.f11101 = C24614.m54251(jSONObject, "offset", 0L);
        this.f11099 = C24614.m54251(jSONObject, "size", 0L);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4870 m10331() {
        return new C4870(null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4870 m10333(String str, String str2, String str3, long j, long j2, long j3, long j4) {
        return new C4870(new JSONObject().add("found", true).add("name", str).add("demangledName", str2).add("instructionMode", str3).add("startVirtualAddress", j).add("startPhysicalAddress", j2).add("offset", j3).add("size", j4));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4870 m10334(long j) {
        if (!this.f11098) {
            return m10331();
        }
        return m10333(this.f11102, this.f11096, this.f11100, this.f11097, this.f11103, j, this.f11099);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4870 m10332(JSONObject jSONObject) {
        return new C4870(jSONObject);
    }
}

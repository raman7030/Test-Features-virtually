package p067l;

import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۘܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C755 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6211 {

    /* JADX INFO: renamed from: ֫ */
    public final C4870 f15631;

    /* JADX INFO: renamed from: ۜ */
    public final long f15632;

    /* JADX INFO: renamed from: ۡ */
    public final long f15633;

    /* JADX INFO: renamed from: ۢ */
    public final boolean f15634;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f15635;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f15636;

    /* JADX INFO: renamed from: ܺ */
    public final long f15637;

    /* JADX INFO: renamed from: ܽ */
    public final long f15638;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f15639;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f15640;

    /* JADX INFO: renamed from: ᩷ */
    public final String f15641;

    /* JADX INFO: renamed from: ᩻ */
    public final long f15642;

    public C6211(JSONObject jSONObject) {
        this.f15635 = jSONObject.getBoolean("found", false);
        this.f15640 = jSONObject.getBoolean("inputVirtual", false);
        this.f15638 = C24614.m54251(jSONObject, "inputAddress", 0L);
        this.f15641 = jSONObject.getString("sectionName", "");
        this.f15637 = C24614.m54251(jSONObject, "virtualAddress", 0L);
        this.f15632 = C24614.m54251(jSONObject, "physicalAddress", 0L);
        this.f15642 = C24614.m54251(jSONObject, "offset", 0L);
        this.f15633 = C24614.m54251(jSONObject, "size", 0L);
        this.f15636 = jSONObject.getBoolean("isLoaded", false);
        this.f15639 = jSONObject.getBoolean("isExecutable", false);
        this.f15634 = jSONObject.getBoolean("segment", false);
        this.f15631 = C4870.m10332(jSONObject.getJSONObject("enclosingSymbol"));
    }

    public C6211(boolean z, boolean z2, long j, String str, long j2, long j3, long j4, long j5, boolean z3, boolean z4, boolean z5, C4870 c4870) {
        this.f15635 = z;
        this.f15640 = z2;
        this.f15638 = j;
        this.f15641 = str;
        this.f15637 = j2;
        this.f15632 = j3;
        this.f15642 = j4;
        this.f15633 = j5;
        this.f15636 = z3;
        this.f15639 = z4;
        this.f15634 = z5;
        this.f15631 = c4870;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6211 m14061(long j) {
        return m14063(false, false, j, "", 0L, 0L, 0L, 0L, false, false, false, C4870.m10331());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6211 m14063(boolean z, boolean z2, long j, String str, long j2, long j3, long j4, long j5, boolean z3, boolean z4, boolean z5, C4870 c4870) {
        return new C6211(z, z2, j, str, j2, j3, j4, j5, z4, z5, z3, c4870 != null ? c4870 : C4870.m10331());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6211 m14062(JSONObject jSONObject) {
        return new C6211(jSONObject);
    }
}

package p067l;

import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.C0655am;

/* JADX INFO: renamed from: l.ۛܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V75S */
/* JADX INFO: loaded from: classes2.dex */
public final class C8222 {

    /* JADX INFO: renamed from: ֡ */
    public final boolean f21793;

    /* JADX INFO: renamed from: ֨ */
    public final String f21794;

    /* JADX INFO: renamed from: ֫ */
    public final String f21795;

    /* JADX INFO: renamed from: ۖ */
    public final String f21796;

    /* JADX INFO: renamed from: ۘ */
    public final String f21797;

    /* JADX INFO: renamed from: ۚ */
    public final String f21798;

    /* JADX INFO: renamed from: ۜ */
    public final long f21799;

    /* JADX INFO: renamed from: ۡ */
    public final boolean f21800;

    /* JADX INFO: renamed from: ۢ */
    public final long f21801;

    /* JADX INFO: renamed from: ۧ */
    public final String f21802;

    /* JADX INFO: renamed from: ܳ */
    public final C12246 f21803;

    /* JADX INFO: renamed from: ܺ */
    public final long f21804;

    /* JADX INFO: renamed from: ܽ */
    public final long f21805;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f21806;

    /* JADX INFO: renamed from: ᩳ */
    public final int f21807;

    /* JADX INFO: renamed from: ᩴ */
    public final boolean f21808;

    /* JADX INFO: renamed from: ᩵ */
    public final String f21809;

    /* JADX INFO: renamed from: ᩷ */
    public final long f21810;

    /* JADX INFO: renamed from: ᩻ */
    public final String f21811;

    public C8222(JSONObject jSONObject) {
        jSONObject.getString(MotionUtils.EASING_TYPE_PATH, "");
        this.f21794 = jSONObject.getString("type", "");
        jSONObject.getString("className", "");
        jSONObject.getString("realClassName", "");
        this.f21802 = jSONObject.getString("arch", "");
        this.f21811 = jSONObject.getString(C0655am.f2362w, "");
        this.f21797 = jSONObject.getString("machine", "");
        this.f21795 = jSONObject.getString("abi", "");
        this.f21809 = jSONObject.getString(C0655am.f2363x, "");
        this.f21798 = jSONObject.getString("subsystem", "");
        this.f21796 = jSONObject.getString("interpreter", "");
        this.f21807 = jSONObject.getInt("bits", 0);
        this.f21800 = jSONObject.getBoolean("hasVirtualAddress", false);
        this.f21793 = jSONObject.getBoolean("positionIndependent", false);
        this.f21808 = jSONObject.getBoolean("nx", false);
        this.f21806 = jSONObject.getBoolean("canary", false);
        this.f21805 = C24614.m54251(jSONObject, "baseAddress", 0L);
        this.f21810 = C24614.m54251(jSONObject, "entryVirtualAddress", 0L);
        this.f21799 = C24614.m54251(jSONObject, "entryPhysicalAddress", 0L);
        this.f21804 = C24614.m54251(jSONObject, "initVirtualAddress", 0L);
        this.f21801 = C24614.m54251(jSONObject, "finiVirtualAddress", 0L);
        this.f21803 = C12246.m28236(jSONObject.getJSONObject("counts"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8222 m18999(JSONObject jSONObject) {
        return new C8222(jSONObject);
    }
}

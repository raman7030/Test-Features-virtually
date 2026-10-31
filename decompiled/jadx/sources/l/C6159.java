package l;

import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ۛܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V75S */
/* JADX INFO: loaded from: classes2.dex */
public final class C6159 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f18934;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f18935;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f18936;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f18937;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f18938;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f18939;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f18940;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f18941;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f18942;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f18943;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C10393 f18944;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f18945;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f18946;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f18947;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f18948;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f18949;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String f18950;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f18951;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f18952;

    public C6159(JSONObject jSONObject) {
        jSONObject.getString(MotionUtils.EASING_TYPE_PATH, "");
        this.f18935 = jSONObject.getString("type", "");
        jSONObject.getString("className", "");
        jSONObject.getString("realClassName", "");
        this.f18943 = jSONObject.getString("arch", "");
        this.f18952 = jSONObject.getString(am.w, "");
        this.f18938 = jSONObject.getString("machine", "");
        this.f18936 = jSONObject.getString("abi", "");
        this.f18950 = jSONObject.getString(am.x, "");
        this.f18939 = jSONObject.getString("subsystem", "");
        this.f18937 = jSONObject.getString("interpreter", "");
        this.f18948 = jSONObject.getInt("bits", 0);
        this.f18941 = jSONObject.getBoolean("hasVirtualAddress", false);
        this.f18934 = jSONObject.getBoolean("positionIndependent", false);
        this.f18949 = jSONObject.getBoolean("nx", false);
        this.f18947 = jSONObject.getBoolean("canary", false);
        this.f18946 = C23407.m51853(jSONObject, "baseAddress", 0L);
        this.f18951 = C23407.m51853(jSONObject, "entryVirtualAddress", 0L);
        this.f18940 = C23407.m51853(jSONObject, "entryPhysicalAddress", 0L);
        this.f18945 = C23407.m51853(jSONObject, "initVirtualAddress", 0L);
        this.f18942 = C23407.m51853(jSONObject, "finiVirtualAddress", 0L);
        this.f18944 = C10393.m26207(jSONObject.getJSONObject("counts"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6159 m17067(JSONObject jSONObject) {
        return new C6159(jSONObject);
    }
}

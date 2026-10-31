package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۘܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C755 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4043 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2632 f12816;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f12817;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f12818;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f12819;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f12820;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f12821;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f12822;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f12823;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f12824;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f12825;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f12826;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f12827;

    public C4043(JSONObject jSONObject) {
        this.f12820 = jSONObject.getBoolean("found", false);
        this.f12825 = jSONObject.getBoolean("inputVirtual", false);
        this.f12823 = C23407.m51853(jSONObject, "inputAddress", 0L);
        this.f12826 = jSONObject.getString("sectionName", "");
        this.f12822 = C23407.m51853(jSONObject, "virtualAddress", 0L);
        this.f12817 = C23407.m51853(jSONObject, "physicalAddress", 0L);
        this.f12827 = C23407.m51853(jSONObject, "offset", 0L);
        this.f12818 = C23407.m51853(jSONObject, "size", 0L);
        this.f12821 = jSONObject.getBoolean("isLoaded", false);
        this.f12824 = jSONObject.getBoolean("isExecutable", false);
        this.f12819 = jSONObject.getBoolean("segment", false);
        this.f12816 = C2632.m8288(jSONObject.getJSONObject("enclosingSymbol"));
    }

    public C4043(boolean z, boolean z2, long j, String str, long j2, long j3, long j4, long j5, boolean z3, boolean z4, boolean z5, C2632 c2632) {
        this.f12820 = z;
        this.f12825 = z2;
        this.f12823 = j;
        this.f12826 = str;
        this.f12822 = j2;
        this.f12817 = j3;
        this.f12827 = j4;
        this.f12818 = j5;
        this.f12821 = z3;
        this.f12824 = z4;
        this.f12819 = z5;
        this.f12816 = c2632;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4043 m12140(long j) {
        return m12142(false, false, j, "", 0L, 0L, 0L, 0L, false, false, false, C2632.m8287());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4043 m12142(boolean z, boolean z2, long j, String str, long j2, long j3, long j4, long j5, boolean z3, boolean z4, boolean z5, C2632 c2632) {
        return new C4043(z, z2, j, str, j2, j3, j4, j5, z4, z5, z3, c2632 != null ? c2632 : C2632.m8287());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4043 m12141(JSONObject jSONObject) {
        return new C4043(jSONObject);
    }
}

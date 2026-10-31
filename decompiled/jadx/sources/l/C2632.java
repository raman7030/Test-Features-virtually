package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۖܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C755 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2632 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f8301;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f8302;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f8303;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f8304;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f8305;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f8306;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f8307;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f8308;

    public C2632(JSONObject jSONObject) {
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f8303 = jSONObject.getBoolean("found", false);
        this.f8307 = jSONObject.getString("name", "");
        this.f8301 = jSONObject.getString("demangledName", "");
        this.f8305 = jSONObject.getString("instructionMode", "");
        this.f8302 = C23407.m51853(jSONObject, "startVirtualAddress", 0L);
        this.f8308 = C23407.m51853(jSONObject, "startPhysicalAddress", 0L);
        this.f8306 = C23407.m51853(jSONObject, "offset", 0L);
        this.f8304 = C23407.m51853(jSONObject, "size", 0L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2632 m8287() {
        return new C2632(null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2632 m8289(String str, String str2, String str3, long j, long j2, long j3, long j4) {
        return new C2632(new JSONObject().add("found", true).add("name", str).add("demangledName", str2).add("instructionMode", str3).add("startVirtualAddress", j).add("startPhysicalAddress", j2).add("offset", j3).add("size", j4));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2632 m8290(long j) {
        if (!this.f8303) {
            return m8287();
        }
        return m8289(this.f8307, this.f8301, this.f8305, this.f8302, this.f8308, j, this.f8304);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2632 m8288(JSONObject jSONObject) {
        return new C2632(jSONObject);
    }
}

package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܽۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes4.dex */
public final class C16351 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f50321;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f50322;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f50323;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f50324;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f50325;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f50326;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f50327;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f50328;

    public C16351(JSONObject jSONObject) {
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f50328 = C23407.m51853(jSONObject, "startVirtualAddress", -1L);
        this.f50326 = C23407.m51853(jSONObject, "startPhysicalAddress", -1L);
        this.f50327 = jSONObject.getString("name", "");
        this.f50325 = jSONObject.getString("demangledName", "");
        this.f50322 = C23407.m51853(jSONObject, "symbolSize", 0L);
        this.f50324 = jSONObject.getString("startSource", "");
        this.f50323 = jSONObject.getString("boundarySource", "");
        this.f50321 = C23407.m51853(jSONObject, "boundaryEndVirtualAddress", -1L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16351 m38496(JSONObject jSONObject) {
        return new C16351(jSONObject);
    }
}

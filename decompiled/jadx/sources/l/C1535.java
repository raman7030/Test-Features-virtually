package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.֫ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q75G */
/* JADX INFO: loaded from: classes2.dex */
public final class C1535 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f5417;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f5418;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f5419;

    public C1535(JSONObject jSONObject) {
        this.f5417 = C23407.m51853(jSONObject, "fromVirtualAddress", -1L);
        this.f5419 = C23407.m51853(jSONObject, "toVirtualAddress", -1L);
        this.f5418 = jSONObject.getString("kind", "");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1535 m5247(JSONObject jSONObject) {
        return new C1535(jSONObject);
    }
}

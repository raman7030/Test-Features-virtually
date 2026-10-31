package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ᩴۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6W4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18673 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f59008;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f59009;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f59010;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f59011;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f59012;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f59013;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f59014;

    public C18673(String str, String str2, String str3, String str4, long j, long j2, String str5) {
        this.f59011 = str;
        this.f59008 = str2;
        this.f59013 = str3;
        this.f59014 = str4;
        this.f59009 = j;
        this.f59010 = j2;
        this.f59012 = str5;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JSONObject m43292() {
        return JSON.object().add("credentialId", this.f59011).add("clientName", this.f59008).add("digest", this.f59013).add("token", this.f59014).add("createdAt", this.f59009).add("lastUsedAt", this.f59010).add("lastIp", this.f59012);
    }
}

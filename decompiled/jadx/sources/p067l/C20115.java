package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ᩴۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6W4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20115 {

    /* JADX INFO: renamed from: ֫ */
    public final String f62231;

    /* JADX INFO: renamed from: ۧ */
    public final long f62232;

    /* JADX INFO: renamed from: ܳ */
    public final long f62233;

    /* JADX INFO: renamed from: ܽ */
    public final String f62234;

    /* JADX INFO: renamed from: ܿ */
    public final String f62235;

    /* JADX INFO: renamed from: ᩳ */
    public final String f62236;

    /* JADX INFO: renamed from: ᩻ */
    public final String f62237;

    public C20115(String str, String str2, String str3, String str4, long j, long j2, String str5) {
        this.f62234 = str;
        this.f62231 = str2;
        this.f62236 = str3;
        this.f62237 = str4;
        this.f62232 = j;
        this.f62233 = j2;
        this.f62235 = str5;
    }

    /* JADX INFO: renamed from: ֫ */
    public final JSONObject m45558() {
        return JSON.object().add("credentialId", this.f62234).add("clientName", this.f62231).add("digest", this.f62236).add("token", this.f62237).add("createdAt", this.f62232).add("lastUsedAt", this.f62233).add("lastIp", this.f62235);
    }
}

package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩶ܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V75H */
/* JADX INFO: loaded from: classes5.dex */
public final class C20271 implements InterfaceC8276 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f65505;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f65506;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f65507;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f65508;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f65509;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f65510;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f65511;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f65512;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f65513;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f65514;

    public C20271(JSONObject jSONObject) {
        this.f65509 = jSONObject.getString("name", "");
        this.f65510 = jSONObject.getString("demangledName", "");
        this.f65511 = jSONObject.getString("library", "");
        this.f65513 = C23407.m51853(jSONObject, "type", 0L);
        this.f65514 = C23407.m51853(jSONObject, "numericType", 0L);
        this.f65507 = C23407.m51853(jSONObject, "vaddr", 0L);
        this.f65506 = C23407.m51853(jSONObject, "paddr", 0L);
        this.f65505 = C23407.m51853(jSONObject, "addend", 0L);
        this.f65508 = jSONObject.getBoolean("additive", false);
        this.f65512 = jSONObject.getBoolean("ifunc", false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20271 m46528(JSONObject jSONObject) {
        return new C20271(jSONObject);
    }
}

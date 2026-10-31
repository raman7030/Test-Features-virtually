package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۤܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V75S */
/* JADX INFO: loaded from: classes3.dex */
public final class C10393 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f31253;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f31254;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f31255;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f31256;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f31257;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f31258;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f31259;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f31260;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f31261;

    public C10393(JSONObject jSONObject) {
        this.f31258 = m26206(jSONObject, "neededLibraries");
        this.f31261 = m26206(jSONObject, "sections");
        this.f31254 = m26206(jSONObject, "segments");
        this.f31257 = m26206(jSONObject, "imports");
        this.f31260 = m26206(jSONObject, "symbols");
        this.f31253 = m26206(jSONObject, "entries");
        this.f31259 = m26206(jSONObject, "initArray");
        this.f31255 = m26206(jSONObject, "finiArray");
        this.f31256 = m26206(jSONObject, "relocations");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10393 m26207(JSONObject jSONObject) {
        return new C10393(jSONObject);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m26206(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.getInt(str, 0);
    }
}

package p067l;

import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۤܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V75S */
/* JADX INFO: loaded from: classes3.dex */
public final class C12246 {

    /* JADX INFO: renamed from: ֫ */
    public final int f34218;

    /* JADX INFO: renamed from: ۜ */
    public final int f34219;

    /* JADX INFO: renamed from: ۧ */
    public final int f34220;

    /* JADX INFO: renamed from: ܳ */
    public final int f34221;

    /* JADX INFO: renamed from: ܽ */
    public final int f34222;

    /* JADX INFO: renamed from: ܿ */
    public final int f34223;

    /* JADX INFO: renamed from: ᩳ */
    public final int f34224;

    /* JADX INFO: renamed from: ᩷ */
    public final int f34225;

    /* JADX INFO: renamed from: ᩻ */
    public final int f34226;

    public C12246(JSONObject jSONObject) {
        this.f34223 = m28235(jSONObject, "neededLibraries");
        this.f34226 = m28235(jSONObject, "sections");
        this.f34219 = m28235(jSONObject, "segments");
        this.f34222 = m28235(jSONObject, "imports");
        this.f34225 = m28235(jSONObject, "symbols");
        this.f34218 = m28235(jSONObject, "entries");
        this.f34224 = m28235(jSONObject, "initArray");
        this.f34220 = m28235(jSONObject, "finiArray");
        this.f34221 = m28235(jSONObject, "relocations");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12246 m28236(JSONObject jSONObject) {
        return new C12246(jSONObject);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m28235(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.getInt(str, 0);
    }
}

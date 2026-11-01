package p067l;

import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۚܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K75F */
/* JADX INFO: loaded from: classes3.dex */
public final class C7552 implements InterfaceC10234 {

    /* JADX INFO: renamed from: ֫ */
    public final String f19815;

    /* JADX INFO: renamed from: ۜ */
    public final long f19816;

    /* JADX INFO: renamed from: ۧ */
    public final String f19817;

    /* JADX INFO: renamed from: ܳ */
    public final String f19818;

    /* JADX INFO: renamed from: ܽ */
    public final String f19819;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f19820;

    /* JADX INFO: renamed from: ᩳ */
    public final String f19821;

    /* JADX INFO: renamed from: ᩷ */
    public final String f19822;

    /* JADX INFO: renamed from: ᩻ */
    public final String f19823;

    public C7552(JSONObject jSONObject) {
        this.f19823 = jSONObject.getString("name", "");
        this.f19819 = jSONObject.getString("demangledName", "");
        this.f19818 = jSONObject.getString("library", "");
        this.f19815 = jSONObject.getString("bind", "");
        this.f19822 = jSONObject.getString("type", "");
        this.f19817 = jSONObject.getString("className", "");
        this.f19821 = jSONObject.getString("descriptor", "");
        this.f19816 = C24614.m54251(jSONObject, "ordinal", 0L);
        this.f19820 = jSONObject.getBoolean("inSectionHeader", false);
        jSONObject.getBoolean("imported", false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7552 m17469(JSONObject jSONObject) {
        return new C7552(jSONObject);
    }
}

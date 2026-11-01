package p067l;

import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܰۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C15349 {

    /* JADX INFO: renamed from: ֫ */
    public String f43808;

    /* JADX INFO: renamed from: ۧ */
    public String f43809;

    /* JADX INFO: renamed from: ܳ */
    public String f43810;

    /* JADX INFO: renamed from: ܽ */
    public String f43811;

    /* JADX INFO: renamed from: ܿ */
    public Boolean f43812;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC17043 f43813;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f43814;

    /* JADX INFO: renamed from: ֫ */
    public final JSONObject m34934() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("1", this.f43813.mo25505());
        jSONObject.put("2", this.f43811);
        jSONObject.put("3", C8597.m20011(80, this.f43809));
        jSONObject.put("4", this.f43810);
        jSONObject.put("5", this.f43812.booleanValue());
        jSONObject.put("6", this.f43814);
        jSONObject.put("7", this.f43808);
        return jSONObject;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34935(JSONObject jSONObject) {
        this.f43813 = C18524.m42109(jSONObject.getString("1"), new String[0]);
        this.f43811 = jSONObject.getString("2");
        this.f43809 = jSONObject.getString("3");
        this.f43810 = jSONObject.getString("4");
        this.f43812 = Boolean.valueOf(jSONObject.getBoolean("5"));
        this.f43814 = jSONObject.getBoolean("6");
        this.f43808 = jSONObject.getString("7");
    }
}

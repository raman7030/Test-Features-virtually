package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ܰۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13658 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f40727;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f40728;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f40729;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f40730;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Boolean f40731;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f40732;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f40733;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JSONObject m32819() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("1", this.f40732.mo23554());
        jSONObject.put("2", this.f40730);
        jSONObject.put("3", C6554.m18061(80, this.f40728));
        jSONObject.put("4", this.f40729);
        jSONObject.put("5", this.f40731.booleanValue());
        jSONObject.put("6", this.f40733);
        jSONObject.put("7", this.f40727);
        return jSONObject;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32820(JSONObject jSONObject) {
        this.f40732 = C16999.m39866(jSONObject.getString("1"), new String[0]);
        this.f40730 = jSONObject.getString("2");
        this.f40728 = jSONObject.getString("3");
        this.f40729 = jSONObject.getString("4");
        this.f40731 = Boolean.valueOf(jSONObject.getBoolean("5"));
        this.f40733 = jSONObject.getBoolean("6");
        this.f40727 = jSONObject.getString("7");
    }
}

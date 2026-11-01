package p067l;

import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩹ܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T753 */
/* JADX INFO: loaded from: classes.dex */
public final class C23645 implements InterfaceC10234 {

    /* JADX INFO: renamed from: ֫ */
    public final String f75267;

    public C23645(JSONObject jSONObject) {
        this.f75267 = jSONObject.getString("name", "");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23645 m52596(JSONObject jSONObject) {
        return new C23645(jSONObject);
    }
}

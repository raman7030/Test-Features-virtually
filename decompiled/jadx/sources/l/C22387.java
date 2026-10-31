package l;

import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩹ܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T753 */
/* JADX INFO: loaded from: classes.dex */
public final class C22387 implements InterfaceC8276 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f72541;

    public C22387(JSONObject jSONObject) {
        this.f72541 = jSONObject.getString("name", "");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22387 m50256(JSONObject jSONObject) {
        return new C22387(jSONObject);
    }
}

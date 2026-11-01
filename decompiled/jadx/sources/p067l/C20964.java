package p067l;

import bin.p000mt.json.JSONObject;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.᩵ܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V75L */
/* JADX INFO: loaded from: classes4.dex */
public final class C20964 {

    /* JADX INFO: renamed from: ֫ */
    public final int f65860;

    /* JADX INFO: renamed from: ۧ */
    public final String f65861;

    public C20964(JSONObject jSONObject) {
        C24614.m54251(jSONObject, "address", 0L);
        this.f65860 = jSONObject.getInt("size", 0);
        jSONObject.getString("bytes", "");
        this.f65861 = jSONObject.getString(TextBundle.TEXT_ENTRY, "");
    }
}

package l;

import bin.mt.json.JSONObject;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.᩵ܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V75L */
/* JADX INFO: loaded from: classes4.dex */
public final class C19566 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f63241;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f63242;

    public C19566(JSONObject jSONObject) {
        C23407.m51853(jSONObject, "address", 0L);
        this.f63241 = jSONObject.getInt("size", 0);
        jSONObject.getString("bytes", "");
        this.f63242 = jSONObject.getString(TextBundle.TEXT_ENTRY, "");
    }
}

package p067l;

import bin.p000mt.json.JSONObject;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۡۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O75H */
/* JADX INFO: loaded from: classes3.dex */
public final class C10533 {

    /* JADX INFO: renamed from: ֫ */
    public final String f29147;

    /* JADX INFO: renamed from: ۜ */
    public final String f29148;

    /* JADX INFO: renamed from: ۧ */
    public final String f29149;

    /* JADX INFO: renamed from: ܳ */
    public final C5839 f29150;

    /* JADX INFO: renamed from: ܽ */
    public final long f29151;

    /* JADX INFO: renamed from: ܿ */
    public final int f29152;

    /* JADX INFO: renamed from: ᩳ */
    public final String f29153;

    /* JADX INFO: renamed from: ᩻ */
    public final long f29154;

    public C10533(JSONObject jSONObject) {
        this.f29154 = C24614.m54251(jSONObject, "sourceVirtualAddress", -1L);
        this.f29151 = C24614.m54251(jSONObject, "sourceFileOffset", -1L);
        this.f29153 = jSONObject.getString("sourceKind", "");
        this.f29152 = jSONObject.getInt("sourceSize", 0);
        this.f29150 = C5839.m13119(jSONObject.getJSONObject("sourceSymbol"));
        this.f29147 = jSONObject.getString("bytes", "");
        this.f29148 = jSONObject.getString(TextBundle.TEXT_ENTRY, "");
        this.f29149 = jSONObject.getString("referenceKind", "");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10533 m24268(JSONObject jSONObject) {
        return new C10533(jSONObject);
    }
}

package p067l;

import bin.p000mt.json.JSONObject;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.۬ܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: J76B */
/* JADX INFO: loaded from: classes3.dex */
public final class C14927 {

    /* JADX INFO: renamed from: ֫ */
    public final long f42625;

    /* JADX INFO: renamed from: ۧ */
    public final String f42626;

    /* JADX INFO: renamed from: ܽ */
    public final long f42627;

    /* JADX INFO: renamed from: ܿ */
    public final long f42628;

    /* JADX INFO: renamed from: ᩳ */
    public final String f42629;

    public C14927(JSONObject jSONObject) {
        this.f42629 = jSONObject.getString(TextBundle.TEXT_ENTRY, "");
        this.f42627 = C24614.m54251(jSONObject, "size", 0L);
        this.f42625 = C24614.m54251(jSONObject, "paddr", -1L);
        this.f42628 = C24614.m54251(jSONObject, "vaddr", -1L);
        this.f42626 = jSONObject.getString("sectionName", "");
        jSONObject.getString("type", "");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14927 m34147(JSONObject jSONObject) {
        return new C14927(jSONObject);
    }
}

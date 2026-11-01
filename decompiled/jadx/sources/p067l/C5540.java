package p067l;

import bin.p000mt.json.JSONObject;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;

/* JADX INFO: renamed from: l.ۗܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274X */
/* JADX INFO: loaded from: classes2.dex */
public final class C5540 implements InterfaceC10234 {

    /* JADX INFO: renamed from: ֫ */
    public final String f13350;

    /* JADX INFO: renamed from: ۜ */
    public final long f13351;

    /* JADX INFO: renamed from: ۡ */
    public final long f13352;

    /* JADX INFO: renamed from: ۢ */
    public final long f13353;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f13354;

    /* JADX INFO: renamed from: ܳ */
    public final long f13355;

    /* JADX INFO: renamed from: ܽ */
    public final long f13356;

    /* JADX INFO: renamed from: ܿ */
    public final long f13357;

    /* JADX INFO: renamed from: ᩳ */
    public final String f13358;

    /* JADX INFO: renamed from: ᩷ */
    public final String f13359;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean f13360;

    public C5540(JSONObject jSONObject) {
        this.f13358 = jSONObject.getString("name", "");
        this.f13359 = jSONObject.getString("type", "");
        this.f13350 = jSONObject.getString("arch", "");
        this.f13353 = C24614.m54251(jSONObject, "vaddr", 0L);
        this.f13355 = C24614.m54251(jSONObject, "paddr", 0L);
        this.f13351 = C24614.m54251(jSONObject, "size", 0L);
        this.f13352 = C24614.m54251(jSONObject, "virtualSize", 0L);
        this.f13357 = C24614.m54251(jSONObject, "permissions", 0L);
        this.f13356 = C24614.m54251(jSONObject, "flags", 0L);
        this.f13354 = jSONObject.getBoolean(AbstractC0213e.f989m, false);
        this.f13360 = jSONObject.getBoolean("segment", false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5540 m12229(JSONObject jSONObject) {
        return new C5540(jSONObject);
    }
}

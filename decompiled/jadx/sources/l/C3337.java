package l;

import bin.mt.json.JSONObject;
import com.alipay.sdk.m.t.e;

/* JADX INFO: renamed from: l.ۗܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274X */
/* JADX INFO: loaded from: classes2.dex */
public final class C3337 implements InterfaceC8276 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f10540;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f10541;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f10542;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f10543;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f10544;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f10545;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f10546;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f10547;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f10548;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f10549;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f10550;

    public C3337(JSONObject jSONObject) {
        this.f10548 = jSONObject.getString("name", "");
        this.f10549 = jSONObject.getString("type", "");
        this.f10540 = jSONObject.getString("arch", "");
        this.f10543 = C23407.m51853(jSONObject, "vaddr", 0L);
        this.f10545 = C23407.m51853(jSONObject, "paddr", 0L);
        this.f10541 = C23407.m51853(jSONObject, "size", 0L);
        this.f10542 = C23407.m51853(jSONObject, "virtualSize", 0L);
        this.f10547 = C23407.m51853(jSONObject, "permissions", 0L);
        this.f10546 = C23407.m51853(jSONObject, "flags", 0L);
        this.f10544 = jSONObject.getBoolean(e.m, false);
        this.f10550 = jSONObject.getBoolean("segment", false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3337 m10193(JSONObject jSONObject) {
        return new C3337(jSONObject);
    }
}

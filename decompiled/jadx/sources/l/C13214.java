package l;

import bin.mt.json.JSONObject;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.۬ܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: J76B */
/* JADX INFO: loaded from: classes3.dex */
public final class C13214 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f39560;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f39561;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f39562;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f39563;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f39564;

    public C13214(JSONObject jSONObject) {
        this.f39564 = jSONObject.getString(TextBundle.TEXT_ENTRY, "");
        this.f39562 = C23407.m51853(jSONObject, "size", 0L);
        this.f39560 = C23407.m51853(jSONObject, "paddr", -1L);
        this.f39563 = C23407.m51853(jSONObject, "vaddr", -1L);
        this.f39561 = jSONObject.getString("sectionName", "");
        jSONObject.getString("type", "");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13214 m32049(JSONObject jSONObject) {
        return new C13214(jSONObject);
    }
}

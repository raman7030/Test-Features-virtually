package l;

import java.util.Set;

/* JADX INFO: renamed from: l.᩸ܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes.dex */
public final class C21700 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18878 f69595;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f69596;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C11159 f69597;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f69598;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C11159 f69599;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11159 f69600;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C13232 f69601;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Set f69602;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f69603;

    public C21700(C18878 c18878, int i, String str, String str2, Set set) {
        this.f69595 = c18878;
        this.f69596 = i;
        this.f69603 = str;
        this.f69598 = str2;
        this.f69602 = set;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13937 m48989() {
        String str;
        C13232 c13232 = this.f69601;
        String str2 = this.f69603;
        if (c13232 == null) {
            return new C13937(str2, true, null, null, null, null, null, false);
        }
        C11159 c11159 = this.f69600;
        if (c11159 == null && (c11159 = this.f69597) == null) {
            c11159 = this.f69599;
        }
        if (c11159 != null) {
            String str3 = c11159.f33502;
            String strM21635 = ("item_list".equals(str3) || "null_value".equals(str3) || "unparsed".equals(str3) || (str = c11159.f33491) == null) ? null : C8163.m21635(0, str.length(), 300, str);
            C13232 c13233 = this.f69601;
            return new C13937(str2, false, c13233.f39606, c13233.f39605, c11159.f33488, str3, strM21635, c11159.f33490);
        }
        return new C13937(str2, false, c13232.f39606, c13232.f39605, null, "null_value", null, false);
    }
}

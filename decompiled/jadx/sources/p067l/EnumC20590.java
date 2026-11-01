package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.᩵ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC20590 {
    ALWAYS,
    LEGACY,
    NONEMPTY;

    /* JADX INFO: renamed from: ֫ */
    public static EnumC20590 m46547(C13565 c13565) {
        String strM30873 = c13565.m30873(EnumC2483.f3977);
        if (strM30873 == null) {
            return LEGACY;
        }
        return valueOf(strM30873.toUpperCase(Locale.US));
    }
}

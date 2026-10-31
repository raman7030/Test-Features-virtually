package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.᩵ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC19173 {
    ALWAYS,
    LEGACY,
    NONEMPTY;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC19173 m44252(C11781 c11781) {
        String strM28825 = c11781.m28825(EnumC0121.f1201);
        if (strM28825 == null) {
            return LEGACY;
        }
        return valueOf(strM28825.toUpperCase(Locale.US));
    }
}

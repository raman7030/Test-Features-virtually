package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۗ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5649 {
    /* JADX INFO: renamed from: ֫ */
    public static final String m12577(String str) {
        int i = ViewOnClickListenerC20541.f63467;
        int iM11299 = C5235.m11299(str);
        if (iM11299 == -1) {
            return ".";
        }
        String strSubstring = str.substring(iM11299 + 1);
        C13045.m29865(strSubstring, "substring(...)");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        C13045.m29865(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}

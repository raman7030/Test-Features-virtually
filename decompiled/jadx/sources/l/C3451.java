package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۗ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3451 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String m10553(String str) {
        int i = ViewOnClickListenerC19121.f60235;
        int iM9241 = C3016.m9241(str);
        if (iM9241 == -1) {
            return ".";
        }
        String strSubstring = str.substring(iM9241 + 1);
        C11233.m27803(strSubstring, "substring(...)");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        C11233.m27803(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}

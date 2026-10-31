package l;

import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۧ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11251 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17600 f33720;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15068 f33721;

    public C11251(C17600 c17600, C15068 c15068) {
        this.f33720 = c17600;
        this.f33721 = c15068;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27839() {
        return this.f33720.f53785;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15068 m27840(String str) {
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        boolean zStartsWith = lowerCase.startsWith(".");
        C17600 c17600 = this.f33720;
        C15068 c15068 = this.f33721;
        if (zStartsWith) {
            Iterator it = c15068.m35662().iterator();
            while (it.hasNext()) {
                if (lowerCase.equals(((String) it.next()).toLowerCase(Locale.ROOT))) {
                    return c15068;
                }
            }
            return C17600.m41132(c17600, lowerCase);
        }
        String strM35657 = c15068.m35657();
        return (strM35657 == null || !lowerCase.equals(strM35657.toLowerCase(locale))) ? C17600.m41136(c17600, lowerCase) : c15068;
    }
}

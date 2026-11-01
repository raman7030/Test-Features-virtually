package p067l;

import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۧ᩷ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13062 {

    /* JADX INFO: renamed from: ֫ */
    public final C19096 f36720;

    /* JADX INFO: renamed from: ۧ */
    public final C16689 f36721;

    public C13062(C19096 c19096, C16689 c16689) {
        this.f36720 = c19096;
        this.f36721 = c16689;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m29901() {
        return this.f36720.f56979;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16689 m29902(String str) {
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        boolean zStartsWith = lowerCase.startsWith(".");
        C19096 c19096 = this.f36720;
        C16689 c16689 = this.f36721;
        if (zStartsWith) {
            Iterator it = c16689.m37820().iterator();
            while (it.hasNext()) {
                if (lowerCase.equals(((String) it.next()).toLowerCase(Locale.ROOT))) {
                    return c16689;
                }
            }
            return C19096.m43378(c19096, lowerCase);
        }
        String strM37815 = c16689.m37815();
        return (strM37815 == null || !lowerCase.equals(strM37815.toLowerCase(locale))) ? C19096.m43382(c19096, lowerCase) : c16689;
    }
}

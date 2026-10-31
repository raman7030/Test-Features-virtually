package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ᩴ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: G97V */
/* JADX INFO: loaded from: classes5.dex */
public class C19038 extends C16497 {
    @Override // l.C16497, l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() {
        HashSet hashSet;
        int length;
        C6337 c6337M29289;
        C6337 c6337M292810;
        int i = 0;
        try {
            C17222 c17222Mo2780 = super.mo2780();
            String[] strArrM11558 = m11558("ARG_PATHS");
            hashSet = new HashSet();
            length = strArrM11558.length;
            while (i < length) {
                String str = strArrM11558[i];
                if (str.startsWith("$RECYCLE.BIN$/") && (c6337M292810 = C11982.m29289(str.substring(14))) != null) {
                    hashSet.add(c6337M292810.m17613());
                }
            }
            return c17222Mo2780;
        } finally {
            String[] strArrM11559 = m11558("ARG_PATHS");
            hashSet = new HashSet();
            length = strArrM11559.length;
            while (i < length) {
                String str2 = strArrM11559[i];
                if (str2.startsWith("$RECYCLE.BIN$/") && (c6337M29289 = C11982.m29289(str2.substring(14))) != null) {
                    hashSet.add(c6337M29289.m17613());
                }
                i++;
            }
            C21939.m49414(hashSet);
        }
    }
}

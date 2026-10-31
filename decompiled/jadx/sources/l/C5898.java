package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K79T */
/* JADX INFO: loaded from: classes2.dex */
public final class C5898 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16538(C12164 c12164, C11418 c11418, int i, int i2, ArrayList arrayList) {
        arrayList.clear();
        if (i2 <= 0) {
            return;
        }
        int iMin = Math.min(i, c11418.length());
        boolean zM16539 = false;
        int iMax = Math.max(0, iMin);
        if (iMax <= 0) {
            zM16539 = m16539(c12164);
        } else if (c12164.find(iMax)) {
            zM16539 = c12164.start() != c12164.end() ? true : m16539(c12164);
        }
        while (zM16539 && arrayList.size() < i2) {
            arrayList.add(new C10132(c12164.start(), c12164.end()));
            if (arrayList.size() >= i2) {
                return;
            } else {
                zM16539 = m16539(c12164);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m16539(C12164 c12164) {
        while (c12164.find()) {
            if (c12164.start() != c12164.end()) {
                return true;
            }
        }
        return false;
    }
}

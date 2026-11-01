package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K79T */
/* JADX INFO: loaded from: classes2.dex */
public final class C7974 {
    /* JADX INFO: renamed from: ֫ */
    public static void m18464(C13929 c13929, C13220 c13220, int i, int i2, ArrayList arrayList) {
        arrayList.clear();
        if (i2 <= 0) {
            return;
        }
        int iMin = Math.min(i, c13220.length());
        boolean zM18465 = false;
        int iMax = Math.max(0, iMin);
        if (iMax <= 0) {
            zM18465 = m18465(c13929);
        } else if (c13929.find(iMax)) {
            zM18465 = c13929.start() != c13929.end() ? true : m18465(c13929);
        }
        while (zM18465 && arrayList.size() < i2) {
            arrayList.add(new C11998(c13929.start(), c13929.end()));
            if (arrayList.size() >= i2) {
                return;
            } else {
                zM18465 = m18465(c13929);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m18465(C13929 c13929) {
        while (c13929.find()) {
            if (c13929.start() != c13929.end()) {
                return true;
            }
        }
        return false;
    }
}

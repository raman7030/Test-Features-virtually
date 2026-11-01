package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩴۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5DS */
/* JADX INFO: loaded from: classes4.dex */
public final class C19981 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C2545 c2545 = (C2545) obj;
        C2545 c2546 = (C2545) obj2;
        C14849 c14849 = c2545.f4189;
        if ((c14849 == null) == (c2546.f4189 == null)) {
            boolean z = c2545.f4186;
            if (z == c2546.f4186) {
                int i = c2546.f4188 - c2545.f4188;
                if (i != 0) {
                    return i;
                }
                int i2 = c2545.f4185 - c2546.f4185;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            }
            if (z) {
                return -1;
            }
        } else if (c14849 != null) {
            return -1;
        }
        return 1;
    }
}

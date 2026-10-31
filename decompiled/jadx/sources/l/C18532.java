package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩴۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5DS */
/* JADX INFO: loaded from: classes4.dex */
public final class C18532 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0186 c0186 = (C0186) obj;
        C0186 c0187 = (C0186) obj2;
        C13132 c13132 = c0186.f1415;
        if ((c13132 == null) == (c0187.f1415 == null)) {
            boolean z = c0186.f1412;
            if (z == c0187.f1412) {
                int i = c0187.f1414 - c0186.f1414;
                if (i != 0) {
                    return i;
                }
                int i2 = c0186.f1411 - c0187.f1411;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            }
            if (z) {
                return -1;
            }
        } else if (c13132 != null) {
            return -1;
        }
        return 1;
    }
}

package p067l;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.۬᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4VP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15023 implements InterfaceC2696 {
    /* JADX INFO: renamed from: ֫ */
    public static int m34401(List list, Object obj, int i) {
        int iCompare;
        if (i >= list.size()) {
            i = list.size() - 1;
        }
        Object obj2 = list.get(i);
        Comparator comparator = C20289.f62686;
        int iCompare2 = comparator.compare(obj2, obj);
        if (iCompare2 == 0) {
            return i;
        }
        if (iCompare2 < 0) {
            do {
                i++;
                if (i < list.size()) {
                    iCompare = comparator.compare(list.get(i), obj);
                    if (iCompare == 0) {
                        return i;
                    }
                } else {
                    return -(list.size() + 1);
                }
            } while (iCompare <= 0);
            return -(i + 1);
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int iCompare3 = comparator.compare(list.get(i2), obj);
            if (iCompare3 == 0) {
                return i2;
            }
            if (iCompare3 < 0) {
                return -(i2 + 2);
            }
        }
        return -1;
    }
}
